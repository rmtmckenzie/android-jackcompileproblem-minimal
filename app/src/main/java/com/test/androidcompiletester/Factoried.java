package com.test.androidcompiletester;

import com.google.auto.factory.AutoFactory;

@AutoFactory
public class Factoried {

    private final int num;

    public Factoried(
            int num
    ) {
        this.num = num;
    }

}
