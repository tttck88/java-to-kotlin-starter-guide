package com.lannstark.lec04

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L);

    if (money1 > money3) {
        println("Money1이 Money3보다 금액이 큽니다.")
    }

    println(money1 == money2)
    println(money1 === money2)


}