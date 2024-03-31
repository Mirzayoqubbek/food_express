package com.example.foodexpress.model

import java.io.Serializable

data class RestarantModel(
    val image: Int,
    val name: String,
    val lakatsa: String,
    val masofa: String
): Serializable