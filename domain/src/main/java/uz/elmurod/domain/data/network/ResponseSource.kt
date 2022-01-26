package uz.elmurod.domain.data.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseSource(
    @Json(name = "id")
    val id: String?=null,
    @Json(name = "name")
    val name: String? = null
)