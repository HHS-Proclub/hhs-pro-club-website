<?php

//$id = $_GET['id'];
$q = $_GET['q'];
$lang = $_GET['lang'];

$sites = array();
$sites['html'] = 'https://developer.mozilla.org/en-US/search?q=';
$sites['css'] = 'https://developer.mozilla.org/en-US/search?q=';
$sites['js'] = 'https://developer.mozilla.org/en-US/search?q=';
$sites['java'] = 'http://docs.oracle.com/javase/7/docs/api/';
$sites['php'] = 'http://php.net/search.php?show=quickref&pattern=';

$url = $sites[$lang] . $q;
$html = file_get_contents($url);

echo $html;

/*$doc = new DOMDocument();
$doc->loadHTML($html);
$XPath = new DOMXPath($doc);
$tr = $XPath->query('');
$tr = $tr->item(0);
$trHTML = $tr->nodeValue;
*/

?>