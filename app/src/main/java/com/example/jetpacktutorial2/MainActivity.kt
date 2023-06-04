package com.example.jetpacktutorial2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacktutorial2.ui.theme.JetpackTutorial2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTutorial2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

               MyComplexLayout()
             }
             }
        }
    }
}
@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),contentAlignment = Alignment.Center) {
            Text(text = "hola Cyan")

        }
//        Spacer(modifier = Modifier
//            .width(0.dp)
//            .height(30.dp))
// *** se cambia por la siguiente funcion
        MySpacer(size = 30)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)) {
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red), contentAlignment = Alignment.Center){
                Text(text = "hola rojo")
            }
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Green), contentAlignment = Alignment.Center){
                Text(text = "hola verde")
                
            }
        }
        MySpacer(size = 20)
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Blue),contentAlignment = Alignment.BottomCenter){
            Text(text = "hola Azul")

        }
    }
}

@Composable
fun MySpacer(size:Int){
    Spacer(modifier = Modifier.height(size.dp))
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
@Preview(showBackground = true)
@Composable
fun PreviewComponet(){

    MyComplexLayout()

}
