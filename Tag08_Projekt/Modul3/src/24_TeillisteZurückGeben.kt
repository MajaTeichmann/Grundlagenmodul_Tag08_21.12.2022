fun main(){
    var bestenListe = listOf("Lisa", "Marko", "Sebastian", "Marie", "Florian", "Henrik", "Lillie", "Martin")
    // TODO : Schreibe eine main Funktion die zwei Zahlen als Eingaben vom Benutzer entgegennimmt.
    // TODO : Die zwei Eingaben sollen als Idizes gewertet und für Anfang und Ende einer Teilliste der bestenListe stehen. (erstelle diese Teilliste) Tipp : <Listenname>.slice() .
    // TODO : Die Teilliste soll über einen println() befehl ausgegeben werden.


    println("Nenne mir eine Zahl!")
    var ersteZahl = readln().toInt()
    //println("Du hast folgende Zahl eingegeben: ${ersteZahl}.")



    println("Nenne mir noch eine Zahl!")
    var zweiteZahl = readln().toInt()
    //println("Du hast folgende Zahl eingegeben: ${zweiteZahl}.")

   var teilListeBestenListe = bestenListe.slice(ersteZahl..zweiteZahl)
        println(teilListeBestenListe)









}
