package com.technoshaft.designpatterns.design_pattern.observer

class Channel(val channelName:String) : YTChannel{
    val subscriberList = mutableListOf<YTSubscriber>()
	
    fun publishVideo(){
        for(sub in subscriberList){
            sub.notifyNewVideoPublish()
        }
    }
   
    override fun subscribe(user:YTSubscriber){
        subscriberList.add(user)
    }
    
    override fun unsubscribe(user:YTSubscriber){
        subscriberList.remove(user)
    }
}