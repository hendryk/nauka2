package lsp

object Moja extends App {
    println("Posadzili Bace na skraju")

    val double: Int => Int = _ * 2
    (1 to 10) foreach double.andThen(println)
}
