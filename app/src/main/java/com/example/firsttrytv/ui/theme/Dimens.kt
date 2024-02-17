package com.example.firsttrytv.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.tv.material3.MaterialTheme

@Immutable
data class Dimens(
    val corner4: Dp = 4.dp,

    val size2: Dp = 2.dp,
    val size4: Dp = 4.dp,
    val size6: Dp = 6.dp,
    val size8: Dp = 8.dp,
    val size16: Dp = 16.dp,
    val size20: Dp = 20.dp,
    val size24: Dp = 24.dp,
    val size32: Dp = 32.dp,
    val size40: Dp = 40.dp,
    val size48: Dp = 48.dp,
    val size58: Dp = 58.dp,
    val size72: Dp = 72.dp,
    val size153: Dp = 153.dp,
    val size231: Dp = 231.dp,
)

val localDimens = compositionLocalOf { Dimens() }
val MaterialTheme.dimens
    @Composable get() = localDimens.current