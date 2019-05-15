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
            val DOM: Int = editTextMonth.text.toString().toInt()
            val DOY: Int = editTextyear.text.toString().toInt()

            var currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            val currentmonth = Calendar.getInstance().get(Calendar.MONTH) + 1


            var currentYear = Calendar.getInstance().get(Calendar.YEAR)


            var month: Int? = null
            var yea: Int? = null
            var day: Int? = null

            if (DOM == currentmonth) {
                yea = (currentYear - DOY) - 1
                month = currentmonth - DOM + 11
                currentDay++


            } else if (currentmonth >= DOM) {

                month = (DOM - currentmonth)
                yea = currentYear - DOY
                currentDay++

            } else {
                month = (12 + currentmonth) - DOM
                yea = (currentYear - DOY) - 1

            }
            if (DOD > currentDay) {

                day = currentDay - DOD
                day = 30 + day

            } else {
                day = currentDay - DOD
            }

            day = abs(day)

//            day = currentmonth - day
            month = abs(month)
            showtext.text = "your age is  $yea years $month months $day days"


        }

    }
}
