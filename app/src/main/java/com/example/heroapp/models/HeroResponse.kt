package com.example.heroapp.models

import com.google.gson.annotations.SerializedName

data class HeroResponse(
    @SerializedName("response") val response: String,
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("powerstats") val powerstats: PowerstatsModel,
    @SerializedName("biography") val biography: BiographyModel,
    @SerializedName("appearance") val appearance: AppearanceModel,
    @SerializedName("work") val work: WorkModel,
    @SerializedName("connections") val connections: ConnectionsModel,
    @SerializedName("image") val image: ImageModel
)
