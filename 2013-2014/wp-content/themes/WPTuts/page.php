<?php
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */
?>
<?php get_header(); ?>
<div id="post-content">
    <?php if (have_posts()) : while (have_posts()) : the_post(); ?>
    <h1 class="page-title"><?php the_title(); ?></h1>			
    <?php the_content(); ?>
    <?php endwhile; ?>
    <?php endif; ?>	   
    <?php comments_template(); ?>  
</div>
<!-- END post-content -->
<?php get_sidebar(); ?>
<?php get_footer(); ?>