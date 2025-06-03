package com.example.tomandjerry.presentation.account

data class TomAccountData(
    val name: String,
    val status: String,
    val quarrels: String,
    val chaseTime: String,
    val huntingTimes: String,
    val heartbreaks: String,
    val favoriteFoods: List<String>
)
