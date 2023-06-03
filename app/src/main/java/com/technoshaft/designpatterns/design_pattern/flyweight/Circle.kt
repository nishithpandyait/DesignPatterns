package com.technoshaft.designpatterns.design_pattern.flyweight

open class Circle(var color:String = ""):Shape{
    override fun draw(){
        println("circle class draw method called color->$color")
    }
}