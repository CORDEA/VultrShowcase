package jp.cordea.vultrshowcase

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.region.RegionFragment

@Module
interface MainFragmentsModule {

    @FragmentScope
    @ContributesAndroidInjector
    fun contributeRegionFragment(): RegionFragment
}
