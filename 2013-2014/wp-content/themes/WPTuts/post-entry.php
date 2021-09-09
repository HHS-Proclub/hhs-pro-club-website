<?php while (have_posts()) : the_post(); ?>      
    <div id="post-<?php the_ID(); ?>" <?php post_class('clearfix'); ?>>
        <?php if ( has_post_thumbnail() ) {  ?>
        
        <div class="post-featured-image">
			<a href="<?php the_permalink(' ') ?>" title="<?php the_title(); ?>" class="opacity"><?php the_post_thumbnail('post-image'); ?></a>
        </div>
        <!-- END post-featured-image -->
        
    <div class="post-content">
        	<h2><a href="<?php the_permalink(' ') ?>" title="<?php the_title(); ?>"><?php the_title(); ?></a></h2>
               			<div class="post-meta"><?php the_time('d/m/y') ?> | <?php the_category(' '); ?></div>
					<?php better_excerpts('40','','','plain','no'); ?>
        </div><!-- END post-content -->
   
   <?php } else{ ?>
	<h2><a href="<?php the_permalink(' ') ?>" title="<?php the_title(); ?>"><?php the_title(); ?></a></h2>
   		<div class="post-meta"><?php the_time('d/m/y') ?> | <?php the_category(' '); ?></div>
		<?php better_excerpts('40','','','plain','no'); ?>
	<?php } ?>
		</div>
		<!-- END post -->
<?php endwhile; ?>