package jp.cordea.vultrshowcase.di

import dagger.Binds
import dagger.Module
import jp.cordea.vultrshowcase.ui.region.RegionDataSource
import jp.cordea.vultrshowcase.ui.region.RegionRemoteDataSource

@Module
interface DataSourceModule {

    @Binds
    fun bindRegionDataSource(remoteDataSource: RegionRemoteDataSource): RegionDataSource
}
