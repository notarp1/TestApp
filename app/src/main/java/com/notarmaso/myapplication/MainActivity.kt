package com.notarmaso.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.notarmaso.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = MainActivityViewModel()

        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                    MainView(viewModel)

            }
        }
    }
}

@Composable
fun MainView(viewmodel: MainActivityViewModel){
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(if (!viewmodel.buttonPress) Color.Green else Color.Red),
    contentAlignment = Alignment.TopCenter){

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TopBar()
            MenuButton("Gå til shop", viewmodel::OnButtonPressed)
            Spacer(Modifier.height(20.dp))
            MenuButton("Gå til indstillinger", viewmodel::OnButtonPressed)

        }
    }

}





@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}