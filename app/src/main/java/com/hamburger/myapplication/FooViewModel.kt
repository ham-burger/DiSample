package com.hamburger.myapplication

import javax.inject.Inject

class FooViewModel @Inject constructor(private val barRepository: BarRepository) {
    fun foo() = "fooViewModel : ${this.barRepository.bar()}"
}