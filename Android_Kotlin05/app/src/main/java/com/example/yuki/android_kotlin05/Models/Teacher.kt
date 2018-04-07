package com.example.yuki.android_kotlin05.Models

import android.util.Log

enum class Sex {
    WOMAN,
    MAN;
}

open class Teacher(name: String, age: Int, sex: Sex, baseSalary: Double) {

    val name = name
    val age = age
    val sex = sex
    val baseSalary = baseSalary
}