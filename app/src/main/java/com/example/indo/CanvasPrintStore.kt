package com.example.indo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.*

class CanvasPrintStore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canvas_print_store)
        // Load the image into the ImageButton
        val C1Button = findViewById<ImageButton>(R.id.C1)
        C1Button.setImageResource(R.drawable.c1)
        val C2Button = findViewById<ImageButton>(R.id.C2)
        C2Button.setImageResource(R.drawable.c2)
        val C3Button = findViewById<ImageButton>(R.id.C3)
        C3Button.setImageResource(R.drawable.c3)
        val C4Button = findViewById<ImageButton>(R.id.C4)
        C4Button.setImageResource(R.drawable.c4)
        val C5Button = findViewById<ImageButton>(R.id.C5)
        C5Button.setImageResource(R.drawable.c5)
        val C6Button = findViewById<ImageButton>(R.id.C6)
        C6Button.setImageResource(R.drawable.c6)
        val C7Button = findViewById<ImageButton>(R.id.C7)
        C7Button.setImageResource(R.drawable.c7)
        val C8Button = findViewById<ImageButton>(R.id.C8)
        C8Button.setImageResource(R.drawable.c8)

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
        C1Button.setOnClickListener {
            val websiteUrl = "https://www.greatbigcanvas.com/view/guardian-of-the-sea,2153818/?ref=recently-sold"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        C2Button.setOnClickListener {
            val websiteUrl =
                "https://www.etsy.com/listing/1197980815/custom-portrait-painting-from-your?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=canvas+paintings&ref=sr_gallery-1-3&frs=1&etp=1&sts=1&organic_search_click=1"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        C3Button.setOnClickListener {
            val websiteUrl =
                "https://www.amazon.com/Cortesi-Home-Forgiveness-Sanchez-Art/dp/B07XTPKPLG/ref=sr_1_9?keywords=Canvas%2BArt%2Bfor%2BSale&qid=1679159327&sr=8-9&ufe=app_do%3Aamzn1.fos.f5122f16-c3e8-4386-bf32-63e904010ad0&th=1"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }
        C4Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/Wieco-Art-Paintings-Reproduction-Decorations/dp/B00NV0CXT2/ref=sr_1_5?crid=1FQRC10MMQ7KJ&keywords=Canvas+Art+for+Sale+small&qid=1679161199&sprefix=canvas+art+for+sale+small%2Caps%2C173&sr=8-5"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        C5Button.setOnClickListener {
            val websiteUrl = "https://www.greatbigcanvas.com/view/rustic-black-stallion-i,2561233/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        C6Button.setOnClickListener {
            val websiteUrl =
                "https://www.amazon.com/Bedroom-Decorations-Pictures-Artwork-Painting/dp/B0BPGHWZ2W/ref=sxin_16_pa_sp_search_thematic_sspa?content-id=amzn1.sym.711b623b-fef6-4340-9590-f21d01371ab3%3Aamzn1.sym.711b623b-fef6-4340-9590-f21d01371ab3&crid=1FQRC10MMQ7KJ&cv_ct_cx=Canvas+Art+for+Sale+small&keywords=Canvas+Art+for+Sale+small&pd_rd_i=B0BPGHWZ2W&pd_rd_r=37e12c24-d10d-494e-b585-525c52f6d03c&pd_rd_w=KcEBU&pd_rd_wg=wcif9&pf_rd_p=711b623b-fef6-4340-9590-f21d01371ab3&pf_rd_r=NFJBR36CVQT21XFTVJ0R&qid=1679161714&sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&sprefix=canvas+art+for+sale+small%2Caps%2C173&sr=1-4-2b34d040-5c83-4b7f-ba01-15975dfb8828-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyTDlaTk02WlFLTk9JJmVuY3J5cHRlZElkPUEwMDMzOTQ2M0dFS0EzWkhHNzA4RSZlbmNyeXB0ZWRBZElkPUEwOTQ3NTQ4MUdZMU1IQTVDWTI4VCZ3aWRnZXROYW1lPXNwX3NlYXJjaF90aGVtYXRpYyZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }

        C7Button.setOnClickListener {
            val websiteUrl =
                "https://www.amazon.com/Painting-Decorations-Bathroom-Sunflower-Pictures/dp/B08YYP73X3/ref=sxin_16_pa_sp_search_thematic_sspa?content-id=amzn1.sym.711b623b-fef6-4340-9590-f21d01371ab3%3Aamzn1.sym.711b623b-fef6-4340-9590-f21d01371ab3&crid=1FQRC10MMQ7KJ&cv_ct_cx=Canvas+Art+for+Sale+small&keywords=Canvas+Art+for+Sale+small&pd_rd_i=B08YYP73X3&pd_rd_r=37e12c24-d10d-494e-b585-525c52f6d03c&pd_rd_w=KcEBU&pd_rd_wg=wcif9&pf_rd_p=711b623b-fef6-4340-9590-f21d01371ab3&pf_rd_r=NFJBR36CVQT21XFTVJ0R&qid=1679161714&sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&sprefix=canvas+art+for+sale+small%2Caps%2C173&sr=1-5-2b34d040-5c83-4b7f-ba01-15975dfb8828-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyTDlaTk02WlFLTk9JJmVuY3J5cHRlZElkPUEwMDMzOTQ2M0dFS0EzWkhHNzA4RSZlbmNyeXB0ZWRBZElkPUEwNDM4NjA1M0tOUThSQjk3TTRDUiZ3aWRnZXROYW1lPXNwX3NlYXJjaF90aGVtYXRpYyZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }
        C8Button.setOnClickListener {
            val websiteUrl = "https://www.amazon.com/NATVVA-Callahan-Painting-Picture-Decoration/dp/B0956JV6GB/ref=sr_1_9?crid=1FQRC10MMQ7KJ&keywords=Canvas+Art+for+Sale+small&qid=1679161714&sprefix=canvas+art+for+sale+small%2Caps%2C173&sr=8-9"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(intent)
        }
    }
}
