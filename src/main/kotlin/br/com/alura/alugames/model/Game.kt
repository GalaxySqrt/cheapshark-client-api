package br.com.alura.alugames.model

data class Game(val title:String,
           val cover:String) {
    var description:String? = ""
    override fun toString(): String {
        return "Meu jogo:\n" +
                "Titulo: $title \n" +
                "Capa: $cover \n" +
                "Descricao: $description"
    }
}