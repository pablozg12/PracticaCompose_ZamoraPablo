package com.example.practica4_zamorapablo.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica4_zamorapablo.model.sampleFilms
import com.example.practica4_zamorapablo.ui.theme.components.FilmCard

@Composable
fun FilmsScreen(onFilmClick: (Int) -> Unit, onBack: () -> Unit ){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Listado de películas",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn() {
            items(items = sampleFilms){
                film ->
                FilmCard(film,onClick = { onFilmClick(film.id) })
            }
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {
                onBack()
            },
            modifier = Modifier.fillMaxWidth(),
        ) {

            Text(text = "Volver")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun FilmsScreenPreview(){
   // FilmsScreen({})
}