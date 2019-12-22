package com.example.kointest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student:Student=get<Student>()
        student.beSmart()

        val student2:Student=get<Student>()
        student.beSmart()
    }
}
