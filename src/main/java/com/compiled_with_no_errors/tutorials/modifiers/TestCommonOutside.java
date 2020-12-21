package com.compiled_with_no_errors.tutorials.modifiers;

import com.compiled_with_no_errors.tutorials.modifiers.access_modifiers.Common;

public class TestCommonOutside {

    public static void main(String[] args) {
        Common testCommon = new Common();

        System.out.println("testCommon.name = " + testCommon.name);
        testCommon.printMyName();

        //SecureClass cannot be accessible outside of the package.
    }
}
