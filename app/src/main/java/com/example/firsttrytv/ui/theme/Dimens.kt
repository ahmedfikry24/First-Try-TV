package com.example.firsttrytv.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.tv.material3.MaterialTheme

@Immutable
data class Dimens(
    val size27: Dp = 27.dp,
    val size48: Dp = 48.dp
)

val localDimens = compositionLocalOf { Dimens() }
val MaterialTheme.dimens
    @Composable get() = localDimens.current