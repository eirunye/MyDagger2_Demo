package com.example.yrung.mydagger;

import dagger.Module;
import dagger.Provides;

/**
 * Author Eirunye
 * Created by on 2018/12/2.
 * Describe
 */
@Module
public class MyDaggerModule {

    @Provides
    User1 myDaggerModule() {
        return new User1();
    }
}
