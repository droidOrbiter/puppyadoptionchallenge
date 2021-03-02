package com.droidorbiter.puppyadoptionchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.droidorbiter.puppyadoptionchallenge.presentation.Details
import com.droidorbiter.puppyadoptionchallenge.presentation.Home
import com.droidorbiter.puppyadoptionchallenge.presentation.SplashScreen


const val SPLASH_SCREEN_DESTINATION = "SplashScreen"
const val HOME_SCREEN_DESTINATION = "HomeScreen"
const val DETAILS_SCREEN_DESTINATION = "DetailsScreen"
const val DETAILS_SCREEN_ARGUMENT = "puppyID"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colors.background) {
                PuppyAdoptionApp()
            }
        }
    }
}

@Composable
fun PuppyAdoptionApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = SPLASH_SCREEN_DESTINATION) {
        composable(SPLASH_SCREEN_DESTINATION) {
            SplashScreen(navController)
        }
        composable(HOME_SCREEN_DESTINATION) {
            Home(navController)
        }
        composable(
            "$DETAILS_SCREEN_DESTINATION/{$DETAILS_SCREEN_ARGUMENT}",
            arguments = listOf(navArgument(DETAILS_SCREEN_ARGUMENT) { type = NavType.StringType })
        ) {
            Details(navController, it.arguments?.getString(DETAILS_SCREEN_ARGUMENT) ?: "1")
        }
    }
}




