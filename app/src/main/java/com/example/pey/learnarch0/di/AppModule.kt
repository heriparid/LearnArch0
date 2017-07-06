package com.example.pey.learnarch0.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by pey on 06/07/17.
 */
@Module
class AppModule {
    @Provides @Singleton fun provideContext(application: Application) = application
}