package com.hamburger.myapplication

import dagger.Component

@Component(modules = [FooViewModelModule::class, BarRepositoryModule::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}