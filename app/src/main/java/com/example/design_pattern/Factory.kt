package com.example.design_pattern

// Product: Pizza
interface Pizza {
    fun prepare()
    fun bake()
    fun cut()
    fun box()
}

// Concrete Product: Cheese Pizza
class CheesePizza : Pizza {
    override fun prepare() {
        println("Preparing Cheese Pizza")
    }

    override fun bake() {
        println("Baking Cheese Pizza")
    }

    override fun cut() {
        println("Cutting Cheese Pizza")
    }

    override fun box() {
        println("Packing Cheese Pizza")
    }
}

// Concrete Product: Pepperoni Pizza
class PepperoniPizza : Pizza {
    override fun prepare() {
        println("Preparing Pepperoni Pizza")
    }

    override fun bake() {
        println("Baking Pepperoni Pizza")
    }

    override fun cut() {
        println("Cutting Pepperoni Pizza")
    }

    override fun box() {
        println("Packing Pepperoni Pizza")
    }
}

// Factory: PizzaFactory
interface PizzaFactory {
    fun createPizza(type: String): Pizza?
}

// Concrete Factory: SimplePizzaFactory
class SimplePizzaFactory : PizzaFactory {
    override fun createPizza(type: String): Pizza? {
        return when (type) {
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            else -> null // Return null for unknown pizza types
        }
    }
}

fun main() {
    val pizzaFactory: PizzaFactory = SimplePizzaFactory()

    val cheesePizza: Pizza? = pizzaFactory.createPizza("cheese")
    cheesePizza?.prepare()
    cheesePizza?.bake()
    cheesePizza?.cut()
    cheesePizza?.box()

    val pepperoniPizza: Pizza? = pizzaFactory.createPizza("pepperoni")
    pepperoniPizza?.prepare()
    pepperoniPizza?.bake()
    pepperoniPizza?.cut()
    pepperoniPizza?.box()
}
