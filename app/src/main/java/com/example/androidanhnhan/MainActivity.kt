package com.example.androidanhnhan

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidanhnhan.cviGroup.adapter.CVIMainMenuActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val btnContinue: TextView
        val btnGoToCVI: TextView
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnContinue = findViewById(R.id.btnContinue)
        btnContinue.setOnClickListener {
            var intent = Intent(this, SelectCredentialList::class.java)
            startActivity(intent)
        }

        btnGoToCVI = findViewById(R.id.btnGoToCVI)
        btnGoToCVI.setOnClickListener({
            var intent = Intent(this, CVIMainMenuActivity::class.java)
            startActivity(intent)
        })
    }
}