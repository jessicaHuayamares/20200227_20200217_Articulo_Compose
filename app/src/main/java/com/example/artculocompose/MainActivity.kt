package com.example.artculocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artculocompose.ui.theme.ArtículoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtículoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(title = stringResource(R.string.jetpack_compose_title),
                        description = stringResource(R.string.jetpack_compose_description),
                        description2 = stringResource(R.string.jetpack_compose_description2))

                }
            }
        }
    }
}

@Composable
fun GreetingText(title: String, description: String, description2: String,modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Top, modifier = modifier){
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = description,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = description2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun GreetingImage(title: String, description: String, description2: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier){
        Image(
            painter = image,
            contentDescription = null
        )
    GreetingText(title = title,description = description,description2=description2, modifier = Modifier
        .padding(5.dp).fillMaxSize()
    )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtículoComposeTheme {
        //Greeting("Android")
        GreetingImage(title = stringResource(R.string.jetpack_compose_title),
            description = stringResource(R.string.jetpack_compose_description),
            description2 = stringResource(R.string.jetpack_compose_description2))


    }
}
