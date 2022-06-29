package com.example.nativeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FlutterEngine(this).let {
            it.navigationChannel.setInitialRoute("flutter_activity")
            it.dartExecutor.executeDartEntrypoint(
                DartExecutor.DartEntrypoint.createDefault()
            )
            FlutterEngineCache.getInstance().put("flutter_activity_id",it)
        }

    }

    fun flutteractivity(view: View) {
        val flutterActivity=FlutterActivity.withCachedEngine("flutter_activity_id").build(this)
        startActivity(flutterActivity)
    }
    fun flutterfragment(view: View) {
        FlutterEngine(this).let {
            it.navigationChannel.setInitialRoute("/")
            it.dartExecutor.executeDartEntrypoint(
                DartExecutor.DartEntrypoint.createDefault()
            )
            FlutterEngineCache
                .getInstance()
                .put("flutter_fragment_id", it)
        }
        val intent = Intent()
        intent.setClass(this, MyFragmentActivity::class.java)
        startActivity(intent)

    }
    fun flutterview(view: View) {

    }
}