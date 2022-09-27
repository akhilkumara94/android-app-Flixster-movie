package com.akhil.flixster

import com.google.gson.annotations.SerializedName

/**
 * Model class mapping JSON to class
 */
class Movie {
    @JvmField
    @SerializedName("original_title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var summary: String? = null

    @JvmField
    @SerializedName("poster_path")
    var movieImageUrl:String? = null
}