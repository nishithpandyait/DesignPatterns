package com.technoshaft.designpatterns.design_pattern.facade

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Favourite : Screen {
    @Composable
    override fun display() {
        Text(text = "Favourite Screen")
    }
}