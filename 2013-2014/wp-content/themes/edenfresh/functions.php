<?php
 
if ( ! isset( $content_width ) ) $content_width = 960;


require_once(dirname(__FILE__)."/admin/engine.php"); 
require_once(dirname(__FILE__)."/libs/nav-menu-walker.class.php"); 

    
//save theme option    
function edenfresh_save_theme_opt(){                                                                                                   /*Save Theme Option in an array*/
        if(isset($_POST['edenfresh_act'])&&$_POST['edenfresh_act']=='savethmopt') {    
        $edenfresh_nonce = $_REQUEST['_edenfresh_nonce'];
        if (! wp_verify_nonce($edenfresh_nonce, 'wpeden-nonce') ) die('Invalid nonce'); 
        
        //validate and sanitize data before save        
        update_option("edenfresh_bs_thmopt_slider_cat",(int)$_POST['edenfresh_bs_thmopt_slider_cat']);                                 
        update_option("edenfresh_bs_intro_page",(int)$_POST['edenfresh_bs_intro_page']);                                 
        update_option("edenfresh_bs_intro_page_2",(int)$_POST['edenfresh_bs_intro_page_2']);
        update_option("edenfresh_bs_intro_page_3",(int)$_POST['edenfresh_bs_intro_page_3']);
        
        header("location: $_SERVER[HTTP_REFERER]");
        die('');   
        }
 
    }

 
//generate thumbnail 
function edenfresh_thumb($post, $size='', $extra = array(), $echo = true){    
    $size = $size?$size:'thumbnail';   
    $large_image_url = wp_get_attachment_image_src( get_post_thumbnail_id($post->ID), 'large'); 
    $large_image_url = $large_image_url[0];    
    $large_image_url = $large_image_url?$large_image_url:'';        
    $class = isset($extra['class'])?$extra['class']:'';
    if($echo&&has_post_thumbnail($post->ID ))
    echo get_the_post_thumbnail($post->ID, $size, $extra );
    else if(!$echo&&has_post_thumbnail($post->ID ))
    return get_the_post_thumbnail($post->ID, $size, $extra );  
    else if($echo)
    echo "";
    else
    return "";
    
}

function edenfresh_register_portfolio() {
 
    $labels = array(
        'name' => _x('Portfolio', 'post type general name'),
        'singular_name' => _x('Portfolio', 'post type singular name'),
        'add_new' => _x('Add New', 'portfolio'),
        'add_new_item' => __('Add New Portfolio'),
        'edit_item' => __('Edit Portfolio'),
        'new_item' => __('New Portfolio'),
        'view_item' => __('View Portfolio'),
        'search_items' => __('Search Portfolio'),
        'not_found' =>  __('Nothing found'),
        'not_found_in_trash' => __('Nothing found in Trash'),
        'parent_item_colon' => ''
    );
 
    $args = array(
        'labels' => $labels,
        'public' => true,
        'publicly_queryable' => true,
        'show_ui' => true,
        'query_var' => true,
        'rewrite' => true,
        'capability_type' => 'post',
        'hierarchical' => false,
        'menu_position' => null,
        'menu_icon' => get_stylesheet_directory_uri().'/images/portfolio.png',
        'supports' => array( 'title', 'editor', 'thumbnail', 'comments','excerpt' ),
      ); 
 
    register_post_type( 'portfolio' , $args );
} 

//post thumbnail function
function edenfresh_post_thumb($size='', $echo = true, $extra = null){
    global $post;
    $size = $size?$size:'thumbnail';   
    $large_image_url = wp_get_attachment_image_src( get_post_thumbnail_id($post->ID), 'large'); 
    $large_image_url = $large_image_url[0];
    if((is_single()||is_page())&&$large_image_url=='') return;
    $large_image_url = $large_image_url?$large_image_url:'';              
    $class = isset($extra['class'])?$extra['class']:'';
    if($echo&&has_post_thumbnail($post->ID ))
    echo get_the_post_thumbnail($post->ID, $size, $extra );    
    else if(!$echo&&has_post_thumbnail($post->ID ))
    return get_the_post_thumbnail($post->ID, $size, $extra );  
    else if($echo)
    echo "";
    else
    return "";
}

//post thumbnail url
function edenfresh_post_thumb_url($size='', $echo = true, $extra = null){
    global $post;
    $size = $size?$size:'thumbnail';   
    $large_image_url = wp_get_attachment_image_src( get_post_thumbnail_id($post->ID), 'large'); 
    $large_image_url = $large_image_url[0];
    return $large_image_url;
}

//generate cutom excerpt
function edenfresh_post_excerpt($length){
    global $post;
    $uexcerpt = $post->post_excerpt?$post->post_excerpt:$post->post_content;
    $uexcerpt = strip_tags($uexcerpt);
    $excerpt = substr($uexcerpt,0,$length);
    $eexcerpt = substr($uexcerpt,$length);
    $excerpt .= array_shift(explode(" ",$eexcerpt));
    echo $excerpt.'...';
}

//comments
function edenfresh_comment($comment, $args, $depth) {
   $GLOBALS['comment'] = $comment; 
   $GLOBALS['comment'] = $comment;
    
    switch ( $comment->comment_type ) :
        case 'pingback' :
        case 'trackback' :
        ?>
    <li class="post pingback">
        <p><?php _e( 'Pingback:', 'wpeden' ); ?> <?php comment_author_link(); ?><?php edit_comment_link( __( 'Edit', 'wpeden' ), '<span class="edit-link">', '</span>' ); ?></p>
    <?php
        break;
        default :
   ?>
   <li <?php comment_class(); ?> id="li-comment-<?php comment_ID() ?>">         
            <div class="comment-body">
               <div id="comment-<?php comment_ID(); ?>" class="clearfix">
                    <div class="author-box">
                        <?php echo get_avatar($comment,100); ?>
                         
                    </div> <!-- end .avatar-box -->
                    <div class="comment-wrap clearfix">                        
                        <div class="comment-meta commentmetadata">
                        <?php printf('<span class="fn">%s</span>', get_comment_author_link()) ?>
                        <a href="<?php echo esc_url( get_comment_link( $comment->comment_ID ) ); ?>">
                            <?php
                                /* translators: 1: date, 2: time */
                                printf( __( '%1$s at %2$s', 'wpeden' ), get_comment_date(),  get_comment_time() ); ?></a><?php edit_comment_link( __( '(Edit)', 'Feather' ), ' ' );
                            ?>
                        </div><!-- .comment-meta .commentmetadata -->

                        <?php if ($comment->comment_approved == '0') : ?>
                            <em class="moderation"><?php _e('Your comment is awaiting moderation.','Feather') ?></em>
                            <br />
                        <?php endif; ?>

                        <div class="comment-content"><?php comment_text() ?></div> <!-- end comment-content-->
                        <div class="reply-container"><?php comment_reply_link(array_merge( $args, array('reply_text' => __('Reply','Feather'),'depth' => $depth, 'max_depth' => $args['max_depth']))) ?></div>
                    </div> <!-- end comment-wrap-->
                    <div class="comment-arrow"></div>
                </div> <!-- end comment-body-->
            </div> <!-- end comment-body-->
         
 
<?php 
        break;
    endswitch;    
 }
 
 
 
 //Sidebars
 function edenfresh_widget_init(){
     
    register_sidebar(array(
      'name' => 'Single Post',
      'id' => 'single_post_sidebar',
      'description' => 'Sidebar For Single post.',
      'before_widget' => '<div class="box widget">',
      'after_widget' => '</div>',
      'before_title' => '<h3>',
      'after_title' => '</h3>'
    ));
        
     register_sidebar(array(
      'name' => 'Archive Page',
      'id' => 'archive_page_sidebar',
      'description' => 'Sidebar For Archive Page.',
      'before_widget' => '<div class="box widget box_yellow">',
      'after_widget' => '</div>',
      'before_title' => '<h3>',
      'after_title' => '</h3>'
    ));    
       
    
    register_sidebar(array(
      'name' => 'Footer Left',
      'id' => 'footer1',
      'description' => 'Footer Left',
      'before_widget' => '<div class="widget widget-footer">',
      'after_widget' => '</div>',
      'before_title' => '<h3>',
      'after_title' => '</h3>'
    )); 
    
    register_sidebar(array(
      'name' => 'Footer Middle',
      'id' => 'footer2',
      'description' => 'Footer Middle',
      'before_widget' => '<div class="widget widget-footer">',
      'after_widget' => '</div>',
      'before_title' => '<h3>',
      'after_title' => '</h3>'
    )); 
    
    register_sidebar(array(
      'name' => 'Footer Right',
      'id' => 'footer3',
      'description' => 'Footer Right',
      'before_widget' => '<div class="widget widget-footer">',
      'after_widget' => '</div>',
      'before_title' => '<h3>',
      'after_title' => '</h3>'
    )); 
 }
 
 // wp_title filter
 function edenfresh_filter_wp_title( $old_title, $sep, $sep_location ){
    $ssep = ' ' . $sep . ' ';
    // find the type of index page this is
    if( is_category() ) $insert = $ssep . 'Category';
    elseif( is_tag() ) $insert = $ssep . 'Tag';
    elseif( is_author() ) $insert = $ssep . 'Author';
    elseif( is_year() || is_month() || is_day() ) $insert = $ssep . 'Archives';
    else $insert = NULL;
     
    // get the page number we're on (index)
    if( get_query_var( 'paged' ) )
    $num = $ssep . 'page ' . get_query_var( 'paged' );
     
    // get the page number we're on (multipage post)
    elseif( get_query_var( 'page' ) )
    $num = $ssep . 'page ' . get_query_var( 'page' );
     
    // else
    else $num = NULL;
    
    $site_description = get_bloginfo( 'description', 'display' );
    if ( is_home() && $site_description )
    $old_title .=  $ssep  . $site_description;
     
    // concoct and return new title
    return get_bloginfo( 'name' ) . $insert . $old_title . $num;
}
 
 
//Theme setup function 
function edenfresh_setup(){
    register_nav_menus( array(
        'primary' => __( 'Top Menu', 'wp-eden' ) 
          
    ) );
    
    edenfresh_register_portfolio();
    add_theme_support( 'post-thumbnails' );
    if(has_post_format('aside'))
    add_theme_support("post-formats");
    add_theme_support("automatic-feed-links");
    add_theme_support("excerpt");
    add_theme_support('custom-background');
     
    add_image_size( 'wpeden-responsive-post-thumb', 960, 99999, false );
    add_image_size( 'wpeden-responsive-blog-thumb', 960, 300, true ); 
    add_image_size( 'wpeden-responsive-intro-thumb', 470, 200, true ); 
    add_image_size( 'wpeden-responsive-category-thumb', 270, 270, true ); 
 
 }
 
 function edenfresh_enqueue_scripts(){
 
    wp_enqueue_style('wpeden-bootstrap',get_stylesheet_directory_uri().'/bootstrap/css/bootstrap.css');   
    wp_enqueue_style('wpeden-bootstrap-responsive',get_stylesheet_directory_uri().'/bootstrap/css/bootstrap-responsive.css');   
    wp_enqueue_script('wpeden-bootstrap',get_stylesheet_directory_uri().'/bootstrap/js/bootstrap.min.js',array('jquery'));                 
    //wp_enqueue_script('wpeden-masonry',get_stylesheet_directory_uri().'/js/jquery.masonry.min.js',array('jquery'));                 
    wp_enqueue_script('wpeden-site',get_stylesheet_directory_uri().'/js/site.js',array('jquery'));                 
    wp_enqueue_script( 'comment-reply' ); 
 }

 

add_action( 'wp_enqueue_scripts', 'edenfresh_enqueue_scripts');
add_action("init","edenfresh_save_theme_opt"); 
add_filter( 'wp_title', 'edenfresh_filter_wp_title', 10, 3 );
add_action( 'init', 'edenfresh_widget_init' );  
add_action( 'after_setup_theme', 'edenfresh_setup' );  
 
