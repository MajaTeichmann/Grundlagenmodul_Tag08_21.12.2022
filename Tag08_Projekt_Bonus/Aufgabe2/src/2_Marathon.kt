fun main() {
    /*
    Szenario: Wir wollen einen Marathon veranstalten und vergeben dafür 20 Plätze.
    Die Startnummern werden zufällig an die Läufer verteilt.
    Es haben sich schon 15 Personen angemeldet.

    Hinweis:
    Der Index von beiden Listen (startNumbers, runners) teilt den jeweiligen Läufer die entsprechende Startnummer zu.

    Beispiel: "Eric" (runners[0]) hat die Startnummer 1 (startNumbers[0]) "Randy" (runners[1])
    hat die Startnummer 2 (startNumbers[1]) usw.
     */
    var startNumbers: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    var runners: MutableList<String> = mutableListOf(
        "Eric",
        "Randy",
        "Sheila",
        "Jimmy",
        "Kyle",
        "Sharon",
        "Stan",
        "Bebe",
        "Kenny",
        "Liane",
        "Leopold",
        "Heidi",
        "Gerald",
        "Carol",
        "Stuart"
    )

    // todo: Verteile die Startnummern erneut, diesmal zufällig.
    //  Bringe dazu die Liste startNumbers in eine neue zufällige Reihenfolge.
    println(startNumbers)
    var gemischteStartNummern = startNumbers.shuffled()
    println(gemischteStartNummern)

    /*
    Weitere Läufer wollen teilnehmen.
    todo: Füge die Teilnehmer unserer Liste runners mit nur einem Befehl hinzu.
    Neue Teilnehmer:
    - Timmy
    - Wendy
    - Ike
    - Herbert
    - Jimbo
     */
    runners.addAll("Timmy","Wendy","Ike","Herbert","Jimbo")

    //todo: Ergänzt den Text um weitere Läufer und fügt die Anzahl an Läufer hinzu.
    val anzahlTeilnehmer = startNumbers.addAll(21,22,23,24,25,26)
    runners.addAll("Tim","Tom","Torben")
    println("Das Rennen beginnt mit $anzahlTeilnehmer Teilnehmern. ${runners[0]} trägt dabei die Nummer ${startNumbers[0]}")


    /*
    Leider können nicht alle das Rennen beenden.
    Die folgenden Läufer beenden den Marathon vorzeitig:
    - Eric
    - Kenny
    - Bebe
    Entferne die 3 Läufer aus der Liste runners.
    Tipp: Das Entfernen der Teilnehmer lässt sich in einem Schritt erledigen.
     */
    //todo: Entferne die Läufer aus der Liste
    runners.removeAll("Eric","Kenny","Bebe")

    // überprüfe dein Ergebnis
    println(runners)

    /*
    Es wurde die Zeit jedes Teilnehmers gestoppt. Die Zeiten befinden sich in der Liste time.
    Da nur 17 Läufer das Rennen beendet haben, gibt es nur 17 Messungen.
    Auch hier ist der erste Index für den ersten Läufer und die Zeit ist in Stunden.
    "Randy" hat den Marathon also in 5 Stunden und 1 Minuten abgeschlossen.
     */
    val time: MutableList<Double> = mutableListOf(
        5.01, 5.59, 7.00, 4.35, 4.58, 3.44, 5.22, 4.20, 6.12, 3.49,
        5.35, 6.27, 5.33, 4.34, 3.51, 4.19, 4.14
    )

    /*
    Um die Aufgabe etwas schwieriger zu machen werden die Zeiten nochmal gemischt.
    Das bedeutet jeder Teilnehmer des Rennens bekommt eine neue Zeit zugeteilt.
    Stellt euch vor, das Rennen wird jedes Mal neu gelaufen,
    sobald ihr auf run drückt und die Teilnehmer sind pro durchlauf mal besser oder schlechter.
    Dadurch soll verhindert werden, dass ihr einfach in die Liste guckt um zu sehen an welcher Postion
    z.B. der schnellste Läufer war. Falls die Aufgabe zu schwer ist kommentiert die Zeile einfach aus.

    //TODO Zeile auskommentieren falls die Aufgabe zu schwer ist
    time.shuffle()

    //TODO erstellt eine Variable in der steht wer für den Marathon am längsten Gebraucht hat.
    println(slowestRunner)

    //TODO Verändere den Text damit die Person mit der langsamsten Zeit erwähnt wird. Ihr könnt auch weitere Läufer mit den entsprechenden Zeiten erwähnen.
    println(" $slowestRunner hat mit TODO std am längsten für den Marathon gebraucht.")*/

    /*
        Am Ende soll es noch eine Siegerehrung geben.
        Die 3 Läufer mit den besten Zeiten sollen eine Medaille erhalten.
        In der Variable sortedTime befinden sich die Zeiten in aufsteigender Abfolge:
        [3.44, 3.49, 3.51, 4.14, 4.19, 4.2, 4.34, 4.35, 4.58, 5.01, 5.22, 5.33, 5.35, 5.59, 6.12, 6.27, 7.0]
        Die schnellsten 3 Zeiten befinden sich dementsprechend in sortedTime[0] , sortedTime[1] und sortedTime[2].
        Die Liste time ist immer noch gemischt.
        Versucht mit diesen Informationen die Läufer zu finden, die am schnellsten waren.
    */
    val sortedTime: MutableList<Double> = time.sorted().toMutableList()

    //TODO Verändere die Liste runners so, dass sich nur noch die Läufer mit den 3 besten Zeiten in der Liste befinden
    // und füge die entsprechenden Werte in den Text ein.

    println("Die Bronzemeddaille geht an: \n" +
            "Die Silbermedaille geht an: \n" +
            "Die Goldmedaille geht an: " )
}
