package com.bookapp

import android.content.Intent
import android.os.Bundle
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bookapp.databinding.ActivityMainBinding
import com.bookapp.ui.BookAdapter
import com.bookapp.ui.GenreAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val recommendedBooks = listOf(
        Book(1, "OYE", "Melissa Mogollon", 4.1f, "Fiction", Color.parseColor("#E53935"),
            description = "A vibrant debut novel about family, identity, and love."),
        Book(2, "The Girl with the Dragonfruit Tattoo", "Carrie Doyle", 4.1f, "Mystery", Color.parseColor("#1565C0"),
            description = "A delicious mystery set in a tropical paradise."),
        Book(3, "The Silent Patient", "Alex Michaelides", 4.6f, "Thriller", Color.parseColor("#4A148C"),
            description = "A shocking psychological thriller of a famous painter who shoots her husband."),
        Book(4, "Happy Place", "Emily Henry", 4.3f, "Romance", Color.parseColor("#00695C"),
            description = "Two exes. One last holiday. Could this change everything?"),
    )

    private val popularBooks = listOf(
        Book(5, "The Girl with the Dragon Tattoo Returns", "Stieg Larsson", 4.5f, "Thriller", Color.parseColor("#BF360C"),
            description = "The legendary Lisbeth Salander returns in this gripping sequel."),
        Book(6, "The Girl Who Kicked the Hornet's Nest", "Stieg Larsson", 4.4f, "Thriller", Color.parseColor("#1A237E"),
            description = "The explosive conclusion to the Millennium trilogy."),
        Book(7, "Great Big Beautiful Life", "Emily Henry", 4.2f, "Romance", Color.parseColor("#880E4F"),
            description = "A stunning new novel from the #1 NYT bestselling author."),
    )

    private val genres = listOf(
        Genre("Fantasy", "🐉", android.R.color.holo_red_dark),
        Genre("Thriller", "🔪", android.R.color.holo_blue_dark),
        Genre("Romance", "💖", android.R.color.holo_purple),
        Genre("Mystery", "🕵️", android.R.color.holo_green_dark),
        Genre("Sci-Fi", "🚀", android.R.color.holo_orange_dark),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecommendations()
        setupGenres()
        setupPopular()
        setupNavigation()
        setupHeroBanner()
    }

    private fun setupHeroBanner() {
        binding.heroBannerTitle.text = "#1 New York Times\nBestselling Author"
        binding.heroBadgeNew.text = "NEW"
        binding.heroBadgeExclusive.text = "EXCLUSIVE"
    }

    private fun setupRecommendations() {
        val adapter = BookAdapter(recommendedBooks) { book -> openDetail(book) }
        binding.rvRecommendations.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvRecommendations.adapter = adapter
    }

    private fun setupGenres() {
        val adapter = GenreAdapter(genres)
        binding.rvGenres.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvGenres.adapter = adapter
    }

    private fun setupPopular() {
        val adapter = BookAdapter(popularBooks) { book -> openDetail(book) }
        binding.rvPopular.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPopular.adapter = adapter
    }

    private fun setupNavigation() {
        binding.navMain.setOnClickListener { /* already here */ }
        binding.navSearch.setOnClickListener { /* TODO: SearchActivity */ }
        binding.navMyBooks.setOnClickListener { /* TODO: MyBooksActivity */ }
        binding.navProfile.setOnClickListener { /* TODO: ProfileActivity */ }
    }

    private fun openDetail(book: Book) {
        val intent = Intent(this, BookDetailActivity::class.java)
        intent.putExtra("book_title", book.title)
        intent.putExtra("book_author", book.author)
        intent.putExtra("book_rating", book.rating)
        intent.putExtra("book_description", book.description)
        intent.putExtra("book_color", book.coverColor)
        startActivity(intent)
    }
}
