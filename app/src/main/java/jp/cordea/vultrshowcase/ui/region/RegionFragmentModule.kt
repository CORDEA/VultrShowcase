package jp.cordea.vultrshowcase.ui.region

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.di.FragmentScope

@Module
interface RegionFragmentModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [
        RegionNavigatorModule::class
    ])
    fun contributeRegionFragment(): RegionFragment
}
