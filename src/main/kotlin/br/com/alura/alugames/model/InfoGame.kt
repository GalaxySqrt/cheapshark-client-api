package br.com.alura.alugames.model

import sun.invoke.empty.Empty

data class InfoGame(val info: InfoApiShark) {
    override fun toString(): String {
        return info.toString()
    }
}