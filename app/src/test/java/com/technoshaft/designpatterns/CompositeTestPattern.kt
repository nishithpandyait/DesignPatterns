package com.technoshaft.designpatterns

import com.technoshaft.designpatterns.design_pattern.composite.Accountant
import com.technoshaft.designpatterns.design_pattern.composite.BankManager
import com.technoshaft.designpatterns.design_pattern.composite.Cashier
import com.technoshaft.designpatterns.design_pattern.composite.Employee
import org.junit.Test


class CompositeTestPattern {

    @Test
    fun main() {
        val cashier: Employee = Cashier(1, "Mukesh Sukla", 10000.0)
        val accountant: Employee = Accountant(2, "Jack", 20000.0)
        val bankManager: Employee = BankManager(3, "sparrow", 40000.0)

        bankManager.addEmployee(cashier)
        bankManager.addEmployee(accountant)
        bankManager.print()
    }



}