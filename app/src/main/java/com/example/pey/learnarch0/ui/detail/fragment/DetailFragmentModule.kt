package com.example.pey.learnarch0.ui.detail.fragment

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by pey on 06/07/17.
 */
@Module
class DetailFragmentModule{

    @Provides
    @Named("AKU")
    fun provideSomething(): String {
        return "something"
    }

}