package com.example.textfaces.ui

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.textfaces.R
import com.example.textfaces.data.TabTitles
import com.example.textfaces.ui.feature.textface.TextFaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        view_pager.adapter = sectionsPagerAdapter

        tabs.setupWithViewPager(view_pager)
    }

    inner class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

        private val tabTitles = TabTitles.getAllTabTitles()

        override fun getItem(position: Int): Fragment {
            // Returns a new instance of TextFaceFragment for each index
            return TextFaceFragment.newInstance(position)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return context.resources.getString(tabTitles[position])
        }

        override fun getCount(): Int {
            // Shows 4 pages.
            return 4
        }
    }
}