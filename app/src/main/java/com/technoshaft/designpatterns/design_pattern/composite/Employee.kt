package com.technoshaft.designpatterns.design_pattern.composite

interface Employee {

    fun getId():Int
    fun getName():String
    fun getSalary():Double
    fun print()
    fun addEmployee(employee: Employee)
    fun removeEmployee(employee: Employee)
}