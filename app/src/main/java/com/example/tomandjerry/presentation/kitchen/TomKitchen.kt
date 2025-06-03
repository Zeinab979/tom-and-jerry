package com.example.tomandjerry.presentation.kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.presentation.kitchen.components.AddToCartBar
import com.example.tomandjerry.presentation.kitchen.components.DetailsSection
import com.example.tomandjerry.presentation.kitchen.components.PastaHeader
import com.example.tomandjerry.presentation.kitchen.components.PreparationMethodSection
import com.example.tomandjerry.presentation.kitchen.components.TextBox
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomKitchen() {
    Scaffold(
        bottomBar = {
            AddToCartBar()
        },
    ) { padding ->
        PastaImageSection(padding)
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 162.dp)
                .background(
                    MaterialTheme.colorScheme.background,
                    RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                ),
            contentPadding = PaddingValues(16.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(16.dp))
                PastaHeader()
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Pasta cooked with a charger cable and sprinkled with questionable cheese. " +
                            "Make sure to unplug it before eating (or not, you decide).",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(16.dp))
                DetailsSection()
                Spacer(modifier = Modifier.height(16.dp))
                PreparationMethodSection()
            }
        }
        Image(
            painter = painterResource(id = R.drawable.pasta),
            contentDescription = "pasta",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(187.dp)
                .height(168.dp)
                .offset(x = (180).dp, y = (18).dp)
        )
    }
}

@Composable
fun PastaImageSection(paddingValues: PaddingValues) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(172.dp)
                .background(MaterialTheme.colorScheme.surfaceContainer)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse_3_background),
                contentDescription = "Pasta Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                     .size(210.dp)

            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(top = 40.dp, start = 16.dp)
            ) {
                TextBox(
                    "High tension",
                    painter = painterResource(R.drawable.icon)
                )
                TextBox(
                    "Shocking foods",
                    painter = painterResource(R.drawable.food)
                )

            }
        }
    }
}

@Preview(
    showBackground = true, name = "Tom Pasta Detail Screen",
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES,
    device = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
)
@Preview(
    showBackground = true, name = "Tom Pasta Detail Screen",
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO,
    device = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
)
@Preview(
    showBackground = true, name = "Tom Pasta Detail Screen",
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO,
    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
)
@Composable
fun PreviewTomPastaDetailScreen() {
    TomAndJerryTheme {
        TomKitchen()
    }
}



