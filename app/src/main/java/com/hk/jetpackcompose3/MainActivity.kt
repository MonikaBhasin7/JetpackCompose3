package com.hk.jetpackcompose3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hk.jetpackcompose3.ui.theme.JetpackCompose3Theme
import com.hk.jetpackcompose3.ui.theme.Purple200

class MainActivity : ComponentActivity() {

    val mainViewModel by  viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
//                    BaseFun(viewModel = mainViewModel)
                    SuperMarketNavHost()
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        JetpackCompose3Theme {
            BaseFun(mainViewModel)
        }
    }


}

@Composable
fun BaseFun(viewModel: MainViewModel) {
    var clickCount by remember { mutableStateOf(0) }

    BaseFunUi(clickCount = clickCount, buttonClickCallback = {
        clickCount++
    })
}

@Composable
fun BaseFunUi(clickCount: Int, buttonClickCallback: () -> Int) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .padding(horizontal = 4.dp, vertical = 4.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "Hare Krishna ${clickCount}",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Green,
        )
        Button(onClick = {
            buttonClickCallback()
        }, shape = RoundedCornerShape(8.dp)) {
            Text(text = "Tap")
        }
    }
}

























