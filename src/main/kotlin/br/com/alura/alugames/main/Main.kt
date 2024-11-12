package br.com.alura.alugames.main

import br.com.alura.alugames.model.Game
import br.com.alura.alugames.model.InfoGame
import br.com.alura.alugames.services.UseApi
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Digite um codigo de jogo para buscar:")
    val search = scanner.nextLine()

    val searchApi = UseApi()
    var informationGame: InfoGame? = null
    var myGame: Game? = null

    val result = runCatching {
        informationGame = searchApi.searchGame(search)
    }

    result.onSuccess {
        if (informationGame != null) {
            myGame = Game(
                informationGame.info.title ,
                informationGame.info.thumb
            )
        }
        print(myGame)
    }

    result.onFailure {
        print("Jogo nao encontrado. Tente outro ID")
    }

}
