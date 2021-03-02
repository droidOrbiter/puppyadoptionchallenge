package com.droidorbiter.puppyadoptionchallenge.presentation

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.droidorbiter.puppyadoptionchallenge.HOME_SCREEN_DESTINATION
import com.droidorbiter.puppyadoptionchallenge.SPLASH_SCREEN_DESTINATION
import com.droidorbiter.puppyadoptionchallenge.ui.theme.AppTypography
import com.droidorbiter.puppyadoptionchallenge.ui.theme.Purple500
import com.droidorbiter.puppyadoptionchallenge.ui.theme.White
import com.example.puppyadoptionchallenge.R

@Preview(showBackground = true)
@Composable
fun SplashScreen_Preview() {
    SplashScreen()
}


@Composable
fun SplashScreen(navController: NavController? = null) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Purple500),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "Saving on dog \nwill not change \nthe world,",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp, bottom = 15.dp),
            style = AppTypography.h2,
            textAlign = TextAlign.Center
        )

        Image(
            modifier = Modifier
                .height(180.dp)
                .padding(top = 15.dp, bottom = 15.dp)
                .clip(RoundedCornerShape(percent = 10)),
            painter = painterResource(R.drawable.footprint),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Text(
            text = "but for that one dog \nthe world will be \nforever changed",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 25.dp),
            style = AppTypography.h2,
            textAlign = TextAlign.Center
        )

        Column (
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            LinearProgressIndicator(
                modifier = Modifier
                    .width(150.dp),

                color = White,
                //strokeWidth = Dp(value = 10F)
            )
        }

    }

    // Navigate to Home screen after a delay
    Handler(Looper.getMainLooper()).postDelayed({

        navController?.navigate(HOME_SCREEN_DESTINATION) {
            popUpTo(route = SPLASH_SCREEN_DESTINATION) {
                inclusive = true
            }
        }
    }, 4000)

}