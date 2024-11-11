package org.example

import com.google.gson.annotations.SerializedName

class Game(@SerializedName("title") val title:String,
           @SerializedName("thumb") val cover:String) {
    val description = ""

    override fun toString(): String {
        return "Meu jogo:\n" +
                "Titulo: $title \n" +
                "Capa: $cover \n" +
                "Descricao: $description"
    }


}