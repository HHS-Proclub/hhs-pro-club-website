<?php
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */
$options = get_option( 'wptuts_theme_settings' );
?>
<?php get_header(' '); ?>
<div id="post-content">
<?php
// get custom post type ==> slides
global $post;
$args = array(
	'post_type' =>'slides',
	'numberposts' => -1,
	'orderby' => 'ASC'
);
$slider_posts = get_posts($args);
?>
<?php if($slider_posts) { ?>
<div id="slider-wrap">
    <div id="slider" class="nivoSlider"> 
    <?php 
        foreach($slider_posts as $post) : setup_postdata($post);
        $slide = wp_get_attachment_image_src(get_post_thumbnail_id(), 'featured-image');
        // get metabox data
        $slidelink = get_post_meta($post->ID, 'slides_url', TRUE);
    ?>
         <?php if ( has_post_thumbnail() ) { ?>
            <?php
            // show link with slide if meta exists
            if($slidelink != '') { ?>
            <a href="<?php echo $slidelink ?>" title="<?php the_title(); ?>"><img src="<?php echo $slide[0]; ?>" alt="<?php the_title(); ?>" width="610" height="240" title="<?php the_title(); ?>" /></a>
            <?php
             // no meta link defined, show plain img
            } else { ?>
            <img src="<?php echo $slide[0]; ?>" alt="<?php the_title(); ?>" width="610" height="240" title="<?php the_title(); ?>" />
            <?php } } ?>
    <?php endforeach; ?>
</div><!-- END slider -->
</div><!-- end slider-wrap -->
<?php } wp_reset_postdata(); // there are no slides ?> 

        <?php if (have_posts()) : ?>              
        	<?php get_template_part( 'post' , 'entry') ?>                	
    <?php endif; ?>       
	<?php
    // include pagination
    if (function_exists("pagination")) { pagination($additional_loop->max_num_pages); } ?>
</div>
<!-- END post-content -->
<?php get_sidebar(' '); ?>           
<?php get_footer(' '); ?>