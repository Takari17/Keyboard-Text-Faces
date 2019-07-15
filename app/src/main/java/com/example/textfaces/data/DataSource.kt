package com.example.textfaces.data

import com.example.textfaces.R

/*
Holds miscellaneous enums and constants
 */

const val TAB_INDEX = "Tab Index"
const val LABEL = "Text Face"

enum class TabTitles(val stringResource: Int) {
    Tab1(R.string.tab_text_1),
    Tab2(R.string.tab_text_2),
    Tab3(R.string.tab_text_3),
    Tab4(R.string.tab_text_4);

    companion object {
        fun getAllTabTitles(): List<Int> {
            val tabs = mutableListOf<Int>()

            values().forEach { tab -> tabs.add(tab.stringResource) }

            return tabs.toList()
        }
    }
}