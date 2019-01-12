package com.hamburger.myapplication

import dagger.Module
import dagger.Provides

@Module
class BarRepositoryModule {
    @Provides
    fun provideBarRepository(): BarRepository {
        return BarRepository()
    }
}