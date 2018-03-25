package jp.cordea.vultrshowcase.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.di.ActivityScope

@Module
interface MainActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        MainFragmentsModule::class
    ])
    fun contributeMainActivity(): MainActivity
}
