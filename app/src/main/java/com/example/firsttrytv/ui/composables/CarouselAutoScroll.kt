package com.example.firsttrytv.ui.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarouselAutoScroll(
    pagerState: PagerState = rememberPagerState { 0 }
) {
    LaunchedEffect(key1 = pagerState.settledPage) {
        delay(3000)
        if (pagerState.canScrollForward)
            pagerState.animateScrollToPage(pagerState.settledPage + 1)
        else
            pagerState.animateScrollToPage(0)
    }
}