package edu.temple.catimageviewerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_PARAM1 = "param1"

class SelectionFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    lateinit var images: ArrayList<ImageObject>
    lateinit var viewModel: ImageObjectViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        images = arguments?.getParcelableArrayList<ImageObject>(ARG_PARAM1) as ArrayList<ImageObject>
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_selection, container, false)
        layout.findViewById<TextView>(R.id.textView).text = getString(R.string.click_an_image)
        recyclerView = layout.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(layout.context, 3)
        // Initialize viewModel.
        viewModel = ViewModelProvider(requireActivity()).get(ImageObjectViewModel::class.java)
        // Set adapter and click listener.
        val adapter = ImageAdapter(imageList(resources)) {
                position -> myOnClick(position)
        }

        recyclerView.adapter = adapter

        return layout
    }

    companion object {

        /**
         * The getInstance function Factory Function is used to generate a new instance. The
         * factory method should be provided with the collection of elements to display.
         *
         * @param imageList The list of images to display in the fragments recycler view.
         */
        fun getInstance (imageList: ArrayList<ImageObject>) : SelectionFragment {
            val fragment = SelectionFragment()
            val bundle = Bundle()

            bundle.putParcelableArrayList(ARG_PARAM1, imageList)
            fragment.arguments = bundle
            return fragment
        }
    }

    /**
     * The myOnClick function is used as a click listener and to start new activity when click occurs.
     * @param position The position of child view when click occurred.
     */
    private fun myOnClick(position: Int) {
        viewModel.setImageObject(images[position])
    }

}


