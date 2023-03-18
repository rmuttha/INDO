package com.example.indo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CanvasPainting : AppCompatActivity() {

    private lateinit var webView1: WebView
    private lateinit var webView2: WebView
    private lateinit var webView3: WebView
    private lateinit var webView4: WebView
    private lateinit var webView5: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canvas_painting)

        webView1 = findViewById(R.id.webview1)
        webView1.settings.javaScriptEnabled = true
        webView1.settings.loadWithOverviewMode = true
        webView1.settings.useWideViewPort = true

        webView2 = findViewById(R.id.webView2)
        webView2.settings.javaScriptEnabled = true
        webView2.settings.loadWithOverviewMode = true
        webView2.settings.useWideViewPort = true

        webView3 = findViewById(R.id.webView3)
        webView3.settings.javaScriptEnabled = true
        webView3.settings.loadWithOverviewMode = true
        webView3.settings.useWideViewPort = true

        webView4 = findViewById(R.id.webView4)
        webView4.settings.javaScriptEnabled = true
        webView4.settings.loadWithOverviewMode = true
        webView4.settings.useWideViewPort = true

        webView5 = findViewById(R.id.webView5)
        webView5.settings.javaScriptEnabled = true
        webView5.settings.loadWithOverviewMode = true
        webView5.settings.useWideViewPort = true


        val videoId1 = "Hf__HjlaaCo"
        val videoUrl1 = "https://www.youtube.com/embed/$videoId1"
        webView1.loadUrl(videoUrl1)

        val videoId2= "M5eynslZhKU"
        val videoUrl2 = "https://www.youtube.com/embed/$videoId2"
        webView2.loadUrl(videoUrl2)

        val videoId3= "76jpCIZTq2E"
        val videoUrl3 = "https://www.youtube.com/embed/$videoId3"
        webView3.loadUrl(videoUrl3)

        val videoId4= "B3uz9geGVPI"
        val videoUrl4 = "https://www.youtube.com/embed/$videoId4"
        webView4.loadUrl(videoUrl4)

        val videoId5= "aXGfeNaODfw"
        val videoUrl5 = "https://www.youtube.com/embed/$videoId5"
        webView5.loadUrl(videoUrl5)

    }
}


