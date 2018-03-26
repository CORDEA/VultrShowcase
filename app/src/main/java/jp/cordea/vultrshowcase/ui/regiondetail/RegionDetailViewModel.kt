package jp.cordea.vultrshowcase.ui.regiondetail

import io.reactivex.Completable
import jp.cordea.vultrshowcase.di.ActivityScope
import jp.cordea.vultrshowcase.ui.region.RegionRepository
import javax.inject.Inject

@ActivityScope
class RegionDetailViewModel @Inject constructor(
        private val repository: RegionRepository
) {

    fun fetchRegion(): Completable =
            repository.fetchRegion(false)
}
