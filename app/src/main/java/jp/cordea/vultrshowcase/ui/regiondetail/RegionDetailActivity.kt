package jp.cordea.vultrshowcase.ui.regiondetail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import jp.cordea.vultrshowcase.R
import kotlinx.android.synthetic.main.activity_region_detail.*

class RegionDetailActivity : AppCompatActivity() {

    companion object {

        private const val POSITION_KEY = "position"

        fun createIntent(context: Context, position: Int): Intent =
                Intent(context, RegionDetailActivity::class.java).apply {
                    putExtra(POSITION_KEY, position)
                }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_region_detail)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
