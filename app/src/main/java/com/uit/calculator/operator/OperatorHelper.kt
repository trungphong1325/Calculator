package com.uit.calculator.operator

object OperatorHelper {
    fun plusOperator(first : Double, second : Double) : Double{
        return first + second
    }
    fun minusOperator(first : Double, second : Double) : Double{
        return first - second
    }
    fun multipeOperator(first : Double, second : Double) : Double{
        return first * second
    }
    fun divideOperator(first : Double, second : Double) : Double{
        var result = 0.0
        if (second != 0.0) {
            result = first / second
        }
        return result
    }
}