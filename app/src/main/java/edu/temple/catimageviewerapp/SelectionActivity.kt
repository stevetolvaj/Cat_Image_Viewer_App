package edu.temple.catimageviewerapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView



class SelectionActivity : AppCompatActivity() {

    // Save const string for put extra tag.
    companion object {
        const val EXTRA_IMAGE_OBJECT = "edu.temple.catimageviewerapp.IMAGE_OBJECT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set title of activity.
        supportActionBar?.title = getString(R.string.title_selector)

        // Assign RecyclerView and set to grid layout.
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Set adapter and click listener.
        val adapter = ImageAdapter(imageList(resources)) {
            position -> myOnClick(position)
        }

        recyclerView.adapter = adapter
    }

    /**
     * The myOnClick function is used as a click listener and to start new activity when click occurs.
     * @param position The position of child view when click occured.
     */
    private fun myOnClick(position: Int) {
        val intent = Intent(this, DisplayActivity::class.java).apply {
            putExtra(EXTRA_IMAGE_OBJECT, imageList(resources)[position])
        }
        startActivity(intent)
    }


}

