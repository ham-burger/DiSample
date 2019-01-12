package com.hamburger.myapplication

class BarViewModel(private val fooViewModel: FooViewModel) {
    fun bar() = "${fooViewModel.foo()}bar"
}