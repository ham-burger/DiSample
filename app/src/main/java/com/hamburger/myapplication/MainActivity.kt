package com.hamburger.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var fooViewModel: FooViewModel
    private val component = DaggerMainActivityComponent.builder()
        .fooModule(FooModule())
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.component.inject(this)

        Log.d("test", BarViewModel(this.fooViewModel).bar())
    }
}
