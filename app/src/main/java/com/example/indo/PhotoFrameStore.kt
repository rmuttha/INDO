package com.example.indo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.HttpsURLConnection
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

class PhotoFrameStore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_frame_store)

        val F1Button = findViewById<ImageButton>(R.id.F1)
        F1Button.setImageResource(R.drawable.f1)
        val F2Button = findViewById<ImageButton>(R.id.F2)
        F2Button.setImageResource(R.drawable.f2)
        val F3Button = findViewById<ImageButton>(R.id.F3)
        F3Button.setImageResource(R.drawable.f3)
        val F4Button = findViewById<ImageButton>(R.id.F4)
        F4Button.setImageResource(R.drawable.f4)
        val F5Button = findViewById<ImageButton>(R.id.F5)
        F5Button.setImageResource(R.drawable.f5)
        val F6Button = findViewById<ImageButton>(R.id.F6)
        F6Button.setImageResource(R.drawable.f6)
        val F7Button = findViewById<ImageButton>(R.id.F7)
        F7Button.setImageResource(R.drawable.f7)
        val F8Button = findViewById<ImageButton>(R.id.F8)
        F8Button.setImageResource(R.drawable.f8)

        // Trust all SSL certificates
        val trustAllCerts = arrayOf<TrustManager>(object : X509TrustManager {
            override fun getAcceptedIssuers(): Array<X509Certificate>? = null
            override fun checkClientTrusted(chain: Array<X509Certificate>, authType: String) = Unit
            override fun checkServerTrusted(chain: Array<X509Certificate>, authType: String) = Unit
        })

        // Create a SSL context that trusts all certificates
        val sslContext = SSLContext.getInstance("SSL").apply {
            init(null, trustAllCerts, SecureRandom())
        }

        // Set the SSL socket factory on the HttpsURLConnection
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.socketFactory)

        // Set an OnClickListener to launch the website
        F1Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/Gallery-Perfect-Decorative-Hanging-Template/dp/B00KY08L52/ref=sr_1_7?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-7&ufe=app_do%3Aamzn1.fos.006c50ae-5d4c-4777-9bc0-4513d670b6bc"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        F2Button.setOnClickListener {
            val websiteUrl =
                "https://www.amazon.com/SESEAT-Hanging-Picture-Collage-Distressed/dp/B08FM2V9T9/ref=sr_1_8?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-8"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        F3Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/Bikoney-Picture-Collage-Blackboard-Carbonized/dp/B089SS5LY6/ref=sr_1_9?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-9"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }
        F4Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/Umbra-Exhibit-Picture-Gallery-Adjustable/dp/B07WTRTLML/ref=sr_1_6?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-6"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        F5Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/Adeco-Openings-Decorative-Handcrafted-Hanging/dp/B097GNFM3P/ref=sr_1_14_sspa?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-14-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFWVDBPTTJOMUhJNTcmZW5jcnlwdGVkSWQ9QTA2OTI1NTExUjBEWUVMWTJVTENYJmVuY3J5cHRlZEFkSWQ9QTAwODE2MTAzOTc5MklWTFU5WktTJndpZGdldE5hbWU9c3BfbXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ=="
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        F6Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/Super-Holiday-Eucalyptus-Farmhouse-Anniversary/dp/B09TGLYH2V/ref=sr_1_18?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-18"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        F7Button.setOnClickListener {
            val websiteUrl =
               "https://www.amazon.com/Family-Picture-Collages-Circular-Hanging/dp/B0B5H2JF5W/ref=sr_1_19_sspa?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-19-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFWVDBPTTJOMUhJNTcmZW5jcnlwdGVkSWQ9QTA2OTI1NTExUjBEWUVMWTJVTENYJmVuY3J5cHRlZEFkSWQ9QTAyMTc4MTkzM09DQks4NTZQQTgxJndpZGdldE5hbWU9c3BfbXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ=="
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }
        F8Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/Aiyome-Decorative-Drilling-Required-Carbonized/dp/B08YDLHVDR/ref=sr_1_24?crid=21WHYPFDS6S38&keywords=picture+frame+wall+hanging&qid=1679163622&sprefix=picture+frame+wall+hanging%2Caps%2C157&sr=8-24"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }
    }
}