package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CourseScreen(){
    val scroll = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(15.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(
                    R.drawable.logo_image
                ),
                contentDescription = "",
                modifier = Modifier
                    .size(80.dp)
            )
            Text(
                text = "Lion \nSchool",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF3347B0)
            )
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth(),
            color = Color(0xFFFFC23D),
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    tint = Color(0xFF9E9FA4)
                )
            },
            label = {
                Text(
                    text = stringResource(R.string.find_course),
                    fontSize = 16.sp,
                    color = Color(0xFF9E9FA4)
                )
            },
            shape = RoundedCornerShape(8.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF5F5F5),
                unfocusedBorderColor = Color(0xFFFFC23D)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(
                    R.drawable.lion_list
                ),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = "Courses",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF3347B0)
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 14.dp)
                .verticalScroll(scroll)
        ){
            //Adicionar o nome do arquivo que vou criar...
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun InitialScreenPreview(){
    CourseScreen()
}