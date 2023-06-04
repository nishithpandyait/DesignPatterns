package com.technoshaft.designpatterns.observabletests

import com.technoshaft.designpatterns.design_pattern.observer.Channel
import com.technoshaft.designpatterns.design_pattern.observer.ObserverUser
import org.junit.Test

class ObserverPatternTest {

    @Test
    fun main() {
        val tSeriesChannel = Channel("T series")
        for(i in 0 until 5){
            tSeriesChannel.subscribe(ObserverUser("User #$i"))
        }
        tSeriesChannel.publishVideo()
    }
}