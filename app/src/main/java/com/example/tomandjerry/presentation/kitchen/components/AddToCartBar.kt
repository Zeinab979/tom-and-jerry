package com.example.tomandjerry.presentation.kitchen.components
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun AddToCartBar() {
    Surface(tonalElevation = 8.dp) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.tertiary)
                .padding(horizontal = 16.dp, vertical = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.weight(1f),
                onClick = { }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        stringResource(R.string.add_to_cart),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ellipse_4),
                        contentDescription = "ellipse",
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Text(
                        buildAnnotatedString {
                            withStyle(style = ParagraphStyle()) {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.White,
                                        fontWeight = FontWeight(500),
                                        fontSize = 14.sp
                                    )
                                ) {
                                    append("3 cheeses\n")

                                }
                                withStyle(
                                    style = SpanStyle()
                                )
                                {
                                    append("  ")
                                }
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.White,
                                        fontWeight = FontWeight(400),
                                        fontSize = 12.sp,
                                        textDecoration = TextDecoration.LineThrough,
                                    )
                                )
                                {
                                    append("5 cheeses")
                                }
                            }

                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun AddToCartBarPreview() {
    TomAndJerryTheme {
        AddToCartBar()
    }
}