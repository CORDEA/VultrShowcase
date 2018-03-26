package jp.cordea.vultrshowcase.ui.region

import io.reactivex.Maybe
import jp.cordea.vultrshowcase.api.response.Region

interface RegionDataSource {

    fun fetchRegion(): Maybe<List<Region>>
}
