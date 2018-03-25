package jp.cordea.vultrshowcase

import dagger.Binds
import dagger.Module

@Module
interface StoreModule {

    @Binds
    fun bindRegionStore(repository: RegionRepository): RegionStore
}
