package com.softvision.hope.ui.main

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.softvision.hope.R
import com.softvision.hope.base.ui.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.myNavHostFragment)
        setupActionBarWithNavController(navController)
    }
}