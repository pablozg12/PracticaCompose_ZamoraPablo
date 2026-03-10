package com.example.practica4_zamorapablo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practica4_zamorapablo.model.sampleFilms
import com.example.practica4_zamorapablo.ui.theme.screens.FilmDetailScreen
import com.example.practica4_zamorapablo.ui.theme.screens.FilmsScreen
import com.example.practica4_zamorapablo.ui.theme.screens.LoginScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LOGIN_SCREEN){
        composable(Routes.LOGIN_SCREEN){
            LoginScreen(onLoginSuccess = {navController.navigate(Routes.FILMS_SCREEN)})
        }
        composable(Routes.FILMS_SCREEN){
            FilmsScreen(
                onFilmClick = { id -> navController.navigate("detail/$id")},
                onBack = {navController.navigate(Routes.LOGIN_SCREEN)})
        }
        composable(
            Routes.FILM_DETAIL,
            listOf(navArgument("filmId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("filmId")
            val film = sampleFilms.find { it.id == id }

            if (film != null) {
                FilmDetailScreen(film = film, onBack = { navController.popBackStack() })
            }
        }
    }
}

object Routes{
    const val LOGIN_SCREEN = "login"
    const val FILMS_SCREEN = "list"
    const val FILM_DETAIL = "detail/{filmId}"
}