package jp.cordea.vultrshowcase.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.di.ActivityScope
import jp.cordea.vultrshowcase.ui.region.RegionFragmentModule

@Module
interface MainActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        RegionFragmentModule::class
    ])
    fun contributeMainActivity(): MainActivity
}
