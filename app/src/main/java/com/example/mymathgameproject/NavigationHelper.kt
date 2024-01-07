package com.example.mymathgameproject

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mymathgameproject.pages.AppPages
import com.example.mymathgameproject.pages.FirstPage
import com.example.mymathgameproject.pages.SecondPage

@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppPages.FIRST_PAGE.page,
    ) {

        composable(
            route = AppPages.FIRST_PAGE.page
        ) {
            FirstPage(
                navController = navController
            )
        }

        composable(
            route = AppPages.SECOND_PAGE.page + "/{$CATEGORY_ARGUMENT}",
            arguments = listOf(
                navArgument(CATEGORY_ARGUMENT) { type = NavType.StringType }
            )
        ) {
            val selectedCategory = it.arguments?.getString(CATEGORY_ARGUMENT)
            selectedCategory?.let { cat ->
                SecondPage(
                    navController = navController,
                    category = cat
                )
            }
        }
    }
}

const val CATEGORY_ARGUMENT = "category"