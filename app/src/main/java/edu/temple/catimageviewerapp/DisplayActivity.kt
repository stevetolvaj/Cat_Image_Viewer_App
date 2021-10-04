package edu.temple.catimageviewerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Set title of activity.
        title = getString(R.string.title_display_er)
        val textView = findViewById<TextView>(R.id.displayerTextView)
        val imageView = findViewById<ImageView>(R.id.displayerImageView)
        val position = intent.getIntExtra(EXTRA_POSITION, 0)

        textView.text = imageList()[position].title
        imageView.setImageResource(imageList()[position].resourceId)
    }
}


