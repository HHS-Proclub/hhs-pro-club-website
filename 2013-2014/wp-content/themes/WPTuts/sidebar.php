<?php
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */
?>
<div id="sidebar">          
	<?php if ( !function_exists('dynamic_sidebar') || !dynamic_sidebar('Sidebar') ) : ?>
	<?php endif; ?>
</div>
<!-- END sidebar -->