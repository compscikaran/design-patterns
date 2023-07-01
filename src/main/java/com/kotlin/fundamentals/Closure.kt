package com.kotlin.fundamentals

fun increment(limit: Int): () -> Int {
    var x = 1;
    return fun(): Int {
        if(x < limit)
            x++;
        return x;
    }
}

fun main() {
    val inc = increment(5);
    println(inc())
    println(inc())
    println(inc())
    println(inc())
    println(inc())
    println(inc())
    println(inc())
}
