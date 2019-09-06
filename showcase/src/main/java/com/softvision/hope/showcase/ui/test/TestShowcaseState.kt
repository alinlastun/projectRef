package com.softvision.hope.showcase.ui.test

import com.softvision.hope.base.mvi.State

data class TestShowcaseState(
    val someData: String = "",
    val btnLoginClick: Boolean = false
) : State