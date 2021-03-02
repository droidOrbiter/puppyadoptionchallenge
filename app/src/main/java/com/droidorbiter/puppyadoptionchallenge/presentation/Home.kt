package com.droidorbiter.puppyadoptionchallenge.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.droidorbiter.puppyadoptionchallenge.DETAILS_SCREEN_DESTINATION
import com.droidorbiter.puppyadoptionchallenge.domain.Puppies
import com.droidorbiter.puppyadoptionchallenge.domain.PuppiesImp
import com.droidorbiter.puppyadoptionchallenge.ui.theme.AppTypography
import com.droidorbiter.puppyadoptionchallenge.ui.theme.CardBackground

@Preview(showBackground = true)
@Composable
fun HomeScreen_Preview() {
    Home()
}

@Composable
fun Home(navController: NavController? = null) {
    val puppies: Puppies = PuppiesImp()

    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        Header(title = "Your best friend is waiting for you")

        LazyColumn(
            contentPadding = PaddingValues(
                top = 25.dp, start = 15.dp, end = 15.dp, bottom = 80.dp),
            verticalArrangement = Arrangement
                .spacedBy(34.dp),
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
        ) {
            puppies.getPuppiesList().forEach { puppyItem ->
                item {
                    CardItem(puppyItem, onClick = {
                        navController?.navigate("$DETAILS_SCREEN_DESTINATION/${puppyItem.id}")
                    })
                }
            }
        }
    }
}


@Composable
fun CardItem(puppy: PuppiesImp.Puppy, onClick:()-> Unit) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 6.dp
    ) {
        Column (
            modifier = Modifier
                .background(CardBackground)
        ){
            Row {
                Image(
                    modifier = Modifier
                        .height(160.dp)
                        .padding(top = 15.dp, start = 8.dp, end = 15.dp, bottom = 15.dp)
                        .clip(RoundedCornerShape(percent = 10))
                        .border( 2.dp,
                            MaterialTheme.colors.background,
                            RoundedCornerShape(percent = 10)
                        )
                        .weight(1f),
                    painter = painterResource(id = puppy.profile_image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Column (
                    modifier = Modifier
                        .weight(2f)

                ) {
                    Text(
                        text = puppy.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 15.dp, start = 15.dp, bottom = 15.dp),
                        //style = TextStyle(fontSize = 20.sp),
                        style = AppTypography.h1,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = puppy.breed,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.dp, start = 15.dp, bottom = 6.dp),
                        style = AppTypography.h3,
                        textAlign = TextAlign.Start
                    )
                    Text(
                        text = puppy.gender,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.dp, start = 15.dp, bottom = 6.dp),
                        style = AppTypography.h3,
                        textAlign = TextAlign.Start
                    )
                }
            }
            Text(
                text = puppy.previewDescription,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 18.dp, end = 18.dp, bottom = 15.dp),
                style = AppTypography.body1
            )
        }
    }
}