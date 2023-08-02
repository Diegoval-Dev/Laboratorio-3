package com.uvg.Laboratorio3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.Laboratorio3.ui.theme.Laboratorio3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio3Theme {
                // A surface container using the 'background' color from the theme
                Surface() {
                    Greeting("Diego Pablo Valenzuela Palacios 22309")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Surface(color = Color.Blue, modifier = Modifier.fillMaxSize()) {
        Text(text = "Hola $name!", modifier = Modifier.padding(24.dp), color = Color.Red, fontFamily = FontFamily.Cursive, fontSize = 24.sp, fontWeight = FontWeight(500))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio3Theme {
        Greeting("Preview Diego Pablo Valenzuela")
    }
}