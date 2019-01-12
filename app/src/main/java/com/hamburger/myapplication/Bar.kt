package com.hamburger.myapplication

class Bar(private val foo: Foo) {
    fun bar() = "${foo.foo()}bar"
}