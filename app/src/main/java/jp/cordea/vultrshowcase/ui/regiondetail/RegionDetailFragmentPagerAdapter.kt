package jp.cordea.vultrshowcase.ui.regiondetail

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import jp.cordea.vultrshowcase.api.response.Region
import jp.cordea.vultrshowcase.di.ActivityScope
import jp.cordea.vultrshowcase.ui.region.RegionStore
import javax.inject.Inject

@ActivityScope
class RegionDetailFragmentPagerAdapter @Inject constructor(
        store: RegionStore,
        lifecycleOwner: LifecycleOwner,
        fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    init {
        store.regions()
                .observe(lifecycleOwner, Observer {
                    it ?: return@Observer
                    items = it
                    notifyDataSetChanged()
                })
    }

    private var items: List<Region> = emptyList()

    override fun getItem(position: Int): Fragment =
            RegionDetailFragment.newInstance(items[position])

    override fun getCount(): Int =
            items.size
}
