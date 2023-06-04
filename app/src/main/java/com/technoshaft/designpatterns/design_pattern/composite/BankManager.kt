package com.technoshaft.designpatterns.design_pattern.composite


class BankManager(private val id:Int, private val employeeName:String,
                  private val salary:Double) : Employee{

    var employees: MutableList<Employee> = ArrayList()

    override fun getId():Int {
        return id
    }

    override fun getName():String {
        return employeeName
    }

    override fun getSalary():Double {
        return salary
    }

    override fun print() {
        println("=============Bank Manager=================")
        println("Id =" + getId())
        println("Name =" + getName())
        println("Salary =" + getSalary())
        println("============= End Bank Manager=================")

        println("employeeSize"+employees.size)
        for(emp in employees){
            println("Id =" + emp.getId())
            println("Name =" + emp.getName())
            println("Salary =" + emp.getSalary())

        }
        /*val it: Iterator<Employee> = employees.iterator()

        while (it.hasNext()) {
            val employee = it.next()
            employee.print()
        }*/
    }

    override fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    override fun removeEmployee(employee: Employee) {
        employees.remove(employee)
    }
}