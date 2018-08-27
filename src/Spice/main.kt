package Spice

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface CurryColor {
    val color: String
}

object YellowColor : CurryColor {
    override val color = "yellow"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus (curryColor: CurryColor = YellowColor):
        FishAction by PrintingFishAction("eat a lot of algae"),
        CurryColor by curryColor