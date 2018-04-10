package kotlinguide.skeleton

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import kotlinguide.skeleton.di.DaggerAppComponent

/**
 * Created by aulate on 16/2/18.
 */
class CustomApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}