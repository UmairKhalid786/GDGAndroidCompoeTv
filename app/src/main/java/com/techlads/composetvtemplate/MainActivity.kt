package com.techlads.composetvtemplate

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.tv.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.tv.material3.MaterialTheme
import com.techlads.composetvtemplate.ui.theme.ComposeTvTemplateTheme

class MainActivity : androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTvTemplateTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
        Menu(
            Modifier
                .width(300.dp)
                .padding(32.dp))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            contentAlignment = Alignment.Center
        ) {
            GDGGreetings()
        }
    }
}

@Composable
fun GDGGreetings() {
    Text(
        modifier = Modifier
            .padding(bottom = 32.dp, top = 16.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = "GDG ♥️",
        style = MaterialTheme.typography.headlineLarge
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTvTemplateTheme {
        App()
    }
}