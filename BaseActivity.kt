package com.example.zoneker.mydemo

import android.app.Activity
import android.os.Bundle

/**
 * Created by Zoneker on 2017/6/5.
 */
abstract class BaseActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    abstract fun init()
}