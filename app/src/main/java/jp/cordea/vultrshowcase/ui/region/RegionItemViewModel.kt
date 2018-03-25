package jp.cordea.vultrshowcase.ui.region

import jp.cordea.vultrshowcase.api.response.Region

data class RegionItemViewModel(
        val title: String,
        val description: String
) {

    companion object {

        fun from(region: Region) =
                RegionItemViewModel(region.name, region.continent)
    }
}
