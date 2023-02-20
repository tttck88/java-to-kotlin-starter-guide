package com.lannstark.lec16

fun main() {
    val str = "ABC"
    str.lastChar()

    3.add(4)

    3.add2(4)
    3 add2 4
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}






































