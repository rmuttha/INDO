package com.example.indo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WallHanging : AppCompatActivity() {

    private lateinit var webView11: WebView
    private lateinit var webView12: WebView
    private lateinit var webView13: WebView
    private lateinit var webView14: WebView
    private lateinit var webView15: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wall_hanging)

        webView11 = findViewById(R.id.webview11)
        webView11.settings.javaScriptEnabled = true
        webView11.settings.loadWithOverviewMode = true
        webView11.settings.useWideViewPort = true

        webView12 = findViewById(R.id.webView12)
        webView12.settings.javaScriptEnabled = true
        webView12.settings.loadWithOverviewMode = true
        webView12.settings.useWideViewPort = true

        webView13 = findViewById(R.id.webView13)
        webView13.settings.javaScriptEnabled = true
        webView13.settings.loadWithOverviewMode = true
        webView13.settings.useWideViewPort = true

        webView14 = findViewById(R.id.webView14)
        webView14.settings.javaScriptEnabled = true
        webView14.settings.loadWithOverviewMode = true
        webView14.settings.useWideViewPort = true

        webView15 = findViewById(R.id.webView15)
        webView15.settings.javaScriptEnabled = true
        webView15.settings.loadWithOverviewMode = true
        webView15.settings.useWideViewPort = true

        val videoId11 = "NVCMFSf9yqw"
        val videoUrl11 = "https://www.youtube.com/embed/$videoId11"
        webView11.loadUrl(videoUrl11)

        val videoId12= "qKMZSoQKBrA"
        val videoUrl12 = "https://www.youtube.com/embed/$videoId12"
        webView12.loadUrl(videoUrl12)

        val videoId13= "dNUW5Y4CZPI"
        val videoUrl13 = "https://www.youtube.com/embed/$videoId13"
        webView13.loadUrl(videoUrl13)

        val videoId14= "lMKvNDLmhsI"
        val videoUrl14 = "https://www.youtube.com/embed/$videoId14"
        webView14.loadUrl(videoUrl14)

        val videoId15= "4Vf3u72EU1I"
        val videoUrl15 = "https://www.youtube.com/embed/$videoId15"
        webView15.loadUrl(videoUrl15)

    }
}