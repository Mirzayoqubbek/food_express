package com.example.foodexpress

import kotlin.math.abs
import kotlin.math.tan
fun funksiya(x: Double): Double {
    return x * x * x - 2 * x + 2
}

fun hosila(x: Double): Double {
    return 3 * x * x - 2
}

fun nyutonusuli(funksiya: (Double) -> Double, hosilasi: (Double) -> Double, x0: Double, e: Double): Pair<Double, Int> {
    var xn = x0
    var n = 0
    while (true) {
        val fxn = funksiya(xn)
        val dfxn = hosilasi(xn)
        val xnPlus1 = xn - fxn / dfxn
        if (abs(xnPlus1 - xn) < e) {
            return Pair(xnPlus1, n)
        }
        xn = xnPlus1
        n++
    }
}


fun main() {
    val a = -2.0
    val b = -1.0
    val e = 0.000001
    val x0 = -1.0

    val (ildiz, qadamlarsoni) = nyutonusuli(::funksiya, ::hosila, x0, e)
    println("Nyuton usuli:")
    println("ildiz: $ildiz")
    println("qadamlar soni: $qadamlarsoni")
}