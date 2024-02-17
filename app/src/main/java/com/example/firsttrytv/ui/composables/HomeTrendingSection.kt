package com.example.firsttrytv.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.example.firsttrytv.R
import com.example.firsttrytv.entities.HomeImageEntity
import com.example.firsttrytv.ui.theme.dimens

@Composable
fun HomeTrendingSection() {
    val films = listOf(
        HomeImageEntity(R.drawable.treanding_film, "Him"),
        HomeImageEntity(R.drawable.treanding_film2, "Yellow"),
        HomeImageEntity(R.drawable.treanding_film3, "Luke Strong"),
        HomeImageEntity(R.drawable.treanding_film4, "Amelia Jones"),
        HomeImageEntity(R.drawable.treanding_film5, "Wanted"),
        HomeImageEntity(R.drawable.treanding_film6, "Rainbow")
    )
    Column(verticalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.size16)) {
        Text(
            modifier = Modifier.padding(start = MaterialTheme.dimens.size58),
            text = "Trending",
            style = MaterialTheme.typography.headlineMedium
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.size16),
            contentPadding = PaddingValues(horizontal = MaterialTheme.dimens.size58)
        ) {
            items(
                items = films,
                key = { it.id },
                contentType = { Int }
            ) { film ->

                Image(
                    modifier = Modifier
                        .size(
                            width = MaterialTheme.dimens.size153,
                            height = MaterialTheme.dimens.size231
                        )
                        .clip(RoundedCornerShape(MaterialTheme.dimens.size4)),
                    painter = painterResource(film.id),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = null
                )
            }
        }
    }
}
