package jp.cordea.vultrshowcase.login

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.vultrshowcase.ActivityScope

@Module
interface LoginActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        LoginNavigatorModule::class
    ])
    fun contributeLoginActivity(): LoginActivity
}
