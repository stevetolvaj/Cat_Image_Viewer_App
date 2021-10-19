package edu.temple.catimageviewerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Set title of activity.
        supportActionBar?.title = getString(R.string.title_selector)
        // Calling Factory Method to generate a new instance, passing in imageList to bundle
        // into fragment arguments.
        val selectionFragment = SelectionFragment.getInstance(imageList(resources))

        if (savedInstanceState == null)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentSelectionContainerView, selectionFragment)
            .commit()

        val displayFragment = DisplayFragment()

        if (savedInstanceState == null)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentDisplayContainerView, displayFragment)
            .commit()
    }




}

