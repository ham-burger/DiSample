package com.hamburger.myapplication

import dagger.Module
import dagger.Provides

@Module
class FooViewModelModule {
    @Provides
    fun provideFooViewModel(barRepository: BarRepository): FooViewModel {
        return FooViewModel(barRepository)
    }
}