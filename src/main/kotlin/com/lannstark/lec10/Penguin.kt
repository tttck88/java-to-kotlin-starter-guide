package com.lannstark.lec10

class Penguin (
    species : String
) : Swimable, Flyable {

    private val wingCount: Int = 2

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}