package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val person = Person("최태현", 100)
    println("이름 : ${person.name}")

    val name = "최태현"

    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
//        val person = obj as Person
//        println(person.age)
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}