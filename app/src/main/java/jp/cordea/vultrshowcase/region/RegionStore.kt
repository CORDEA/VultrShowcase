package jp.cordea.vultrshowcase.region

import android.arch.lifecycle.LiveData
import jp.cordea.vultrshowcase.api.response.Region

interface RegionStore {

    fun regions(): LiveData<List<Region>>
}
