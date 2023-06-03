package com.technoshaft.designpatterns.design_pattern.flyweight

class FlyWeightPattern {

    fun main() {
        val shapeFactory = ShapeFactory()
        println(shapeFactory.map.size)

        val shapeList = mutableListOf<Shape>()
        shapeList.add(shapeFactory.getShapeByName("Red"))
        shapeList.add(shapeFactory.getShapeByName("Green"))
        shapeList.add(shapeFactory.getShapeByName("Blue"))
        shapeList.add(shapeFactory.getShapeByName("Pink"))
        println(shapeFactory.map.size)
        for(i in shapeList){
            i.draw()
        }
    }
}