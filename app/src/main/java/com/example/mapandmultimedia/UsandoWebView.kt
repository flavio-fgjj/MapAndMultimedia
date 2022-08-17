package com.example.mapandmultimedia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.mapandmultimedia.databinding.ActivityUsandoWebViewBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityUsandoWebViewBinding

class UsandoWebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUsandoWebViewBinding.inflate((layoutInflater))
        setContentView(binding.root)

        val webView = binding.webview

        object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                if (url != null) view?.loadUrl(url)

                return true
            }
        }.also { webView.webViewClient = it }
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.fiap.com.br/")
    }
}