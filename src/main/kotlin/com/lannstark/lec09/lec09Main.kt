package com.lannstark.lec09

import java.lang.IllegalArgumentException

fun main() {
    val person = Person("최태현", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    val person2 = Person("최태현")
}

class Person(
    val name: String
    ,var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult2: Boolean
        get() = this.age > 20

    val isAdult3: Boolean
        get() {
            return this.age >= 20
        }

    constructor(name: String): this(name, 1)
}