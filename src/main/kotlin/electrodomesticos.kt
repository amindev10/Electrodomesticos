class Electrodomestic(
    private var nom: String = "",
    private var preuBase: Int = 0,
    private var color: String = "blanc",
    private var consum: String = "G",
    private var pes: Int = 5,
    private var càrrega: Int = 5,
    private var mida: Int = 28
) {
    fun preuFinal(): Int {
        var preuFinal = preuBase


        when (consum) {
            "A" -> preuFinal += 35
            "B" -> preuFinal += 30
            "C" -> preuFinal += 25
            "D" -> preuFinal += 20
            "E" -> preuFinal += 15
            "F" -> preuFinal += 10
            "G" -> preuFinal += 0
        }

        when {
            pes in 6..20 -> preuFinal += 20
            pes in 21..50 -> preuFinal += 50
            pes in 51..80 -> preuFinal += 80
            pes > 80 -> preuFinal += 100
        }


        if (càrrega in 6..10) {
            preuFinal += when (càrrega) {
                in 6..7 -> 55
                8 -> 70
                9 -> 85
                10 -> 100
                else -> 0
            }
        }


        if (mida in 29..50) {
            preuFinal += when {
                mida in 29..32 -> 50
                mida in 33..42 -> 100
                mida in 43..50 -> 150
                mida >= 51 -> 200
                else -> 0
            }
        }

        return preuFinal
    }

    override fun toString(): String {
        return when {
            càrrega > 0 -> "Rentadora: Nom=$nom, PreuBase=$preuBase, Color=$color, Consum=$consum, Pes=$pes, Càrrega=$càrrega"
            else -> "Televisió: Nom=$nom, PreuBase=$preuBase, Color=$color, Consum=$consum, Pes=$pes, Mida=$mida”"

        }
    }
}