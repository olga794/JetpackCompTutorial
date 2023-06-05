package com.example.jetpacktutorial2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpacktutorial2.ui.theme.JetpackTutorial2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTutorial2Theme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //MyTextField()
                    Column() {
                        MyTextFieldAdVance()
                        MyTextFieldOutLined()
                    }

                }

            }
        }
    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackTutorial2Theme {
        //MyTextField()
        MyTextFieldAdVance()
        MyTextFieldOutLined()
    }
}

    @Composable
    fun MyTextFieldOutLined() {
        var myTextVaria by remember { mutableStateOf("") }
        OutlinedTextField(
            value = myTextVaria,
            onValueChange = { myTextVaria = it },
            modifier = Modifier.padding(24.dp),
            label = {Text(text = "text_line")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Cyan,
                unfocusedBorderColor = Color.Yellow
            )
        )

    }

    @Composable
    fun MyTextFieldAdVance() {
        var myTextVariaA by remember { mutableStateOf("") }
        //TextField(value = myTextVariaA, onValueChange = { myTextVariaA = it }, label = {Text(text = "Escribe Nombre")})
        // agregando comprobaciones
        TextField(value = myTextVariaA, onValueChange = {
            myTextVariaA = if (it.contains("a")) {
                it.replace("a","rr")
            } else {
                it
            }
        }, label = { Text(text = "Escribe Nombre") })


    }
@Composable
fun MyTextField() {
    var myTextVaria by remember { mutableStateOf("olga") }
    TextField(value = myTextVaria, onValueChange = { myTextVaria = it })


}

@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {

    }
    Text(text = "EJEmplo")
    Text(text = "EJEmplo 2 color", color = Color.Red)
    Text(text = "EJEmplo 3 Fuente 1 ", fontWeight = FontWeight.SemiBold)
    Text(text = "EJEmplo 4 fuente 2", fontWeight = FontWeight.ExtraBold)
    Text(
        text = "EJEmplo 5 estilo tipo fuente ",
        style = TextStyle(fontFamily = FontFamily.Cursive)
    )
    Text(
        text = "EJEmplo 5 estilo decoracion 1",
        style = TextStyle(textDecoration = TextDecoration.Underline)
    )
    Text(
        text = "EJEmplo 5 estilo decoracion 2 ",
        style = TextStyle(textDecoration = TextDecoration.LineThrough)
    )
    Text(
        text = "EJEmplo 5 estilo decoracion 2 y 1 ", style = TextStyle(
            textDecoration = TextDecoration.combine(
                listOf(TextDecoration.LineThrough, TextDecoration.Underline)
            )
        )
    )
    // se puede usar asi
    Text(text = "EJEmplo 5 estilo tipo fuente  sin usar style", fontFamily = FontFamily.Cursive)
    Text(text = "EJEmplo 5 tamaño de texto", fontSize = 20.sp)


}
}
