package com.example.tomandjerry.presentation.store

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.presentation.store.components.TomCard
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomGridSection(tomList: List<TomItem>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(bottom = 80.dp),
    ) {
        items(tomList) { tom ->
            TomCard(item = tom)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JerryStore(tomList: List<TomItem>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.profile_image_2),
                contentDescription = stringResource(R.string.profile),
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    stringResource(R.string.hi_jerry),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
                Text(
                    stringResource(R.string.which_tom_do_you_want_to_buy),
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.outline
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            BadgedBox(
                badge = {
                    Badge(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = Color.White,
                        modifier = Modifier
                            .size(14.dp)
                            .align(Alignment.BottomCenter)
                    ) {
                        Text("3", fontSize = 10.sp)
                    }
                },
                content = {
                    Icon(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = "notification",
                        modifier = Modifier
                            .size(40.dp)
                            .border(
                                1.dp,
                                MaterialTheme.colorScheme.outline,
                                RoundedCornerShape(12.dp)
                            )
                            .padding(8.dp)
                    )
                }

            )

        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
        ) {
            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        "Search about tom ...",
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.outline,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                    )
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "search",
                        tint = MaterialTheme.colorScheme.outline
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    unfocusedIndicatorColor = Color.White,
                ),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.weight(1f)
                    .padding(end = 8.dp)
                ,
            )

            Icon(
                painter = painterResource(id = R.drawable.filter_horizontal),
                contentDescription = "Filter",
                tint = Color.White,
                modifier = Modifier
                    .background
                        (
                        MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(12.dp)
                    )
                   .padding(horizontal = 14.dp, vertical = 15.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(Brush.linearGradient(listOf(Color(0xFF03446A), Color(0xFF0685D0))))
                    .height(92.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle()) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight(600),
                                    fontSize = 16.sp
                                )
                            ) {
                                append("Buy 1 Tom and get 2 for free\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight(400),
                                    fontSize = 12.sp,

                                    )
                            ) {
                                append("Adopt Tom! (Free Fail-Free\n Guarantee)")
                            }
                        }
                    },
                    modifier = Modifier.padding(8.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.adopt_tom),
                contentDescription = "adopt tom",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(108.dp)
                    .width(115.dp)
                    .shadow(
                        elevation = 1.dp,
                        shape = RoundedCornerShape(topStart = 360.dp, topEnd = 5.dp),
                        ambientColor = Color(0xC8FFFFFF),
                        spotColor = Color(0x41FFFFFF),
                        clip = false
                        )

            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Cheap tom section",
                fontWeight = FontWeight(600),
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                "View All",
                fontWeight = FontWeight(500),
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.primary
            )
            Icon(
                painter = painterResource(R.drawable.arrow_right),
                contentDescription = "View all",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(top = 6.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        TomGridSection(tomList = tomList)
    }
}


@Preview(showBackground = true, showSystemUi = true,
    device = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420"
)
@Preview(showBackground = true, showSystemUi = true,
    device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240"
)
@Composable
fun TomStoreScreenPreview() {
    TomAndJerryTheme {
        JerryStore(tomList = sampleTomList)
    }
}
