package com.example.solid

interface Swimming {
    fun swim()
}

interface Flying {
    fun fly()
}

class Duck : Swimming, Flying {
    override fun swim() = println("Duck is swimming")
    override fun fly() = println("Duck is flying")
}

class Penguin : Swimming {
    override fun swim() = println("Penguin is swimming")
}


fun main(){
    fun makeAnimalsSwim(animals: List<Swimming>) {
        for (animal in animals) {
            animal.swim()
        }
    }

    val ducks = listOf(Duck(), Duck())
    makeAnimalsSwim(ducks) // prints "Duck is swimming" twice

    val penguins = listOf(Penguin(), Penguin())
    makeAnimalsSwim(penguins) // prints "Penguin is swimming" twice
}