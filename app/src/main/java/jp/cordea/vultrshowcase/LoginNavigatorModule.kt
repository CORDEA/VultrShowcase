package jp.cordea.vultrshowcase

import android.app.Activity
import dagger.Binds
import dagger.Module

@Module
interface LoginNavigatorModule {

    @Binds
    fun bindActivity(activity: LoginActivity): Activity
}
