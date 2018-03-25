package jp.cordea.vultrshowcase.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.di.FragmentScope
import jp.cordea.vultrshowcase.ui.region.RegionFragment

@Module
interface MainFragmentsModule {

    @FragmentScope
    @ContributesAndroidInjector
    fun contributeRegionFragment(): RegionFragment
}
