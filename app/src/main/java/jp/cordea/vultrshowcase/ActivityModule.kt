package jp.cordea.vultrshowcase

import dagger.Module
import jp.cordea.vultrshowcase.login.LoginActivityModule

@Module(includes = [
    MainActivityModule::class,
    LoginActivityModule::class
])
class ActivityModule
