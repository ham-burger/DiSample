package com.hamburger.myapplication

import dagger.Module
import dagger.Provides

@Module
class FooModule {
    @Provides
    fun provideFooViewModel(): FooViewModel {
        return FooViewModel()
    }
}