<?php
/**
 * @package WordPress
 * @subpackage WPTuts Theme
 */

//better excerpts fucntion
function better_excerpts($words = 40, $link_text = 'Continue reading this entry &#187;', $allowed_tags = '', $container = 'p', $smileys = 'no' )
{
global $post;
 
if ( $allowed_tags == 'all' ) $allowed_tags = '<a>,<i>,<em>,<b>,<strong>,<ul>,<ol>,<li>,<span>,<blockquote>,<img>';
 
$text = preg_replace('/\[.*\]/', '', strip_tags($post->post_content, $allowed_tags));
 
$text = explode(' ', $text);
$tot = count($text);
 
for ( $i=0; $i<$words; $i++ ) : $output .= $text[$i] . ' '; endfor;
 
if ( $smileys == "yes" ) $output = convert_smilies($output);
 
?><p><?php echo force_balance_tags($output) ?><?php if ( $i < $tot ) : ?> ...<?php else : ?></p><?php endif; ?>
<?php if ( $i < $tot ) :
if ( $container == 'p' || $container == 'div' ) : ?></p><?php endif;
if ( $container != 'plain' ) : ?><<?php echo $container; ?> class="more"><?php if ( $container == 'div' ) : ?><p><?php endif; endif; ?>
 
<a href="<?php the_permalink(); ?>" title="<?php echo $link_text; ?>"><?php echo $link_text; ?></a><?php
 
if ( $container == 'div' ) : ?></p><?php endif; if ( $container != 'plain' ) : ?></<?php echo $container; ?>><?php endif;
 
if ( $container == 'plain' || $container == 'span' ) : ?></p><?php endif;
endif;
 
}

?>