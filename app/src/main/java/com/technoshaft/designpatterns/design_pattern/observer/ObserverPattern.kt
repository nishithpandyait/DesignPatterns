package com.technoshaft.designpatterns.design_pattern.observer

class ObserverPattern {

    fun main() {
        val tSeriesChannel = Channel("T series")
        for(i in 0 until 5){
            tSeriesChannel.subscribe(ObserverUser("User #$i"))
        }
        tSeriesChannel.publishVideo()
    }
}