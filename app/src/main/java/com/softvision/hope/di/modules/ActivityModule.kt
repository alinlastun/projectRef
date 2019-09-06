package com.softvision.hope.di.modules

import com.softvision.hope.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Each activity that extends BaseActivity (and therefore is injectable) must be defined here.
 * Either set the FragmentModule as submodule or specify your own when a specific Dagger
 * subcomponent is needed.
 */
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    internal abstract fun contributesMainActivity(): MainActivity
}
