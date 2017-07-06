package com.example.pey.learnarch0.ui.detail

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by pey on 06/07/17.
 */
@Module
class DetailActivityModule{
    @Provides fun provideContext(detailActivity: DetailActivity) = detailActivity

//    @Provides @Named("nameId") fun provideSimpleString() = "Heri Parid"
}