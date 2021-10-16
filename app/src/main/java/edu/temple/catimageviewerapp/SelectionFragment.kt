package edu.temple.catimageviewerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.temple.catimageviewerapp.MainActivity.Companion.EXTRA_IMAGE_LIST


class SelectionFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    lateinit var images: ArrayList<ImageObject>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        images = arguments?.getParcelableArrayList<ImageObject>(EXTRA_IMAGE_LIST) as ArrayList<ImageObject>
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

        // Set adapter and click listener.
        val adapter = ImageAdapter(imageList(resources)) {
                position -> (activity as MainActivity).myOnClick(position)
        }

        recyclerView.adapter = adapter

        return layout
    }

    companion object {

        /**
         * The getInstance function Factory Function is used to generate a new instance. The
         * factory method should be provided with the collection of elements to display.
         */
        fun getInstance (imageList: ArrayList<ImageObject>) : SelectionFragment {
            val fragment = SelectionFragment()
            val bundle = Bundle()

            bundle.putParcelableArrayList(EXTRA_IMAGE_LIST, imageList)
            fragment.arguments = bundle
            return fragment
        }
    }


}


