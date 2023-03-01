package com.example.thequizzapp

object setData {

    fun getQuestion():ArrayList<QuestionData> {
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(1, 2,"Qual animal foi escolhido para a nota de 20 reais?",
            "Tartaruga",
            "Mico-leão",
            "Lobo-guará",
            "Onça-pintada"
        )
        var q2 = QuestionData(2, 4,"Qual o resultado de: 8:(10:5)-4:(2).(2) ?",
            "8",
            "4",
            "2",
            "0"
        )
        var q3 = QuestionData(3, 3,"Se a irmã do marido da mãe de Ana é tia da sua mãe, o que você é de Ana?",
            "Primo",
            "Tio",
            "Filho",
            "Irmão"
        )
        var q4 = QuestionData(4, 2,"O termo pólis veio do(a):",
            "Japão",
            "Grécia-Antiga",
            "Roma",
            "Chile"
        )
        var q5 = QuestionData(5, 1,"Catraca, caneca, casaca, cômico e careca são exemplos de:",
            "Palíndromo",
            "Substantivo composto",
            "Objeto",
            "Adjetivo"
        )

        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
}