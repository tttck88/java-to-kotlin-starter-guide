package com.lannstark.lec08

fun main() {
//    repeat("Hello World", 3, false)
    repeat("Hello World", useNewLine = false)
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
}

fun max2(a: Int, b: Int) = if (a > b) a else b

