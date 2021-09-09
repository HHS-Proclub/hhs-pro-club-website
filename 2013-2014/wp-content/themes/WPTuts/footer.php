<?php
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */
$options = get_option( 'wptuts_theme_settings' );
?>
<?php if ($options['disable_social'] != true) { ?> 
<?php if (is_single()) { ?>
<div class="share">
    <div class="share-btn">
    	<a href="http://twitter.com/share" class="twitter-share-button" data-count="vertical" data-via="">Tweet</a><script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
    </div><!-- end share-btn -->
    <div class="share-btn facebook-share">
    	<div id="fb-root"></div><script src="http://connect.facebook.net/en_US/all.js#appId=211103805598560&amp;xfbml=1"></script><fb:like href="<?php the_permalink(); ?>" send="true" layout="box_count" width="80" show_faces="false" font=""></fb:like>
    </div><!-- end share-btn -->
    <div class="share-btn">
    	<g:plusone size="tall"></g:plusone>
    </div><!-- end share-btn -->
</div><!-- end share -->
<?php } } ?>

</div><!-- END wrap --> 
<?php if ($options['disable_footer'] != true) { ?> 
<div id="footer-wrap">
<div id="footer" class="clearfix"> 
      <div class="footer-widget">
          <?php if ( !function_exists('dynamic_sidebar') || !dynamic_sidebar('First Footer Area') ) : ?><?php endif; ?>
      </div>
      <!-- END footer-widget -->
      <div class="footer-widget">
          <?php if ( !function_exists('dynamic_sidebar') || !dynamic_sidebar('Second Footer Area') ) : ?><?php endif; ?>
      </div>
      <!-- END footer-widget -->   
      <div class="footer-widget">
          <?php if ( !function_exists('dynamic_sidebar') || !dynamic_sidebar('Third Footer Area') ) : ?><?php endif; ?>
      </div>
      <!-- END footer-widget -->  
      <div class="footer-widget remove-margin">   
          <?php if ( !function_exists('dynamic_sidebar') || !dynamic_sidebar('Fourth Footer Area') ) : ?><?php endif; ?>
      </div>
      <!-- END footer-widget -->
</div><!-- END Footer -->
</div><!-- END footer-wrap -->
<?php } ?>
<div id="copyright-wrap">
    <div id="copyright">
    &copy; <?php echo date('Y'); ?>  <?php bloginfo( 'name' ) ?>
    </div>
    <!-- END copyright - theme by WPExplorer.com -->
</div><!-- END copyright-wrap -->
<!-- WP Footer -->
<?php wp_footer(); ?>
</body>
</html>