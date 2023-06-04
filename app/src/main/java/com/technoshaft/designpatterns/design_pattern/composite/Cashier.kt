package com.technoshaft.designpatterns.design_pattern.composite

class Cashier (private val id:Int, private val employeeName:String,
               private val salary:Double) : Employee{

    override fun getId(): Int {
        return id
    }

    override fun getName(): String {
        return employeeName
    }

    override fun getSalary(): Double {
        return salary
    }

    override fun print() {
        println("=============Cashier=================")
        println("Id =" + getId())
        println("Name =" + getName())
        println("Salary =" + getSalary())
        println("============End Cashier==============")

    }

    override fun addEmployee(employee: Employee) {

    }

    override fun removeEmployee(employee: Employee) {

    }
}