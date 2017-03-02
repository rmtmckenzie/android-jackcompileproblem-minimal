package com.test.androidcompiletester;

import dagger.Component;

@Component(modules = {TheModule.class})
public interface TheComponent {

    void inject(MainActivity activity);

}
