package com.module.test.we;

import com.modules.util.we.DemoCounter;
import com.modules.we.ModuleConstants;

public class TestUtilModule implements DemoCounter {

    static int counter =0;

    public static void main(String[] args) {

        new TestUtilModule().count();
        System.out.println("Hey Look at depandancies , not Just Counter "+counter);

    }

    @Override
    public void count() {

        counter = ModuleConstants.getTheModuleConstantCounter();

    }
}
