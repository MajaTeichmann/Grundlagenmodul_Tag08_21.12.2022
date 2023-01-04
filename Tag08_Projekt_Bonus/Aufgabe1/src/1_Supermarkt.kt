fun main() {

    /*
    Erstelle eine Liste aus Strings, die Namen für verschiedene Artikel enthält.
    Die Liste soll veränderbar sein und initial (am Anfang) so aussehen:
    ["Pizza", "Kürbis", "Schokolade", "Banane", "Apfelsaft"]
     */
    var artikelNamen = mutableListOf<String>("Pizza","Kürbis","Schokolade","Banane","Apfelsaft")

    /*
    Erstelle eine Liste aus Doubles, die Preise für verschiedene Artikel enthält.
    Die Liste soll veränderbar sein und initial so aussehen:
    [3.45, 9.99, 0.99, 1.49, 4.69]
    Artikel "Pizza" kostet 3,45€,
    Artikel "Kürbis" kostet 9,99€, usw.
     */
    var artikelPreise = mutableListOf<Double>(3.45,9.99,0.99,1.49,4.69)

    /*
    Erstelle jetzt eine weitere Liste, diesmal jedoch aus Integern:
    [20, 15, 80, 45, 10]
    Diese Liste zeigt uns wie viele Artikel wir vom jeweiligen Produkt noch auf Lager haben.
    Wir haben also 20-mal Artikel "Pizza" für jeweils 3.45 Euro im Lager.
     */
    var artikelBestand = mutableListOf<Int>(20,15,80,45,10)

    /*
    Ein Kunde kauft jetzt 3 Kürbisse und 9 Bananen.
    Wie viel Euro muss er uns geben?
    Rechne dafür zuerst den Preis für jeden Artikel aus und addiere diese am Ende zusammen.
    Gebe das Ergebnis aus.
     */
    var index = artikelNamen.indexOf("Kürbis")
    var kuerbis = artikelNamen[index]
    println(index)
    var dreiKuerbisse = artikelPreise[index]*3

    var index2 = artikelNamen.indexOf("Banane")
    var banane = artikelNamen[index2]
    println(index2)
    var neunBananen = artikelPreise[index2]*9

    println(dreiKuerbisse)
    println(neunBananen)

    var gesamtPreis = dreiKuerbisse + neunBananen
    println("Der Gesamtpreis beträgt ${gesamtPreis}€.")

    /*
    Am Ende des Tages machen wir nochmal Inventur.
    Dafür schauen wir von welchem Artikel wir am wenigsten im Lager haben und von welchem wir am meisten haben.
    Verwende dazu die passenden Funktionen aus der Vorlesung.
     */
    println("Wir bieten folgende Artikel an: ${artikelNamen}")



    println("Wir haben am meisten ${artikelNamen.max()} (${artikelBestand.max()}) und am wenigsten ${artikelNamen.min()} (${artikelBestand.min()}).")
}