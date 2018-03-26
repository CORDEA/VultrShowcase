package jp.cordea.vultrshowcase.ui.regiondetail

import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides
import jp.cordea.vultrshowcase.di.ActivityScope

@Module
class RegionDetailAdapterModule {

    @Provides
    @ActivityScope
    fun provideFragmentManager(activity: RegionDetailActivity): FragmentManager =
            activity.supportFragmentManager
}
