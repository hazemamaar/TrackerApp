package com.example.trackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.core.navigation.Route
//import com.example.onboarding_presentation.welcome.WelcomeScreen
//import com.example.trackerapp.navigation.navigate
import com.example.trackerapp.ui.theme.TrackerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrackerAppTheme{
//                val navController = rememberNavController()
//                NavHost(navController = navController, startDestination = Route.WELCOME){
//                    composable(Route.WELCOME){
//                        WelcomeScreen(onNavigation = navController::navigate)
//                    }
//                    composable(Route.AGE){
//
//                    }
//                }
            }

        }
    }
}
