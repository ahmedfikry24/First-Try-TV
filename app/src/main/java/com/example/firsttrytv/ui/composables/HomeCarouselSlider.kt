package com.example.firsttrytv.ui.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.tv.material3.MaterialTheme
import com.example.firsttrytv.R
import com.example.firsttrytv.ui.theme.dimens

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeCarouselSlider() {
    val imageHeight = (LocalConfiguration.current.screenHeightDp / 2).dp
    val films = listOf(
        R.drawable.film1,
        R.drawable.film2,
        R.drawable.film3,
        R.drawable.film4,
        R.drawable.film5
    )
    val pagerState = rememberPagerState { films.size }
    Box(
        modifier = Modifier
            .height(imageHeight)
            .fillMaxWidth()
            .padding(horizontal = MaterialTheme.dimens.size58),
        contentAlignment = Alignment.BottomEnd
    ) {
        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,
            userScrollEnabled = false
        ) { currentFilmIndex ->
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(films[currentFilmIndex]),
                contentScale = ContentScale.FillBounds,
                contentDescription = null
            )
        }

        CarouselIndicator(pagerState = pagerState, listSize = films.size)
    }

    CarouselAutoScroll(pagerState = pagerState)
}