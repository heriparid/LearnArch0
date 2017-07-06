package com.example.pey.learnarch0.ui.detail

import com.example.pey.learnarch0.ui.detail.fragment.DetailFragment
import com.example.pey.learnarch0.ui.detail.fragment.DetailFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by pey on 06/07/17.
 */
@Module
abstract class DetailFragmentBuilder {
    @ContributesAndroidInjector(modules = arrayOf(DetailFragmentModule::class))
    abstract fun bindDetailFragment(): DetailFragment
}