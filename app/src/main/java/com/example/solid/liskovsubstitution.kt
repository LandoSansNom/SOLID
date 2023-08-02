package com.example.solid

open class Animal {
     open fun move() = println("Animal is moving")
}

class Bird : Animal() {
    override fun move() = println("Bird is flying")
}

fun main() {
    val animal = Animal()
    animal.move() // prints "Animal is moving"

    val bird = Bird()
    bird.move() // prints "Bird is flying"

    fun makeAnimalsMove(animals: List<Animal>) {
        for (animal in animals) {
            animal.move()
        }
    }

    val animals = listOf(Animal(), Animal())
    makeAnimalsMove(animals) // prints "Animal is moving" twice

    val birds = listOf(Bird(), Bird())
    makeAnimalsMove(birds) // prints "Bird is flying" twice

}


