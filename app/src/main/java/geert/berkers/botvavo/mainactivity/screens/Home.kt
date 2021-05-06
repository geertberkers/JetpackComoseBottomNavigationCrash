package geert.berkers.botvavo.mainactivity.screens

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import geert.berkers.botvavo.mainactivity.Screen

/**
 * Created by Zorgkluis (Geert Berkers)
 */
@Composable
fun Home(navController: NavController) {
    Greeting("Home")

    Button(onClick = { navController.navigate(Screen.Profile.route)}) {
        Text("Navigate")
    }
}




@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}