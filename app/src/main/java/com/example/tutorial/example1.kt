package com.example.tutorial

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text

@Composable
fun NormalButton(onClick: () -> Unit) {
    Button( onClick = { }) {
        Text("Press Here")
    }
}
@Preview
@Composable
fun PreviewNormalButton(){
    NormalButton{ }
}