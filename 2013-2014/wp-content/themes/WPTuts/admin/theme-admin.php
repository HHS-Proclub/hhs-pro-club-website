<?php
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */

//register settings
function wptuts_theme_settings_init(){
	register_setting( 'wptuts_theme_settings', 'wptuts_theme_settings' );
}

//menu
function wptuts_add_settings_page() {
add_theme_page( __( 'Theme Settings' ), __( 'Theme Settings' ), 'manage_options', 'wptuts-settings', 'wptuts_theme_settings_page');
}

add_action( 'admin_init', 'wptuts_theme_settings_init' );
add_action( 'admin_menu', 'wptuts_add_settings_page' );

//options
$slider_effects = array("random", "fade", "fold", "slideInRight", "slideInLeft", "sliceDown", "sliceDownLeft", "sliceUp", "sliceUpLeft", "sliceUpDown", "sliceUpDownLeft", "boxRandom", "boxRain", "boxRainReverse", "boxRainGrow", "boxRainGrowReverse");

//start settings page
function wptuts_theme_settings_page() {
global $slider_effects;
if ( ! isset( $_REQUEST['updated'] ) )
$_REQUEST['updated'] = false;
?>

<div class="wrap">
<div id="icon-options-general" class="icon32"></div>
<h2><?php _e( 'WPTuts Settings' ) ?></h2>


<?php if ( false !== $_REQUEST['updated'] ) : ?>
<div class="updated fade"><p><strong><?php _e( 'Options saved' ); ?></strong></p></div>
<?php endif; ?>
<form method="post" action="options.php">

<?php settings_fields( 'wptuts_theme_settings' ); ?>
<?php $options = get_option( 'wptuts_theme_settings' ); ?>

<table class="form-table">  

<tr valign="top">
<th scope="row">Theme Credits</th>
<td><p>The <a href="http://www.wpexplorer.com/wptuts-wordpress-theme.html">WPTuts</a> Theme was created by AJ Clarke from <a href="http://www.wpexplorer.com"><strong>WPExplorer.com</strong></a></p>
</td>
</tr>

<tr valign="top">
<th scope="row">Do You like my themes?</th>
<td><div id="fb-root"></div><script src="http://connect.facebook.net/en_US/all.js#appId=215260205165212&amp;xfbml=1"></script><fb:like href="http://www.wpexplorer.com/" send="true" layout="button_count" width="450" height="40" show_faces="false" font=""></fb:like></td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Favicon' ); ?></th>
<td>
<input id="wptuts_theme_settings[favicon]" class="regular-text" type="text" size="36" name="wptuts_theme_settings[favicon]" value="<?php esc_attr_e( $options['favicon'] ); ?>" />
<br />
<label class="description abouttxtdescription" for="wptuts_theme_settings[favicon]"><?php _e( 'Upload or type in the URL for the site favicon.' ); ?></label>
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Logo' ); ?></th>
<td>
<input id="wptuts_theme_settings[logo]" class="regular-text" type="text" size="36" name="wptuts_theme_settings[logo]" value="<?php esc_attr_e( $options['logo'] ); ?>" />
<br />
<label class="description abouttxtdescription" for="wptuts_theme_settings[logo]"><?php _e( 'Upload or type in the URL for the site favicon.' ); ?></label>
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Disable Slider' ); ?></th>
<td>
<input id="wptuts_theme_settings[disable_slider]" name="wptuts_theme_settings[disable_slider]" type="checkbox" value="1" <?php checked( '1', $options['disable_slider'] ); ?> />
<br />
<label class="description abouttxtdescription" for="wptuts_theme_settings[disable_slider]"><?php _e( 'If you will not use the homepage slider check this box to disable the Javascript for the slider. If you have slides, it will show the first slide as a static image.' ); ?></label>
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Slider Transition' ); ?></th>
<td>
<select name="wptuts_theme_settings[effect]">
<?php foreach ($slider_effects as $option) { ?>
<option <?php if ($options['effect'] == $option ){ echo 'selected="selected"'; } ?>><?php echo htmlentities($option); ?></option>
<?php } ?>
</select>					
<br />
<label class="description" for="wptuts_theme_settings[effect]"><?php _e( 'Choose the type of transition you want your slider to have. <small>~ Default is random.</small>' ); ?></label>
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Slider Animation Speed' ); ?></th>
<td>
<input id="wptuts_theme_settings[anim_speed]" class="regular-text" type="text" name="wptuts_theme_settings[anim_speed]" value="<?php esc_attr_e( $options['anim_speed'] ); ?>" />
<br />
<label class="description" for="wptuts_theme_settings[anim_speed]"><?php _e( 'Type in the speed for the slide transitions in milliseconds. <small>~ Default is 500.</small>' ); ?></label>
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Slider Pause Time' ); ?></th>
<td>
<input id="wptuts_theme_settings[pause_time]" class="regular-text" type="text" name="wptuts_theme_settings[pause_time]" value="<?php esc_attr_e( $options['pause_time'] ); ?>" />
<br />
<label class="description" for="wptuts_theme_settings[pause_time]"><?php _e( 'This is the time the image is displayed before it transits to the next, in milliseconds. <small>~ Default is 3000.</small>' ); ?></label></td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Disable Social Share' ); ?></th>
<td>
<input id="wptuts_theme_settings[disable_social]" name="wptuts_theme_settings[disable_social]" type="checkbox" value="1" <?php checked( '1', $options['disable_social'] ); ?> />
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Disable Widgetized Footer' ); ?></th>
<td>
<input id="wptuts_theme_settings[disable_footer]" name="wptuts_theme_settings[disable_footer]" type="checkbox" value="1" <?php checked( '1', $options['disable_footer'] ); ?> />
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Top Advertisement Code' ); ?></th>
<td>
<label class="description" for="wptuts_theme_settings[top_ad]"><?php _e( 'Enter your code for the top ad' ); ?></label>
<br />
<textarea id="wptuts_theme_settings[top_ad]" class="regular-text" name="wptuts_theme_settings[top_ad]" rows="5" cols="45"><?php esc_attr_e( $options['top_ad'] ); ?></textarea>
</td>
</tr>

<tr valign="top">
<th scope="row"><?php _e( 'Analytics Code' ); ?></th>
<td>
<label class="description" for="wptuts_theme_settings[analytics]"><?php _e( 'Enter your analytics tracking code' ); ?></label>
<br />
<textarea id="wptuts_theme_settings[analytics]" class="regular-text" name="wptuts_theme_settings[analytics]" rows="5" cols="45"><?php esc_attr_e( $options['analytics'] ); ?></textarea>
</td>
</tr>

<tr valign="top">
<th scope="row">Get More Themes!</th>
<td>
<a href="http://www.wpexplorer.com/themeforest">Get More Themes</a>
</td>
</tr>

</table>
<p class="submit-changes">
<input type="submit" class="button-primary" value="<?php _e( 'Save Options' ); ?>" />
</p>
</form>
</div><!-- END wrap -->

<?php
}
//sanitize and validate
function wptuts_options_validate( $input ) {
	global $select_options, $radio_options;
	if ( ! isset( $input['option1'] ) )
		$input['option1'] = null;
	$input['option1'] = ( $input['option1'] == 1 ? 1 : 0 );
	$input['sometext'] = wp_filter_nohtml_kses( $input['sometext'] );
	if ( ! isset( $input['radioinput'] ) )
		$input['radioinput'] = null;
	if ( ! array_key_exists( $input['radioinput'], $radio_options ) )
		$input['radioinput'] = null;
	$input['sometextarea'] = wp_filter_post_kses( $input['sometextarea'] );

	return $input;
}

?>