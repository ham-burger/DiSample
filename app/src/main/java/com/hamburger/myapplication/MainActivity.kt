package com.hamburger.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var foo: Foo
    private val component = DaggerMainActivityComponent.builder()
        .fooModule(FooModule())
        .build()
//    private val component = DaggerMainActivityComponent.builder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.component.inject(this)

        Log.d("test", Bar(this.foo).bar())
    }
}
