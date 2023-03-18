package com.example.indo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WasteToBest : AppCompatActivity() {

    private lateinit var webView26: WebView
    private lateinit var webView27: WebView
    private lateinit var webView28: WebView
    private lateinit var webView29: WebView
    private lateinit var webView30: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waste_to_best2)

        webView26 = findViewById(R.id.webview26)
        webView26.settings.javaScriptEnabled = true
        webView26.settings.loadWithOverviewMode = true
        webView26.settings.useWideViewPort = true

        webView27 = findViewById(R.id.webView27)
        webView27.settings.javaScriptEnabled = true
        webView27.settings.loadWithOverviewMode = true
        webView27.settings.useWideViewPort = true

        webView28 = findViewById(R.id.webView28)
        webView28.settings.javaScriptEnabled = true
        webView28.settings.loadWithOverviewMode = true
        webView28.settings.useWideViewPort = true

        webView29 = findViewById(R.id.webView29)
        webView29.settings.javaScriptEnabled = true
        webView29.settings.loadWithOverviewMode = true
        webView29.settings.useWideViewPort = true

        webView30 = findViewById(R.id.webView30)
        webView30.settings.javaScriptEnabled = true
        webView30.settings.loadWithOverviewMode = true
        webView30.settings.useWideViewPort = true

        val videoId26 = "-6vAK5JBpEY"
        val videoUrl26 = "https://www.youtube.com/embed/$videoId26"
        webView26.loadUrl(videoUrl26)

        val videoId27= "iEetc-6H7zk"
        val videoUrl27 = "https://www.youtube.com/embed/$videoId27"
        webView27.loadUrl(videoUrl27)

        val videoId28= "HJ57b84Eic4"
        val videoUrl28 = "https://www.youtube.com/embed/$videoId28"
        webView28.loadUrl(videoUrl28)

        val videoId29= "XrGifqGsSjs"
        val videoUrl29 = "https://www.youtube.com/embed/$videoId29"
        webView29.loadUrl(videoUrl29)

        val videoId30= "gHYmoKNuhvA"
        val videoUrl30 = "https://www.youtube.com/embed/$videoId30"
        webView30.loadUrl(videoUrl30)


    }
}