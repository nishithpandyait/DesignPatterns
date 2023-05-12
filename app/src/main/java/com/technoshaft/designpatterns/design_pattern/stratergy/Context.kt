package com.technoshaft.designpatterns.design_pattern.stratergy


class Context {

  private  val hotel: Hotel

    constructor(hotel: Hotel) {
        this.hotel = hotel
    }

    fun getMenu(): Hotel {
        return hotel
    }

}