#include<jni.h>
#include<stdio.h>
#include "Child.h"

JNIEXPORT void JNICALL Java_Child_m2
  (JNIEnv *env, jobject thisObj){
	jclass thisClass = (*env)->GetObjectClass(env,thisObj);
	jmethodID cmidm1 = (*env)->GetMethodID(env,thisClass,"m1","()V");
	if(NULL == cmidm1) return;
	jclass  parentClass = (*env)->FindClass(env, "Parent");
	jmethodID pmidm1 = (*env)->GetMethodID(env,parentClass,"m1","()V");
	if(NULL == pmidm1) return;
	(*env)->CallNonvirtualVoidMethod(env,thisObj,thisClass, pmidm1);
	(*env)->CallVoidMethod(env,thisObj,cmidm1);
}
