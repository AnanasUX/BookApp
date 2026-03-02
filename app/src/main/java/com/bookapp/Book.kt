package com.bookapp

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val rating: Float,
    val genre: String,
    val coverColor: Int,
    val hasAudio: Boolean = true,
    val hasEbook: Boolean = true,
    val description: String = ""
)

data class Genre(
    val name: String,
    val emoji: String,
    val colorRes: Int
)
