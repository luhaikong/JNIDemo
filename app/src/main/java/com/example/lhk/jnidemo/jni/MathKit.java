package com.example.lhk.jnidemo.jni;

/**
 * Created by Administrator on 2016/11/10.
 */

public class MathKit {
    public static native int square(int num);

    static {
        System.loadLibrary("JniDemo");
    }

}
