package com.softvision.hope.showcase.ui.main

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.softvision.hope.base.ui.BaseActivity
import com.softvision.hope.showcase.R

class MainShowcaseActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showcase_main)

        val navController = findNavController(R.id.myNavHostFragment)
        setupActionBarWithNavController(navController)
    }
}
