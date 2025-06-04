package com.example.tomandjerry.presentation.account

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.presentation.account.components.FoodItem
import com.example.tomandjerry.presentation.account.components.SettingItem
import com.example.tomandjerry.presentation.account.components.StateCard
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomAccountScreen() {
    Scaffold(
        bottomBar = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(
                        MaterialTheme.colorScheme.background)
            ) {
                Text(
                    "v.TomBeta",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                )
            }
        }
    ) { padding ->
        ImageSection(padding)
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 190.dp)
                .background(
                    MaterialTheme.colorScheme.background,
                    RoundedCornerShape(
                        topStart = 16.dp , topEnd = 16.dp)
                )
                .padding(start = 16.dp , end = 16.dp)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(top = 23.dp, bottom = 12.dp)
            ) {
                items(stats) { stat -> StateCard(stat) }
            }
            Text(
                "Tom settings",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondary

            )
            settings.forEach { SettingItem(it) }
            HorizontalDivider(
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.outline
            )
            Text(
                "His favorite foods",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondary
            )
            foods.forEach { FoodItem(it) }

        }
    }
}

@Composable
fun ImageSection(
    padding: PaddingValues = PaddingValues(0.dp)
) {
    Box (
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(
                id = R.drawable.background_container_account
            ),
            contentDescription = "Pasta Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_tom),
                contentDescription = "Tom Image",
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(12.dp)
                )
            )
            Text(
                "Tom",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                "specializes in failure!",
                fontSize = 12.sp,
                color = Color.White
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.onPrimary)
            ) {
                Text(
                    "Edit foolishness",
                    color = Color.White
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Preview(showBackground = true,uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES,)
@Preview(showBackground = true,
    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
)
@Composable
fun PreviewTomAccountScreen() {
    TomAndJerryTheme {
        TomAccountScreen()
    }
}
