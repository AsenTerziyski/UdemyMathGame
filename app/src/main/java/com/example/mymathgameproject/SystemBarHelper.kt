package com.example.mymathgameproject

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

object SystemBarHelper {
    @Composable
    fun setColor(): SystemUiController {
        val systemUIController = rememberSystemUiController()
        systemUIController.setSystemBarsColor(
            color = colorResource(id = R.color.green)
        )
        return systemUIController
    }
}