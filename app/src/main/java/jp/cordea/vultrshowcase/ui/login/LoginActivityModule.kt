package jp.cordea.vultrshowcase.ui.login

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.di.ActivityScope

@Module
interface LoginActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        LoginNavigatorModule::class
    ])
    fun contributeLoginActivity(): LoginActivity
}
