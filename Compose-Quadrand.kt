package com.clinton.myquadrantapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clinton.myquadrantapp.ui.theme.MyQuadrantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyQuadrantAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun MyQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableDisplay(
                title = "Text composable",
                description = "Displays text and follows Material Design guidelines",
               // backgroundColor = Color.Green,
                modifier = Modifier.weight(1f).background(Color.Green)
            )
            ComposableDisplay(
                title = "Image composables",
                description = "Create a composable that lays out and draws a given Painter class object",
                //backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f).background(Color.Yellow)
            )

        }
        Row(Modifier.weight(1f)) {
            ComposableDisplay(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence",
                //backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f).background(Color.Cyan)
            )
            ComposableDisplay(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence",
                //backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f).background(Color.LightGray)
            )
        }

    }
}
@Composable
private fun ComposableDisplay(
    title: String,
    description: String,
    backgroundColor: Color = Color.Transparent,
    modifier: Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(bottom = 16.dp))
        Text(
            text = description,
        textAlign = TextAlign.Justify
        )

    }
}
@Preview(showBackground = true)
@Composable
fun MyQuadrantAppPreview(){
    MyQuadrantAppTheme{
        MyQuadrantApp()
    }
}

