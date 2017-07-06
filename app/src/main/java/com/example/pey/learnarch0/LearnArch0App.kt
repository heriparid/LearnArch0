package com.example.pey.learnarch0

import android.app.Activity
import android.app.Application
import com.example.pey.learnarch0.di.AppComponent
import com.example.pey.learnarch0.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by pey on 06/07/17.
 */
class LearnArch0App: Application(), HasActivityInjector {

    @Inject lateinit var dispathingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispathingAndroidInjector
    }

}