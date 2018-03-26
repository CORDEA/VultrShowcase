package jp.cordea.vultrshowcase.ui.region

import android.support.v4.app.Fragment
import jp.cordea.vultrshowcase.di.FragmentScope
import jp.cordea.vultrshowcase.ui.regiondetail.RegionDetailActivity
import javax.inject.Inject

@FragmentScope
class RegionNavigator @Inject constructor(
        private val fragment: Fragment
) {

    fun navigateToDetail(position: Int) {
        val context = fragment.context ?: return
        fragment.startActivity(
                RegionDetailActivity.createIntent(context, position)
        )
    }
}
