<?php
/*
Template Name: Full Width
*/
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */
$options = get_option( 'wptuts_theme_settings' );
?>
<?php get_header(); ?> 
    	<div id="full-width-wrap">
				<?php if (have_posts()) : while (have_posts()) : the_post(); ?>
        		<h1 class="page-title"><?php the_title(); ?></h1>			
				<?php the_content(); ?>
				<?php endwhile; ?>
				<?php endif; ?>	
				
				<?php comments_template(); ?>  
        </div><!-- END full-width-wrap -->
<?php get_footer(); ?>