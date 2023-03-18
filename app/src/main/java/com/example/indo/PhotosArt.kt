package com.example.indo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PhotosArt : AppCompatActivity() {

    private lateinit var webView21: WebView
    private lateinit var webView22: WebView
    private lateinit var webView23: WebView
    private lateinit var webView24: WebView
    private lateinit var webView25: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photos_art)

        webView21 = findViewById(R.id.webview21)
        webView21.settings.javaScriptEnabled = true
        webView21.settings.loadWithOverviewMode = true
        webView21.settings.useWideViewPort = true

        webView22 = findViewById(R.id.webView22)
        webView22.settings.javaScriptEnabled = true
        webView22.settings.loadWithOverviewMode = true
        webView22.settings.useWideViewPort = true

        webView23 = findViewById(R.id.webView23)
        webView23.settings.javaScriptEnabled = true
        webView23.settings.loadWithOverviewMode = true
        webView23.settings.useWideViewPort = true

        webView24 = findViewById(R.id.webView24)
        webView24.settings.javaScriptEnabled = true
        webView24.settings.loadWithOverviewMode = true
        webView24.settings.useWideViewPort = true

        webView25 = findViewById(R.id.webView25)
        webView25.settings.javaScriptEnabled = true
        webView25.settings.loadWithOverviewMode = true
        webView25.settings.useWideViewPort = true

        val videoId21 = "ui_KAvGi4N4"
        val videoUrl21 = "https://www.youtube.com/embed/$videoId21"
        webView21.loadUrl(videoUrl21)

        val videoId22= "n17RhXFA7Ww"
        val videoUrl22 = "https://www.youtube.com/embed/$videoId22"
        webView22.loadUrl(videoUrl22)

        val videoId23= "lJy8xAc4aJY"
        val videoUrl23 = "https://www.youtube.com/embed/$videoId23"
        webView23.loadUrl(videoUrl23)

        val videoId24= "qXhCCeBTKHM"
        val videoUrl24 = "https://www.youtube.com/embed/$videoId24"
        webView24.loadUrl(videoUrl24)

        val videoId25= "GqgiA_gLzQo"
        val videoUrl25 = "https://www.youtube.com/embed/$videoId25"
        webView25.loadUrl(videoUrl25)


    }
}