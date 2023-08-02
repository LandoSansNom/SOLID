package com.example.solid


class Car(private val name: String) {
    fun getBrand(): String {
        when (name) {
            "chevrolet" -> {
                return "This is a Chevrolet"
            }

            "toyota" -> {
                return "This is a Toyota"
            }

            else -> {
                return "Unknown Brand"
            }
        }
    }
}


interface Car2{
    fun getBrand(): String
}

class Chevrolet: Car2{
    override fun getBrand(): String {
        return "This is a Chevrolet"
    }
}

class Toyota: Car2{
    override fun getBrand(): String {
        return "This is a Toyota"
    }

}