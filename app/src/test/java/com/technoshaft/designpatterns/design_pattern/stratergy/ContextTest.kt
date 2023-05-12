package com.technoshaft.designpatterns.design_pattern.stratergy

import org.junit.Assert
import org.junit.Test


class ContextTest {

    @Test
    fun testStratergy() {

        val nonvegContext = Context(NonVegMenu())
        val vegContext = Context(VegMenu())


        val menu = nonvegContext.getMenu()
        val menuVeg = vegContext.getMenu()
        Assert.assertEquals(menu.getFoodMenu(),"non_veg_menu")
        Assert.assertEquals(menuVeg.getFoodMenu(),"veg_menu")

    }

}