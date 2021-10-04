package edu.temple.catimageviewerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val EXTRA_POSITION = "edu.temple.catimageviewerapp.POSITION"

class SelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set title of activity.
        title = getString(R.string.title_selector)

        // Assign RecyclerView and set to grid layout.
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Set adapter and click listener.
        val adapter = ImageAdapter(imageList()) {
            position -> myOnClick(position)
        }

        recyclerView.adapter = adapter



    }

    /**
     * myOnClick is used as a click listener and to start new activity when click occurs.
     * @param position The position of child view when click occured.
     */
    private fun myOnClick(position: Int) {
        startDisplayActivity(position)
    }

    private fun startDisplayActivity(position: Int) {
        val intent = Intent(this, DisplayActivity::class.java).apply {
            putExtra(EXTRA_POSITION, position)
        }
        startActivity(intent)
    }
}

