package jp.cordea.vultrshowcase

import dagger.Module

@Module(includes = [
    MainActivityModule::class,
    LoginActivityModule::class
])
class ActivityModule
