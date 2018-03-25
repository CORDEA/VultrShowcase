package jp.cordea.vultrshowcase

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainFragmentsModule {

    @ContributesAndroidInjector
    fun contributeRegionFragment(): RegionFragment
}
