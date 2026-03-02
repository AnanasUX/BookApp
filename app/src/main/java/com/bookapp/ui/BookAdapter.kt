package com.bookapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bookapp.Book
import com.bookapp.R

class BookAdapter(
    private val books: List<Book>,
    private val onClick: (Book) -> Unit
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    inner class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cardCover: CardView = view.findViewById(R.id.cardCover)
        val tvTitle: TextView = view.findViewById(R.id.tvBookTitle)
        val tvAuthor: TextView = view.findViewById(R.id.tvBookAuthor)
        val tvRating: TextView = view.findViewById(R.id.tvRating)
        val tvFormats: TextView = view.findViewById(R.id.tvFormats)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.cardCover.setCardBackgroundColor(book.coverColor)
        holder.tvTitle.text = book.title
        holder.tvAuthor.text = book.author
        holder.tvRating.text = "★ ${book.rating}"
        val formats = buildString {
            if (book.hasAudio) append("🎧")
            if (book.hasAudio && book.hasEbook) append(" | ")
            if (book.hasEbook) append("📖")
        }
        holder.tvFormats.text = formats
        holder.itemView.setOnClickListener { onClick(book) }
    }

    override fun getItemCount() = books.size
}
