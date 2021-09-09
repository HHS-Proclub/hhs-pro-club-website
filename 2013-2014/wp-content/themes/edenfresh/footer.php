<div class="footer">
<div class="container">
<div class="row-fluid">
<div class="header">
<div class="span4">
<?php if(!dynamic_sidebar('footer1')) echo "<br/>Add some widgets here"; ?>
</div>
<div class="span4">
<?php if(!dynamic_sidebar('footer2')) echo "<br/>Add some widgets here"; ?>
</div>
<div class="span4">
<?php if(!dynamic_sidebar('footer3')) echo "<br/>Add some widgets here"; ?>
</div>
<div class="clear"></div>
</div>
</div>
</div>
<div class="container"><div class="content"><?php echo edenfresh_get_theme_opts('footer_text','Copyright &copy; '. get_bloginfo('sitename')); ?> | Designed by <a href='http://wpeden.com'>WP Eden</a> | Powered by <a href='http://wordpress.org'>WordPress</a></div></div>
</div>

<?php wp_footer(); ?>

</div>

</body>
</html>