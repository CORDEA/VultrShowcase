package jp.cordea.vultrshowcase.api

import io.reactivex.Maybe
import jp.cordea.vultrshowcase.KeyManager
import jp.cordea.vultrshowcase.api.response.Regions
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VultrApiClient @Inject constructor(
        private val manager: KeyManager,
        private val retrofitBuilder: Retrofit.Builder
) : VultrApi {

    private val service: Maybe<VultrApi>
        get() {
            val key = manager.get() ?: return Maybe.empty()
            val builder = OkHttpClient.Builder()
                    .addInterceptor {
                        it.proceed(it.request()
                                .newBuilder()
                                .addHeader("API-Key", key)
                                .build())
                    }

            return Maybe.just(retrofitBuilder
                    .client(builder.build())
                    .build()
                    .create(VultrApi::class.java))
        }

    override fun getRegions(): Maybe<Regions> =
            service.flatMap { it.getRegions() }
}
