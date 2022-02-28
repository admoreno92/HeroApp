package com.example.heroapp.models

import com.google.gson.annotations.SerializedName

data class WorkModel(
    @SerializedName("base") val base: String,
    @SerializedName("occupation") val occupation: String
)
