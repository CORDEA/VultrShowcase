package jp.cordea.vultrshowcase

import dagger.Binds
import dagger.Module
import jp.cordea.vultrshowcase.region.RegionRepository
import jp.cordea.vultrshowcase.region.RegionStore

@Module
interface StoreModule {

    @Binds
    fun bindRegionStore(repository: RegionRepository): RegionStore
}
