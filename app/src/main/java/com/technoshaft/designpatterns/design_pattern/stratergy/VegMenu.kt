package com.technoshaft.designpatterns.design_pattern.stratergy

class VegMenu : Hotel {
    override fun getFoodMenu(): String {
        return "veg_menu"
    }
}