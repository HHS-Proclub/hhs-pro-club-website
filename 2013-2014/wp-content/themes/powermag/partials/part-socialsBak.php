<?php     
$socials = array('vimeo' => 'Vimeo', 'gplus' => 'Google +', 'technorati' => 'Technorati', 'skype' => 'Skype', 'blogger' => 'Blogger', 'rss' => 'Rss Feed', 'facebook' => 'Facebook', 'instagram' => 'Instagram', 'twitter' => 'Twitter', 'delicious' => 'Delicious', 'youtube' => 'YouTube', 'flickr' => 'Flickr', 'digg' => 'Digg', 'stumble' => 'Stumble Upon', 'linkedin' => 'Linked In', 'deviant' => 'Deviant Art','picasa' => 'Picasa', 'dribbble' => 'Dribbble', 'tumblr' => 'Tumblr', 'forrst' => 'Forrst');  ?>

<ul class="socials">
	<?php foreach($socials as $key=>$val){
if ( of_get_option('pm_sm_'.$key) ) { ?>
	<li><a href="<?php echo of_get_option('pm_sm_'.$key); ?>"><img src="<?php echo get_template_directory_uri(); ?>/images/socials/<?php echo $key ?>.png" alt="<?php echo $val; ?>" class="clip social-icon" height="42" width="26"/></a></li>
	<?php } 
}?>
</ul>