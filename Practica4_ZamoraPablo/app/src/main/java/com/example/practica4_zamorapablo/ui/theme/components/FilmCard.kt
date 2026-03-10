package com.example.practica4_zamorapablo.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica4_zamorapablo.R
import com.example.practica4_zamorapablo.model.Film

@Composable
fun FilmCard(film: Film, onClick: () -> Unit){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clickable{onClick()},
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
                painter = painterResource(film.imageRes),
                contentDescription = "logo${film.id}",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(90.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column() {
                Text(text = film.title,
                    style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = film.theme)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FilmCardPreview(){
    Film(id = 2, title = "Dune", theme = "Película de acción", description = "Al querer seguir el legado de su padre termina por adentrarse en una guerra de la cual no podrá salir nunca.",imageRes = R.drawable.dune)
}