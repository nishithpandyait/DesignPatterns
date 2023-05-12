package com.technoshaft.designpatterns.design_pattern.facade

import androidx.compose.material3.Button
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

interface ScreenManager {
    fun homeScreen(): Screen = Home()
    fun profileScreen(): Screen = Profile()
    fun favouriteScreen(): Screen = Favourite()
}

class ScreenManagerImpl  {

    private val homeScreen: Screen = Home()
    private val profileScreen: Screen = Profile()
    private val favouriteScreen: Screen = Favourite()

    @Composable
    fun showScreenByName(screenName: String) {
        when (screenName) {
            "home" -> {
                homeScreen.display()
            }

            "profile" -> {
                profileScreen.display()
            }

            "favourite" -> {
                favouriteScreen.display()
            }
        }
    }


    @Composable
    fun showNavigationBar(function: () -> Unit) {
        NavigationBar() {
            Button(onClick = function) {
                Text(text = "Home")
            }
            Button(onClick = function) {
                Text(text = "Favourite")
            }
            Button(onClick = function) {
                Text(text = "Profile")
            }
        }
    }
}