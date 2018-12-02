package com.example.yrung.mydagger;

import javax.inject.Inject;

/**
 * Author Eirunye
 * Created by on 2018/12/2.
 * Describe
 */
public class MyFactory {

    User user;

    @Inject
    public MyFactory(User user) {
        this.user = user;
    }
}
