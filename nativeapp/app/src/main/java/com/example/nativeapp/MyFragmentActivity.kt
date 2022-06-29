package com.example.nativeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.flutter.embedding.android.FlutterFragment

class MyFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_fragment)
        val fragment = FlutterFragment
            .withCachedEngine("flutter_fragment_id")
            .build<FlutterFragment>()

        supportFragmentManager.beginTransaction()
            .add(R.id.layout_fragment, fragment).commit()
    }
}