package com.example.madpractical_6_20012021059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Youtube_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeid="fJn9B64Znrk"
        val mywebview=findViewById<WebView>(R.id.webvideo)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}