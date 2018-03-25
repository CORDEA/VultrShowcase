package jp.cordea.vultrshowcase

import android.view.View
import javax.inject.Inject

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
