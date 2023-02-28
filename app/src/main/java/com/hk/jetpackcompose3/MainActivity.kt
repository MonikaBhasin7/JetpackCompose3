package com.hk.jetpackcompose3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hk.jetpackcompose3.ui.theme.JetpackCompose3Theme
import com.hk.jetpackcompose3.ui.theme.Purple200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BaseFun()
                }
            }
        }
    }
}

@Composable
fun BaseFun() {
    var clickCount by remember { mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .background(color = Purple200)
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
            clickCount++;
        }, shape = RoundedCornerShape(8.dp)) {
            Text(text = "Tap")
        }
        Button(onClick = {
            clickCount++;
        }, shape = RoundedCornerShape(8.dp)) {
            Text(text = "Tap")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose3Theme {
        BaseFun()
    }
}

























