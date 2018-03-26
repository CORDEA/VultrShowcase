package jp.cordea.vultrshowcase.ui.region

import io.reactivex.Completable
import jp.cordea.vultrshowcase.di.FragmentScope
import javax.inject.Inject

@FragmentScope
class RegionViewModel @Inject constructor(
        private val repository: RegionRepository
) {

    fun fetchRegion(): Completable =
            repository.fetchRegion(false)
}
