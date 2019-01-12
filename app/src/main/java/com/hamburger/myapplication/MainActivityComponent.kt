package com.hamburger.myapplication

import dagger.Component

@Component(modules = [FooModule::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}