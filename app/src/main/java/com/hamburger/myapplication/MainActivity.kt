package com.hamburger.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var fooViewModel: FooViewModel
    @Inject
    lateinit var barRepository: BarRepository
    private val component = DaggerMainActivityComponent.builder()
        .fooViewModelModule(FooViewModelModule())
        .barRepositoryModule(BarRepositoryModule())
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.component.inject(this)
        // viewModelのインスタンスを取得できる
        Log.d("test1", this.fooViewModel.foo())
        // repositoryのインスタンスも取得できる(本来はrepositoryに直接アクセスすべきじゃない)
        Log.d("test2", this.barRepository.bar())
    }
}
