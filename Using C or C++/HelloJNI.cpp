#include <jni.h>       // JNI header provided by JDK
#include <iostream>    // C++ standard IO header
#include "HelloJNI.h"  // Generated
using namespace std;

JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject thisObj) {
	cout << "Hello World from C++!" << endl;
   return;
}
