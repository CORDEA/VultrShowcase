package jp.cordea.vultrshowcase.api

import io.reactivex.Maybe
import jp.cordea.vultrshowcase.api.response.Regions
import retrofit2.http.GET

interface VultrApi {

    @GET("v1/regions/list")
    fun getRegions(): Maybe<Regions>
}
