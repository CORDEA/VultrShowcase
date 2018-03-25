package jp.cordea.vultrshowcase

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module(includes = [
    ViewModelModule::class
])
class AppModule {

    @Provides
    fun provideContext(application: Application): Context =
            application.applicationContext

    @Provides
    fun provideRetrofitBuilder(): Retrofit.Builder =
            Retrofit.Builder()
                    .baseUrl(BuildConfig.API_BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
}
