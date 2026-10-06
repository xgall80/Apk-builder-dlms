package com.example.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        view.text = "Hello World! APK Berhasil Dibuat."
        view.textSize = 22f
        view.setPadding(40, 80, 40, 40)
        setContentView(view)
    }
}
