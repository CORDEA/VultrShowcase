package jp.cordea.vultrshowcase.ui.region

import io.reactivex.Maybe
import jp.cordea.vultrshowcase.api.VultrApiClient
import jp.cordea.vultrshowcase.api.response.Region
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegionRemoteDataSource @Inject constructor(
        private val apiClient: VultrApiClient
) : RegionDataSource {

    override fun fetchRegion(): Maybe<List<Region>> =
            apiClient.getRegions()
                    .map { it.values.toList() }
}
