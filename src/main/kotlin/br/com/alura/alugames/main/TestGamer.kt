package br.com.alura.alugames.main

import br.com.alura.alugames.model.Gamer

fun main() {
    val gamer1 = Gamer("Galaxy", "galaxy@gmail.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Mickey",
        "mickey@mouse.com",
        "01/01/1901",
        "ratim")

    println(gamer2)

    gamer1.let {
        it.birthDate = "30/04/2000"
        it.user = "galaxy"

    }.also {
        println(gamer1.internalId)
    }

    println(gamer1)
    gamer1.user = "netinho"
    println(gamer1)
}