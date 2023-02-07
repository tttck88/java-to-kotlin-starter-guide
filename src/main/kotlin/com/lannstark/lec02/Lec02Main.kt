package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main() {
    var str : String? = "ABC"
    // null이 올 수 있기에 함수 호출이 안됌
    // println(str.length)

    // safe call
    // null이 아니면 실행하고, null이면 실행하지 않는다(그대로 null)
    println(str?.length)

    // Elvis 연산자
    // 앞의 연산결과가 null이면 뒤의 값을 실행
    println(str?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean? {
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    // null이 들어오면 NPE가 나오기 때문에
    // 정말 null이 아닌게 확실한 경우에만 널 아님 단언!!을 사용해야 한다.
    return str!!.startsWith("A")
}