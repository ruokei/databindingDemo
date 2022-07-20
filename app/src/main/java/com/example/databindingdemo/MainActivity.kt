package com.example.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    //Student student = new Student()
    private lateinit var student :Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.btnSetValue.setOnClickListener {
            student  = Student("Ali",20,"RSD")
            binding.myData = student
        }

        binding.btnDisplay.setOnClickListener {
            /*binding.tvName.text = student.name
            binding.tvAge.text = student.age.toString()
            binding.tvProgramme.text = student.programme*/

            /*student.programme = "RIS"
            binding.apply{
                invalidateAll()
            }*/

        }

    }
}