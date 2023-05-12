package com.technoshaft.designpatterns.design_pattern.stratergy

class NonVegMenu : Hotel {
    override fun getFoodMenu(): String {
        return "non_veg_menu"
    }
}