package com.example.tomandjerry.presentation.store.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.presentation.store.TomItem
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomCard(item: TomItem) {
    Box(
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .padding(top = 16.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(16.dp)
                )
                .height(219.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Spacer(modifier = Modifier.height(92.dp))
            Text(
                item.title,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()

            )
            Text(
                item.description,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
                maxLines = 3,
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, bottom = 8.dp , end = 8.dp)

            ) {
                CheesesCard(
                    item.cheeseCount,
                    modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.elements),
                    contentDescription = "element",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .size(30.dp)
                        .border
                            (
                            1.dp,
                            MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(7.dp)

                )
            }
        }
        Image(
            painter = painterResource(id = item.imageRes),
            contentScale = ContentScale.Crop,
            contentDescription = item.title,
            modifier = Modifier
                .size(100.dp)
        )
    }
}

@Preview
@Composable
private fun TomCardPreview() {
    TomAndJerryTheme {
        val sampleTom =
            TomItem("Sport Tom", "He runs 1 meter.. trips over his boot.", 3, R.drawable.sport_tom)
        TomCard(item = sampleTom)
    }
}