package com.example.tomandjerry.presentation.store

import com.example.tomandjerry.R

data class TomItem(
    val title: String,
    val description: String,
    val cheeseCount: Int,
    val imageRes: Int
)
val sampleTomList = listOf(
    TomItem("Sport Tom", "He runs 1 meter.. trips over his boot.", 3, R.drawable.sport_tom),
    TomItem(
        "Tom the lover",
        "He loves one-sidedly and is beaten by the other side.",
        5,
        R.drawable.tom_the_lover
    ),
    TomItem(
        "Tom the bomb",
        "He blows himself up before Jerry can catch him.",
        10,
        R.drawable.tom_the_bomb
    ),
    TomItem(
        "Spy Tom",
        "Disguises itself as a table.",
        10,
        R.drawable.spy_tom
    ),
    TomItem(
        "Frozen Tom",
        "He was chasing Jerry, he froze after the first look",
        10,
        R.drawable.frozen_tom
    ),
    TomItem(
        "Sleeping Tom",
        "He doesn't chase anyone, he just snores in stereo",
        10,
        R.drawable.sleeping_tom
    ),
    TomItem(
        "Tom the bomb",
        "He blows himself up before Jerry can catch him.",
        10,
        R.drawable.tom_the_bomb
    ),
    TomItem("Spy Tom", "Disguises itself as a table.", 12, R.drawable.spy_tom)

)
