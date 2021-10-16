package edu.temple.catimageviewerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    // Save const string for put extra tag.
    companion object {
        const val EXTRA_IMAGE_OBJECT = "edu.temple.catimageviewerapp.IMAGE_OBJECT"
        const val EXTRA_IMAGE_LIST = "edu.temple.catimageviewerapp.IMAGE_LIST"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Set title of activity.
        supportActionBar?.title = getString(R.string.title_selector)
        // Calling Factory Method to generate a new instance, passing in imageList to bundle
        // into fragment arguments.
        val selectionFragment = SelectionFragment.getInstance(imageList(resources))
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentSelectionContainerView, selectionFragment)
            .commit()
    }


    /**
     * The myOnClick function is used as a click listener and to start new activity when click occurs.
     * @param position The position of child view when click occurred.
     */
    fun myOnClick(position: Int) {
//        val intent = Intent(this, DisplayActivity::class.java).apply {
//            putExtra(EXTRA_IMAGE_OBJECT, imageList(resources)[position])
//        }
        //startActivity(intent)
    }

}

