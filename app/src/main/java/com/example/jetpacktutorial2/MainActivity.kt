package com.example.jetpacktutorial2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import com.example.jetpacktutorial2.ui.theme.JetpackTutorial2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComponent()
        }
    }
}

@Composable
fun MyComponent(){
    Row(modifier = Modifier.padding(8.dp)) {
        MyTexts()
        Myimage()
    }
}

@Composable
fun Myimage(){
    Image(
        painterResource(R.drawable.ic_launcher_foreground ),
        "uso imagen de prueba")
}


@Composable
fun MyTexts() {
    Column() {
        MyText("hola mundo")
        MyText("listo")
    }

}

@Composable
fun MyText(text: String) {
    Text(text)
}
@Preview
@Composable
fun PreviewComponet(){
    MyComponent()

}
