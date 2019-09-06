package com.softvision.hope.design.extensions

import android.content.Context

fun Context.dipsToPixels(dips: Int): Int {
    val scale = resources.displayMetrics.density
    return (dips*scale + 0.5f).toInt()
}
