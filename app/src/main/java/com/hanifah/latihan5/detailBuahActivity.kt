package com.hanifah.latihan5

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailBuahActivity : AppCompatActivity() {

    private lateinit var txtDetailBuah : TextView
    private lateinit var imageDetailBuah : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtDetailBuah = findViewById(R.id.txtDetailBuah)
        imageDetailBuah = findViewById(R.id.imageDetailBuah)

        //get data
        val detailText = intent.getStringExtra("deskripsi")
        val detailimage = intent.getIntExtra("image",0)

        //set data ke layout
        txtDetailBuah.setText(detailText)
        imageDetailBuah.setImageResource(detailimage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}