package br.com.alura.alugames.services

import br.com.alura.alugames.model.InfoGame
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class UseApi {

    fun searchGame(id: String): InfoGame {

        val address = "https://www.cheapshark.com/api/1.0/games?id=$id"
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(address))
            .build()
        val response = client
            .send(request, HttpResponse.BodyHandlers.ofString())
        var stringJson = response.body()
        val gson = Gson()
        val array = ArrayList<String>()

        if (stringJson.equals(array.toString())) {
            var mockJson = null
            stringJson = Gson().toJson(mockJson)
        }

        var myInfoGame = gson.fromJson(stringJson, InfoGame::class.java)

        return myInfoGame
    }
}