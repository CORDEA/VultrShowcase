package jp.cordea.vultrshowcase.di

import dagger.Module
import jp.cordea.vultrshowcase.ui.login.LoginActivityModule
import jp.cordea.vultrshowcase.ui.main.MainActivityModule

@Module(includes = [
    MainActivityModule::class,
    LoginActivityModule::class
])
class ActivityModule
