package kotlinguide.skeleton.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kotlinguide.skeleton.views.activities.MainActivity

/**
 * Created by aulate on 16/2/18.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector()
    abstract fun bindMainActivity(): MainActivity


}