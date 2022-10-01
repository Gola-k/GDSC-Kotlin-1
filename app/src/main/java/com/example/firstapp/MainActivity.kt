package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}

@Composable
fun Greeting(name: String, from: String) {
    Box{
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
        Column{
            Text(
                text = "Hello $name !",
                fontSize = 36.sp,
                modifier = Modifier.padding(PaddingValues(top = 16.dp, end = 16.dp, start = 16.dp)).fillMaxWidth(),
                textAlign = TextAlign.Center,
            )
            Text(
                text = "- from $from",
                fontSize = 25.sp,
                modifier = Modifier.padding(PaddingValues(start = 8.dp, end=8.dp)).fillMaxWidth(),
                textAlign = TextAlign.End,
            )
            
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstappTheme {
        Greeting("Kunal", from = "GDSC")
    }
}