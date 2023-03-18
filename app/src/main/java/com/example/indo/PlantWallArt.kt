package com.example.indo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PlantWallArt : AppCompatActivity() {

    private lateinit var webView16: WebView
    private lateinit var webView17: WebView
    private lateinit var webView18: WebView
    private lateinit var webView19: WebView
    private lateinit var webView20: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_wall_art)

        webView16 = findViewById(R.id.webview16)
        webView16.settings.javaScriptEnabled = true
        webView16.settings.loadWithOverviewMode = true
        webView16.settings.useWideViewPort = true

        webView17 = findViewById(R.id.webView17)
        webView17.settings.javaScriptEnabled = true
        webView17.settings.loadWithOverviewMode = true
        webView17.settings.useWideViewPort = true

        webView18 = findViewById(R.id.webView18)
        webView18.settings.javaScriptEnabled = true
        webView18.settings.loadWithOverviewMode = true
        webView18.settings.useWideViewPort = true

        webView19 = findViewById(R.id.webView19)
        webView19.settings.javaScriptEnabled = true
        webView19.settings.loadWithOverviewMode = true
        webView19.settings.useWideViewPort = true

        webView20 = findViewById(R.id.webView20)
        webView20.settings.javaScriptEnabled = true
        webView20.settings.loadWithOverviewMode = true
        webView20.settings.useWideViewPort = true

        val videoId16 = "aJlN8UlXWF4"
        val videoUrl16 = "https://www.youtube.com/embed/$videoId16"
        webView16.loadUrl(videoUrl16)

        val videoId17= "IVDbRF-pojE"
        val videoUrl17 = "https://www.youtube.com/embed/$videoId17"
        webView17.loadUrl(videoUrl17)

        val videoId18= "A9F0d1v9-7s"
        val videoUrl18 = "https://www.youtube.com/embed/$videoId18"
        webView18.loadUrl(videoUrl18)

        val videoId19= "uq99p3o582g"
        val videoUrl19 = "https://www.youtube.com/embed/$videoId19"
        webView19.loadUrl(videoUrl19)

        val videoId20= "gpwTYSbeLNE"
        val videoUrl20 = "https://www.youtube.com/embed/$videoId20"
        webView20.loadUrl(videoUrl20)

    }
}