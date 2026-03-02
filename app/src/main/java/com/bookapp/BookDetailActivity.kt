package com.bookapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bookapp.databinding.ActivityBookDetailBinding

class BookDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("book_title") ?: ""
        val author = intent.getStringExtra("book_author") ?: ""
        val rating = intent.getFloatExtra("book_rating", 0f)
        val description = intent.getStringExtra("book_description") ?: ""
        val color = intent.getIntExtra("book_color", 0xFF333333.toInt())

        binding.detailCover.setBackgroundColor(color)
        binding.detailTitle.text = title
        binding.detailAuthor.text = author
        binding.detailRating.text = "★ $rating"
        binding.detailDescription.text = description

        binding.btnBack.setOnClickListener { finish() }
        binding.btnRead.setOnClickListener { /* TODO: open reader */ }
        binding.btnListen.setOnClickListener { /* TODO: open audio player */ }
    }
}
