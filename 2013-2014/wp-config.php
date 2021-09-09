<?php
/**
 * The base configurations of the WordPress.
 *
 * This file has the following configurations: MySQL settings, Table Prefix,
 * Secret Keys, WordPress Language, and ABSPATH. You can find more information
 * by visiting {@link http://codex.wordpress.org/Editing_wp-config.php Editing
 * wp-config.php} Codex page. You can get the MySQL settings from your web host.
 *
 * This file is used by the wp-config.php creation script during the
 * installation. You don't have to use the web site, you can just copy this file
 * to "wp-config.php" and fill in the values.
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define('WP_CACHE', true); //Added by WP-Cache Manager
define( 'WPCACHEHOME', '/home3/hhsprog/public_html/2013-2014/wp-content/plugins/wp-super-cache/' ); //Added by WP-Cache Manager
define('DB_NAME', 'hhsprog_wrdp1');

/** MySQL database username */
define('DB_USER', 'hhsprog_wrdp1');

/** MySQL database password */
define('DB_PASSWORD', 'DffJst3jqZwfOWn');

/** MySQL hostname */
define('DB_HOST', 'localhost');

/** Database Charset to use in creating database tables. */
define('DB_CHARSET', 'utf8');

/** The Database Collate type. Don't change this if in doubt. */
define('DB_COLLATE', '');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define('AUTH_KEY',         'iD#;:PCBSP@x?dz9CzEYyC)a1rktSmqd!yN|zc=!?V2rCEJkI@3cP:Rd|kD<ZN7|dqIM9B\`lA2=_o-<');
define('SECURE_AUTH_KEY',  'p:5bg_|$oW<:ZOw|r-p@?mS;<!QvTw#iNM8gM5r-j_O<Ef4h1$5W87ku=>AK;aKcW_$V_wHo');
define('LOGGED_IN_KEY',    'h|t\`Ta#T8<japyp*ZbKBB<wOfbZ2JTNuR<Mp@Gqn99L7km7h$;qiL12A1mNO<V~AK1J:u^2');
define('NONCE_KEY',        'N/I6U\`s#cpHr7nF4JkNUY>5RFTSdD6lk*3GrFs_89DmLNQyLvAZV|0SNt>/eotRDc#unB^EH7@OG@t');
define('AUTH_SALT',        'JI(j>^Ho?MOeR)rO8EIfhfmUYcSmKEMCX@CEt(\`^RohgC2KueVT*~a8=FujknD3lP');
define('SECURE_AUTH_SALT', 'CHZvIk\`PqYE@jC9ejj8SL#vmR*ziy^9ctz)*kf1fX)XwN~A?agGKg$sIu60I)8<>a:v|P2VHJ~');
define('LOGGED_IN_SALT',   'y*_Sa/<\`7\`l/n/~y16d9(^4Zhr(gkJvEnfDy;O;h2*VUpU)Z5^FBDST3pY:?cbq<(pO');
define('NONCE_SALT',       'Rko<|nC05!DQnM^(Zgk1P#z/e!7~xW4<pmu0-ifovRcpmF7C3b_0n9e');

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each a unique
 * prefix. Only numbers, letters, and underscores please!
 */
$table_prefix  = 'wp_';

/**
 * WordPress Localized Language, defaults to English.
 *
 * Change this to localize WordPress. A corresponding MO file for the chosen
 * language must be installed to wp-content/languages. For example, install
 * de_DE.mo to wp-content/languages and set WPLANG to 'de_DE' to enable German
 * language support.
 */
define('WPLANG', '');

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 */
define('WP_DEBUG', false);

/* That's all, stop editing! Happy blogging. */

/** Absolute path to the WordPress directory. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');

/** Sets up WordPress vars and included files. */
require_once(ABSPATH . 'wp-settings.php');
