package edu.temple.catimageviewerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ViewModelProvider(requireActivity())
            .get(ImageObjectViewModel::class.java)
            .getImageObject()
            .observe(requireActivity(), {updateImageDetails(it)})
    }

    /**
     * The updateImageDetails function will update the Display fragments the TextView and ImageView
     * with the image object supplied as an argument.
     *
     * @param imageObject The ImageObject to supply the child views data.
     */
    private fun updateImageDetails(imageObject: ImageObject) {
        view?.findViewById<TextView>(R.id.displayTextView)?.text = imageObject.title.toString()
        view?.findViewById<ImageView>(R.id.displayImageView)?.setImageResource(imageObject.resourceId)
    }


}