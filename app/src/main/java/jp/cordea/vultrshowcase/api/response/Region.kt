package jp.cordea.vultrshowcase.api.response

import com.squareup.moshi.Json

data class Region(
        @Json(name = "DCID") val id: Int,
        val name: String,
        val country: String,
        val continent: String,
        val state: String,
        @Json(name = "ddos_protection") val ddosProtection: Boolean,
        @Json(name = "block_storage") val blockStorage: Boolean,
        @Json(name = "regioncode") val regionCode: String
)
