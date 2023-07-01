package com.kotlin.fundamentals

import java.awt.Color

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum2(a: Int, b: Int) = a + b

fun doNothing(): Unit {
    println("Called doNothing")
}


enum class Colors {
    GREEN, RED, BLUE
}

/**
 * Documentation Kotlin Doc
 *
 */
fun main() {
    val value = sum(10,20)
    println(value)
    val value2 = sum2(20,30)
    println(value2)

    doNothing()

    val arr = arrayOf<Int>(1,2,3,4,5);

    println("${arr[0]} ${arr[1]} ${arr[2]} ${arr[3]}")

    val name = "Kevin"
    println("Name is ${name.uppercase()}")

    if(arr.size < 10) {
        println("Count is less than 10")
    } else {
        println("Count is more than 10")
    }

    when(arr.size) {
        1 -> println("Count is 1")
        3 -> println("Count is 3")
        else -> println("Count is something else")
    }

    val a = 23
    val b = 10
    val result = if (a < b) a else b

    println("Min is $result")

    val ans = try {
        arr[7]
    } catch (t: Throwable) {
        -1
    }

    println("Answer is $ans")

    val numbers = 1..10;

    var i = 0;
    while(i < b) {
        println("i is $i")
        i++;
    }

    for (i in 1..10 step 2) {
        println("i is $i")
    }

    for (i in 10 downTo 1) {
        println("i is $i")
    }

    for (i in 1 until 10) {
        println("i is $i")
    }

    for(num in arr) {
        println("Number is $num")
    }

    for((index, num) in arr.withIndex()) {
        println("Number at index $index = $num")
    }

    val people = HashMap<String, Int>()
    people["Karan"] = 26
    people["Sandeep"] = 31
    people["Akhil"] = 35

    for((name, age) in people) {
        println("$name is $age")
    }

    val num = 6

    val isNum6or7 = when(num) {
        6, 7 -> true
        else -> false
    }

    println("Is number 6: $isNum6or7")

    when(num) {
        in 1..10 -> println("Num is in range")
    }

    val color = Colors.BLUE

    when(color) {
        Colors.RED -> println("I am red")
        Colors.BLUE -> println("I am blue")
        else-> println("I am green")
    }
}

