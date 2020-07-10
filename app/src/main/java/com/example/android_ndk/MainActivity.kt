package com.example.android_ndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("NDK-Example")
        // Example of a call to a native method




    }
    fun gonder(view: View){
        var sayi=sayiInput.text.toString().toInt();
        sonuc_text.text="Sonuc: ${hesapla(sayi)}"

    }

    external fun hesapla(sayi:Int): String

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }

    }
}
