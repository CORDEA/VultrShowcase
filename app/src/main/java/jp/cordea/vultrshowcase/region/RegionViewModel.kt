package jp.cordea.vultrshowcase.region

import io.reactivex.Completable
import jp.cordea.vultrshowcase.FragmentScope
import javax.inject.Inject

@FragmentScope
class RegionViewModel @Inject constructor(
        private val repository: RegionRepository
) {

    fun fetchRegion(): Completable =
            repository.fetchRegion()
}
