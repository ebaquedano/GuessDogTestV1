package com.example.guesstestv1

import android.os.Bundle
import android.print.PrintAttributes.Margins
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.guesstestv1.ui.theme.GuessTestV1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            helloApp()
        }
    }
}

//Funcion contenedora de toda la pantalla
@Preview (showBackground = true)
@Composable
fun helloApp(){
    GuessTestV1Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Android")
        }
    }
}

// Mostrar el nombre de la app "Guees Dog"
@Preview(showBackground = true)
@Composable
fun exampleModifier(){
    Text(text = "Guess Dog",
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp))
}

@Preview (showBackground = true)
@Composable
fun funcionConColumnas(){
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {

        item {

        Text(text = "Guess Dog",
            color = Color.White,
            fontSize = 40.sp,
            modifier = Modifier.fillMaxWidth().padding(PaddingValues(top = 30.dp, bottom = 30.dp)),
            textAlign = TextAlign.Center)

            //Dejo este espacio para remplazar por Imag
        Text(text = " ")
        Text(text = " ")
        Text(text = " ")
        Text(text = " ")
        Text(text = " ")
        Text(text = " ")
        Text(text = " ")

        Row() {
            Text(text = "Adivina la raza del perro",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 20.dp),
                textAlign = TextAlign.Center)
        }

        Text(text = "Raza del perro: ",
            fontSize = 18.sp,
            color = Color.White)

        Text(text = "Nombre del perro: ",
            fontSize = 18.sp,
            color = Color.White)
        
        Text(text = "Puntos: ",
            fontSize = 18.sp,
            color = Color.White)

            Row() {
                Button(
                    onClick = {
                        Log.i("Button", "Presiono el boton")
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Actualizar imagen",
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Bienvenido $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GuessTestV1Theme {
        Greeting("Usuario")
    }
}