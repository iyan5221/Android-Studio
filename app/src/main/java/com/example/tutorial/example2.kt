package com.example.tutorial

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource

@Composable
fun MyImageView(){
    val image= painterResource(id = R.drawable.sky)
    Image(painter=image, contentDescription = null)
}
@Preview
@Composable
fun MyImageViewPreview(){
    MyImageView()
}