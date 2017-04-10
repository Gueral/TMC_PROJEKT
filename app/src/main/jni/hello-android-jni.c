#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_kaczor_tmc_1shpreader_MainActivity_getMsgFromJni(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "Halo, ile kurwa mozna");
}