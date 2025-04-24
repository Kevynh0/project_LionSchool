package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CourseScreen(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.7f),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.logo_image
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .size(120.dp)
                )
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun InitialScreenPreview(){
    CourseScreen()
}