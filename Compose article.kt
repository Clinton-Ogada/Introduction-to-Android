package com.clinton.myjetpackapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clinton.myjetpackapp.ui.theme.MyJetPackAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyJetPackAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    JetpackWithImage(name="Jetpack Compose tutorial", name2 = "Jetpack Compose is a modern toolkit for building native Android Ui. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", name3 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is build aropund Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
                }
            }
        }
    }
}
@Composable
fun JetpackWithImage(name: String, name2: String,name3: String, modifier:Modifier = Modifier){
    val image = painterResource(id = R.drawable.googleproject)
    Column {
        Image(painter=image, contentDescription=null, modifier = Modifier.padding(bottom=25.dp))
        JetpackWithText(name="Jetpack Compose tutorial", name2 = "Jetpack Compose is a modern toolkit for building native Android Ui. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", name3 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is build aropund Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")

    }

}
@Composable
fun JetpackWithText(name: String, name2: String, name3:String, ) {
    Column() {
        Text(text = "$name", fontSize = 25.sp, modifier = Modifier.padding(bottom = 15.dp),textAlign = TextAlign.Center)
        Text(text = "$name2", modifier = Modifier.padding(bottom = 10.dp), textAlign = TextAlign.Justify)
        Text(text = "$name3", textAlign = TextAlign.Justify)
    }

}

@Preview(showBackground = false)
@Composable
fun JetpackWithImagePreview() {
    MyJetPackAppTheme {
        JetpackWithImage(name="Jetpack Compose tutorial", name2 = "Jetpack Compose is a modern toolkit for building native Android Ui. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", name3 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is build aropund Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}
