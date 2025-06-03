package com.example.tomandjerry.presentation.kitchen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R


@Composable
fun DetailsSection() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        DetailBox(
            "1000 V",
            "Temperature",
            icon = R.drawable.temperature,
            modifier = Modifier.weight(1f)
        )
        DetailBox("3 sparks", "Time", icon = R.drawable.timer_02, modifier = Modifier.weight(1f))
        DetailBox("1M 12K", "No. of deaths", icon = R.drawable.evil, modifier = Modifier.weight(1f))
    }
}