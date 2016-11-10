package com.example.lhk.jnidemo.jni;

/**
 * Created by Administrator on 2016/11/10.
 */

public class StringKit {
    public static native void setNull(String str);
    static {
        System.loadLibrary("JniDemo");
    }

}
