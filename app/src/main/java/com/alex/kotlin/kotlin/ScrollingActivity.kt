package com.alex.kotlin.kotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        fab.setOnClickListener {
            prepare()
            prepareThird()
        }

    }

    private fun prepare(){
        prepareFirst()
        prepareSecond()
        prepareThird()
    }

    private fun prepareFirst() {
        Thread.sleep(4000)
    }

    private fun prepareSecond() {
        Thread.sleep(4000)
    }

    private fun prepareThird() {
        Thread.sleep(10000)
    }

}
