package kotlinguide.skeleton.di

import android.app.Application
import com.effeta.miparroquiaandroid.di.FragmentBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import kotlinguide.skeleton.CustomApplication
import kotlinguide.skeleton.di.viewModels.ViewModelsModule
import javax.inject.Singleton

/**
 * Created by aulate on 16/2/18.
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ViewModelsModule::class,
    RoomModule::class,
    ActivityBuilder::class,
    FragmentBuilder::class
])
interface AppComponent : AndroidInjector<DaggerApplication> {
    fun inject(app: CustomApplication)

    override fun inject(instance: DaggerApplication?)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}