package com.faces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.faces.textfaces.R
import com.faces.textfaces.ui.TextFaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val titleList = listOf("Happy", "Sad", "Mad", "Weird")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(titleList, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)
    }

    private class SectionsPagerAdapter(private val titleList: List<String>, fm: FragmentManager) :
        FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            // Returns a new instance of TextFaceFragment for each index
            return TextFaceFragment.newInstance(position)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }

        override fun getCount(): Int {
            // Shows 4 pages.
            return 4
        }
    }
}