package com.technoshaft.designpatterns.design_pattern.observer

interface YTChannel{
    fun subscribe(user:YTSubscriber)
    fun unsubscribe(user:YTSubscriber)
}