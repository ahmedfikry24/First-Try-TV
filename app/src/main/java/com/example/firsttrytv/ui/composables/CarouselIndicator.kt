package com.example.firsttrytv.ui.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.tv.material3.MaterialTheme
import com.example.firsttrytv.ui.theme.dimens
import com.example.firsttrytv.ui.theme.white
import com.example.firsttrytv.ui.theme.white24
import com.example.firsttrytv.ui.theme.white8

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarouselIndicator(
    pagerState: PagerState = rememberPagerState { 0 },
    listSize: Int = 0
) {
    Row(
        modifier = Modifier
            .wrapContentHeight()
            .padding(MaterialTheme.dimens.size24)
            .background(white8)
    ) {
        repeat(listSize) { index ->
            val color = if (pagerState.currentPage == index) white else white24
            Box(
                modifier = Modifier
                    .padding(MaterialTheme.dimens.size8)
                    .background(color, CircleShape)
                    .size(MaterialTheme.dimens.size16)
            )
        }
    }
}