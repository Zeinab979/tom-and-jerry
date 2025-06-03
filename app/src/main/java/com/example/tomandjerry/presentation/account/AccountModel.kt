package com.example.tomandjerry.presentation.account

import androidx.compose.ui.graphics.Color
import com.example.tomandjerry.R

data class TomState(val icon: Int, val label: String, val value: String, val backgroundColor: Color, val tint:Color)
//data class TomState(val icon: Int, val label: String, val value: String, val backgroundColor: Color)

data class TomSetting(val icon: Int, val label: String)

data class TomFood(val icon: Int, val label: String)

val stats = listOf(
    TomState(R.drawable.evil_container, "No. of quarrels", "2M 12K", Color(0xFFD0E5F0),Color(0xFF03578A)),
    TomState(R.drawable.stat_icon_container, "Chase time", "+500 h", Color(0xFFDEEECD),Color(0xFF57AB0F)),
    TomState(R.drawable.sad_icon_container, "Hunting times", "2M 12K", Color(0xFFF2D9E7),Color(0xFFF46983)),
    TomState(R.drawable.heart_icon_container, "Heartbroken", "3M 7K", Color(0xFFFAEDCF),Color(0xFFFFBF1A))
)

//val stats = listOf(
//    TomState(R.drawable.evil_container, "No. of quarrels", "2M 12K", Color(0xFFD0E5F0),),
//    TomState(R.drawable.stat_icon_container, "Chase time", "+500 h", Color(0xFFDEEECD)),
//    TomState(R.drawable.sad_icon_container, "Hunting times", "2M 12K", Color(0xFFF2D9E7)),
//    TomState(R.drawable.heart_icon_container, "Heartbroken", "3M 7K", Color(0xFFFAEDCF))
//)
val settings = listOf(
    TomSetting(R.drawable.bed, "Change sleeping place"),
    TomSetting(R.drawable.meow, "Meow settings"),
    TomSetting(R.drawable.fridge, "Password to open the fridge")
)

val foods = listOf(
    TomFood(R.drawable.alert_01, "Mouses"),
    TomFood(R.drawable.hamburger_02, "Last stolen meal"),
    TomFood(R.drawable.sleep, "Change sleep mood")
)
