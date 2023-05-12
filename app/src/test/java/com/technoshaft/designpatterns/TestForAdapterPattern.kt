package com.technoshaft.designpatterns

import com.technoshaft.designpatterns.design_pattern.adapter.EnglishAdapter
import com.technoshaft.designpatterns.design_pattern.adapter.FromLanguageData
import org.junit.Assert
import org.junit.Test

class TestForAdapterPattern {

    @Test
    fun testAdapter(){
        val list = mutableListOf<FromLanguageData>()

        list.add(FromLanguageData("kem cho"))
        list.add(FromLanguageData("majama"))
        list.add(FromLanguageData("jsk"))

        val englishAdapter = EnglishAdapter(list);
        val englishData = englishAdapter.getItem(0)

        Assert.assertEquals(englishData.sentence,"how are you")
    }

}