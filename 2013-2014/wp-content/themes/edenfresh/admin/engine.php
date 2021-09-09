<?php 

define("edenfresh_THEME_DIR",dirname(dirname(__FILE__)));
define("edenfresh_THEME_URL",get_stylesheet_directory_uri());

global $edenfresh_wf_data;

//require(dirname(__FILE__).'/');

### SECTION
// LESS Processing
function enqueue_less_styles($tag, $handle) {
    global $wp_styles;
    $match_pattern = '/\.less$/U';
    if ( preg_match( $match_pattern, $wp_styles->registered[$handle]->src ) ) {
        $handle = $wp_styles->registered[$handle]->handle;
        $media = $wp_styles->registered[$handle]->args;
        $href = $wp_styles->registered[$handle]->src . '?ver=' . $wp_styles->registered[$handle]->ver;
        $rel = isset($wp_styles->registered[$handle]->extra['alt']) && $wp_styles->registered[$handle]->extra['alt'] ? 'alternate stylesheet' : 'stylesheet';
        $title = isset($wp_styles->registered[$handle]->extra['title']) ? "title='" . esc_attr( $wp_styles->registered[$handle]->extra['title'] ) . "'" : '';

        $tag = "<link rel='stylesheet' id='$handle' $title href='$href' type='text/less' media='$media' />";
    }
    return $tag;
}

add_filter( 'style_loader_tag', 'enqueue_less_styles', 5, 2);
// LESS Processing Ends ^^
 
 
### SECTION
//Theme admin css & js
function edenfresh_theme_admin_scripts($hook){   
    if($hook!='appearance_page_wpeden-themeopts') return;
    wp_enqueue_style('bootstrap-ui',edenfresh_THEME_URL.'/admin/bootstrap/css/bootstrap.css');
    wp_enqueue_style('chosen-ui',edenfresh_THEME_URL.'/admin/css/chosen.css');
    wp_enqueue_style('admincss',edenfresh_THEME_URL.'/admin/css/base-admin-style.css');
    wp_enqueue_script('bootstrap-js',edenfresh_THEME_URL.'/admin/bootstrap/js/bootstrap.min.js',array('jquery'));
    wp_enqueue_script('chosen-js',edenfresh_THEME_URL.'/admin/js/chosen.jquery.js',array('jquery'));
    wp_enqueue_script('wpeden-js',edenfresh_THEME_URL.'/admin/js/wpeden.js',array('jquery','chosen-js'));
}

add_action( 'admin_enqueue_scripts', 'edenfresh_theme_admin_scripts');
//Theme admin css & js ends ^^
 
### SECTION
//Theme option menu function
function edenfresh_theme_opt_menu(){                                                                                             /*Theme Option Menu*/
      add_theme_page( "WPEden Theme Options", "Theme Options", 'edit_theme_options', 'wpeden-themeopts', 'edenfresh_theme_options');  
}


function edenfresh_setting_field($data) {     
    
    switch($data['type']):
            case 'text':
                echo "<div class='controls'><input type='text' name='$data[name]' class='input span5' value='$data[value]' /></div></div>";
            break;
            case 'textarea':
                echo "<div class='controls'><textarea name='$data[name]' class='input span5'>$data[value]</textarea></div></div>";
            break;
            case 'callback':
                echo "<div class='controls'>".call_user_func($data['dom_callback'], $data['dom_callback_params'])."</div></div>";
            break;
            case 'heading':
                echo "<div class='navbar'><div class='navbar-inner'><a href='#{$data['id']}' class='brand'>".$data['label']."</a></div></div></div>";
            break;
    endswitch;
}
global $wpede_data_fetched;
function edenfresh_get_theme_opts($index = null, $default = null){
    global $edenfresh_wf_data, $settings_sections, $wpede_data_fetched;
    if(!$wpede_data_fetched){
    $edenfresh_wf_data = array();    
    foreach($settings_sections as $section_id => $section_name) {
    $edenfresh_wf_data = array_merge($edenfresh_wf_data,(array)get_option($section_id,array()));    
    }
    $wpede_data_fetched = 1;}
    
    if(!$index)
    return $edenfresh_wf_data;
    else
    return isset($edenfresh_wf_data[$index])&&$edenfresh_wf_data[$index]!=''?stripcslashes($edenfresh_wf_data[$index]):$default;
}

function edenfresh_subsection_heading($data){
    return "<h3>{$data}</h3>";
}

$section = isset($_GET['section'])?$_GET['section']:'edenfresh_general_settings';
$settings_sections = array(
            'edenfresh_general_settings' => 'General Settings',
            'edenfresh_homepage_settings' => 'Homepage Settings',
            
);
$settings_fields = array(
            'logo_url' => array('id' => 'logo_url',
                                'section'=>'edenfresh_general_settings',
                                'label'=>'Logo URL',
                                'description'=>'Size: 140x25 px',
                                'name' => 'edenfresh_general_settings[logo_url]',
                                'type' => 'text',
                                'value' => edenfresh_get_theme_opts('logo_url'),
                                'validate' => 'str'                                 
                                ),
            'footer_text' => array('id' => 'footer_text',
                                'section'=>'edenfresh_general_settings',
                                'label'=>'Footer Text',
                                'name' => 'edenfresh_general_settings[footer_text]',
                                'type' => 'text',
                                'value' => edenfresh_get_theme_opts('footer_text'),
                                'validate' => 'str'                                 
                                ),
            'featured_slider_heading' => array('id' => 'featured_slider_heading',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Homepage Header Settings',
                                'name' => 'featured_slider_heading',
                                'type' => 'heading'                                
                                ),
            'home_featured_image' => array('id' => 'home_featured_image',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Image URL',
                                'name' => 'edenfresh_homepage_settings[home_featured_image]',
                                'type' => 'text',
                                'value' => edenfresh_get_theme_opts('home_featured_image'),
                                'validate' => 'str'                                
                                ),
             
            'home_featured_title' => array('id' => 'home_featured_title',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Headline',
                                'name' => 'edenfresh_homepage_settings[home_featured_title]',
                                'type' => 'text',
                                'value' => edenfresh_get_theme_opts('home_featured_title'),
                                'validate' => 'str'                                
                                ),
             
            'home_featured_desc' => array('id' => 'home_featured_desc',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Description',
                                'name' => 'edenfresh_homepage_settings[home_featured_desc]',
                                'type' => 'textarea',
                                'value' => edenfresh_get_theme_opts('home_featured_desc'),
                                'validate' => 'str'                                
                                ),
             
            'home_featured_btntxt' => array('id' => 'home_featured_btntxt',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Button Text',
                                'name' => 'edenfresh_homepage_settings[home_featured_btntxt]',
                                'type' => 'text',
                                'value' => edenfresh_get_theme_opts('home_featured_btntxt'),
                                'validate' => 'str'                                
                                ),
             
            'home_featured_btnurl' => array('id' => 'home_featured_btnurl',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Button URL',
                                'name' => 'edenfresh_homepage_settings[home_featured_btnurl]',
                                'type' => 'text',
                                'value' => edenfresh_get_theme_opts('home_featured_btnurl'),
                                'validate' => 'str'                                
                                ),
             
            'featured_page_heading' => array('id' => 'featured_page_heading',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Featured Pages',
                                'name' => 'featured_page_heading',
                                'type' => 'heading'                                
                                ),
            'home_featured_page_1' => array('id' => 'home_featured_page_1',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Featured Page 1',
                                'name' => 'edenfresh_homepage_settings[home_featured_page_1]',
                                'type' => 'callback',
                                'validate' => 'int',
                                'dom_callback'=> 'wp_dropdown_categories',
                                'dom_callback_params' => 'echo=0&name=edenfresh_homepage_settings[home_featured_page_1]&id=home_featured_page_1&selected='.edenfresh_get_theme_opts('home_featured_page_1')
                                ),
            'home_featured_page_2' => array('id' => 'home_featured_page_2',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Featured Page 2',
                                'name' => 'edenfresh_homepage_settings[home_featured_page_2]',
                                'type' => 'callback',
                                'validate' => 'int',
                                'dom_callback'=> 'wp_dropdown_categories',
                                'dom_callback_params' => 'echo=0&name=edenfresh_homepage_settings[home_featured_page_2]&id=home_featured_page_2&selected='.edenfresh_get_theme_opts('home_featured_page_2')
                                ),
            'home_featured_page_3' => array('id' => 'home_featured_page_3',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Featured Page 3',
                                'name' => 'edenfresh_homepage_settings[home_featured_page_3]',
                                'type' => 'callback',
                                'validate' => 'int',
                                'dom_callback'=> 'wp_dropdown_categories',
                                'dom_callback_params' => 'echo=0&name=edenfresh_homepage_settings[home_featured_page_3]&id=home_featured_page_3&selected='.edenfresh_get_theme_opts('home_featured_page_3')
                                ),
            'home_featured_page_4' => array('id' => 'home_featured_page_4',
                                'section'=>'edenfresh_homepage_settings',
                                'label'=>'Featured Page 4',
                                'name' => 'edenfresh_homepage_settings[home_featured_page_4]',
                                'type' => 'callback',
                                'validate' => 'int',
                                'dom_callback'=> 'wp_dropdown_categories',
                                'dom_callback_params' => 'echo=0&name=edenfresh_homepage_settings[home_featured_page_4]&id=home_featured_page_4&selected='.edenfresh_get_theme_opts('home_featured_page_4')
                                ),

);  

function edenfresh_setup_theme_options(){
    global $settings_fields, $edenfresh_wf_data, $section, $settings_sections;   
    foreach($settings_sections as $section_id=>$section_name){                 
        register_setting($section_id,$section_id,'edenfresh_validate_optdata');           
    }
    foreach($settings_fields as $id=>$field){         
        if($field['type']=='heading')
        add_settings_field($id, '<div class="control-group">', 'edenfresh_setting_field', 'wpeden-themeopts', $field['section'], $field);    
        else
        add_settings_field($id, '<div class="control-group"><label for="ftrcat" class="control-label">'.$field['label'].'</label>', 'edenfresh_setting_field', 'wpeden-themeopts', $field['section'], $field);    
    }
}

add_action('admin_init','edenfresh_setup_theme_options');

function edenfresh_validate_optdata($data){    
    global $settings_fields;  
    $error = array();
    
    foreach($settings_fields as $id=>$field){
         if(!isset($data[$id])) continue;              
         switch($field['validate']){
             case 'int':
                $data[$id] = intval($data[$id]);
             break;
             case 'double':
                $data[$id] = doubleval($data[$id]);
             break;
             case 'str':
                $data[$id] = mysql_escape_string(strval($data[$id]));
             break;
             case 'email':
                $data[$id] = is_email($data[$id])?$data[$id]:'';
                $error[$id] = __('Invalid Email Address','wpeden');
             break;
         }
    }
    if($error) return $data['__error__'] = $error;
    
    return $data;
}
    
//theme option     
function edenfresh_theme_options(){
global $settings_sections, $section;                                                                                                  /*Theme Option Function*/      
?>
    <div class="wrap wpeden-theme-options">                      
            <div class="container-fluid">
                <div class="row-fluid">
                    <div class="span12 margin0">
                        <div class="icon32 wpeden-icon"></div>
                        <h2 class="thm_heading">WPEden Theme Options &nbsp;&nbsp;&nbsp;&nbsp;<div class="btn-group">
                <a class="btn btn-success" href="http://wpeden.com/product/eden-fresh-pro-responsive-corporate-wordpress-theme/" target="_blank">Get Pro!</a> 
                <a class="btn btn-danger" href="http://wpeden.com/wordpress/themes/" target="_blank">More Themes</a> 
                <a class="btn btn-inverse" href="http://wpeden.com/wordpress/plugins/" target="_blank">Premium Plugins</a> 
                </div></h2> 
                    </div>     

            
                    <div class="span12 tabbable margin0">
                        <!-- Theme Option Sections -->
                        <ul class="nav nav-tabs">
                            <?php foreach($settings_sections as $section_id=>$section_name){ ?>
                            <li class="<?php echo $section==$section_id?'active':''; ?>"><a href="#<?php echo $section_id; ?>" data-toggle='tab'><?php echo $section_name; ?></a></li>    
                            <?php } ?>
                        </ul>
                        <!-- Theme Option Sections Ends -->
                        
                        <!-- Theme Option Fields for section # -->
                        <div class="tab-content">
                          <?php foreach($settings_sections as $section_id=>$section_name){ ?>
                            <div class="tab-pane <?php echo $section_id==$section?'active':''; ?>" id="<?php echo $section_id; ?>">
                            <form id="theme-admin-form" class="form-horizontal" action="options.php" method="post" enctype="multipart/form-data">
                                <?php 
                                  settings_fields( $section_id ); 
                                  do_settings_fields( 'wpeden-themeopts',$section_id );
                                ?>
                                <div class="control-group">            
                                         
                                        <div class="controls">
                                        <?php submit_button(); ?>
                                        <span id="loading" style="display: none;"><img src="images/loading.gif" alt=""> saving...</span>
                                        </div>
                            
                                </div>
                            </form>
                            </div>
                           <?php } ?> 
                           
              
                        </div> 
                        <!-- Theme Option Fields for section # Ends -->
                    </div>
                <div class="span12">
                
                </div>
</div>
</div>
 
</div>
<?php
        
}
  
 
add_action('admin_menu', 'edenfresh_theme_opt_menu'); 
