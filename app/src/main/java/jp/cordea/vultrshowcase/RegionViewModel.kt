package jp.cordea.vultrshowcase

import io.reactivex.Completable
import javax.inject.Inject

@FragmentScope
class RegionViewModel @Inject constructor(
        private val repository: RegionRepository
) {

    fun fetchRegion(): Completable =
            repository.fetchRegion()
}
