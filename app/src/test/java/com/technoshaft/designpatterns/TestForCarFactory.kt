package com.technoshaft.designpatterns

import com.technoshaft.designpatterns.design_pattern.factory.Wagonr
import org.junit.Assert
import org.junit.Test

class TestForCarFactory {

    @Test
    fun testWagonr(){

        val wagonr = Wagonr.Factory.build()

        Assert.assertEquals(wagonr.getCarName(),"wagonr")


    }

}