package Aquarium

fun main (args: Array<String>) {

//    buildAquarium()

    buildSimpleSpice()
}

fun buildAquarium() {



    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}" +
            "\nWidth: ${myAquarium.width}" +
            "\nHeight: ${myAquarium.height}" )


    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm.")

    println("Volume: ${myAquarium.volume} liters.")

}

fun buildSimpleSpice() {

    val spice = Spice(name = "String")

    println("${spice.name} ${spice.spices1}")

}