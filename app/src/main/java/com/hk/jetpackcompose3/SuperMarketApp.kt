package com.hk.jetpackcompose3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SuperMarketNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    Column() {
        HomeAppBar()
        HorizontalProductList()
    }
}

@Composable
fun HorizontalProductList() {
    LazyRow(modifier = Modifier.padding(start = 16.dp),) {
        items(listOf("", "", "", "", "", "")) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(end = 16.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = RoundedCornerShape(percent = 100))
                        .background(color = Color.Magenta)
                        .padding(10.dp)
                ) {
                    Icon(
                        Icons.Default.Face,
                        modifier = Modifier.size(30.dp),
                        contentDescription = null,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text("HK")
            }
        }
    }
}

@Composable
fun HomeAppBar() {
    TopAppBar(
        backgroundColor = Color.White,
        elevation = 0.dp,
        title = {
            Text(text = "Store", fontSize = 16.sp)
        },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "back icon")
            }
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "search")
            }
            Box(contentAlignment = Alignment.TopEnd) {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "cart")
                Box(
                    modifier = Modifier
                        .size(size = 15.dp)
                        .clip(shape = RoundedCornerShape(percent = 100))
                        .background(color = Color.Yellow)
                        .padding(1.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(text = "2", fontSize = 9.sp)
                }
            }
        }
    )
}