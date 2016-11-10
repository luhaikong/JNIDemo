//
// Created by Administrator on 2016/11/10.
//

#include <com_example_lhk_jnidemo_jni_MathKit.h>

JNIEXPORT jint JNICALL Java_com_example_lhk_jnidemo_jni_MathKit_square
  (JNIEnv *env, jclass cls, jint num)
  {
        return num*num;
  }
