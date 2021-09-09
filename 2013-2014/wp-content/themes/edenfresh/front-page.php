<?php 

if ( !defined('ABSPATH')) exit; 

 

get_header(); 

?>


<div class="container">
 
    <div class="row-fluid">
        <div class="span12">
            <blockquote class="dark">
            <div class="row-fluid">
            <div class="span9">
                <h3><?php echo edenfresh_get_theme_opts('home_featured_title','Welcome to Simply Clean'); ?></h3>
                <?php
                     echo edenfresh_get_theme_opts('home_featured_desc','Fully responsive, clean looking WordPress Theme')
                 ?> 
          </div> 
          <div class="span3">    
                <a href="<?php echo edenfresh_get_theme_opts('home_featured_btnurl','http://wpeden.com'); ?>" class="btn btn-large btn-info pull-right"><?php echo edenfresh_get_theme_opts('home_featured_btntxt','Get It Now!'); ?></a>
          </div>    
          </div>
            </blockquote>
        </div>
    </div>
    
    <div class="row-fluid">
        <div class="span3-section">
        <h2>Latest News</h2>
        <div>
        <div class="span3">
        <?php /*$tpid = (int)edenfresh_get_theme_opts('home_featured_page_1'); $intropage = get_page($tpid); $introcontent = strip_tags($intropage->post_content,"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];*/  ?>
        <?php $cid = (int)edenfresh_get_theme_opts('home_featured_page_1'); $recentposts = wp_get_recent_posts(array('numberposts' => 1, 'category' => $cid, 'post_status' => 'publish')); $intropage = $recentposts[0]; $introcontent = strip_tags($intropage['post_content'],"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];  ?>
        <div class="service-box">
          <div class="entry-content">
          <h3><span class="service-icon"><i class="icon icon-white icon-leaf"></i></span> <a href="<?php echo get_permalink($cid); ?>"><?php echo $intropage['post_title']; ?></a></h3>
          <?php echo $introcontent; ?>
          </div>
        </div>  
        </div>
        
        <div class="span3">
        <?php /*$tpid = (int)edenfresh_get_theme_opts('home_featured_page_2'); $intropage = get_page($tpid); $introcontent = strip_tags($intropage->post_content,"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];*/  ?>
        <?php $cid = (int)edenfresh_get_theme_opts('home_featured_page_2'); $recentposts = wp_get_recent_posts(array('numberposts' => 1, 'category' => $cid, 'post_status' => 'publish', 'offset' => 1)); $intropage = $recentposts[0]; $introcontent = strip_tags($intropage['post_content'],"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];  ?>
        <div class="service-box">
          <div class="entry-content">
          <h3><span class="service-icon"><i class="icon icon-white icon-leaf"></i></span> <a href="<?php echo get_permalink($cid); ?>"><?php echo $intropage['post_title']; ?></a></h3>
          <?php echo $introcontent; ?>
          </div>
        </div>  
        </div>
        </div>
        </div>
        
        <div class="span3-section">
        <h2>Challenge Problems</h2>
        <div>
        <div class="span3">
        <?php /*$tpid = (int)edenfresh_get_theme_opts('home_featured_page_3'); $intropage = get_page($tpid); $introcontent = strip_tags($intropage->post_content,"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];*/  ?>
        <?php $cid = (int)edenfresh_get_theme_opts('home_featured_page_3'); $recentposts = wp_get_recent_posts(array('numberposts' => 1, 'category' => $cid, 'post_status' => 'publish')); $intropage = $recentposts[0]; $introcontent = strip_tags($intropage['post_content'],"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];  ?>
        <div class="service-box">
          <div class="entry-content">
          <h3><span class="service-icon"><i class="icon icon-white icon-leaf"></i></span> <a href="<?php echo get_permalink($cid); ?>"><?php echo $intropage['post_title']; ?></a></h3>
          <?php echo $introcontent; ?>
          </div>
        </div>  
        </div>
        
        <div class="span3">
        <?php /*$tpid = (int)edenfresh_get_theme_opts('home_featured_page_4'); $intropage = get_page($tpid); $introcontent = strip_tags($intropage->post_content,"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];*/  ?>
        <?php $cid = (int)edenfresh_get_theme_opts('home_featured_page_4'); $recentposts = wp_get_recent_posts(array('numberposts' => 1, 'category' => $cid, 'post_status' => 'publish')); $intropage = $recentposts[0]; $introcontent = strip_tags($intropage['post_content'],"p,br"); if (preg_match('/^.{1,80}\b/s', $introcontent, $match)) $introcontent = $match[0];  ?>
        <div class="service-box">
          <div class="entry-content">
          <h3><span class="service-icon"><i class="icon icon-white icon-leaf"></i></span> <a href="<?php echo get_permalink($cid); ?>"><?php echo $intropage['post_title']; ?></a></h3>
          <?php echo $introcontent; ?>
          </div>
        </div>  
        </div>
        </div>
        </div>
    </div>
        
        <!-- /.span4 -->
      
        <?php /* get_template_part('homepage','portfolio'); */ ?>       
           
 
 
<div class="clear"></div>
<div>
</div>          

</div><!-- /.span4 -->
         
    </div>
 
 
</div>

        
<?php get_footer(); ?>
