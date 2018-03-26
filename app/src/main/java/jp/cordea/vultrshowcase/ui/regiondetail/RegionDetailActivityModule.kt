package jp.cordea.vultrshowcase.ui.regiondetail

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.di.ActivityScope

@Module
interface RegionDetailActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        RegionDetailAdapterModule::class,
        RegionDetailBindModule::class
    ])
    fun contributeRegionDetailActivity(): RegionDetailActivity
}
