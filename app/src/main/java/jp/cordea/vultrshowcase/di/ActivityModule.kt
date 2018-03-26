package jp.cordea.vultrshowcase.di

import dagger.Module
import jp.cordea.vultrshowcase.ui.login.LoginActivityModule
import jp.cordea.vultrshowcase.ui.main.MainActivityModule
import jp.cordea.vultrshowcase.ui.regiondetail.RegionDetailActivityModule

@Module(includes = [
    MainActivityModule::class,
    LoginActivityModule::class,
    RegionDetailActivityModule::class
])
class ActivityModule
