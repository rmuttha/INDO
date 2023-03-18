package com.example.indo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WallArt : AppCompatActivity() {

    private lateinit var webView6: WebView
    private lateinit var webView7: WebView
    private lateinit var webView8: WebView
    private lateinit var webView9: WebView
    private lateinit var webView10: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wall_art)
        webView6 = findViewById(R.id.webview6)
        webView6.settings.javaScriptEnabled = true
        webView6.settings.loadWithOverviewMode = true
        webView6.settings.useWideViewPort = true

        webView7 = findViewById(R.id.webView7)
        webView7.settings.javaScriptEnabled = true
        webView7.settings.loadWithOverviewMode = true
        webView7.settings.useWideViewPort = true

        webView8 = findViewById(R.id.webView8)
        webView8.settings.javaScriptEnabled = true
        webView8.settings.loadWithOverviewMode = true
        webView8.settings.useWideViewPort = true

        webView9 = findViewById(R.id.webView9)
        webView9.settings.javaScriptEnabled = true
        webView9.settings.loadWithOverviewMode = true
        webView9.settings.useWideViewPort = true

        webView10 = findViewById(R.id.webView10)
        webView10.settings.javaScriptEnabled = true
        webView10.settings.loadWithOverviewMode = true
        webView10.settings.useWideViewPort = true


        val videoId6 = "ui_KAvGi4N4"
        val videoUrl6 = "https://www.youtube.com/embed/$videoId6"
        webView6.loadUrl(videoUrl6)

        val videoId7= "n17RhXFA7Ww"
        val videoUrl7 = "https://www.youtube.com/embed/$videoId7"
        webView7.loadUrl(videoUrl7)

        val videoId8= "lJy8xAc4aJY"
        val videoUrl8 = "https://www.youtube.com/embed/$videoId8"
        webView8.loadUrl(videoUrl8)

        val videoId9= "qXhCCeBTKHM"
        val videoUrl9 = "https://www.youtube.com/embed/$videoId9"
        webView9.loadUrl(videoUrl9)

        val videoId10= "GqgiA_gLzQo"
        val videoUrl10 = "https://www.youtube.com/embed/$videoId10"
        webView10.loadUrl(videoUrl10)

    }
}