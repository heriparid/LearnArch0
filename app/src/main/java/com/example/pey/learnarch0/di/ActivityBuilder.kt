package com.example.pey.learnarch0.di

import com.example.pey.learnarch0.ui.detail.DetailActivity
import com.example.pey.learnarch0.ui.detail.DetailActivityModule
import com.example.pey.learnarch0.ui.detail.DetailFragmentBuilder
import com.example.pey.learnarch0.ui.main.MainActivity
import com.example.pey.learnarch0.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by pey on 06/07/17.
 */
@Module
abstract class ActivityBuilder{

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = arrayOf(DetailActivityModule::class, DetailFragmentBuilder::class))
    abstract fun bindDetailActivity(): DetailActivity
}
