package com.clinton.mybirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.clinton.mybirthdaycard.ui.theme.MyBirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(message ="Happiest Birthday Vivian", from ="From:Klint")
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithImage(message:String, from: String, modifier:Modifier = Modifier){
val image = painterResource(id = R.drawable.birthdayparty)
    //Create a box to overlap image and text
    Box() {

        Image(painter = image, contentDescription = null, contentScale= ContentScale.Crop )
        BirthdayGreetingWithText(message ="Happiest Birthday Vivian", from ="From:Klint")
    }


}

@Composable
fun BirthdayGreetingWithText(message: String, from: String){
    Column {
        Text(
            text = message, fontSize =25.sp
        )
        Text(
            text = from, fontSize = 15.sp
        )

    }

}

@Preview(showBackground = false)
@Composable
fun BirthdayGreetingWithImagePreview() {
    MyBirthdayCardTheme {
        BirthdayGreetingWithImage(message ="Happiest Birthday Vivian", from ="From: Klint")
    }
}
