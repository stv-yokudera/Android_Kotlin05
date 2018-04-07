package com.example.yuki.android_kotlin05.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.yuki.android_kotlin05.Models.FiveYearTeacher
import com.example.yuki.android_kotlin05.Models.Sex
import com.example.yuki.android_kotlin05.Models.Teacher
import com.example.yuki.android_kotlin05.Models.TenYearTeacher
import com.example.yuki.android_kotlin05.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTeacherInfo()
    }

    private fun showTeacherInfo() {
        val name = "Tom"
        val age = 31
        val sex = Sex.MAN
        val baseSalary = 3500.toDouble()

        val teacher = Teacher(name, age, sex, baseSalary)
        val fiveYearTeacher = FiveYearTeacher(name, age, sex, baseSalary)
        val tenYearTeacher = TenYearTeacher(name, age, sex, baseSalary)

        Log.d("Salary", "BaseSalary: ${ teacher.baseSalary }")
        Log.d("Salary", "FiveYearTeacher Salary: ${ fiveYearTeacher.calculateSalary() }")
        Log.d("Salary", "TenYearTeacher Salary: ${ tenYearTeacher.calculateSalary() }")
    }
}
