fun main() {
    /*
        Wir haben eine Liste mit Namen und wollen wissen, ob sich die Namen "Jimmy" und "Chuck" in der Liste befinden.
        Erstelle eine neue Boolean-Variable, die uns zeigt, ob sich diese Namen in der Liste befinden.
        Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var names: MutableList<String> = mutableListOf("Jimmy", "Hank", "Jesse", "Walter", "Marie", "Skyler")
    val namesAreInList: List<String> = listOf("Jimmy", "Chuck") // Ihr könnt diese Liste als Hilfsmittel verwenden
    //TODO füge hier deinen Code ein

    var abfrage = names.containsAll(namesAreInList)

    println("Behauptung: Beide gesuchten Namen befinden sich in der gewählten Liste. \n Ergebnis: ${abfrage}.")

}