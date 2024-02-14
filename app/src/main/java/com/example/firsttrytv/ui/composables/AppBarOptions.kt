package com.example.firsttrytv.ui.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.example.firsttrytv.ui.theme.dimens

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun AppBarOptions(text: String, isSelected: Boolean) {
    Box(
        modifier = Modifier.appBarOption(isSelected)
    ) {
        Text(
            modifier = Modifier.padding(
                horizontal = MaterialTheme.dimens.size16,
                vertical = MaterialTheme.dimens.size6
            ),
            text = text,
            color = if (isSelected) MaterialTheme.colorScheme.inverseOnSurface else MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Composable
@OptIn(ExperimentalTvMaterial3Api::class)
@SuppressLint("ModifierFactoryUnreferencedReceiver")
private fun Modifier.appBarOption(selected: Boolean) =
    height(MaterialTheme.dimens.size32).background(
        color = if (selected) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.background,
        shape = if (selected) RoundedCornerShape(MaterialTheme.dimens.corner4) else RectangleShape,
    )