package jp.cordea.vultrshowcase

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {

    @ContributesAndroidInjector(modules = [
        MainFragmentsModule::class
    ])
    fun contributeMainActivity(): MainActivity
}
