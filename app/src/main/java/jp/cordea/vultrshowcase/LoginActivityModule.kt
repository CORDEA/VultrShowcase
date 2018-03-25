package jp.cordea.vultrshowcase

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface LoginActivityModule {

    @ContributesAndroidInjector(modules = [
        LoginNavigatorModule::class
    ])
    fun contributeLoginActivity(): LoginActivity
}
