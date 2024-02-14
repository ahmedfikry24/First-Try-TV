package com.example.firsttrytv.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.tv.material3.MaterialTheme
import com.example.firsttrytv.R
import com.example.firsttrytv.ui.theme.dimens

@Composable
fun AppBar() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(R.drawable.ic_profile), contentDescription = null)
        Spacer(modifier = Modifier.width(MaterialTheme.dimens.size20))
        AppBarOptions(text = "Home", isSelected = true)
        AppBarOptions(text = "Categories", isSelected = false)
        AppBarOptions(text = "Movies", isSelected = false)
        AppBarOptions(text = "Shows", isSelected = false)
        Spacer(modifier = Modifier.width(MaterialTheme.dimens.size20))
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.ic_search),
            contentDescription = null
        )
    }
}