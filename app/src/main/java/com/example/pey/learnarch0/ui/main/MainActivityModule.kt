package com.example.pey.learnarch0.ui.main

import dagger.Module
import dagger.Provides

/**
 * Created by pey on 06/07/17.
 */
@Module
class MainActivityModule {
    @Provides fun provideContext(mainActivity: MainActivity) = mainActivity
}