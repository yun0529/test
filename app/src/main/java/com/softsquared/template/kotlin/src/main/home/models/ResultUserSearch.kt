package com.softsquared.template.kotlin.src.main.home.models

import com.google.gson.annotations.SerializedName

data class ResultUserSearch (
    @SerializedName("userId") val userId: Int,
    @SerializedName("email") val email: String
)