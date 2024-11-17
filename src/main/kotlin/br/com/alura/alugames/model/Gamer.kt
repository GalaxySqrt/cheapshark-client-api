package br.com.alura.alugames.model

import kotlin.random.Random

data class Gamer(var name:String, var email:String) {
    var birthDate: String? = null
    var user: String? = null
        set(value) {
            field = value
            if (internalId.isNullOrBlank()) {
                createInternalId()
            }
        }
    var internalId: String? = null
        private set

    constructor(nome: String, email: String, dataNascimento: String, usuario: String) :
            this(nome, email) {
                this.birthDate = dataNascimento
                this.user = usuario
                createInternalId()
            }

    init{
        if(name.isBlank()){
            throw IllegalArgumentException("Nome está em branco")
        }
        this.email = validateEmail()
    }

    override fun toString(): String {
        return "Gamer(nome='$name', email='$email', dataNascimento=$birthDate, usuario=$user, idInterno=$internalId)"
    }

    fun createInternalId() {
        val number = Random.nextInt(10000)
        val tag = String.format("%04d", number)

        this.internalId = "$user#$tag"
    }

    fun validateEmail(): String{
        val regex = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
        if(regex.matches(email)){
            return email
        } else{
            throw IllegalArgumentException("Email inválido")
        }
    }

}