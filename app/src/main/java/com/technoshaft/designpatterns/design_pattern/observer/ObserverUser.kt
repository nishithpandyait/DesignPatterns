package com.technoshaft.designpatterns.design_pattern.observer

data class ObserverUser(val name:String = "") : YTSubscriber{
    override fun notifyNewVideoPublish(){
        println("New Video published for user ->$name")
    }
}