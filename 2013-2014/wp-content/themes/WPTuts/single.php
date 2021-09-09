<?php
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */
$options = get_option( 'wptuts_theme_settings' );
?>
<?php get_header(); ?>
	<div id="post-content">  
    <div class="single-entry clearfix">
		<?php if (have_posts()) : while (have_posts()) : the_post(); ?>    
        <h1><?php the_title(); ?></h1>
		<div class="post-meta-single">Posted on <?php the_time('d/m/y') ?> | <?php the_category(' '); ?></div>
        <?php if ( has_post_thumbnail() ) { ?>
        	<div id="single-featured-image">
        		<?php the_post_thumbnail('post-image'); ?>
            </div><!-- END single-featured-image -->
        <?php } ?>
		<?php the_content(); ?>
        <div class="clear"></div>
		<?php endwhile; ?>
		<?php endif; ?>	
        
        <?php wp_link_pages('before=<div id="post-page-navigation">&after=</div>'); ?>
         
        <div class="post-bottom">
        <?php the_tags('<div class="post-tags">',' ','</div>'); ?>
        <!-- END post-category -->
        </div>
        <!-- END post-bottom -->
        
        
        </div>
        <!-- END post -->
        
         <div id="post-author" class="clearfix">
            	
                <div id="author-avatar">
					<?php echo get_avatar( get_the_author_meta( 'user_email' ), apply_filters( 'platformbase_author_bio_avatar_size', 50 ) ); ?>
                </div><!-- END author-avatar -->
                
                <div id="author-description">
                	<h4>About The Author</h4>
					<?php the_author_meta('description'); ?>
                </div><!-- END author-description -->
       	</div><!-- END post-author -->
       
        
        <div id="related-posts" class="clearfix">
		<h3>Related Posts</h3>
			<?php
    			$category = get_the_category(); //get first current category ID
    			$this_post = $post->ID; // get ID of current post
    			$posts = get_posts('numberposts=3&orderby=rand&category=' . $category[0]->cat_ID . '&exclude=' . $this_post);
   			?>

  		<?php
   			foreach($posts as $post) {
   		?>
                <?php if ( has_post_thumbnail() ) { ?>
					<div class="related-post clearfix">
						<div class="related-posts-thumbnail">
   	     					<a href="<?php the_permalink() ?>" title="<?php the_title(); ?>" class="opacity"><?php the_post_thumbnail('related-posts'); ?></a>
           				</div><!-- /related-posts-thumbnail -->
                   	 	<div class="related-posts-content">
                    		<h4><a href="<?php the_permalink() ?>" title="<?php the_title(); ?>"><?php the_title(); ?></a></h4>
                   		 <?php better_excerpts('15','','','plain','no'); ?>
                    	</div>
                    <!-- /related-posts-content -->
                    </div>
                    <!-- /related-post -->
                
                <?php } ?>
			 <?php } wp_reset_postdata(); ?>
	</div><!-- END related-posts -->
    <div class="clear"></div>
                
	<?php comments_template(); ?>  
    
    <div id="single-nav" class="clearfix">
		<div id="single-nav-left"><?php previous_post_link('%link', '&laquo;  Previous Post', TRUE); ?></div>
		<div id="single-nav-right"><?php next_post_link('%link', 'Next Post &raquo;', TRUE); ?></div>
    </div>
    <!-- END single-nav -->  
                
	</div>
	<!-- END post-content -->
            
<?php get_sidebar(); ?>
<div class="clear"></div>
<?php get_footer(); ?>