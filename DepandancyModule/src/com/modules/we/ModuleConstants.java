package com.modules.we;

public class ModuleConstants {

    public static int theModuleConstantCounter = 12;

    public static int getTheModuleConstantCounter() {
        return theModuleConstantCounter;
    }

    public static void setTheModuleConstantCounter() {
         theModuleConstantCounter = theModuleConstantCounter++;
    }

    public static void main(String[] args) {

        System.out.println("Test Something " + theModuleConstantCounter);
    }


}
