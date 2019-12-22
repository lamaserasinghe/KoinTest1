package com.example.kointest1

import org.koin.core.module.Module
import java.util.Collections.singleton

class Student(val course: SchoolCourse,val friend: Friend){

    fun beSmart(){
        friend.hangout()
        course.study()
    }
}

class Friend {
    fun hangout(){
        println("I am study")
    }
}

class SchoolCourse {
    fun study(){
        println("I am studying")
    }

}
