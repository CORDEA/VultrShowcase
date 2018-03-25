package jp.cordea.vultrshowcase.region

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.LiveDataReactiveStreams
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.processors.PublishProcessor
import io.reactivex.schedulers.Schedulers
import jp.cordea.vultrshowcase.api.VultrApiClient
import jp.cordea.vultrshowcase.api.response.Region
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegionRepository @Inject constructor(
        private val apiClient: VultrApiClient
) : RegionStore {

    private val regions = PublishProcessor.create<List<Region>>()

    override fun regions(): LiveData<List<Region>> =
            LiveDataReactiveStreams.fromPublisher(regions)

    fun fetchRegion(): Completable =
            apiClient.getRegions()
                    .map { it.values.toList() }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnSuccess { regions.onNext(it) }
                    .doOnError { regions.onError(it) }
                    .ignoreElement()
}
