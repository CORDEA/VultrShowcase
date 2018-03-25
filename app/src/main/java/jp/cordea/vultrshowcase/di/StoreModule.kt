package jp.cordea.vultrshowcase.di

import dagger.Binds
import dagger.Module
import jp.cordea.vultrshowcase.ui.region.RegionRepository
import jp.cordea.vultrshowcase.ui.region.RegionStore

@Module
interface StoreModule {

    @Binds
    fun bindRegionStore(repository: RegionRepository): RegionStore
}
