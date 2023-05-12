package com.technoshaft.designpatterns.design_pattern.facade

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Profile : Screen{

    @Composable
    override fun display() {
        Text(text = "Profile Screen")
    }
}