package com.technoshaft.designpatterns.design_pattern.flyweight

class ShapeFactory{
    val map = hashMapOf<String,Shape>()

    fun getShapeByName(color:String) : Shape{
        var myShape = map[color]
        if(myShape==null){
            myShape = Circle(color)
            map[color] = myShape
        }
        return myShape
    }
}