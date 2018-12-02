package com.example.yrung.mydagger;

import dagger.Component;

/**
 * Author Eirunye
 * Created by on 2018/12/2.
 * Describe
 */
@Component(modules = MyDaggerModule.class)
public interface MyDaggerComponent {
    void inject(MainActivity mainActivity);
}
