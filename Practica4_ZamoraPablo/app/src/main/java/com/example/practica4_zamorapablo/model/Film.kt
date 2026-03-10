package com.example.practica4_zamorapablo.model

import com.example.practica4_zamorapablo.R

data class Film (
    val id:Int,
    val title: String,
    val theme: String,
    val description: String,
    val imageRes: Int = 0
)

val sampleFilms = listOf(
    Film(id = 1, title = "Avengers", theme = "Película de heroes", description = "Película acerca los superheroes más famosos del planeta luchando juntos como equipo contra una amenaza mundial.",imageRes = R.drawable.avengers),
    Film(id = 2, title = "Dune", theme = "Película de acción", description = "Al querer seguir el legado de su padre termina por adentrarse en una guerra de la cual no podrá salir nunca.",imageRes = R.drawable.dune),
    Film(id = 3, title = "Oppenheimer", theme = "Película de la bomba nuclear", description = "El famoso científico, en plena segunda guerra mundial, decide crear un arma con la cual entra en duda de su moral y el propósito de su creación.",imageRes = R.drawable.oppenheimer),
    Film(id = 4, title = "Cenicienta", theme = "Película de una princesa", description = "La dulce princesa ayuda con la limpieza en su vivienda, sin saber el gran futñuro que le depara.",imageRes = R.drawable.cenicienta),
    Film(id = 5, title = "Star wars episodio III", theme = "Película de Ciencia ficción", description = "El imperio reaparece en contra de la república, esta vez con un giro que no se esperaría ni el alto consejo jedi.",imageRes = R.drawable.starwars3)
)