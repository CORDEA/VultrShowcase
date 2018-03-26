package jp.cordea.vultrshowcase.ui.region

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.LiveDataReactiveStreams
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.processors.PublishProcessor
import io.reactivex.schedulers.Schedulers
import jp.cordea.vultrshowcase.api.response.Region
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegionRepository @Inject constructor(
        private val dataSource: RegionDataSource,
        private val localDataSource: RegionLocalDataSource
) : RegionStore {

    private val regions = PublishProcessor.create<List<Region>>()

    override fun regions(): LiveData<List<Region>> =
            LiveDataReactiveStreams.fromPublisher(regions)

    fun fetchRegion(forceFetch: Boolean): Completable =
            if (forceFetch) {
                dataSource.fetchRegion()
            } else {
                localDataSource.fetchRegion()
                        .switchIfEmpty(
                                dataSource.fetchRegion()
                                        .doOnSuccess { localDataSource.cacheRegion(it) }
                        )
            }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnSuccess { regions.onNext(it) }
                    .doOnError { regions.onError(it) }
                    .ignoreElement()
}
