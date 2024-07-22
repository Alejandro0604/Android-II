package com.example.ejercicio7.model

class QuoteProvider {

    companion object {

        fun random(): QuoteModel{
            val position = (0 until quotes.size).random()
            return quotes[position]
        }




        private val quotes = listOf<QuoteModel>(

            QuoteModel("Si la patria es pequeña uno grande la sueña", "Ruben Darío"),
            QuoteModel(
                "El que no sabe gozar la aventura cuando le viene, no debe quejarse de se pasa",
                "Miguel de Cervantes"
            ),
            QuoteModel("El café con leche es como el café pero con leche", "Paulo Coelho"),
            QuoteModel("La sencillez es la máxima sofistificación.", "Leonardo Da Vinci")

        )
    }
}