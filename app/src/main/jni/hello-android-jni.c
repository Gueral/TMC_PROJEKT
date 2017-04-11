#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_kaczor_tmc_1shpreader_Shape_ShapeFragment_getMsgFromJni(JNIEnv *env,
                                                                         jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "HALO OD JNI");
}