<div class="row-fluid">
    <div class="wpeden-portfolio-section">
    <div class="container">
     
        <div class="row-fluid">
            <div class="span12">
                <h3 class="section-head bottom-div">Portfolio<span class="pull-right"><a href="#portfolio-carousel" data-slide="prev"><i class="icon icon-angle-left"></i></a><a  href="#portfolio-carousel" data-slide="next"><i class="icon icon-angle-right"></i></a></span></h3>
            </div>
        </div>
        <div class="carousel slide" id="portfolio-carousel">
        <div class="carousel-inner">
        <div class="item active">
        <div class="row-fluid wpeden-portfolio">
            <?php  
                $fi = 0;
                query_posts('post_type=portfolio&posts_per_page=4');
                 while(have_posts()){  the_post();
                 $hf = ++$fi>1?' hidden-phone':'';
            ?>
            <div class="span3 portfolio-item <?php echo $hf;?>">
             
              <?php edenfresh_post_thumb('medium'); ?> 
              <div class="mask text-center">
              <h2><?php the_title(); ?></h2>
              <div class="info"> 
              <a rel="lightbox" href="<?php echo edenfresh_post_thumb_url(); ?>" class="btn btn-primary"><i class="icon icon-search icon-white"></i></a> 
              <a href="<?php the_permalink(); ?>" class="btn btn-success"><i class="icon icon-arrow-right icon-white"></i></a> 
              </div>
              </div>
              <div class="clear"></div>
             
            </div>
            
            <?php 
                 }
            ?>
        </div>  
        </div>  
            
        </div>   
        </div>   
    </div>
    </div>
</div>