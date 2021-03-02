package com.droidorbiter.puppyadoptionchallenge.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.droidorbiter.puppyadoptionchallenge.ui.theme.HeaderTypography
import com.droidorbiter.puppyadoptionchallenge.ui.theme.Purple500
import com.example.puppyadoptionchallenge.R

@Preview()
@Composable
fun Header_Preview() {
    Header()
}

@Composable
fun Header(navController: NavController? = null,
           title: String = "Home Screen",
           backButtonVisibility: Boolean = false) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Purple500)
    ) {
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            style = HeaderTypography.h1,
            textAlign = TextAlign.Center
        )
        if (backButtonVisibility) {
            Image(
                modifier = Modifier
                    .height(70.dp)
                    .padding(start = 14.dp)
                    .clickable(onClick = {
                        navController?.popBackStack()
                    }),
                painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
                contentDescription = null,
                //contentScale = ContentScale.Crop,
                alignment = Alignment.CenterStart
            )
        }
    }
}

