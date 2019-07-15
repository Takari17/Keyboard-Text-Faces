package com.example.textfaces.ui.feature.textface

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
import com.example.textfaces.R
import com.example.textfaces.data.LABEL
import com.example.textfaces.data.TAB_INDEX
import com.example.textfaces.data.faces.TextFaceFactory
import kotlinx.android.synthetic.main.fragment_main.*

class TextFaceFragment : Fragment() {

    private var textFaces: List<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabIndex = arguments?.getInt(TAB_INDEX)

        tabIndex?.let { index ->
            textFaces = TextFaceFactory.getInstance(index)
        }

        textFaces?.let { textFaces -> initRecyclerView(textFaces) }
    }

    private fun initRecyclerView(textFaces: List<String>) {
        recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = TextFaceAdapter(textFaces) { itemPosition ->

                saveToClipBoard(LABEL, textFaces[itemPosition])
                showSavedToast(context)
            }
        }
    }

    private fun saveToClipBoard(label: String, text: String) {
        val clipboard = activity?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.primaryClip = ClipData.newPlainText(label, text)
    }

    private fun showSavedToast(context: Context) {
        Toast.makeText(context, R.string.saved, Toast.LENGTH_SHORT).show()
    }

    companion object {
        //Creates a new instance which the index of the current tab passes via Bundle
        fun newInstance(tabIndex: Int): TextFaceFragment {
            return TextFaceFragment().apply {
                arguments = Bundle().apply {
                    putInt(TAB_INDEX, tabIndex)
                }
            }
        }
    }
}