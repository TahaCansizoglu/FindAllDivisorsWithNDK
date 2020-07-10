#include <jni.h>
#include <string>

using namespace std;

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_android_1ndk_MainActivity_hesapla(JNIEnv *env,jobject, jint sayi){
    string dizi;
    for (int i=1; i<=sayi; i++)
    {
        if(sayi%i==0)
        {
            if(i!=sayi)
            {
                dizi=dizi+to_string(i)+", ";

            } else{
                dizi=dizi+to_string(i);
            }
        }
    }
    return env->NewStringUTF(dizi.c_str());
}
