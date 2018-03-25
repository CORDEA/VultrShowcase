package jp.cordea.vultrshowcase.ui.login

import android.view.View
import jp.cordea.vultrshowcase.di.ActivityScope
import jp.cordea.vultrshowcase.KeyManager
import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(
        private val keyManager: KeyManager,
        private val navigator: LoginNavigator
) {
    var apiKey: String = ""

    val onClick = View.OnClickListener {
        if (apiKey.isEmpty()) {
            return@OnClickListener
        }
        keyManager.set(apiKey)
        navigator.navigateToMain()
    }
}
