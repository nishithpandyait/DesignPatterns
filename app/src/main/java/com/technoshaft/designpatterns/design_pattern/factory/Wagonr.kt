package com.technoshaft.designpatterns.design_pattern.factory

class Wagonr : Car {

    override val name: String
        get() = "wagonr"

    override fun getCarName(): String {
        return name
    }

    companion object Factory : CarFactory() {
        override fun build() = Wagonr()
    }


}