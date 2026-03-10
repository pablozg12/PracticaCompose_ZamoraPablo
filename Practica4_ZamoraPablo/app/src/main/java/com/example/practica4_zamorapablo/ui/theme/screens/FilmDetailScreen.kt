package com.example.practica4_zamorapablo.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica4_zamorapablo.R
import com.example.practica4_zamorapablo.model.Film
import com.example.practica4_zamorapablo.model.sampleFilms
import com.example.practica4_zamorapablo.ui.theme.components.FilmCard

@Composable
fun FilmDetailScreen(film: Film, onBack: () -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = film.title,
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(18.dp))
        Image(
            painter = painterResource(film.imageRes),
            contentDescription = "logo",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(18.dp))
        Text(text = film.description,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center)
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
fun FilmDetailScreenPreview(){
    // FilmDetailScreen(Film(id = 1, title = "Avengers", theme = "Película de heroes", description = "Película acerca los superheroes más famosos del planeta luchando juntos como equipo contra una amenaza mundial.",imageRes = R.drawable.avengers))
}