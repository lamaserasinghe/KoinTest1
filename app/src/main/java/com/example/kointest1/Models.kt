package com.example.kointest1

import org.koin.core.module.Module
import org.koin.dsl.module

//koin model function
val appModule:Module= module {
    //Define a singleton of SchoolCourse
    single { SchoolCourse() }

    //Define a factory(create new instance every time)
    factory { Friend() }

    //Define a factory(create new instance every time)
    factory { Student(get(),get()) }
}