package edu.temple.catimageviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Set title of activity.
        title = getString(R.string.title_display_er)
    }
}