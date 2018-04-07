package com.example.yuki.android_kotlin05.Models

class FiveYearTeacher(name: String, age: Int, sex: Sex, baseSalary: Double) : Teacher(name, age, sex, baseSalary) {

    private val onePointOne = 1.1

    fun calculateSalary(): Int {
        return (baseSalary * onePointOne).toInt()
    }
}