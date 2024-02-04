fun main() {
    val electrodomestic1 = Electrodomestic("Lavadora Bosch", 25, "blanc", "A", 2)
    val electrodomestic2 = Electrodomestic("Cafetera Krups", 33, "platejat", "C", 15)


    println(electrodomestic1.toString())
    println(electrodomestic2.toString())


    println("Preu final electrodomestic1: ${electrodomestic1.preuFinal()}€")
    println("Preu final electrodomestic2: ${electrodomestic2.preuFinal()}€")
}