package com.example.heroapp.models

import com.google.gson.annotations.SerializedName

data class ConnectionsModel(
    @SerializedName("group-affiliation") val affiliation: String,
    @SerializedName("relatives") val relatives: String
)
