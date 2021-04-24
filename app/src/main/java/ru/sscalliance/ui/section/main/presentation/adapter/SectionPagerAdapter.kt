package ru.sscalliance.ui.section.main.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.sscalliance.ui.section.certain.presentation.SectionFragment
import ru.sscalliance.utils.SectionUtils.getSectionsArray


class SectionPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = getSectionsArray().size

    override fun createFragment(position: Int): Fragment {
        return SectionFragment(getSectionsArray()[position])
    }

}