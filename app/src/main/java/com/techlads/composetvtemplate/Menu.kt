@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.techlads.composetvtemplate

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Icon
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Surface
import androidx.tv.material3.Text

@Composable
fun Menu(modifier: Modifier = Modifier) {
    TvLazyColumn(modifier = modifier, content = {
        item {
            MenuItem(title = "Home", ic = ImageVector.vectorResource(id = R.drawable.ic_home))
            MenuItem(title = "Headset", ic = ImageVector.vectorResource(id = R.drawable.ic_headset))
            MenuItem(title = "Videos", ic = ImageVector.vectorResource(id = R.drawable.ic_video))
            MenuItem(title = "Favorites", ic = ImageVector.vectorResource(id = R.drawable.ic_favorite))
            MenuItem(title = "Profile", ic = ImageVector.vectorResource(id = R.drawable.ic_profile))
            MenuItem(title = "Settings", ic = ImageVector.vectorResource(id = R.drawable.ic_settings))
        }
    })
}

@Composable
fun MenuItem(title: String, ic: ImageVector) {
    Surface(onClick = {}, modifier = Modifier.padding(bottom = 8.dp)) {
        Row(Modifier.padding(16.dp).fillMaxWidth()) {
            Icon(imageVector = ic, contentDescription = title)
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = title, style = MaterialTheme.typography.bodyLarge)
        }
    }
}
