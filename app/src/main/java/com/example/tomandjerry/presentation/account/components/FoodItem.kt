package com.example.tomandjerry.presentation.account.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.presentation.account.TomFood
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun FoodItem(food: TomFood) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .padding(vertical = 4.dp)
            .fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(id = food.icon),
            contentDescription = null,
            modifier = Modifier
                .background(
                    Color.White,
                    RoundedCornerShape(8.dp)
                )
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = food.label,
            color = MaterialTheme.colorScheme.onSurface)
    }
}

@Preview
@Composable
private fun FoodItemPreview() {
    TomAndJerryTheme {
        FoodItem(
            TomFood(R.drawable.sleep, "Change sleep mood")
        )
    }

}