<?php
/*
Plugin Name: 	SocialBox
Plugin URI: 	http://codecanyon.net/item/socialbox-social-wordpress-widget/627127
Description: 	Adds a super easy Social Box Widget which displays the current numbers of Facebook Page Likes, Twitter, Dribbble, Forrst and Digg Followers and YouTube and Vimeo Channel and Feedburner Feed Subscriptions.
Version: 		1.2.1
Author: 		JonasDoebertin
Author URI: 	http://codecanyon.net/user/JonasDoebertin
License: 		Sold exclusively on CodeCanyon
*/
?>

<!-- SocialBox Widget -->
<div class="socialbox">
	
	<ul>
		
		<?php foreach($networks as $network): ?>
			
		<li class="clearfix">
			<a href="<?php echo $network['link']; ?>" title="<?php echo $network['buttonHint']; ?>" <?php if($newWindow) echo 'target="_blank"'; ?>>
				<span class="sprite-sb sprite-<?php echo $network['type'] ?>_46"></span>
				<div class="social-box-txt">
					<span class="number"><?php echo number_format($network['count']); ?></span><br />
					<span class="detail"><?php echo $network['metric']; ?></span>
				</div>
				<span class="socialbox-go"><i class="icon-chevron-right"></i></span>
			</a>
		</li>
			
		<?php endforeach; ?>
		
	</ul>
	
</div>
<!-- End SocialBox Widget -->