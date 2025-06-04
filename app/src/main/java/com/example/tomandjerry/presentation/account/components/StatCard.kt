package com.example.tomandjerry.presentation.account.components
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.presentation.account.TomState
import com.example.tomandjerry.ui.theme.TomAndJerryTheme
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun StateCard(state: TomState, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(state.backgroundColor, shape = RoundedCornerShape(12.dp))
            .padding(12.dp)
            .fillMaxWidth()
    ) {
        Box() {
            Icon(
                painterResource(state.icon),
                contentDescription = null,
                tint = Color.Unspecified,
            )
        }
//        IconWithArcBorder(
//            icon = state.icon,
//            tint = state.tint,
//            arcColor = state.tint
//        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = state.value,
                color = Color(0xAD121212),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = state.label,
                color = Color(0xAD121212),
                fontSize = 12.sp,
            )
        }
    }
}
@Composable
fun IconWithArcBorder(
    icon: Int,
    tint: Color,
    arcColor: Color,
    backgroundColor: Color = Color.White,
    arcSweepAngle: Float = 270f,
    arcStartAngle: Float = -90f,
    strokeWidth: Float = 2f,
    dotRadius: Float = 3f
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(40.dp)
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val arcRadius = size.minDimension / 2 - strokeWidth
            val center = Offset(size.width / 2, size.height / 2)

            drawArc(
                color = arcColor,
                startAngle = arcStartAngle,
                sweepAngle = arcSweepAngle,
                useCenter = false,
                style = Stroke(width = strokeWidth.dp.toPx())
            )

            val angleInRad = Math.toRadians((arcStartAngle + arcSweepAngle).toDouble())
            val dotX = center.x + arcRadius * cos(angleInRad).toFloat()
            val dotY = center.y + arcRadius * sin(angleInRad).toFloat()

            drawCircle(
                color = arcColor,
                radius = dotRadius.dp.toPx(),
                center = Offset(dotX, dotY)
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(32.dp)
                .background(backgroundColor, CircleShape)
        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = tint,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

//@Composable
//fun IconWithArcBorder(
//    icon: ImageVector,
//    tint: Color,
//    arcColor: Color,
//    backgroundColor: Color = Color.White,
//    arcSweepAngle: Float = 270f,
//    strokeWidth: Float = 2f
//) {
//    Box(
//        contentAlignment = Alignment.Center,
//        modifier = Modifier.size(40.dp)
//    ) {
//        Canvas(modifier = Modifier.matchParentSize()) {
//            drawArc(
//                color = arcColor,
//                startAngle = 0f,
//                sweepAngle = arcSweepAngle,
//                useCenter = false,
//                style = Stroke(width = strokeWidth.dp.toPx())
//            )
//        }
//
//        Box(
//            contentAlignment = Alignment.Center,
//            modifier = Modifier
//                .size(32.dp)
//                .background(backgroundColor, CircleShape)
//        ) {
//            Icon(
//                imageVector = icon,
//                contentDescription = null,
//                tint = tint,
//                modifier = Modifier.size(20.dp)
//            )
//        }
//    }
//}

@Preview
@Composable
private fun StateCardPreview() {
    TomAndJerryTheme {
       StateCard(
           TomState(
               R.drawable.evil_container,
               "No. of quarrels",
               "2M 12K",
               Color(0xFFD0E9F0),
               Color(0xFFD000F0)
           ),
       )
    }

}