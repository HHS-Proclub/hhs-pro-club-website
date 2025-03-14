<?php 

if (!class_exists('pm_user_rating')) {
    class pm_user_rating
    {
        public $current_rating;
        public $current_position;
        public $count;

        function __construct()
        {
            // Get rating data for the current post
            if (is_single()) {
            $this->retrieve_values();
            }

            // Listen to rating info.
            add_action('wp_ajax_pm_rating', array(&$this, 'sync_rating'));
            add_action('wp_ajax_nopriv_pm_rating', array(&$this, 'sync_rating'));
            add_action('wp_enqueue_scripts', array(&$this, 'load_scripts'));
            

            
        }

        public function load_scripts()
        {
          global $post;
          if ( $post AND !is_home /* djwd is_home() @since PM 1.1 (not needed in home) */() ) {
                wp_localize_script('jquery', 'pm_script', array(
                                    'post_id' => $post->ID,
                                    'ajaxurl' => admin_url('admin-ajax.php')
                                ), true
                            );
          }
        }

        /**
         * retrieves post values
         */
        private function retrieve_values()
        {
            $current_rating = get_post_meta(get_the_ID(), 'current_rating', true);
            if (!$current_rating) {
                $current_rating = '0';
            }
            $this->current_rating = $current_rating;


            $current_position = get_post_meta(get_the_ID(), 'current_position', true);
            if (!$current_position) {
                $current_position = 0;
            }
            $this->current_position = $current_position;

            $count = get_post_meta(get_the_ID(), 'ratings_count', true);
            if (!$count) {
                $count = 0;
            }
            $this->count = $count;

        }

        public function sync_rating()
        {
            // Sync values
            $position = (int)$_POST['rating_position'];
            $post_id = (int)$_POST['post_id'];


            // Current values
            $current_position = (int)get_post_meta($post_id, 'current_position', true);
            if (!$current_position) {
                $current_position = 0;
            }
            $current_rating = (int)get_post_meta($post_id, 'current_rating', true);
            if (!$current_rating) {
                $current_rating = 0;
            }
            $count = (int)get_post_meta($post_id, 'ratings_count', true);
            if (!$count) {
                $count = 0;
            }

            // new values
            $new_position = ($current_position * $count + $position) / ($count + 1);
            $new_count = $count + 1;
			
			$pm_review_type = get_post_meta(get_the_ID(), 'pm_review_type', true);
			
			if ($pm_review_type == 'percent') {
            $new_rating = floor(($new_position / 10) * 5) / 10;
			} else {
			$new_rating = floor($new_position);
				}
				
            // update values
            update_post_meta($post_id, 'current_position', $new_position, get_post_meta($post_id, 'current_position', true));
            update_post_meta($post_id, 'current_rating', $new_rating, get_post_meta($post_id, 'current_rating', true));
            update_post_meta($post_id, 'ratings_count', $new_count, get_post_meta($post_id, 'ratings_count', true));
            exit;
        }
    }
}

new pm_user_rating();