package com.example.practica4_zamorapablo.ui.theme.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica4_zamorapablo.R

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit){
    var username by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Inicio de sesión",
            modifier = Modifier
                .fillMaxWidth(),
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(18.dp))
        Image(
            painter = painterResource(R.drawable.cine),
            contentDescription = "logo",
            modifier = Modifier
                .size(170.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(18.dp))
        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            label = {Text(text = "Nombre de usuario")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(14.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = {Text(text = "Contraseña")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {
                onLoginSuccess()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Entrar")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen( {})
}