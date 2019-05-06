package com.uit.calculator.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uit.calculator.R
import com.uit.calculator.operator.OperatorHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isOperator : Boolean = false
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnClickListener {
            result.text = result.text.toString() + "0"
            isOperator = false
        }
        btn_1.setOnClickListener {
            result.text = result.text.toString() + "1"
            isOperator = false

        }
        btn_2.setOnClickListener {
            result.text = result.text.toString() + "2"
            isOperator = false

        }
        btn_3.setOnClickListener {
            result.text = result.text.toString() + "3"
            isOperator = false

        }
        btn_4.setOnClickListener {
            result.text = result.text.toString() + "4"
            isOperator = false

        }
        btn_5.setOnClickListener {
            result.text = result.text.toString() + "5"
            isOperator = false

        }
        btn_6.setOnClickListener {
            result.text = result.text.toString() + "6"
            isOperator = false

        }
        btn_7.setOnClickListener {
            result.text = result.text.toString() + "7"
            isOperator = false

        }
        btn_8.setOnClickListener {
            result.text = result.text.toString() + "8"
            isOperator = false

        }
        btn_9.setOnClickListener {
            result.text = result.text.toString() + "9"
            isOperator = false

        }
        btn_clear.setOnClickListener {
            result.text = ""
        }
        btn_plus.setOnClickListener {
            if(!isOperator){
                result.text = result.text.toString() + " + "
                isOperator = true
            }

        }
        btn_minus.setOnClickListener {
            if(!isOperator){
                result.text = result.text.toString() + " - "
                isOperator = true
            }

        }

        btn_multiply.setOnClickListener {
            if(!isOperator){
                result.text = result.text.toString() + " * "
                isOperator = true
            }

        }
        btn_divide.setOnClickListener {
            if(!isOperator){
                result.text = result.text.toString() + " / "
                isOperator = true
            }
        }
        btn_decimal.setOnClickListener {
            result.text = result.text.toString() + "."
        }
        btn_equals.setOnClickListener {
            formula.text = result.text.toString() + " = "
            when {
                result.text.contains("+") -> {
                    val listValue = result.text.split(" ")
                    result.text = OperatorHelper.plusOperator(
                        listValue[0].toDouble(), listValue[listValue.size - 1].toDouble()
                    ).toString()
                }
                result.text.contains("-") -> {
                    val listValue = result.text.split(" ")
                    result.text = OperatorHelper.minusOperator(
                        listValue[0].toDouble(), listValue[listValue.size - 1].toDouble()
                    ).toString()
                }
                result.text.contains("*") -> {
                    val listValue = result.text.split(" ")
                    result.text = OperatorHelper.multipeOperator(
                        listValue[0].toDouble(), listValue[listValue.size - 1].toDouble()
                    ).toString()
                }
                result.text.contains("/") -> {
                    val listValue = result.text.split(" ")
                    result.text = OperatorHelper.divideOperator(
                        listValue[0].toDouble(), listValue[listValue.size - 1].toDouble()
                    ).toString()
                }
               else -> {

               }
            }


        }
    }
}
