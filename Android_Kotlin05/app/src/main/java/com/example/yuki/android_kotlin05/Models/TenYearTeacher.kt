package com.example.yuki.android_kotlin05.Models

class TenYearTeacher(name: String, age: Int, sex: Sex, baseSalary: Double) : Teacher(name, age, sex, baseSalary) {

    private val onePointThree = 1.3

    fun calculateSalary(): Int {
        return (baseSalary * onePointThree).toInt()
    }
}