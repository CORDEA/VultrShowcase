package jp.cordea.vultrshowcase

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface LoginActivityModule {

    @ContributesAndroidInjector
    fun contributeLoginActivity(): LoginActivity
}
