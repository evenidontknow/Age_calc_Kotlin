package com.eidk.my_age

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.abs
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findage.setOnClickListener {
            val DOD: Int = editTextday.text.toString().toInt()
            val DOM:Int = editTextMonth.text.toString().toInt()
            val DOY:Int = editTextyear.text.toString().toInt()

            val currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            val currentmonth = Calendar.getInstance().get(Calendar.MONTH)


            val currentYear = Calendar.getInstance().get(Calendar.YEAR)



            var month:Int? =null

            if (currentmonth == DOM)
            {
                 month = DOM- currentmonth
            } else if (currentmonth >= DOM){

                month = DOM- currentmonth
            }

            else{
                 month =(12 + currentmonth )- DOM
            }



            var day:Double = ((currentDay- DOD).toDouble())
            val yea = currentYear-DOY
            day = abs(day)
            day = 30.146-day
            month = abs(month)
            showtext.text = "your age is  $yea years $month months $day days"


        }

    }
}
