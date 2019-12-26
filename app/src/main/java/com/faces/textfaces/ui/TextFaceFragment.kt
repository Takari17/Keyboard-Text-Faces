package com.faces.textfaces.ui

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.faces.textfaces.R
import com.faces.textfaces.data.TextFaceFactory
import kotlinx.android.synthetic.main.fragment_main.*


class TextFaceFragment : Fragment() {

    private lateinit var textFaces: List<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //argument passed in by activity
        val tabIndex = arguments?.getInt(TAB_INDEX)

        textFaces = TextFaceFactory.getInstance(tabIndex ?: 0)

        recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = TextFaceAdapter(textFaces) { itemPosition -> // onClick
                saveToClipBoard(textFaces[itemPosition])
                Toast.makeText(context, R.string.saved, Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun saveToClipBoard(text: String) {
        val clipboard = activity?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.primaryClip = ClipData.newPlainText("boop", text)
    }


    companion object {
        fun newInstance(tabIndex: Int): TextFaceFragment =
            TextFaceFragment().apply {
                arguments = Bundle().apply {
                    putInt(TAB_INDEX, tabIndex)
                }
            }
        const val TAB_INDEX = "index"
    }
}