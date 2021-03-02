package com.droidorbiter.puppyadoptionchallenge.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.droidorbiter.puppyadoptionchallenge.domain.Puppies
import com.droidorbiter.puppyadoptionchallenge.domain.PuppiesImp
import com.droidorbiter.puppyadoptionchallenge.ui.theme.AppTypography

val puppies: Puppies = PuppiesImp()


@Preview(showBackground = true)
@Composable
fun DetailsScreen_Preview() {
    Details()
}


@Composable
fun Details(navController: NavController? = null, puppyID: String? = null) {

    val puppyByID = puppyID?.let {
        puppies.getPuppyByID(puppyID)
    } ?: run {
        puppies.getPuppyByID("0")
    }

    Column {
        Header(navController,
            title = "Details Screen",
            backButtonVisibility = true
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(
                top = 10.dp, start = 15.dp, end = 15.dp, bottom = 30.dp),
            horizontalArrangement = Arrangement
                .spacedBy(24.dp)
        ) {
            puppyByID.image_list.forEach { puppyImage ->
                item {
                    ImageItem(puppyImage)
                }
            }
        }
        Text(
            text = "Hello i am ${puppyByID.name}",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, bottom = 30.dp),
            style = AppTypography.h1,
            textAlign = TextAlign.Center
        )
        Text(
            text = "A little bit but me :)",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 15.dp, bottom = 25.dp),
            style = TextStyle(fontSize = 20.sp)
        )

        LazyColumn(
            contentPadding = PaddingValues(
                top = 0.dp, start = 15.dp, end = 15.dp, bottom = 60.dp),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            item {
                Text(
                    text = puppyByID.description,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, start = 15.dp, end = 25.dp, bottom = 15.dp),
                    style = AppTypography.body1
                )
            }
        }
    }
}

@Composable
fun ImageItem(puppyImage: Int) {
    Image(
        modifier = Modifier
            .height(160.dp)
            .padding(top = 15.dp, start = 8.dp, end = 15.dp, bottom = 15.dp)
            .clip(RoundedCornerShape(percent = 10))
            .border(2.dp, MaterialTheme.colors.background, RoundedCornerShape(percent = 10)),
        painter = painterResource(id = puppyImage),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}