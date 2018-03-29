package jp.cordea.vultrshowcase.ui.regiondetail

import android.arch.lifecycle.LiveData
import jp.cordea.vultrshowcase.CompletableLiveData
import jp.cordea.vultrshowcase.di.ActivityScope
import jp.cordea.vultrshowcase.ui.region.RegionRepository
import javax.inject.Inject

@ActivityScope
class RegionDetailViewModel @Inject constructor(
        private val repository: RegionRepository
) {

    fun fetchRegion(): LiveData<Unit> =
            CompletableLiveData.fromCompletable(repository.fetchRegion(false))
}
