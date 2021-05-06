package geert.berkers.botvavo.mainactivity

import androidx.annotation.StringRes
import geert.berkers.botvavo.R

/**
 * Created by Zorgkluis (Geert Berkers)
 */
sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("Home", R.string.botvavo_screen_home)
    object Profile : Screen("profile", R.string.botvavo_screen_profile)
}