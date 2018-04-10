package kotlinguide.skeleton.di.viewModels

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelsModule {

//    @Binds
//    @IntoMap
//    @ViewModelKey(AnnouncementListViewModel::class)
//    abstract fun bindAnnouncementViewModel(announcementListViewModel: AnnouncementListViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}