package com.example.ela2.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Example(
    val id: String,
    val title: String,
    @StringRes val codeResId: Int,
    @DrawableRes val imageResId: Int,
    val videoUrl: String,
    val category: String
)
