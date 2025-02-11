<?php

/*
==========================================================
POWERMAG GENERAL SETUP
==========================================================
*/


/* 
 * Enable the WordPress Admin Bar for admins only 
*/

if (!current_user_can('manage_options')) {
	add_filter('show_admin_bar', '__return_false');
}

/**
 * Set the content width based on the theme's design and stylesheet.
 *
 * @since PowerMag 1.0
 */
if ( ! isset( $content_width ) )
	$content_width = 1140; /* pixels */

if ( ! function_exists( 'powermag_setup' ) ) :
/**
 * Sets up theme defaults and registers support for various WordPress features.
 *
 * Note that this function is hooked into the after_setup_theme hook, which runs
 * before the init hook. The init hook is too late for some features, such as indicating
 * support post thumbnails.
 *
 * @since PowerMag 1.0
 */
function powermag_setup() {

	/**
	 * Custom template tags for this theme.
	 */
	require( get_template_directory() . '/inc/template-tags.php' );

	/**
	 * Custom functions that act independently of the theme templates
	 */
	require( get_template_directory() . '/inc/extras.php' );

	/**
	 * Customizer additions
	 */
	require( get_template_directory() . '/inc/customizer.php' );
	
	/**
	 * Options Framework
	 */
	if ( !function_exists( 'optionsframework_init' ) ) {
		define( 'OPTIONS_FRAMEWORK_DIRECTORY', get_template_directory_uri() . '/admin/options-core/' );
		require_once dirname( __FILE__ ) . '/admin/options-core/options-framework.php';
	}
		require_once dirname( __FILE__ ) . '/admin/options.php';

	/**
	 * Make theme available for translation
	 * Translations can be filed in the /languages/ directory
	 * If you're building a theme based on PowerMag, use a find and replace
	 * to change 'powermag' to the name of your theme in all the template files
	 */
	load_theme_textdomain( 'powermag', get_template_directory() . '/languages' );
	load_theme_textdomain( 'login-with-ajax', get_template_directory() . '/inc/login-with-ajax/langs/' );

	/**
	 * Add default posts and comments RSS feed links to head
	 */
	add_theme_support( 'automatic-feed-links' );

	/**
	 * Enable support for Post Thumbnails
	 */
	add_theme_support( 'post-thumbnails' );

	/**
	 * This theme uses wp_nav_menu() in one location.
	 */
	register_nav_menus( array(
		'primary' => __( 'Primary Menu', 'powermag' ),
		'utilities' => __( 'Utilities Menu', 'powermag' ),
		'footer' => __( 'Footer Menu', 'powermag' ),
	) );

	/**
	 * Enable support for Post Formats
	 */
	add_theme_support( 'post-formats', array( 'image', 'video') );
}
endif; // powermag_setup
add_action( 'after_setup_theme', 'powermag_setup' );


/*
==========================================================
INCLUDES
==========================================================
*/

//Core
require "inc/lessc.inc.php"; //Less PHP compiler
require "inc/tax/class-usage.php"; //
require('admin/update-notifier.php');//Theme Update Notifier

//Custom
include_once('admin/functions-extended/fn-styles.php'); // User Styles
include_once('admin/functions-extended/fn-typography.php'); // User Typography
include_once('inc/bwp-minify/bwp-minify.php'); // Minifier @since PM 1.1

//Tools
include_once('inc/user-profile.php'); //User Profile additional fields
include_once('inc/login-with-ajax/login-with-ajax.php'); //Login with Ajax
include_once('inc/sidebar-generator.php'); //Sidebar Generator
include_once('shortcodes/shortcodes-init.php'); //Shortcodes Initialization
include_once('shortcodes/lib/template-shortcodes.php'); //Shortcode Generator
include_once('inc/socialbox/socialbox.php'); //SocialBox Widget
include_once('inc/panes.php'); //Home Tabs Panes
include_once('inc/user-rating-class.php'); //User Rating Engine
include_once('inc/wp-comment-master/wp-comment-master.php'); // Ajax Comments

//Widgets
include_once('inc/widgets/wg-main-cat.php'); // HomePage Widgets
include_once('inc/widgets/wg-main-txt.php'); 
include_once('inc/widgets/wg-sidebar.php'); //Sidebar Widgets

//Custom MetaBoxes Path
define('RWMB_URL', trailingslashit(get_stylesheet_directory_uri() . '/admin/meta-box'));
define('RWMB_DIR', trailingslashit(get_stylesheet_directory() . '/admin/meta-box'));

// Metaboxes Script
require_once RWMB_DIR . 'meta-box.php';

// Include Metabox Definitions
include get_stylesheet_directory() . '/admin/meta-box-config.php';


/*
==========================================================
WIDGETIZED AREAS
==========================================================
*/

function powermag_widgets_init() {
	
	$pm_before_title = '<div class="widget-title-bg clearfix"><h4 class="widget-title"><span class="inner">';
	$pm_after_title = '</span><span class="cat-diagonal"></span></h4></div>';
		
	register_sidebar( array(
		'name' => __( 'Sidebar', 'powermag' ),
		'id' => 'sidebar-1',
		'description' => __( 'This is the main sidebar, it will appear on every post/page unless a different sidebar is generated and attached through the Options Panel, or a full-width layout is selected for the post/page', 'powermag' ),
		'before_widget' => '<aside id="%1$s" class="widget %2$s">',
		'after_widget' => '</aside>',
		'before_title' => $pm_before_title,
		'after_title' => $pm_after_title,	) );
		
	register_sidebar( array(
		'name' => __( 'Login Bar', 'powermag' ),
		'desc' => 'Appears on my cock',
		'id' => 'login-sidebar',
		'description' => __( 'Please only drag the "PowerMag: Login Bar" widget here.', 'powermag' ),
		'before_widget' => '',
		'after_widget' => '',
		'before_title' => '',
		'after_title' => '', ) );
	
	register_sidebar( array(
		'name' => __( 'Homepage Big', 'powermag' ),
		'id' => 'homepage-1',
		'description' => __( 'Widest main content widgetized area for the Magazine layout. Drag the "PowerMag: HP Category Regular" and "PowerMag: Carousel Widget" here for best results', 'powermag' ),
		'before_widget' => '<aside id="%1$s" class="widget %2$s">',
		'after_widget' => '</aside>',
		'before_title' => $pm_before_title,
		'after_title' => $pm_after_title,	) );
	
	register_sidebar( array(
		'name' => __( 'Homepage Medium', 'powermag' ),
		'id' => 'homepage-2',
		'description' => __( 'Same as above, just thinner.', 'powermag' ),
		'before_widget' => '<aside id="%1$s" class="widget %2$s">',
		'after_widget' => '</aside>',
		'before_title' => $pm_before_title,
		'after_title' => $pm_after_title,
	) );
	
	register_sidebar( array(
		'name' => __( 'Homepage Small', 'powermag' ),
		'id' => 'homepage-3',
		'description' => __( 'Same as above, even thinner. You can also choose to hide this and display the default sidebar instead from the Theme Options.', 'powermag' ),
		'before_widget' => '<aside id="%1$s" class="widget %2$s">',
		'after_widget' => '</aside>',
		'before_title' => $pm_before_title,
		'after_title' => $pm_after_title,	) );
	
	register_sidebar( array(
		'name' => __( 'Footer1', 'powermag' ),
		'id' => 'footer-1',
		'description' => __( 'First column footer widget, for best results only place one widget here.', 'powermag' ),
		'before_widget' => '<aside id="%1$s" class="widget %2$s">',
		'after_widget' => '</aside>',
		'before_title' => $pm_before_title,
		'after_title' => $pm_after_title,	) );
	
	register_sidebar( array(
		'name' => __( 'Footer2', 'powermag' ),
		'id' => 'footer-2',
		'description' => __( 'Second column footer widget, for best results only place one widget here.', 'powermag' ),
		'before_widget' => '<aside id="%1$s" class="widget %2$s">',
		'after_widget' => '</aside>',
		'before_title' => $pm_before_title,
		'after_title' => $pm_after_title,	) );
	
	register_sidebar( array(
		'name' => __( 'Footer3', 'powermag' ),
		'id' => 'footer-3',
		'description' => __( 'Third column footer widget, for best results only place one widget here.', 'powermag' ),
		'before_widget' => '<aside id="%1$s" class="widget %2$s">',
		'after_widget' => '</aside>',
		'before_title' => $pm_before_title,
		'after_title' => $pm_after_title,
	) );
}
add_action( 'widgets_init', 'powermag_widgets_init' );


/*
==========================================================
POST THUMBNAIL FORMATS
==========================================================
*/

if ( function_exists( 'add_image_size' ) ) {
	/*sliders*/
	add_image_size( 'slider-single', 1170, 434, true );
	add_image_size( 'slider-double', 570, 434, true );
	add_image_size( 'slider-carousel', 970, 342, true );
	add_image_size( 'slider-double-carousel', 470, 358, true );
	add_image_size( 'slider-cat', 770, 472, true );
	add_image_size( 'slider-cat-carousel', 570, 350, true );
	/*others*/
	add_image_size( 'block-thumbs', 220, 246, true );
	add_image_size( 'small-thumbs', 220, 130, true );
	add_image_size( 'carousel-thumbs', 180, 200, true );
	add_image_size( 'mini-thumbs', 95, 53, true );
	add_image_size( 'tabs-thumbs', 70, 70, true );
	add_image_size( 'loop', 370, 260, true );
}	

/*
==========================================================
PAGE BUILDER INITIALIZATION
==========================================================
*/
	
$dir = dirname(__FILE__) . '/inc/';
 
$composer_settings = Array(
    'APP_ROOT'      => $dir . '/js_composer',
    'WP_ROOT'       => dirname( dirname( dirname( dirname($dir ) ) ) ). '/',
    'APP_DIR'       => basename( $dir ) . '/js_composer/',
    'CONFIG'        => $dir . '/js_composer/config/',
    'ASSETS_DIR'    => 'assets/',
    'COMPOSER'      => $dir . '/js_composer/composer/',
    'COMPOSER_LIB'  => $dir . '/js_composer/composer/lib/',
    'SHORTCODES_LIB'  => $dir . '/js_composer/composer/lib/shortcodes/',
    'default_post_types' => Array('page', 'post')
);
 
require_once locate_template('/inc/js_composer/js_composer.php');
 
$wpVC_setup->init($composer_settings);

// Disable unwanted modules
wpb_remove("vc_teaser_grid");


/*
==========================================================
ENQUEUE SCRIPTS AND STYLES
==========================================================
*/

function powermag_scripts() {
	
	$pm = wp_get_theme();
	$pm_v = $pm->Version;;
	
	//Basic Stylesheets
	wp_enqueue_style ('style', get_template_directory_uri() . '/style.css', array(), 'all' );
	wp_enqueue_style ('bootstrap-css', get_template_directory_uri() . '/css/bootstrap.css', array(), 'all' );
	
	//Server Side LESS Php Compiler
	$parser = new lessc(); // Start new object from PHP Less script
	$less_code = file_get_contents( get_template_directory() . '/css/less/layout.less'); // Grab LESS
	$processed_css = $parser->parse($less_code); // Process to CSS
	file_put_contents( get_template_directory() . '/css/less.css', $processed_css); // Write CSS
	wp_enqueue_style ( 'less-code', get_stylesheet_directory_uri() . '/css/less.css', array(), 'all' ); // Link CSS in page
	
	//Other CSS files
	wp_enqueue_style ( 'font-awesome-css', get_stylesheet_directory_uri() . '/css/font-awesome.css', array(), 'all' ); //FontAwesome Stylesheet @since PM 1.1
	wp_enqueue_style ( 'jackbox-css', get_stylesheet_directory_uri() . '/inc/jackbox/css/jackbox.css', array(), 'all' ); //Jackbox Stylesheet
	wp_enqueue_style ( 'pm_js_composer_front', get_stylesheet_directory_uri() . '/css/pm_js_composer_front.css', array(), 'all' ); //Custom PageBuilder
	
	//Basic Scripts
	wp_enqueue_script( 'bootstrap-js', get_template_directory_uri() . '/js/bootstrap.min.js', array( 'jquery' ), '2.0', true );
	wp_enqueue_script( 'flexslider', get_template_directory_uri() . '/js/jquery.flexslider.min.js', array( 'jquery' ), '2.1', true );
	wp_enqueue_script( 'fitvids', get_template_directory_uri() .'/js/jquery.fitvids.min.js', array('jquery'), '1.0', true );
	wp_enqueue_script( 'jackbox', get_template_directory_uri() . '/inc/jackbox/js/jackbox-for-powermag.min.js', array('jquery'), $pm_v, true );
	wp_enqueue_script( 'djwd-js', get_template_directory_uri() . '/js/djwd.js', array( 'jquery' ), $pm_v, true );
	
	//Deregister Uneeded scripts
	wp_deregister_script('prettyphoto');
	
	/* Conditional Scripts */

	if ( is_home() AND of_get_option('tabs_activate') ) {
		wp_enqueue_script( 'jquery-tools', get_template_directory_uri() .'/js/jquery.tools.min.js', array('jquery'), '1.2.7', true );
	}
	
	//Responsiveness
	//if (of_get_option('pm_responsive')) {
	wp_enqueue_script('small-menu', get_template_directory_uri() . '/js/small-menu.js', array( 'jquery' ), '20120206', true );
	//wp_enqueue_style ('bootstrap-css', get_template_directory_uri() . '/css/bootstrap.responsive.css', array(), 'all' );
	wp_enqueue_style ('responsive', get_stylesheet_directory_uri() . '/css/responsive.css', array(), 'all' ); 
	//}
	
	//Masonry Blog Style
	if ( ( of_get_option('pm_homestyle') == 'classic' AND is_home() AND of_get_option('pm_blogstyle') == 'default' ) OR (  of_get_option('pm_blogstyle') == 'default' AND !is_home() AND !is_single() ) ) {
		wp_enqueue_script( 'jquery-masonry'); /* since @PM 1.1 */
	}
	
	//Retina.js
	if ( of_get_option('pm_retina') ) {
	wp_enqueue_script( 'retina-js', get_template_directory_uri() . '/js/retina.min.js', array( 'jquery' ), '0.0.2', true ); }
	
	//News Ticker
	if ( of_get_option('pm_ticker') ) {
		wp_enqueue_script( 'ticker', get_template_directory_uri() . '/js/jquery.ticker.min.js', array( 'jquery' ), $pm_v, true );
	}
	
	//Home Carousel
	$category_ID = get_query_var('cat');
	$cat_carousel = get_tax_meta($category_ID,'pm_featured_carousel') == 'on';
	if ( (is_home() AND of_get_option('pm_carousel') ) OR $cat_carousel ) {
	wp_enqueue_script('carousel', get_template_directory_uri() . '/js/jquery.homecarousel.js', array( 'jquery' ), '6.0.4', true ); }

	//Threaded Comments
	if ( is_singular() && comments_open() && get_option( 'thread_comments' ) ) {
		wp_enqueue_script( 'comment-reply' );
	}

	//Keyboard Image Navigation
	if ( is_singular() && wp_attachment_is_image() ) {
		wp_enqueue_script( 'keyboard-image-navigation', get_template_directory_uri() . '/js/keyboard-image-navigation.js', array( 'jquery' ), '20120202' );
	}
	
	//Deregister Unneeded Styles  [ already incorporated with PowerMag ]
	add_action( 'wp_print_styles', 'deregister_styles', 100 );
	function deregister_styles() {
		
		// ContactForm7
        wp_deregister_style( 'contact-form-7' );
		
		 //PageBuilder
		wp_deregister_style( 'flexslider' );
		wp_deregister_style( 'js_composer_front' );
		wp_deregister_style( 'prettyphoto' );
		}
	
	}
	
add_action( 'wp_enqueue_scripts', 'powermag_scripts' );


/*
==========================================================
BWP MINIFY SETUP @since PM 1.1
==========================================================
*/

//Apply dir filter
add_filter('bwp_minify_min_dir', 'set_bwp_min_directory');
function set_bwp_min_directory()
{
	return get_template_directory_uri() . '/inc/bwp-minify/min/';
}

//Scripts to minify
add_filter('bwp_minify_allowed_scripts', 'pm_allowed_scripts');
function pm_allowed_scripts()
{
	$minify_js = of_get_option('pm_minify_js');
	
	if ($minify_js) {
		
		return array( 'djwd-js', 'bootstrap-js', 'comment-reply', 'jackbox', 'flexslider', 'fitvids', 'elastislide', 'carousel', 'jquery-masonry', 'ticker', 'tweet', 'retina-js', 'shortcodes-ultimate', 'small-menu', 'jquery-form', 'contact-form-7', 'login-with-ajax', 'jquery-ui-core', 'jquery-ui-tabs', 'jquery-ui-accordion', 'jquery-ui-widget', 'isotope', 'jquery-tools', 'wpb_composer_front_js', 'jquery_ui_tabs_rotate', 'paginating_js', 'wpb_bootstrap_modals_js' );
		
	}
	
}

//Styles to minify
add_filter('bwp_minify_allowed_styles', 'pm_allowed_styles');
function pm_allowed_styles()
{	
	$minify_css = of_get_option('pm_minify_css');
	
	if ($minify_css) {
		
		return array( 'style', 'pm_js_composer_front', 'jackbox-css', 'less-code', 'bootstrap-css', 'font-awesome-css', 'responsive', 'shortcodes-ultimate' );
		
	}
}

//Remove Admin Settings Page
add_action( 'admin_menu', 'pm_remove_menus', 999 );
function pm_remove_menus() {

	remove_submenu_page( 'options-general.php', 'bwp_minify_general' );
}

/*
==========================================================
ENQUEUE ADMIN SCRIPTS
==========================================================
*/

function powermag_admin_scripts() {
	wp_enqueue_script('ios-checkboxes', get_template_directory_uri() . '/admin/options-core/js/checkboxes.js');

}
add_action('admin_enqueue_scripts', 'powermag_admin_scripts');


/*
==========================================================
FAVICON
==========================================================
*/

function pm_favicon() {
	$favicon = of_get_option('pm_favicon', false);
	if ( $favicon ) {
        echo '<link rel="shortcut icon" href="'.  $favicon  .'"/>'."\n";
    }
}

add_action('wp_head', 'pm_favicon', 1);

/*
==========================================================
<HEAD> JS ADD-ONS @since PM 1.1 (splitted CSS/JS)
==========================================================
*/

function head_js_addons(){
	
	//Load Facebook Comments JSSDK only if enabled
	$pm_comment_type = get_post_meta(get_the_ID(), 'pm_comment_type', true);
	
	if ( $pm_comment_type == 'fb' ) { ?>
		<div id="fb-root"></div>
		<script>(function(d, s, id) {var js, fjs = d.getElementsByTagName(s)[0];  if (d.getElementById(id)) return;  js = d.createElement(s); js.id = id;  js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";  fjs.parentNode.insertBefore(js, fjs); }(document, 'script', 'facebook-jssdk'));</script>
	<?php }; 
	
};
add_action('wp_head','head_js_addons', 1);


/*
==========================================================
<HEAD> CSS ADD-ONS @since PM 1.1 (splitted CSS/JS)
==========================================================
*/

function head_css_addons(){
	
	// Left Sidebar
	if ( of_get_option('pm_sidebar_position') == 'sidebar-content' ) { ?>
		<style>

		#sidebar {
			float:left!important;
			margin-left:0;
			
		}
			
		#primary {
			float:right !important;
			margin-left:auto;
		}
			
		@media (max-width: 767px) {
		
		#sidebar {
				display: inline-block;
				margin-top: 20px;
				width: 100%;
		}
			
		#primary {
				float:none !important;
				margin-left:0;
			}
		}
		</style>
	<?php };

	
	//User Custom CSS
	if ( of_get_option('pm_custom_css') ) { ?>
		<style><?php echo of_get_option('pm_custom_css'); ?></style>
	<?php };
	
};
add_action('wp_head','head_css_addons');


/*
==========================================================
JQUERY DEPENDANT - FOOTER LOADED DYNAMIC JS TRIGGERS
==========================================================
*/

function pm_footer_scripts() {
    if( wp_script_is( 'jquery', 'done' ) ) { //Check if jQuery is loaded
	
		// Fade in Content @since PM 1.1 (moved in footer)
		if ( ( of_get_option('pm_fadein')) ) { ?>
			<script type="text/javascript">
			jQuery(document).ready(function($) {
				$('#main').css('visibility','visible').hide().fadeIn(<?php echo of_get_option('pm_fadein_speed')?>);
				$('.spinner').hide();
			});
			</script>
		<?php } else { ?>
			<style>#main {visibility: visible;}</style>
		<?php }; 
		
		//Useful Variable @since PM 1.1 (moved in footer)
		?>
			<script type="text/javascript">
			var templateDir = "<?php bloginfo('template_directory'); ?>";
			</script>
		<?php

		//Masonry Fire
		if ( ( of_get_option('pm_homestyle') == 'classic' AND is_home() AND of_get_option('pm_blogstyle') == 'default' ) OR (  of_get_option('pm_blogstyle') == 'default' AND !is_home() AND !is_single() ) ) { ?>
			<script>
			jQuery(document).ready(function($) {
				var $container = $('#loop-wrap');
			
				var gutter = 30;
				var min_width = 260;
				$container.imagesLoaded( function(){
					$container.masonry({
						itemSelector : '.box',
						gutterWidth: gutter,
						isAnimated: true,
						  columnWidth: function( containerWidth ) {
							var num_of_boxes = (containerWidth/min_width | 0);
			
							var box_width = (((containerWidth - (num_of_boxes-1)*gutter)/num_of_boxes) | 0) ;
			
							if (containerWidth < min_width) {
								box_width = containerWidth;
							}
			
							$('.box').width(box_width);
			
							return box_width;
						  }
					});
				});
			});
			</script>
		<?php };
	
		
		//News Ticker
		if ( of_get_option('pm_ticker') ) { ?>
			<script type="text/javascript">
		
			jQuery(document).ready(function($) {
				$('#js-news').ticker({
					titleText: '',
					controls:  <?php if ( of_get_option('pm_ticker_controls') ) { echo 'true'; } else { echo 'false';} ?>,
					displayType: '<?php if ( of_get_option('pm_ticker_animation') == 'reveal' ) { echo 'reveal'; } else { echo 'fade';} ?>',
					speed: '<?php echo of_get_option('pm_ticker_revealspeed'); ?>',
					pauseOnItems: <?php echo of_get_option('pm_ticker_pause'); ?>,
					fadeInSpeed: <?php echo of_get_option('pm_ticker_speedin'); ?>,      // Speed of fade in animation 600
					fadeOutSpeed: <?php echo of_get_option('pm_ticker_speedout'); ?>     // Speed of fade out animation DEF 300
				});
			});
		
			</script>
		<?php };
	
	
		//Primary Slider
		if ( ( of_get_option('pm_slider_1')) ) { ?>
			<script type="text/javascript">
		
			jQuery(document).ready(function($) {
				jQuery('.slider1 .flexslider').flexslider({
					animation: "<?php echo of_get_option('pm_slider_1_animation'); ?>",
					direction: "<?php echo of_get_option('pm_slider_1_direction'); ?>",
					startAt: <?php echo of_get_option('pm_slider_1_start'); ?>,         
					slideshowSpeed: <?php echo of_get_option('pm_slider_1_slide_speed'); ?>,         
					animationSpeed: <?php echo of_get_option('pm_slider_1_anim_speed'); ?>, 
				});
			});
		
			</script>
		<?php };
		
		
		//Seondary Slider
		if ( ( of_get_option('pm_slider_2')) ) { ?>
			<script type="text/javascript">
		
			jQuery(document).ready(function($) {
				jQuery('.slider2 .flexslider').flexslider({
					animation: "<?php echo of_get_option('pm_slider_2_animation'); ?>",
					direction: "<?php echo of_get_option('pm_slider_2_direction'); ?>",
					startAt: <?php echo of_get_option('pm_slider_2_start'); ?>,         
					slideshowSpeed: <?php echo of_get_option('pm_slider_2_slide_speed'); ?>,         
					animationSpeed: <?php echo of_get_option('pm_slider_2_anim_speed'); ?>, 
				});
			});
		
			</script>
		<?php };
		
	
		//Home Carousel
		$category_ID = get_query_var('cat');
		$cat_carousel = get_tax_meta($category_ID,'pm_featured_carousel') == 'on';
		if ( (is_home() AND of_get_option('pm_carousel') ) OR $cat_carousel ) { ?>
			<script type="text/javascript">
				jQuery(function($) {
					$('#carousel').carouFredSel({
						direction: 'down',
						height: <?php  if ( of_get_option('pm_slider_2') AND of_get_option('pm_carousel') ) { echo '358'; } else { echo '342'; }?>,
						align: false,
						padding: [0, 0, 350, 0],
						items: {
							
							visible: 5,
							minimum: 1
						},
						scroll: {
							items: 1,
							duration: 1000,
							onBefore: function( data ) {
								$('span', this).removeClass('selected');
								data.items.visible.last().find('span').addClass('selected');
							}
						}
					});
					$('#carousel').children().click(function() {
						$('#carousel').trigger( 'slideTo', [this, -4, 'prev'] );
					});
				});
			</script>
		<?php };
		
		
		/* Home Tabs */
		if ( ( of_get_option('tabs_activate')) AND is_home() ) { ?>
			<script type="text/javascript">
			jQuery(document).ready(function($) {
				   $(".cat-tabs").tabs(".cat-panes-content", {
					effect: 'fade',
					tabs: 'li',
					rotate: true,
	
			   }).slideshow( {
					autoplay: <?php if ( of_get_option('tabs_autoplay') ) { echo 'true'; } else { echo 'false';} ?>,
					interval: <?php echo of_get_option('tabs_duration'); ?>,
					clickable: false,
				});
			});
			</script>
	
		<?php };
		
		
		/* User Rating */
			
		$pm_review_type = get_post_meta(get_the_ID(), 'pm_review_type', true);
		$pm_user_rating_switch = get_post_meta(get_the_ID(), 'pm_user_rating_switch', true);
		
		if ( ($pm_user_rating_switch) AND is_single() /* is_single @since PM 1.1 */ ) {
		?>
		
		<script type="text/javascript">
		;
		(function ($) {
			function user_rating() {
				if ($('.rw-user-rating').length) {
				  // Get elements
				  this.el = this.build_el();
				  if (!this.is_rated()) {
					  // Interface fixes
					  this.el.stars.top.css('background-position-y', '1px');
					  this.el.stars.under.css('width', '100px');
					  // Bind Events
					  this.bind_events();
				  } else {
					  this.display_user_rating();
				  }
				}
			}
		
			user_rating.prototype.is_rated = function () {
				if (this.readCookie('pm_rating_' + pm_script.post_id) === 'rated') {
					return true;
				} else {
					return false;
				}
			};
		
			user_rating.prototype.display_user_rating = function () {
				var score = this.readCookie('pm_rating_score_' + pm_script.post_id),
					position = this.readCookie('pm_rating_position_'+ pm_script.post_id);
				this.el.rating.score.html(score);
				this.el.stars.top.css('width', position + '%');
				this.el.rating.label.your_rating.show();
				this.el.rating.label.user_rating.hide();
			};
		
			user_rating.prototype.build_el = function () {
				var el = {
					rating:{
						score:$('SPAN.score', '.rw-user-rating-desc'),
						count:$('SPAN.count', '.rw-user-rating-desc'),
						label:{
							your_rating:$('SPAN.your_rating', '.rw-user-rating-desc'),
							user_rating:$('SPAN.user_rating', '.rw-user-rating-desc')
						}
					},
					stars:{
						under:$('.criteria-stars-color', '.rw-user-rating'),
						top:$('.criteria-stars-overlay', '.rw-user-rating')
					}
				};
		
				// Plain JS style retrieval
				el.stars.old_position = parseInt(el.stars.top[0].style.width, 10);
				el.rating.old_score = el.rating.score.html();
		
				return el;
			};
		
			user_rating.prototype.bind_events = function () {
				var me = this;
		
				// Hover effect
				me.el.stars.under.on('mouseover', function () {
					// changes the sprite
					me.el.stars.top.css('background-position-y', '-20px');
		
					// Changes the cursor
					$(this).css('cursor', 'pointer');
		
					// changes the text
					me.el.rating.label.your_rating.show();
					me.el.rating.label.user_rating.hide();
		
				});
				me.el.stars.under.on('mouseout', function () {
					// Returns the sprite
					me.el.stars.top.css('background-position-y', '1px');
		
					// Returns the initial position
					me.el.stars.top.css('width', me.el.stars.old_position + '%');
		
					// Returns the text and initial rating
					me.el.rating.label.user_rating.show();
					me.el.rating.label.your_rating.hide();
					me.el.rating.score.html(me.el.rating.old_score);
		
				});
				me.el.stars.under.on('mousemove', function (e) {
					if (!e.offsetX){
						e.offsetX = e.clientX - $(e.target).offset().left;
					}
					// Moves the width
					var offset = e.offsetX + 4;
					if (offset > 100) {
						offset = 100;
					}
					me.el.stars.top.css('width', offset + '%');
		
					
					// Update the real-time score
					
					<?php if ($pm_review_type == 'percent') { ?>
					
					var score = Math.floor(offset);
					if (score > 100) {
						score = 100;
					}
					
					<?php } else { ?>
	
					var score = Math.floor(((offset / 10) * 5)) / 10;
					if (score > 5) {
						score = 5;
					}
					
					<?php } ?>
					me.el.rating.score.html(score);
		
				});
		
				// Click effect
				me.el.stars.under.on('click', function (e) {
					if (!e.offsetX){
						e.offsetX = e.clientX - $(e.target).offset().left;
					}
					
					<?php if ($pm_review_type == 'percent') { // Display votes in a scale of 100 if % is selected ?>
					
					var count = parseInt(me.el.rating.count.html(), 10) + 1,
						score = (Math.floor(((e.offsetX + 4)) ) ),
						position = e.offsetX + 4;
					if (score > 100) {
						score = 100;
					}
					
					<?php } else { //Display votes in a scale of 5 if stars are selected ?>
					
					var count = parseInt(me.el.rating.count.html(), 10) + 1,
						score = (Math.floor(((e.offsetX + 4) / 10) * 5) / 10),
						position = e.offsetX + 4;
					if (score > 5) {
						score = 5;
					}
					
					<?php } ?>
					
					if (position > 100) {
						position = 100;
					}
					// Unbind events
					me.el.stars.under.off();
					me.el.stars.under.css('cursor', 'default');
		
					// Stars animation
					me.el.stars.top.fadeOut(function () {
						me.el.stars.top.css('background-position-y', '0');
						me.el.stars.top.fadeIn();
					});
		
					// Count increment
					me.el.rating.count.html(count);
		
					// AJAX call to wordpress
					var req = {
						action:'pm_rating',
						rating_position:position,
						rating_score:score,
						post_id:pm_script.post_id
					};
		
					$.post(pm_script.ajaxurl, req, function () {
						// Save cookie
						me.createCookie('pm_rating_' + pm_script.post_id, 'rated', 900);
						me.createCookie('pm_rating_score_' + pm_script.post_id, score, 900);
						me.createCookie('pm_rating_position_' + pm_script.post_id, position, 900);
					})
				});
			};
		
			user_rating.prototype.createCookie = function (name, value, days) {
				if (days) {
					var date = new Date();
					date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
					var expires = "; expires=" + date.toGMTString();
				}
				else var expires = "";
				document.cookie = name + "=" + value + expires + "; path=/";
			}
		
			user_rating.prototype.readCookie = function (name) {
				var nameEQ = name + "=";
				var ca = document.cookie.split(';');
				for (var i = 0; i < ca.length; i++) {
					var c = ca[i];
					while (c.charAt(0) == ' ') c = c.substring(1, c.length);
					if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length, c.length);
				}
				return null;
			}
		
			user_rating.prototype.eraseCookie = function (name) {
				createCookie(name, "", -1);
			}
		
			$(document).ready(function () {
				new user_rating();
			});
		})(jQuery);
		</script>

		<?php }
		
		//User Custom JS
		/*if ( ( of_get_option('pm_custom_js')) ) { ?>
			<script type="text/javascript"><?php echo of_get_option('pm_custom_js'); ?></script>
		<?php }; */
	
		/*End*/
		
    }
	
}
add_action( 'wp_footer', 'pm_footer_scripts' );

function pm_custom_js() {
	//User Custom JS
	if ( ( of_get_option('pm_custom_js')) ) { ?>
		<script type="text/javascript"><?php echo of_get_option('pm_custom_js'); ?></script>
	<?php }; 
}
add_action( 'wp_footer', 'pm_custom_js', 99999 );

/*
==========================================================
GOOGLE ANALYTICS
==========================================================
*/
 
function pm_analytics(){
	$output = of_get_option( 'pm_google_analytics' );
	if ( $output <> "" )
		echo stripslashes($output) . "\n";
}

add_action( 'wp_footer','pm_analytics' );


/*
==========================================================
MAIN NAV ALTERATIONS
==========================================================
*/

class Description_Walker extends Walker_Nav_Menu
{
    /**
     * Start the element output.
     *
     * @param  string $output Passed by reference. Used to append additional content.
     * @param  object $item   Menu item data object.
     * @param  int $depth     Depth of menu item. May be used for padding.
     * @param  array $args    Additional strings.
     * @return void
     */
    function start_el(&$output, $item, $depth, $args)
    {
        $classes = empty ($item->classes) ? array() : (array)$item->classes;

        $class_names = join(
            ' '
            , apply_filters(
                'nav_menu_css_class'
                , array_filter($classes), $item
            )
        );

        !empty ($class_names)
            and $class_names = ' class="' . esc_attr($class_names) . '"';

        $output .= "<li id='menu-item-$item->ID' $class_names>";

        $attributes = '';

        !empty($item->attr_title)
            and $attributes .= ' title="' . esc_attr($item->attr_title) . '"';
        !empty($item->target)
            and $attributes .= ' target="' . esc_attr($item->target) . '"';
        !empty($item->xfn)
            and $attributes .= ' rel="' . esc_attr($item->xfn) . '"';
        !empty($item->url)
            and $attributes .= ' href="' . esc_attr($item->url) . '"';
        !empty($item->description)
            and $attributes .= ' id="' . esc_attr($item->description) . '"';

        // insert description for top level elements only
        // you may change this
        $description = (!empty ($item->description) and 0 == $depth)

            ? '<small class="nav_desc">' . esc_attr($item->description) . '</small>' : '';

        $title = apply_filters('the_title', $item->title, $item->ID);

		$args = (object)$args;
		
        $item_output = $args->before
            . "<a $attributes>"
            . $args->link_before
            . $title
            . '</a> '
            . $args->link_after
            . $description
            . $args->after;

        // Since $output is called by reference we don't need to return anything.
        $output .= apply_filters(
            'walker_nav_menu_start_el'
            , $item_output
            , $item
            , $depth
            , $args
        );
    }
}


/*
==========================================================
TRIMMING TOOLS
==========================================================
*/

//String Limit Title by letters
function the_trimd_title ($after = '', $length) 
{	
	$mytitle = get_the_title();
	if ( strlen($mytitle) > $length ) {
	$mytitle = substr($mytitle,0,$length);
	echo $mytitle . $after;
	} else {
	echo $mytitle;
	}
}

//String Limit by words
function string_limit_words($string, $word_limit)
{
	$words = explode(' ', $string, ($word_limit + 1));
	
	if(count($words) > $word_limit) {
		array_pop($words);
	}
	
	return implode(' ', $words);
}


/*
==========================================================
TIME AGO FUNCTION
==========================================================
*/
 
function pm_time_ago() {
 
	global $post;
 
	$date = get_post_time('G', true, $post);
 
	// Array of time period chunks
	$chunks = array(
		array( 60 * 60 * 24 * 365 , __( '<span>year', 'powermag' ), __( '<span>years', 'powermag' ) ),
		array( 60 * 60 * 24 * 30 , __( '<span>month', 'powermag' ), __( '<span>months', 'powermag' ) ),
		array( 60 * 60 * 24 * 7, __( '<span>week', 'powermag' ), __( '<span>weeks', 'powermag' ) ),
		array( 60 * 60 * 24 , __( '<span>day', 'powermag' ), __( '<span>days', 'powermag' ) ),
		array( 60 * 60 , __( '<span>hour', 'powermag' ), __( '<span>hours', 'powermag' ) ),
		array( 60 , __( '<span>minute', 'powermag' ), __( '<span>minutes', 'powermag' ) ),
		array( 1, __( '<span>second', 'powermag' ), __( '<span>seconds', 'powermag' ) )
	);
 
	if ( !is_numeric( $date ) ) {
		$time_chunks = explode( ':', str_replace( ' ', ':', $date ) );
		$date_chunks = explode( '-', str_replace( ' ', '-', $date ) );
		$date = gmmktime( (int)$time_chunks[1], (int)$time_chunks[2], (int)$time_chunks[3], (int)$date_chunks[1], (int)$date_chunks[2], (int)$date_chunks[0] );
	}
 
	$current_time = current_time( 'mysql', $gmt = 0 );
	$newer_date = strtotime( $current_time );
 
	// Difference in seconds
	$since = $newer_date - $date;
 
	// Something went wrong with date calculation and we ended up with a negative date.
	if ( 0 > $since )
		return __( 'sometime', 'powermag' );
 
	/**
	 * We only want to output one chunks of time here, eg:
	 * x years
	 * xx months
	 * so there's only one bit of calculation below:
	 */
 
	//Step one: the first chunk
	for ( $i = 0, $j = count($chunks); $i < $j; $i++) {
		$seconds = $chunks[$i][0];
 
		// Finding the biggest chunk (if the chunk fits, break)
		if ( ( $count = floor($since / $seconds) ) != 0 )
			break;
	}
	
	// Set output var
	
	$output = ( 1 == $count ) ? '1 '. $chunks[$i][1] : $count . ' ' . $chunks[$i][2];

 
	if ( !(int)trim($output) ){
		$output = '0 ' . __( 'seconds', 'powermag' );
	}
 
	$output .= __(' ago</span>', 'powermag');
 
	return $output;
}
 
add_filter('the_time', 'pm_time_ago');


/*
==========================================================
LINK THUMBNAILS TO PERMALINK
==========================================================
*/

function pm_post_image_html( $html, $post_id, $post_image_id ) {
 
$html = '<a href="' . get_permalink( $post_id ) . '" title="' . esc_attr( get_post_field( 'post_title', $post_id ) ) . '">' . $html . '</a>';
 
return $html;
}

add_filter( 'post_thumbnail_html', 'pm_post_image_html', 10, 3 );


/*
==========================================================
BREADCRUMBS
==========================================================
*/

function pm_breadcrumb() {

	/* === OPTIONS === */
	$text['home']     = __('Home', 'powermag'); // text for the 'Home' link
	$text['category'] = __('Archive by Category "%s"', 'powermag'); // text for a category page
	$text['search']   = __('Search Results for "%s" Query', 'powermag'); // text for a search results page
	$text['tag']      = __('Posts Tagged "%s"', 'powermag'); // text for a tag page
	$text['author']   = __('Articles Posted by %s', 'powermag'); // text for an author page
	$text['404']      = __('Error 404', 'powermag'); // text for the 404 page

	$show_current   = 1; // 1 - show current post/page/category title in breadcrumbs, 0 - don't show
	$show_on_home   = 0; // 1 - show breadcrumbs on the homepage, 0 - don't show
	$show_home_link = 1; // 1 - show the 'Home' link, 0 - don't show
	$show_title     = 1; // 1 - show the title for the links, 0 - don't show
	$delimiter      = ''; // delimiter between crumbs
	$before         = '<li class="current">'; // tag before the current crumb
	$after          = '</li>'; // tag after the current crumb
	/* === END OF OPTIONS === */

	global $post;
	$home_link    = home_url('/');
	$link_before  = '<li typeof="v:Breadcrumb">';
	$link_after   = '<i class="icon-chevron-right"></i></li>';
	$link_attr    = ' rel="v:url" property="v:title"';
	$link         = $link_before . '<a' . $link_attr . ' href="%1$s">%2$s</a>' . $link_after;
	$parent_id    = $post->post_parent;
	$frontpage_id = get_option('page_on_front');

	if (is_home() || is_front_page()) {

		if ($show_on_home == 1) echo '<ul class="breadcrumb"><a href="' . $home_link . '">' . $text['home'] . '</a></ul>';

	} else {

		echo '<ul class="breadcrumb" xmlns:v="http://rdf.data-vocabulary.org/#">';
		if ($show_home_link == 1) echo sprintf($link, $home_link, $text['home']);
		if ($parent_id != $frontpage_id && $show_home_link == 1) echo $delimiter;

		if ( is_category() ) {
			$this_cat = get_category(get_query_var('cat'), false);
			if ($this_cat->parent != 0) {
				$cats = get_category_parents($this_cat->parent, TRUE, $delimiter);
				if ($show_current == 0) $cats = preg_replace("#^(.+)$delimiter$#", "$1", $cats);
				$cats = str_replace('<a', $link_before . '<a' . $link_attr, $cats);
				$cats = str_replace('</a>', '</a>' . $link_after, $cats);
				if ($show_title == 0) $cats = preg_replace('/ title="(.*?)"/', '', $cats);
				echo $cats;
			}
			if ($show_current == 1) echo $before . sprintf($text['category'], single_cat_title('', false)) . $after;

		} elseif ( is_search() ) {
			echo $before . sprintf($text['search'], get_search_query()) . $after;

		} elseif ( is_day() ) {
			echo sprintf($link, get_year_link(get_the_time('Y')), get_the_time('Y')) . $delimiter;
			echo sprintf($link, get_month_link(get_the_time('Y'),get_the_time('m')), get_the_time('F')) . $delimiter;
			echo $before . get_the_time('d') . $after;

		} elseif ( is_month() ) {
			echo sprintf($link, get_year_link(get_the_time('Y')), get_the_time('Y')) . $delimiter;
			echo $before . get_the_time('F') . $after;

		} elseif ( is_year() ) {
			echo $before . get_the_time('Y') . $after;

		} elseif ( is_single() && !is_attachment() ) {
			if ( get_post_type() != 'post' ) {
				$post_type = get_post_type_object(get_post_type());
				$slug = $post_type->rewrite;
				printf($link, $home_link . '/' . $slug['slug'] . '/', $post_type->labels->singular_name);
				if ($show_current == 1) echo $delimiter . $before . get_the_title() . $after;
			} else {
				$cat = get_the_category(); $cat = $cat[0];
				$cats = get_category_parents($cat, TRUE, $delimiter);
				if ($show_current == 0) $cats = preg_replace("#^(.+)$delimiter$#", "$1", $cats);
				$cats = str_replace('<a', $link_before . '<a' . $link_attr, $cats);
				$cats = str_replace('</a>', '</a>' . $link_after, $cats);
				if ($show_title == 0) $cats = preg_replace('/ title="(.*?)"/', '', $cats);
				echo $cats;
				if ($show_current == 1) echo $before . get_the_title() . $after;
			}

		} elseif ( !is_single() && !is_page() && get_post_type() != 'post' && !is_404() ) {
			$post_type = get_post_type_object(get_post_type());
			echo $before . $post_type->labels->singular_name . $after;

		} elseif ( is_attachment() ) {
			$parent = get_post($parent_id);
			$cat = get_the_category($parent->ID); $cat = $cat[0];
			$cats = get_category_parents($cat, TRUE, $delimiter);
			$cats = str_replace('<a', $link_before . '<a' . $link_attr, $cats);
			$cats = str_replace('</a>', '</a>' . $link_after, $cats);
			if ($show_title == 0) $cats = preg_replace('/ title="(.*?)"/', '', $cats);
			echo $cats;
			printf($link, get_permalink($parent), $parent->post_title);
			if ($show_current == 1) echo $delimiter . $before . get_the_title() . $after;

		} elseif ( is_page() && !$parent_id ) {
			if ($show_current == 1) echo $before . get_the_title() . $after;

		} elseif ( is_page() && $parent_id ) {
			if ($parent_id != $frontpage_id) {
				$breadcrumbs = array();
				while ($parent_id) {
					$page = get_page($parent_id);
					if ($parent_id != $frontpage_id) {
						$breadcrumbs[] = sprintf($link, get_permalink($page->ID), get_the_title($page->ID));
					}
					$parent_id  = $page->post_parent;
				}
				$breadcrumbs = array_reverse($breadcrumbs);
				for ($i = 0; $i < count($breadcrumbs); $i++) {
					echo $breadcrumbs[$i];
					if ($i != count($breadcrumbs)-1) echo $delimiter;
				}
			}
			if ($show_current == 1) {
				if ($parent_id != $frontpage_id || $show_home_link == 1) echo $delimiter;
				echo $before . get_the_title() . $after;
			}

		} elseif ( is_tag() ) {
			echo $before . sprintf($text['tag'], single_tag_title('', false)) . $after;

		} elseif ( is_author() ) {
	 		global $author;
			$userdata = get_userdata($author);
			echo $before . sprintf($text['author'], $userdata->display_name) . $after;

		} elseif ( is_404() ) {
			echo $before . $text['404'] . $after;
		}

		if ( get_query_var('paged') ) {
			if ( is_category() || is_day() || is_month() || is_year() || is_search() || is_tag() || is_author() ) echo ' (';
			echo __('Page') . ' ' . get_query_var('paged');
			if ( is_category() || is_day() || is_month() || is_year() || is_search() || is_tag() || is_author() ) echo ')';
		}

		echo '</ul><!-- .breadcrumbs -->';

	}
}

/* Remove not (yet) html5 valid [rel="category"] attribute on categories */

function remove_category_rel($output)
{
    $output = str_replace(' rel="category"', '', $output);
    return $output;
}
add_filter('the_category', 'remove_category_rel');

/*
==========================================================
COMMENT FORM ALTERATIONS
==========================================================
*/

function alter_comment_form($new_defaults) {

//required variables for changing the fields value
$commenter = wp_get_current_commenter();
$req = get_option( 'require_name_email' );
$aria_req = ( $req ? " aria-required='true'" : '' );

$new_fields = array(
'author' => '<p class="comment-form-author">' . '<label for="author">' . __( 'Name', 'powermag' ) . '</label>
<div class="input-prepend"><span class="add-on"><i class="icon-user"></i></span>
<input id="author" name="author" type="text" placeholder="'. esc_attr__('Name','powermag') . '" value="' . esc_attr( $commenter['comment_author'] ) . '" size="20"' . $aria_req . ' /><i class="icon-asterisk"></i></div>'.( $req ? '' : '' ).'</p>',

'email' => '<p class="comment-form-email">' . '<label for="email">' . __( 'Email', 'powermag' ) . '</label>
<div class="input-prepend"><span class="add-on"><i class="icon-envelope-alt"></i></span>
<input id="email" name="email" type="text" placeholder="'. esc_attr__('Email','powermag') . '" value="' . esc_attr( $commenter['comment_author_email'] ) . '" size="20"' . $aria_req . ' /><i class="icon-asterisk"></i></div>' . ( $req ? '' : '' ) . '</p>',
				
'url' => '<p class="comment-form-url">' . '<label for="url">' . __( 'Url', 'powermag' ) . '</label>
<div class="input-prepend"><span class="add-on"><i class="icon-desktop"></i></span>
<input id="url" name="url" type="text" placeholder="'. esc_attr__('Website','powermag') . '" value="' . esc_attr( $commenter['comment_author_url'] ) . '" size="20"' . $aria_req . ' /></div></p>',
);

$new_defaults['fields'] = apply_filters('comment_form_default_fields', $new_fields);
$new_defaults['comment_field'] = '<p class="comment-form-comment"><label for="comment">' . _x( 'Comment', 'noun', 'powermag' ) . '</label><textarea id="comment" name="comment" cols="45" rows="8" aria-required="true"></textarea></p>';

$new_defaults['title_reply'] = __( 'Leave a Comment', 'powermag');


return $new_defaults;
}

add_filter('comment_form_defaults', 'alter_comment_form');


/*
==========================================================
PAGINATION
==========================================================
*/

function pm_num_pagination($pages = '', $range = 2)
{  
     $showitems = ($range * 2)+1;  

     global $paged;
     if(empty($paged)) $paged = 1;

     if($pages == '')
     {
         global $wp_query;
         $pages = $wp_query->max_num_pages;
         if(!$pages)
         {
             $pages = 1;
         }
     }   

     if(1 != $pages)
     {
         echo "<div class='page-nav'>";
         if($paged > 2 && $paged > $range+1 && $showitems < $pages) echo "<a href='".get_pagenum_link(1)."' class='page-numbers boxed'>&laquo;</a>";
         if($paged > 1 && $showitems < $pages) echo "<a href='".get_pagenum_link($paged - 1)."' class='page-numbers'>&lsaquo;</a>";

         for ($i=1; $i <= $pages; $i++)
         {
             if (1 != $pages &&( !($i >= $paged+$range+1 || $i <= $paged-$range-1) || $pages <= $showitems ))
             {
                 echo ($paged == $i)? "<span class='page-numbers boxed current'>".$i."</span>":"<a href='".get_pagenum_link($i)."' class='page-numbers boxed' >".$i."</a>";
             }
         }

         if ($paged < $pages && $showitems < $pages) echo "<a href='".get_pagenum_link($paged + 1)."' class='page-numbers boxed'>&rsaquo;</a>";  
         if ($paged < $pages-1 &&  $paged+$range-1 < $pages && $showitems < $pages) echo "<a href='".get_pagenum_link($pages)."' class='page-numbers boxed'>&raquo;</a>";
         echo "</div>\n";
     }
}


/*
==========================================================
REMOVE CAPTIONS ADDITIONAL 10PX
==========================================================
*/

add_filter('img_caption_shortcode', 'fix_img_caption_shortcode', 10, 3);

function fix_img_caption_shortcode($val, $attr, $content = null) {
    extract(shortcode_atts(array(
        'id'    => '',
        'align' => '',
        'width' => '',
        'caption' => ''
    ), $attr));

    if ( 1 > (int) $width || empty($caption) ) return $val;

    return '<div id="' . $id . '" class="wp-caption ' . esc_attr($align) . '" style="width: ' . (2 + (int) $width) . 'px">' . do_shortcode( $content ) . '<p class="wp-caption-text">' . $caption . '</p></div>';
}


/*
==========================================================
FIX .DATE CLASS CONFLICT
==========================================================
*/

add_filter('body_class', 'remove_a_body_class', 20, 2);
function remove_a_body_class($wp_classes) {
if( is_date() ) :
      foreach($wp_classes as $key => $value) {
      if ($value == 'date') unset($wp_classes[$key]);
      }
endif;
return $wp_classes;
}


/*
==========================================================
FIN
==========================================================
*/