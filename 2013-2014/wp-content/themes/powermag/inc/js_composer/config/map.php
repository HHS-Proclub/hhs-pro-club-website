<?php
/**
 * WPBakery Visual Composer Shortcodes settings
 *
 * @package VPBakeryVisualComposer
 *
 */
$vc_is_wp_version_3_6_more = version_compare(preg_replace('/^([\d\.]+)(\-.*$)/', '$1', get_bloginfo('version')), '3.6') >= 0;
// Used in "Button" and "Call to Action" blocks
$colors_arr = array(__("Grey", "js_composer") => "wpb_button", __("Blue", "js_composer") => "btn-primary", __("Turquoise", "js_composer") => "btn-info", __("Green", "js_composer") => "btn-success", __("Orange", "js_composer") => "btn-warning", __("Red", "js_composer") => "btn-danger", __("Black", "js_composer") => "btn-inverse");

// Used in "Button" and "Call to Action" blocks
$size_arr = array(__("Regular size", "js_composer") => "wpb_regularsize", __("Large", "js_composer") => "btn-large", __("Small", "js_composer") => "btn-small", __("Mini", "js_composer") => "btn-mini");

$target_arr = array(__("Same window", "js_composer") => "_self", __("New window", "js_composer") => "_blank");

wpb_map( array(
  "name" => __("Row", "js_composer"),
  "base" => "vc_row",
  "is_container" => true,
  "icon" => "icon-wpb-row",
  "show_settings_on_create" => false,
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcRowView'
) );
wpb_map( array(
  "name" => __("Row", "js_composer"), //Inner Row
  "base" => "vc_row_inner",
  "content_element" => false,
  "is_container" => true,
  "icon" => "icon-wpb-row",
  "show_settings_on_create" => false,
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcRowView'
) );
wpb_map( array(
  "name" => __("Column", "js_composer"),
  "base" => "vc_column",
  "is_container" => true,
  "content_element" => false,
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcColumnView'
) );

/* Text Block
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Text Block", "js_composer"),
  "base" => "vc_column_text",
  "icon" => "icon-wpb-layer-shape-text",
  "wrapper_class" => "clearfix",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textarea_html",
      "holder" => "div",
      "heading" => __("Text", "js_composer"),
      "param_name" => "content",
      "value" => __("<p>I am text block. Click edit button to change this text.</p>", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

/* Latest tweets
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Twitter Widget", "js_composer"),
  "base" => "vc_twitter",
  "icon" => 'icon-wpb-balloon-twitter-left',
  "category" => __('Social', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Twitter username", "js_composer"),
      "param_name" => "twitter_name",
      "admin_label" => true,
      "description" => __("Type in twitter profile name from which load tweets.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Tweets count", "js_composer"),
      "param_name" => "tweets_count",
      "admin_label" => true,
      "value" => array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15),
      "description" => __("How many recent tweets to load.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

/* Separator (Divider)
---------------------------------------------------------- */
wpb_map( array(
  "name"		=> __("Separator", "js_composer"),
  "base"		=> "vc_separator",
  'icon'		=> 'icon-wpb-ui-separator',
  "show_settings_on_create" => false,
  "category"  => __('Content', 'js_composer'),
  "controls"	=> 'popup_delete'
) );

/* Textual block
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Separator with Text", "js_composer"),
  "base" => "vc_text_separator",
  "icon" => "icon-wpb-ui-separator-label",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Title", "js_composer"),
      "param_name" => "title",
      "holder" => "div",
      "value" => __("Title", "js_composer"),
      "description" => __("Separator title.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Title position", "js_composer"),
      "param_name" => "title_align",
      "value" => array(__('Align center', "js_composer") => "separator_align_center", __('Align left', "js_composer") => "separator_align_left", __('Align right', "js_composer") => "separator_align_right"),
      "description" => __("Select title location.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcTextSeparatorView'
) );

/* Message box
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Message Box", "js_composer"),
  "base" => "vc_message",
  "icon" => "icon-wpb-information-white",
  "wrapper_class" => "alert",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "dropdown",
      "heading" => __("Message box type", "js_composer"),
      "param_name" => "color",
      "value" => array(__('Informational', "js_composer") => "alert-info", __('Warning', "js_composer") => "alert-block", __('Success', "js_composer") => "alert-success", __('Error', "js_composer") => "alert-error"),
      "description" => __("Select message type.", "js_composer")
    ),
    array(
      "type" => "textarea_html",
      "holder" => "div",
      "class" => "messagebox_text",
      "heading" => __("Message text", "js_composer"),
      "param_name" => "content",
      "value" => __("<p>I am message box. Click edit button to change this text.</p>", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcMessageView'
) );

/* Facebook like button
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Facebook Like", "js_composer"),
  "base" => "vc_facebook",
  "icon" => "icon-wpb-balloon-facebook-left",
  "category" => __('Social', 'js_composer'),
  "params" => array(
    array(
      "type" => "dropdown",
      "heading" => __("Button type", "js_composer"),
      "param_name" => "type",
      "admin_label" => true,
      "value" => array(__("Standard", "js_composer") => "standard", __("Button count", "js_composer") => "button_count", __("Box count", "js_composer") => "box_count"),
      "description" => __("Select button type.", "js_composer")
    )
  )
) );

/* Tweetmeme button
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Tweetmeme Button", "js_composer"),
  "base" => "vc_tweetmeme",
  "icon" => "icon-wpb-tweetme",
  "category" => __('Social', 'js_composer'),
  "params" => array(
    array(
      "type" => "dropdown",
      "heading" => __("Button type", "js_composer"),
      "param_name" => "type",
      "admin_label" => true,
      "value" => array(__("Horizontal", "js_composer") => "horizontal", __("Vertical", "js_composer") => "vertical", __("None", "js_composer") => "none"),
      "description" => __("Select button type.", "js_composer")
    )
  )
) );

/* Google+ button
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Google+ Button", "js_composer"),
  "base" => "vc_googleplus",
  "icon" => "icon-wpb-application-plus",
  "category" => __('Social', 'js_composer'),
  "params" => array(
    array(
      "type" => "dropdown",
      "heading" => __("Button size", "js_composer"),
      "param_name" => "type",
      "admin_label" => true,
      "value" => array(__("Standard", "js_composer") => "", __("Small", "js_composer") => "small", __("Medium", "js_composer") => "medium", __("Tall", "js_composer") => "tall"),
      "description" => __("Select button size.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Annotation", "js_composer"),
      "param_name" => "annotation",
      "admin_label" => true,
      "value" => array(__("Inline", "js_composer") => "inline", __("Bubble", "js_composer") => "", __("None", "js_composer") => "none"),
      "description" => __("Select annotation type.", "js_composer")
    )
  )
) );

/* Google+ button
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Pinterest Button", "js_composer"),
  "base" => "vc_pinterest",
  "icon" => "icon-wpb-pinterest",
  "category" => __('Social', 'js_composer'),
  "params"	=> array(
    array(
      "type" => "dropdown",
      "heading" => __("Button layout", "js_composer"),
      "param_name" => "type",
      "admin_label" => true,
      "value" => array(__("Horizontal", "js_composer") => "", __("Vertical", "js_composer") => "vertical", __("No count", "js_composer") => "none"),
      "description" => __("Select button layout.", "js_composer")
    )
  )
) );

/* Toggle (FAQ)
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("FAQ", "js_composer"),
  "base" => "vc_toggle",
  "icon" => "icon-wpb-toggle-small-expand",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "holder" => "h4",
      "class" => "toggle_title",
      "heading" => __("Toggle title", "js_composer"),
      "param_name" => "title",
      "value" => __("Toggle title", "js_composer"),
      "description" => __("Toggle block title.", "js_composer")
    ),
    array(
      "type" => "textarea_html",
      "holder" => "div",
      "class" => "toggle_content",
      "heading" => __("Toggle content", "js_composer"),
      "param_name" => "content",
      "value" => __("<p>Toggle content goes here, click edit button to change this text.</p>", "js_composer"),
      "description" => __("Toggle block content.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Default state", "js_composer"),
      "param_name" => "open",
      "value" => array(__("Closed", "js_composer") => "false", __("Open", "js_composer") => "true"),
      "description" => __('Select "Open" if you want toggle to be open by default.', "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcToggleView'
) );

/* Single image */
wpb_map( array(
  "name" => __("Single Image", "js_composer"),
  "base" => "vc_single_image",
  "icon" => "icon-wpb-single-image",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "attach_image",
      "heading" => __("Image", "js_composer"),
      "param_name" => "image",
      "value" => "",
      "description" => __("Select image from media library.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Image size", "js_composer"),
      "param_name" => "img_size",
      "description" => __("Enter image size. Example: thumbnail, medium, large, full or other sizes defined by current theme. Alternatively enter image size in pixels: 200x100 (Width x Height). Leave empty to use 'thumbnail' size.", "js_composer")
    ),
    array(
      "type" => 'checkbox',
      "heading" => __("Link to large image?", "js_composer"),
      "param_name" => "img_link_large",
      "description" => __("If selected, image will be linked to the bigger image.", "js_composer"),
      "value" => Array(__("Yes, please", "js_composer") => 'yes')
    ),
    array(
      "type" => "textfield",
      "heading" => __("Image link", "js_composer"),
      "param_name" => "img_link",
      "description" => __("Enter url if you want this image to have link.", "js_composer"),
      "dependency" => Array('element' => "img_link_large", 'is_empty' => true, 'callback' => 'wpb_single_image_img_link_dependency_callback')
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Link Target", "js_composer"),
      "param_name" => "img_link_target",
      "value" => $target_arr,
      "dependency" => Array('element' => "img_link", 'not_empty' => true)
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
));

/* Gallery/Slideshow
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Image Gallery", "js_composer"),
  "base" => "vc_gallery",
  "icon" => "icon-wpb-images-stack",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Gallery type", "js_composer"),
      "param_name" => "type",
      "value" => array(__("Flex slider fade", "js_composer") => "flexslider_fade", __("Flex slider slide", "js_composer") => "flexslider_slide", __("Nivo slider", "js_composer") => "nivo", __("Image grid", "js_composer") => "image_grid"),
      "description" => __("Select gallery type.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Auto rotate slides", "js_composer"),
      "param_name" => "interval",
      "value" => array(3, 5, 10, 15, __("Disable", "js_composer") => 0),
      "description" => __("Auto rotate slides each X seconds.", "js_composer"),
      "dependency" => Array('element' => "type", 'value' => array('flexslider_fade', 'flexslider_slide', 'nivo'))
    ),
    array(
      "type" => "attach_images",
      "heading" => __("Images", "js_composer"),
      "param_name" => "images",
      "value" => "",
      "description" => __("Select images from media library.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Image size", "js_composer"),
      "param_name" => "img_size",
      "description" => __("Enter image size. Example: thumbnail, medium, large, full or other sizes defined by current theme. Alternatively enter image size in pixels: 200x100 (Width x Height). Leave empty to use 'thumbnail' size.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("On click", "js_composer"),
      "param_name" => "onclick",
      "value" => array(__("Open prettyPhoto", "js_composer") => "link_image", __("Do nothing", "js_composer") => "link_no", __("Open custom link", "js_composer") => "custom_link"),
      "description" => __("What to do when slide is clicked?", "js_composer")
    ),
    array(
      "type" => "exploded_textarea",
      "heading" => __("Custom links", "js_composer"),
      "param_name" => "custom_links",
      "description" => __('Enter links for each slide here. Divide links with linebreaks (Enter).', 'js_composer'),
      "dependency" => Array('element' => "onclick", 'value' => array('custom_link'))
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Custom link target", "js_composer"),
      "param_name" => "custom_links_target",
      "description" => __('Select where to open  custom links.', 'js_composer'),
      "dependency" => Array('element' => "onclick", 'value' => array('custom_link')),
      'value' => $target_arr
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


/* Tabs
---------------------------------------------------------- */
$tab_id_1 = time().'-1-'.rand(0, 100);
$tab_id_2 = time().'-2-'.rand(0, 100);
wpb_map( array(
  "name"  => __("Tabs", "js_composer"),
  "base" => "vc_tabs",
  "show_settings_on_create" => false,
  "is_container" => true,
  "icon" => "icon-wpb-ui-tab-content",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Auto rotate tabs", "js_composer"),
      "param_name" => "interval",
      "value" => array(__("Disable", "js_composer") => 0, 3, 5, 10, 15),
      "description" => __("Auto rotate tabs each X seconds.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "custom_markup" => '
  <div class="wpb_tabs_holder wpb_holder vc_container_for_children">
  <ul class="tabs_controls">
  </ul>
  %content%
  </div>'
  ,
  'default_content' => '
  [vc_tab title="'.__('Tab 1','js_composer').'" tab_id="'.$tab_id_1.'"][/vc_tab]
  [vc_tab title="'.__('Tab 2','js_composer').'" tab_id="'.$tab_id_2.'"][/vc_tab]
  ',
  "js_view" => ($vc_is_wp_version_3_6_more ? 'VcTabsView' : 'VcTabsView35')
) );

/* Tour section
---------------------------------------------------------- */
$tab_id_1 = time().'-1-'.rand(0, 100);
$tab_id_2 = time().'-2-'.rand(0, 100);
WPBMap::map( 'vc_tour', array(
  "name" => __("Tour Section", "js_composer"),
  "base" => "vc_tour",
  "show_settings_on_create" => false,
  "is_container" => true,
  "container_not_allowed" => true,
  "icon" => "icon-wpb-ui-tab-content-vertical",
  "category" => __('Content', 'js_composer'),
  "wrapper_class" => "clearfix",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Auto rotate slides", "js_composer"),
      "param_name" => "interval",
      "value" => array(__("Disable", "js_composer") => 0, 3, 5, 10, 15),
      "description" => __("Auto rotate slides each X seconds.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "custom_markup" => '  
  <div class="wpb_tabs_holder wpb_holder clearfix vc_container_for_children">
  <ul class="tabs_controls">
  </ul>
  %content%
  </div>'
  ,
  'default_content' => '
  [vc_tab title="'.__('Slide 1','js_composer').'" tab_id="'.$tab_id_1.'"][/vc_tab]
  [vc_tab title="'.__('Slide 2','js_composer').'" tab_id="'.$tab_id_2.'"][/vc_tab]
  ',
  "js_view" => ($vc_is_wp_version_3_6_more ? 'VcTabsView' : 'VcTabsView35')
) );

wpb_map( array(
  "name" => __("Tab", "js_composer"),
  "base" => "vc_tab",
  "allowed_container_element" => 'vc_row',
  "is_container" => true,
  "content_element" => false,
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Title", "js_composer"),
      "param_name" => "title",
      "description" => __("Tab title.", "js_composer")
    ),
    array(
      "type" => "tab_id",
      "heading" => __("Tab ID", "js_composer"),
      "param_name" => "tab_id"
    )
  ),
  'js_view' => ($vc_is_wp_version_3_6_more ? 'VcTabView' : 'VcTabView35')
) );

/* Accordion block
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Accordion", "js_composer"),
  "base" => "vc_accordion",
  "show_settings_on_create" => false,
  "is_container" => true,
  "icon" => "icon-wpb-ui-accordion",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    ),
    array(
      "type" => 'checkbox',
      "heading" => __("Allow collapsible all", "js_composer"),
      "param_name" => "collapsible",
      "description" => __("", "js_composer"),
      "value" => Array(__("Allow", "js_composer") => 'yes')
    )
  ),
  "custom_markup" => '
  <div class="wpb_accordion_holder wpb_holder clearfix vc_container_for_children">
  %content%
  </div>
  <div class="tab_controls">
  <button class="add_tab" title="'.__("Add accordion section", "js_composer").'">'.__("Add accordion section", "js_composer").'</button>
  </div>
  ',
  'default_content' => '
  [vc_accordion_tab title="Section 1"][/vc_accordion_tab]
  [vc_accordion_tab title="Section 2"][/vc_accordion_tab]
  ',
  'js_view' => 'VcAccordionView'
) );
wpb_map( array(
  "name" => __("Accordion Section", "js_composer"),
  "base" => "vc_accordion_tab",
  "allowed_container_element" => 'vc_row',
  "is_container" => true,
  "content_element" => false,
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Title", "js_composer"),
      "param_name" => "title",
      "description" => __("Accordion section title.", "js_composer")
    ),
  ),
  'js_view' => 'VcAccordionTabView'
) );

/* Teaser grid
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Teaser (posts) Grid", "js_composer"),
  "base" => "vc_teaser_grid",
  "icon" => "icon-wpb-application-icon-large",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Columns count", "js_composer"),
      "param_name" => "grid_columns_count",
      "value" => array(4, 3, 2, 1),
      "admin_label" => true,
      "description" => __("Select columns count.", "js_composer")
    ),
    array(
      "type" => "posttypes",
      "heading" => __("Post types", "js_composer"),
      "param_name" => "grid_posttypes",
      "description" => __("Select post types to populate posts from.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Teasers count", "js_composer"),
      "param_name" => "grid_teasers_count",
      "description" => __('How many teasers to show? Enter number or word "All".', "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Content", "js_composer"),
      "param_name" => "grid_content",
      "value" => array(__("Teaser (Excerpt)", "js_composer") => "teaser", __("Full Content", "js_composer") => "content"),
      "description" => __("Teaser layout template.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Layout", "js_composer"),
      "param_name" => "grid_layout",
      "value" => array(__("Title + Thumbnail + Text", "js_composer") => "title_thumbnail_text", __("Thumbnail + Title + Text", "js_composer") => "thumbnail_title_text", __("Thumbnail + Text", "js_composer") => "thumbnail_text", __("Thumbnail + Title", "js_composer") => "thumbnail_title", __("Thumbnail only", "js_composer") => "thumbnail", __("Title + Text", "js_composer") => "title_text"),
      "description" => __("Teaser layout.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Link", "js_composer"),
      "param_name" => "grid_link",
      "value" => array(__("Link to post", "js_composer") => "link_post", __("Link to bigger image", "js_composer") => "link_image", __("Thumbnail to bigger image, title to post", "js_composer") => "link_image_post", __("No link", "js_composer") => "link_no"),
      "description" => __("Link type.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Link target", "js_composer"),
      "param_name" => "grid_link_target",
      "value" => $target_arr,
      "dependency" => Array('element' => "grid_link", 'value' => array('link_post', 'link_image_post'))
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Teaser grid layout", "js_composer"),
      "param_name" => "grid_template",
      "value" => array(__("Grid", "js_composer") => "grid", __("Grid with filter", "js_composer") => "filtered_grid", __("Carousel", "js_composer") => "carousel"),
      "description" => __("Teaser layout template.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Layout mode", "js_composer"),
      "param_name" => "grid_layout_mode",
      "value" => array(__("Fit rows", "js_composer") => "fitRows", __('Masonry', "js_composer") => 'masonry'),
      "dependency" => Array('element' => 'grid_template', 'value' => array('filtered_grid', 'grid')),
      "description" => __("Teaser layout template.", "js_composer")
    ),
    array(
      "type" => "taxonomies",
      "heading" => __("Taxonomies", "js_composer"),
      "param_name" => "grid_taxomonies",
      "dependency" => Array('element' => 'grid_template' /*, 'not_empty' => true*/, 'value' => array('filtered_grid'), 'callback' => 'wpb_grid_post_types_for_taxonomies_handler'),
      "description" => __("Select taxonomies from.", "js_composer") //TODO: Change description
    ),
    array(
      "type" => "textfield",
      "heading" => __("Thumbnail size", "js_composer"),
      "param_name" => "grid_thumb_size",
      "description" => __('Enter thumbnail size. Example: thumbnail, medium, large, full or other sizes defined by current theme. Alternatively enter image size in pixels: 200x100 (Width x Height).', "js_composer")
    ),  
    array(
      "type" => "textfield",
      "heading" => __("Post/Page IDs", "js_composer"),
      "param_name" => "posts_in",
      "description" => __('Fill this field with page/posts IDs separated by commas (,) to retrieve only them. Use this in conjunction with "Post types" field.', "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Exclude Post/Page IDs", "js_composer"),
      "param_name" => "posts_not_in",
      "description" => __('Fill this field with page/posts IDs separated by commas (,) to exclude them from query.', "js_composer")
    ),
    array(
      "type" => "exploded_textarea",
      "heading" => __("Categories", "js_composer"),
      "param_name" => "grid_categories",
      "description" => __("If you want to narrow output, enter category names here. Note: Only listed categories will be included. Divide categories with linebreaks (Enter).", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Order by", "js_composer"),
      "param_name" => "orderby",
      "value" => array( "", __("Date", "js_composer") => "date", __("ID", "js_composer") => "ID", __("Author", "js_composer") => "author", __("Title", "js_composer") => "title", __("Modified", "js_composer") => "modified", __("Random", "js_composer") => "rand", __("Comment count", "js_composer") => "comment_count", __("Menu order", "js_composer") => "menu_order" ),
      "description" => sprintf(__('Select how to sort retrieved posts. More at %s.', 'js_composer'), '<a href="http://codex.wordpress.org/Class_Reference/WP_Query#Order_.26_Orderby_Parameters" target="_blank">WordPress codex page</a>')
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Order way", "js_composer"),
      "param_name" => "order",
      "value" => array( __("Descending", "js_composer") => "DESC", __("Ascending", "js_composer") => "ASC" ),
      "description" => sprintf(__('Designates the ascending or descending order. More at %s.', 'js_composer'), '<a href="http://codex.wordpress.org/Class_Reference/WP_Query#Order_.26_Orderby_Parameters" target="_blank">WordPress codex page</a>')
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

/* Posts slider
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Posts Slider", "js_composer"),
  "base" => "vc_posts_slider",
  "icon" => "icon-wpb-slideshow",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Slider type", "js_composer"),
      "param_name" => "type",
      "admin_label" => true,
      "value" => array(__("Flex slider fade", "js_composer") => "flexslider_fade", __("Flex slider slide", "js_composer") => "flexslider_slide", __("Nivo slider", "js_composer") => "nivo"),
      "description" => __("Select slider type.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Slides count", "js_composer"),
      "param_name" => "count",
      "description" => __('How many slides to show? Enter number or word "All".', "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Auto rotate slides", "js_composer"),
      "param_name" => "interval",
      "value" => array(3, 5, 10, 15, __("Disable", "js_composer") => 0),
      "description" => __("Auto rotate slides each X seconds.", "js_composer")
    ),
    array(
      "type" => "posttypes",
      "heading" => __("Post types", "js_composer"),
      "param_name" => "posttypes",
      "description" => __("Select post types to populate posts from.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Description", "js_composer"),
      "param_name" => "slides_content",
      "value" => array(__("No description", "js_composer") => "", __("Teaser (Excerpt)", "js_composer") => "teaser" ),
      "description" => __("Some sliders support description text, what content use for it?", "js_composer"),
      "dependency" => Array('element' => "type", 'value' => array('flexslider_fade', 'flexslider_slide')),
    ),
    array(
      "type" => 'checkbox',
      "heading" => __("Output post title?", "js_composer"),
      "param_name" => "slides_title",
      "description" => __("If selected, title will be printed before the teaser text.", "js_composer"),
      "value" => Array(__("Yes, please", "js_composer") => true),
      "dependency" => Array('element' => "slides_content", 'value' => array('teaser')),
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Link", "js_composer"),
      "param_name" => "link",
      "value" => array(__("Link to post", "js_composer") => "link_post", __("Link to bigger image", "js_composer") => "link_image", __("Open custom link", "js_composer") => "custom_link", __("No link", "js_composer") => "link_no"),
      "description" => __("Link type.", "js_composer")
    ),
    array(
      "type" => "exploded_textarea",
      "heading" => __("Custom links", "js_composer"),
      "param_name" => "custom_links",
      "dependency" => Array('element' => "link", 'value' => 'custom_link'),
      "description" => __('Enter links for each slide here. Divide links with linebreaks (Enter).', 'js_composer')
    ),
    array(
      "type" => "textfield",
      "heading" => __("Thumbnail size", "js_composer"),
      "param_name" => "thumb_size",
      "description" => __('Enter thumbnail size. Example: thumbnail, medium, large, full or other sizes defined by current theme. Alternatively enter image size in pixels: 200x100 (Width x Height).', "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Post/Page IDs", "js_composer"),
      "param_name" => "posts_in",
      "description" => __('Fill this field with page/posts IDs separated by commas (,), to retrieve only them. Use this in conjunction with "Post types" field.', "js_composer")
    ),
    array(
      "type" => "exploded_textarea",
      "heading" => __("Categories", "js_composer"),
      "param_name" => "categories",
      "description" => __("If you want to narrow output, enter category names here. Note: Only listed categories will be included. Divide categories with linebreaks (Enter).", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Order by", "js_composer"),
      "param_name" => "orderby",
      "value" => array( "", __("Date", "js_composer") => "date", __("ID", "js_composer") => "ID", __("Author", "js_composer") => "author", __("Title", "js_composer") => "title", __("Modified", "js_composer") => "modified", __("Random", "js_composer") => "rand", __("Comment count", "js_composer") => "comment_count", __("Menu order", "js_composer") => "menu_order" ),
      "description" => sprintf(__('Select how to sort retrieved posts. More at %s.', 'js_composer'), '<a href="http://codex.wordpress.org/Class_Reference/WP_Query#Order_.26_Orderby_Parameters" target="_blank">WordPress codex page</a>')
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Order by", "js_composer"),
      "param_name" => "order",
      "value" => array( __("Descending", "js_composer") => "DESC", __("Ascending", "js_composer") => "ASC" ),
      "description" => sprintf(__('Designates the ascending or descending order. More at %s.', 'js_composer'), '<a href="http://codex.wordpress.org/Class_Reference/WP_Query#Order_.26_Orderby_Parameters" target="_blank">WordPress codex page</a>')
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

/* Widgetised sidebar
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Widgetised Sidebar", "js_composer"),
  "base" => "vc_widget_sidebar",
  "class" => "wpb_widget_sidebar_widget",
  "icon" => "icon-wpb-layout_sidebar",
  "category" => __('Structure', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "widgetised_sidebars",
      "heading" => __("Sidebar", "js_composer"),
      "param_name" => "sidebar_id",
      "description" => __("Select which widget area output.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

/* Button
---------------------------------------------------------- */
$icons_arr = array(
    __("None", "js_composer") => "none",
    __("Address book icon", "js_composer") => "wpb_address_book",
    __("Alarm clock icon", "js_composer") => "wpb_alarm_clock",
    __("Anchor icon", "js_composer") => "wpb_anchor",
    __("Application Image icon", "js_composer") => "wpb_application_image",
    __("Arrow icon", "js_composer") => "wpb_arrow",
    __("Asterisk icon", "js_composer") => "wpb_asterisk",
    __("Hammer icon", "js_composer") => "wpb_hammer",
    __("Balloon icon", "js_composer") => "wpb_balloon",
    __("Balloon Buzz icon", "js_composer") => "wpb_balloon_buzz",
    __("Balloon Facebook icon", "js_composer") => "wpb_balloon_facebook",
    __("Balloon Twitter icon", "js_composer") => "wpb_balloon_twitter",
    __("Battery icon", "js_composer") => "wpb_battery",
    __("Binocular icon", "js_composer") => "wpb_binocular",
    __("Document Excel icon", "js_composer") => "wpb_document_excel",
    __("Document Image icon", "js_composer") => "wpb_document_image",
    __("Document Music icon", "js_composer") => "wpb_document_music",
    __("Document Office icon", "js_composer") => "wpb_document_office",
    __("Document PDF icon", "js_composer") => "wpb_document_pdf",
    __("Document Powerpoint icon", "js_composer") => "wpb_document_powerpoint",
    __("Document Word icon", "js_composer") => "wpb_document_word",
    __("Bookmark icon", "js_composer") => "wpb_bookmark",
    __("Camcorder icon", "js_composer") => "wpb_camcorder",
    __("Camera icon", "js_composer") => "wpb_camera",
    __("Chart icon", "js_composer") => "wpb_chart",
    __("Chart pie icon", "js_composer") => "wpb_chart_pie",
    __("Clock icon", "js_composer") => "wpb_clock",
    __("Fire icon", "js_composer") => "wpb_fire",
    __("Heart icon", "js_composer") => "wpb_heart",
    __("Mail icon", "js_composer") => "wpb_mail",
    __("Play icon", "js_composer") => "wpb_play",
    __("Shield icon", "js_composer") => "wpb_shield",
    __("Video icon", "js_composer") => "wpb_video"
);

wpb_map( array(
  "name" => __("Button", "js_composer"),
  "base" => "vc_button",
  "icon" => "icon-wpb-ui-button",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Text on the button", "js_composer"),
      "holder" => "button",
      "class" => "wpb_button",
      "param_name" => "title",
      "value" => __("Text on the button", "js_composer"),
      "description" => __("Text on the button.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("URL (Link)", "js_composer"),
      "param_name" => "href",
      "description" => __("Button link.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Target", "js_composer"),
      "param_name" => "target",
      "value" => $target_arr,
      "dependency" => Array('element' => "href", 'not_empty' => true)
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Color", "js_composer"),
      "param_name" => "color",
      "value" => $colors_arr,
      "description" => __("Button color.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Icon", "js_composer"),
      "param_name" => "icon",
      "value" => $icons_arr,
      "description" => __("Button icon.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Size", "js_composer"),
      "param_name" => "size",
      "value" => $size_arr,
      "description" => __("Button size.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcButtonView'
) );

/* Call to Action Button
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Call to Action Button", "js_composer"),
  "base" => "vc_cta_button",
  "icon" => "icon-wpb-call-to-action",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textarea",
      'admin_label' => true,
      "heading" => __("Text", "js_composer"),
      "param_name" => "call_text",
      "value" => __("Click edit button to change this text.", "js_composer"),
      "description" => __("Enter your content.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Text on the button", "js_composer"),
      "param_name" => "title",
      "value" => __("Text on the button", "js_composer"),
      "description" => __("Text on the button.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("URL (Link)", "js_composer"),
      "param_name" => "href",
      "description" => __("Button link.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Target", "js_composer"),
      "param_name" => "target",
      "value" => $target_arr,
      "dependency" => Array('element' => "href", 'not_empty' => true)
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Color", "js_composer"),
      "param_name" => "color",
      "value" => $colors_arr,
      "description" => __("Button color.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Icon", "js_composer"),
      "param_name" => "icon",
      "value" => $icons_arr,
      "description" => __("Button icon.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Size", "js_composer"),
      "param_name" => "size",
      "value" => $size_arr,
      "description" => __("Button size.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Button position", "js_composer"),
      "param_name" => "position",
      "value" => array(__("Align right", "js_composer") => "cta_align_right", __("Align left", "js_composer") => "cta_align_left", __("Align bottom", "js_composer") => "cta_align_bottom"),
      "description" => __("Select button alignment.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  ),
  "js_view" => 'VcCallToActionView'
) );

/* Video element
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Video Player", "js_composer"),
  "base" => "vc_video",
  "icon" => "icon-wpb-film-youtube",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Video link", "js_composer"),
      "param_name" => "link",
      "admin_label" => true,
      "description" => sprintf(__('Link to the video. More about supported formats at %s.', "js_composer"), '<a href="http://codex.wordpress.org/Embeds#Okay.2C_So_What_Sites_Can_I_Embed_From.3F" target="_blank">WordPress codex page</a>')
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

/* Google maps element
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Google' Maps", "js_composer"),
  "base" => "vc_gmaps",
  "icon" => "icon-wpb-map-pin",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Google map link", "js_composer"),
      "param_name" => "link",
      "admin_label" => true,
      "description" => sprintf(__('Link to your map. Visit %s find your address and then click "Link" button to obtain your map link.', "js_composer"), '<a href="http://maps.google.com" target="_blank">Google maps</a>')
    ),
    array(
      "type" => "textfield",
      "heading" => __("Map height", "js_composer"),
      "param_name" => "size",
      "description" => __('Enter map height in pixels. Example: 200).', "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Map type", "js_composer"),
      "param_name" => "type",
      "value" => array(__("Map", "js_composer") => "m", __("Satellite", "js_composer") => "k", __("Map + Terrain", "js_composer") => "p"),
      "description" => __("Select button alignment.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Map Zoom", "js_composer"),
      "param_name" => "zoom",
      "value" => array(__("14 - Default", "js_composer") => 14, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20)
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

/* Raw HTML
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Raw HTML", "js_composer"),
	"base" => "vc_raw_html",
	"icon" => "icon-wpb-raw-html",
	"category" => __('Structure', 'js_composer'),
	"wrapper_class" => "clearfix",
	"params" => array(
		array(
  		"type" => "textarea_raw_html",
			"holder" => "div",
			"heading" => __("Raw HTML", "js_composer"),
			"param_name" => "content",
			"value" => base64_encode("<p>I am raw html block.<br/>Click edit button to change this html</p>"),
			"description" => __("Enter your HTML content.", "js_composer")
		),
	)
) );

/* Raw JS
---------------------------------------------------------- */
wpb_map( array(
	"name" => __("Raw JS", "js_composer"),
	"base" => "vc_raw_js",
	"icon" => "icon-wpb-raw-javascript",
	"category" => __('Structure', 'js_composer'),
	"wrapper_class" => "clearfix",
	"params" => array(
  	array(
  		"type" => "textarea_raw_html",
			"holder" => "div",
			"heading" => __("Raw js", "js_composer"),
			"param_name" => "content",
			"value" => __(base64_encode("<script type='text/javascript'> alert('Enter your js here!'); </script>"), "js_composer"),
			"description" => __("Enter your JS code.", "js_composer")
		),
	)
) );

/* Flickr
---------------------------------------------------------- */
wpb_map( array(
  "base" => "vc_flickr",
  "name" => __("Flickr Widget", "js_composer"),
  "icon" => "icon-wpb-flickr",
  "category" => __('Content', 'js_composer'),
  "params"	=> array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Flickr ID", "js_composer"),
      "param_name" => "flickr_id",
      'admin_label' => true,
      "description" => sprintf(__('To find your flickID visit %s.', "js_composer"), '<a href="http://idgettr.com/" target="_blank">idGettr</a>')
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Number of photos", "js_composer"),
      "param_name" => "count",
      "value" => array(9, 8, 7, 6, 5, 4, 3, 2, 1),
      "description" => __("Number of photos.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Type", "js_composer"),
      "param_name" => "type",
      "value" => array(__("User", "js_composer") => "user", __("Group", "js_composer") => "group"),
      "description" => __("Photo stream type.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Display", "js_composer"),
      "param_name" => "display",
      "value" => array(__("Latest", "js_composer") => "latest", __("Random", "js_composer") => "random"),
      "description" => __("Photo order.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


/* Graph
---------------------------------------------------------- */
wpb_map( array(
  "name" => __("Progress Bar", "js_composer"),
  "base" => "vc_progress_bar",
  "icon" => "icon-wpb-graph",
  "category" => __('Content', 'js_composer'),
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
    ),
    array(
      "type" => "exploded_textarea",
      "heading" => __("Graphic values", "js_composer"),
      "param_name" => "values",
      "description" => __('Input graph values here. Divide values with linebreaks (Enter). Example: 90|Development', 'js_composer'),
      "value" => "90|Development,80|Design,70|Marketing"
    ),
    array(
      "type" => "textfield",
      "heading" => __("Units", "js_composer"),
      "param_name" => "units",
      "description" => __("Enter measurement units (if needed) Eg. %, px, points, etc. Graph value and unit will be appended to the graph title.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Bar color", "js_composer"),
      "param_name" => "bgcolor",
      "value" => array(__("Grey", "js_composer") => "bar_grey", __("Blue", "js_composer") => "bar_blue", __("Turquoise", "js_composer") => "bar_turquoise", __("Green", "js_composer") => "bar_green", __("Orange", "js_composer") => "bar_orange", __("Red", "js_composer") => "bar_red", __("Black", "js_composer") => "bar_black", __("Custom Color", "js_composer") => "custom"),
      "description" => __("Choose previously created contact form from the drop down list.", "js_composer"),
      "admin_label" => true
    ),
    array(
      "type" => "colorpicker",
      "heading" => __("Bar custom color", "js_composer"),
      "param_name" => "custombgcolor",
      "description" => __("Select custom background color for bars.", "js_composer"),
      "dependency" => Array('element' => "bgcolor", 'value' => array('custom'))
    ),
    array(
      "type" => "checkbox",
      "heading" => __("Options", "js_composer"),
      "param_name" => "options",
      "value" => array(__("Add Stripes?", "js_composer") => "striped", __("Add animation? Will be visible with striped bars.", "js_composer") => "animated")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


/* Support for 3rd Party plugins
---------------------------------------------------------- */
// Contact form 7 plugin
include_once( ABSPATH . 'wp-admin/includes/plugin.php' ); // Require plugin.php to use is_plugin_active() below
if (is_plugin_active('contact-form-7/wp-contact-form-7.php')) {
  global $wpdb;
  $cf7 = $wpdb->get_results( 
  	"
  	SELECT ID, post_title 
  	FROM $wpdb->posts
  	WHERE post_type = 'wpcf7_contact_form' 
  	"
  );
  $contact_forms = array();
  if ($cf7) {
    foreach ( $cf7 as $cform ) {
      $contact_forms[$cform->post_title] = $cform->ID;
    }
  } else {
    $contact_forms["No contact forms found"] = 0;
  }
  wpb_map( array(
    "base" => "contact-form-7",
    "name" => __("Contact Form 7", "js_composer"),
    "icon" => "icon-wpb-contactform7",
    "category" => __('Content', 'js_composer'),
    "params" => array(
      array(
        "type" => "textfield",
        "heading" => __("Form title", "js_composer"),
        "param_name" => "title",
        "admin_label" => true,
        "description" => __("What text use as form title. Leave blank if no title is needed.", "js_composer")
      ),
      array(
        "type" => "dropdown",
        "heading" => __("Select contact form", "js_composer"),
        "param_name" => "id",
        "value" => $contact_forms,
        "description" => __("Choose previously created contact form from the drop down list.", "js_composer")
      )
    )
  ) );
} // if contact form7 plugin active

if (is_plugin_active('LayerSlider/layerslider.php')) {
  global $wpdb;
  $ls = $wpdb->get_results( 
  	"
  	SELECT id, name, date_c
  	FROM ".$wpdb->prefix."layerslider
  	WHERE flag_hidden = '0' AND flag_deleted = '0'
  	ORDER BY date_c ASC LIMIT 100
  	"
  );
  $layer_sliders = array();
  if ($ls) {
    foreach ( $ls as $slider ) {
      $layer_sliders[$slider->name] = $slider->id;
    }
  } else {
    $layer_sliders["No sliders found"] = 0;
  }
  wpb_map( array(
    "base" => "layerslider_vc",
    "name" => __("Layer Slider", "js_composer"),
    "icon" => "icon-wpb-layerslider",
    "category" => __('Content', 'js_composer'),
    "params" => array(
      array(
        "type" => "textfield",
        "heading" => __("Widget title", "js_composer"),
        "param_name" => "title",
        "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
      ),
      array(
        "type" => "dropdown",
        "heading" => __("LayerSlider ID", "js_composer"),
        "param_name" => "id",
        "admin_label" => true,
        "value" => $layer_sliders,
        "description" => __("Select your LayerSlider.", "js_composer")
      ),
      array(
        "type" => "textfield",
        "heading" => __("Extra class name", "js_composer"),
        "param_name" => "el_class",
        "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
      )
    )
  ) );
} // if layer slider plugin active

if (is_plugin_active('revslider/revslider.php')) {
  global $wpdb;
  $rs = $wpdb->get_results( 
  	"
  	SELECT id, title, alias
  	FROM ".$wpdb->prefix."revslider_sliders
  	ORDER BY id ASC LIMIT 100
  	"
  );
  $revsliders = array();
  if ($rs) {
    foreach ( $rs as $slider ) {
      $revsliders[$slider->title] = $slider->alias;
    }
  } else {
    $revsliders["No sliders found"] = 0;
  }
  wpb_map( array(
    "base" => "rev_slider_vc",
    "name" => __("Revolution Slider", "js_composer"),
    "icon" => "icon-wpb-revslider",
    "category" => __('Content', 'js_composer'),
    "params"=> array(
      array(
        "type" => "textfield",
        "heading" => __("Widget title", "js_composer"),
        "param_name" => "title",
        "description" => __("What text use as a widget title. Leave blank if no title is needed.", "js_composer")
      ),
      array(
        "type" => "dropdown",
        "heading" => __("Revolution Slider", "js_composer"),
        "param_name" => "alias",
        "admin_label" => true,
        "value" => $revsliders,
        "description" => __("Select your Revolution Slider.", "js_composer")
      ),
      array(
        "type" => "textfield",
        "heading" => __("Extra class name", "js_composer"),
        "param_name" => "el_class",
        "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
      )
    )
  ) );
} // if revslider plugin active

if (is_plugin_active('gravityforms/gravityforms.php')) {
  $gravity_forms_array[__("No Gravity forms found.", "js_composer")] = '';
  if ( class_exists('RGFormsModel') ) {
    $gravity_forms = RGFormsModel::get_forms(1, "title");
    if ($gravity_forms) {
      $gravity_forms_array = array(__("Select a form to display.", "js_composer") => '');
      foreach ( $gravity_forms as $gravity_form ) {
        $gravity_forms_array[$gravity_form->title] = $gravity_form->id;
      }
    }
  }
  wpb_map( array(
    "name" => __("Gravity Form", "js_composer"),
    "base" => "gravityform",
    "icon" => "icon-wpb-vc_gravityform",
    "category" => __("Content", "js_composer"),
    "params" => array(
      array(
        "type" => "dropdown",
        "heading" => __("Form", "js_composer"),
        "param_name" => "id",
        "value" => $gravity_forms_array,
        "description" => __("Select a form to add it to your post or page.", "js_composer"),
        "admin_label" => true
      ),
      array(
        "type" => "dropdown",
        "heading" => __("Display Form Title", "js_composer"),
        "param_name" => "title",
        "value" => array( __("No", "js_composer") => 'false', __("Yes", "js_composer") => 'true' ),
        "description" => __("Would you like to display the forms title?", "js_composer"),
        "dependency" => Array('element' => "id", 'not_empty' => true)
      ),
      array(
        "type" => "dropdown",
        "heading" => __("Display Form Description", "js_composer"),
        "param_name" => "description",
        "value" => array( __("No", "js_composer") => 'false', __("Yes", "js_composer") => 'true' ),
        "description" => __("Would you like to display the forms description?", "js_composer"),
        "dependency" => Array('element' => "id", 'not_empty' => true)
      ),
      array(
        "type" => "dropdown",
        "heading" => __("Enable AJAX?", "js_composer"),
        "param_name" => "ajax",
        "value" => array( __("No", "js_composer") => 'false', __("Yes", "js_composer") => 'true' ),
        "description" => __("Enable AJAX submission?", "js_composer"),
        "dependency" => Array('element' => "id", 'not_empty' => true)
      ),
      array(
        "type" => "textfield",
        "heading" => __("Tab Index", "js_composer"),
        "param_name" => "tabindex",
        "description" => __("(Optional) Specify the starting tab index for the fields of this form. Leave blank if you're not sure what this is.", "js_composer"),
        "dependency" => Array('element' => "id", 'not_empty' => true)
      )
    )
  ) );
} // if gravityforms active

/* WordPress default Widgets (Appearance->Widgets)
---------------------------------------------------------- */
wpb_map( array(
  "name" => 'WP ' . __("Search"),
  "base" => "vc_wp_search",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

wpb_map( array(
  "name" => 'WP ' . __("Meta"),
  "base" => "vc_wp_meta",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

wpb_map( array(
  "name" => 'WP ' . __("Recent Comments"),
  "base" => "vc_wp_recentcomments",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Number of comments to show", "js_composer"),
      "param_name" => "number",
      "admin_label" => true
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

wpb_map( array(
  "name" => 'WP ' . __("Calendar"),
  "base" => "vc_wp_calendar",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

wpb_map( array(
  "name" => 'WP ' . __("Pages"),
  "base" => "vc_wp_pages",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Sort by", "js_composer"),
      "param_name" => "sortby",
      "value" => array(__("Page title", "js_composer") => "post_title", __("Page order", "js_composer") => "menu_order", __("Page ID", "js_composer") => "ID"),
      "admin_label" => true
    ),
    array(
      "type" => "textfield",
      "heading" => __("Exclude", "js_composer"),
      "param_name" => "exclude",
      "description" => __("Page IDs, separated by commas.", "js_composer"),
      "admin_label" => true
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

$tag_taxonomies = array();
foreach ( get_taxonomies() as $taxonomy ) :
  $tax = get_taxonomy($taxonomy);
	if ( !$tax->show_tagcloud || empty($tax->labels->name) )
  	continue;
	$tag_taxonomies[$tax->labels->name] = esc_attr($taxonomy);
endforeach;
wpb_map( array(
  "name" => 'WP ' . __("Tag Cloud"),
  "base" => "vc_wp_tagcloud",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Taxonomy", "js_composer"),
      "param_name" => "taxonomy",
      "value" => $tag_taxonomies,
      "admin_label" => true
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

$custom_menus = array();
$menus = get_terms( 'nav_menu', array( 'hide_empty' => false ) );
if ( $menus ) {
  foreach ( $menus as $single_menu ) {
    $custom_menus[$single_menu->name] = $single_menu->term_id;
  }
  wpb_map( array(
    "name" => 'WP ' . __("Custom Menu"),
    "base" => "vc_wp_custommenu",
    "icon" => "icon-wpb-wp",
    "category" => __("WordPress Widgets", "js_composer"),
    "class" => "wpb_vc_wp_widget",
    "params" => array(
      array(
        "type" => "textfield",
        "heading" => __("Widget title", "js_composer"),
        "param_name" => "title",
        "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
      ),
      array(
        "type" => "dropdown",
        "heading" => __("Menu", "js_composer"),
        "param_name" => "nav_menu",
        "value" => $custom_menus,
        "description" => __("Select menu", "js_composer"),
        "admin_label" => true
      ),
      array(
        "type" => "textfield",
        "heading" => __("Extra class name", "js_composer"),
        "param_name" => "el_class",
        "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
      )
    )
  ) );
}

wpb_map( array(
  "name" => 'WP ' . __("Text"),
  "base" => "vc_wp_text",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "textarea",
      "heading" => __("Text", "js_composer"),
      "param_name" => "text",
      "admin_label" => true
    ),
    /*array(
      "type" => "checkbox",
      "heading" => __("Automatically add paragraphs", "js_composer"),
      "param_name" => "filter"
    ),*/
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


wpb_map( array(
  "name" => 'WP ' . __("Recent Posts"),
  "base" => "vc_wp_posts",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Number of posts to show", "js_composer"),
      "param_name" => "number",
      "admin_label" => true
    ),
    array(
      "type" => "checkbox",
      "heading" => __("Display post date?", "js_composer"),
      "param_name" => "show_date",
      "value" => array(__("Display post date?") => true )
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


$link_category = array(__("All Links", "js_composer") => "");
$link_cats = get_terms( 'link_category' );
foreach ( $link_cats as $link_cat ) {
  $link_category[$link_cat->name] = $link_cat->term_id;
}
wpb_map( array(
  "name" => 'WP ' . __("Links"),
  "base" => "vc_wp_links",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "dropdown",
      "heading" => __("Link Category", "js_composer"),
      "param_name" => "category",
      "value" => $link_category,
      "admin_label" => true
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Sort by", "js_composer"),
      "param_name" => "orderby",
      "value" => array(__("Link title", "js_composer") => "name", __("Link rating", "js_composer") => "rating", __("Link ID", "js_composer") => "id", __("Random", "js_composer") => "rand")
    ),
    array(
      "type" => "checkbox",
      "heading" => __("Options", "js_composer"),
      "param_name" => "options",
      "value" => array(__("Show Link Image", "js_composer") => "images", __("Show Link Name", "js_composer") => "name", __("Show Link Description", "js_composer") => "description", __("Show Link Rating", "js_composer") => "rating")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Number of links to show", "js_composer"),
      "param_name" => "limit"
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


wpb_map( array(
  "name" => 'WP ' . __("Categories"),
  "base" => "vc_wp_categories",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "checkbox",
      "heading" => __("Options", "js_composer"),
      "param_name" => "options",
      "value" => array(__("Display as dropdown", "js_composer") => "dropdown", __("Show post counts", "js_composer") => "count", __("Show hierarchy", "js_composer") => "hierarchical")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


wpb_map( array(
  "name" => 'WP ' . __("Archives"),
  "base" => "vc_wp_archives",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "checkbox",
      "heading" => __("Options", "js_composer"),
      "param_name" => "options",
      "value" => array(__("Display as dropdown", "js_composer") => "dropdown", __("Show post counts", "js_composer") => "count")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );

wpb_map( array(
  "name" => 'WP ' . __("RSS"),
  "base" => "vc_wp_rss",
  "icon" => "icon-wpb-wp",
  "category" => __("WordPress Widgets", "js_composer"),
  "class" => "wpb_vc_wp_widget",
  "params" => array(
    array(
      "type" => "textfield",
      "heading" => __("Widget title", "js_composer"),
      "param_name" => "title",
      "description" => __("What text use as a widget title. Leave blank to use default widget title.", "js_composer")
    ),
    array(
      "type" => "textfield",
      "heading" => __("RSS feed URL", "js_composer"),
      "param_name" => "url",
      "description" => __("Enter the RSS feed URL.", "js_composer"),
      "admin_label" => true
    ),
    array(
      "type" => "dropdown",
      "heading" => __("Items", "js_composer"),
      "param_name" => "items",
      "value" => array(__("10 - Default", "js_composer") => '', 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20),
      "description" => __("How many items would you like to display?", "js_composer"),
      "admin_label" => true
    ),
    array(
      "type" => "checkbox",
      "heading" => __("Options", "js_composer"),
      "param_name" => "options",
      "value" => array(__("Display item content?", "js_composer") => "show_summary", __("Display item author if available?", "js_composer") => "show_author", __("Display item date?", "js_composer") => "show_date")
    ),
    array(
      "type" => "textfield",
      "heading" => __("Extra class name", "js_composer"),
      "param_name" => "el_class",
      "description" => __("If you wish to style particular content element differently, then use this field to add a class name and then refer to it in your css file.", "js_composer")
    )
  )
) );


WPBMap::layout(array('id'=>'column_12', 'title'=>'1/2'));
WPBMap::layout(array('id'=>'column_12-12', 'title'=>'1/2 + 1/2'));
WPBMap::layout(array('id'=>'column_13', 'title'=>'1/3'));
WPBMap::layout(array('id'=>'column_13-13-13', 'title'=>'1/3 + 1/3 + 1/3'));
WPBMap::layout(array('id'=>'column_13-23', 'title'=>'1/3 + 2/3'));
WPBMap::layout(array('id'=>'column_14', 'title'=>'1/4'));
WPBMap::layout(array('id'=>'column_14-14-14-14', 'title'=>'1/4 + 1/4 + 1/4 + 1/4'));
WPBMap::layout(array('id'=>'column_16', 'title'=>'1/6'));
WPBMap::layout(array('id'=>'column_11', 'title'=>'1/1'));


