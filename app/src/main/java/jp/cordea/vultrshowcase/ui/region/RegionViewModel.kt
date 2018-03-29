package jp.cordea.vultrshowcase.ui.region

import android.arch.lifecycle.LiveData
import jp.cordea.vultrshowcase.CompletableLiveData
import jp.cordea.vultrshowcase.di.FragmentScope
import javax.inject.Inject

@FragmentScope
class RegionViewModel @Inject constructor(
        private val repository: RegionRepository
) {

    fun fetchRegion(): LiveData<Unit> =
            CompletableLiveData.fromCompletable(repository.fetchRegion(false))
}
