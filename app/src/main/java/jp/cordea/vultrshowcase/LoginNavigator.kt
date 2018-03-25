package jp.cordea.vultrshowcase

import android.app.Activity
import android.content.Intent
import javax.inject.Inject

class LoginNavigator @Inject constructor(
        private val activity: Activity
) {

    fun navigateToMain() {
        activity.startActivity(Intent(activity, MainActivity::class.java))
    }
}
