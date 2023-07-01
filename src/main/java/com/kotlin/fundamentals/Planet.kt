package com.kotlin.fundamentals

//class Planet(val name: String)

class Planet(
        val name: String,
        diameter: Int) {

    init {
        println("Created planet: $name")
    }

    val radius: Int = diameter /2
    var population: Int = 0

    constructor(name: String, diameter: Int, isGaseous: Boolean): this(name, diameter)
}