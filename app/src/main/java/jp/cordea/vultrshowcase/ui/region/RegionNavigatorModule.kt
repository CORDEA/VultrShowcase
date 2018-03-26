package jp.cordea.vultrshowcase.ui.region

import android.support.v4.app.Fragment
import dagger.Binds
import dagger.Module

@Module
interface RegionNavigatorModule {

    @Binds
    fun bindFragment(fragment: RegionFragment): Fragment
}
