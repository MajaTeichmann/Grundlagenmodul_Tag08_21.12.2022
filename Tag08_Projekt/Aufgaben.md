
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Listen</h3>
<br>


#### Beschreibung:

Willkommen zurück zur Übung! Diese Woche habt ihr euch hauptsächlich mit Listen
beschäftigt. In dieser Übung sollst du dich noch mal mit Listen und ihren Funktionen auseinandersetzen.

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Listen → Implementieren: MutableList → Leere MutableList Anlegen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.rnkrupmdex9l)
  - [Handbuch: Listen → Implementieren: MutableList → MutableList mit Initialwerten anlegen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.a0uhrr4g8znt)
  - [Handbuch: Listen → Implementieren: MutableList → Wert in MutableList bei Index ändern](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.x824jd5wl02t)
  - [Handbuch: Listen → Implementieren: MutableList → Wert am Ende einer MutableList hinzufügen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.l7mcm833lw5z)
  - [Handbuch: Listen → Implementieren: MutableList → Wert am Ende einer MutableList löschen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.6nibucoip94h)
  - [Handbuch: Listen → Implementieren: MutableList → Wert am Anfang einer MutableList hinzufügen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.gxxh4ht0vvj2)
  - [Handbuch: Listen → Implementieren: MutableList → Wert am Anfang einer MutableList löschen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.tq5bvfkztr4m)
  - [Handbuch: Listen → Implementieren: MutableList → MutableList leeren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.ibr3tm47jcm9)
  - [Handbuch: Variablen & Datentypen → Nachschlagen → Best Practices: Name für Variable entwerfen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.pjn1yqerf4yj)
  - [Handbuch: Listen → Verstehen → Listen (Lists)](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.1x11k6ax0umf)

---

<details>
<summary ><b>
<h style="color:#997788;">Modul 1 - 
Wiederholung - Listen entwerfen 
</h></b></summary>


---

<details>
<summary> <b> Aufgabe 1 - Leere MutableList anlegen </b> </summary>

Deine erste Aufgabe ist es eine leere MutableList anzulegen.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *1_LeereMutableListAnlegen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 2 - MutableList mit Initialwerten anlegen </b> </summary>

In dieser Aufgabe sollst du erneut eine MutableList anlegen und initial mit Werten füllen. Wir
stellen uns vor wir schreiben eine Liste für ein Kochrezept und möchten die folgenden
Zutaten in der Liste speichern: “Milch”, “Zucker” und “Eier”.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *2_MutableListMitInitialwertenAnlegen.kt*

</details>

---


<details>
<summary> <b> Aufgabe 3 - Name für Liste entwerfen I </b> </summary>

In dieser Aufgabe sollst du einer Liste einen Namen geben welche Ortsvorwahlen
abspeichert. Gib der Liste einen passenden, ansprechenden Namen welcher den Best
Practices folgt.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *3_NameFuerListeEntwerfen1.kt*

</details>

---


<details>
<summary> <b> Aufgabe 4 - Name für Liste entwerfen II </b> </summary>

In dieser Aufgabe sollst du einer Liste einen Namen geben welche Automarken abspeichert.
Gib der Liste einen passenden, ansprechenden Namen welcher den Best Practices folgt.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *4_NameFuerListeEntwerfen2.kt*

</details>

---


<details>
<summary> <b> Aufgabe 5 - Name für Liste entwerfen III </b> </summary>

In dieser Aufgabe sollst du einer Liste einen Namen geben welche die Zahlen von 0 bis 9
speichert. Gib der Liste einen passenden, ansprechenden Namen welcher den Best
Practices folgt.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *5_NameFuerListeEntwerfen3.kt*

</details>

---

<details>
<summary> <b> Aufgabe 6 - Liste entwerfen (List / MutableList) </b> </summary>

Hier ist deine Aufgabe eine Liste zu entwerfen welche Postleitzahlen speichert und
nachträglich nicht geändert werden soll. Die Liste soll initial die Werte 94032, 13593, 21097
enthalten. Überlege dir, welcher der Listen-Typen, die du diese Woche kennengelernt hast
sich am Besten dafür eignen könnten.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *6_ListeEntwerfen_1.kt*

</details>

---

<details>
<summary> <b> Aufgabe 7 - Liste entwerfen (List / MutableList) </b> </summary>

Hier ist deine Aufgabe eine Liste zu entwerfen welche Vornamen abspeichert und zu
welcher nachträglich noch weitere Namen hinzugefügt werden können. Die Liste soll initial
die Werte “Mario”, “Friedrich” und “Anna” enthalten. Überlege dir, welcher der Listen-Typen,
die du diese Woche kennengelernt hast sich am Besten dafür eignen könnten.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *7_ListeEntwerfen_2.kt*

</details>

---

<details>
<summary> <b> Aufgabe 8 - Liste entwerfen (List / MutableList) </b> </summary>

Hier ist deine Aufgabe eine Liste zu entwerfen welche Tasks beim Entwickeln eines kleinen
Programms abspeichert und nachträglich nicht mehr geändert werden soll. Die Liste soll
initial die Werte “Programmieren”, “Bugs fixen” und “Committen” enthalten.
Überlege dir, welcher der Listen-Typen, die du diese Woche kennengelernt hast sich am Besten dafür
eignen könnten.

**Modul für die Aufgabe:** *Modul1*  
**Datei für die Aufgabe:** *8_ListeEntwerfen_3.kt*

</details>


</details>

---

<details>
<summary> <b>
<h style="color:#997788;">
Modul 2 - Übung - Listenmanipulation
</h>
</b>
</summary>

---

<details>
<summary> <b> Aufgabe 9 - Wert in MutableList bei Index ändern </b> </summary>

In dieser Aufgabe hast du eine MutableList mit Werten (verschiedene Obstsorten) gegeben
und sollst einen Wert an einer bestimmten Stelle verändern. Bitte ersetze den Wert in der
Liste an Stelle “1” durch “Äpfel”.

**Modul für die Aufgabe:** *Modul2*  
**Datei für die Aufgabe:** *9_WertInMutableListBeiIndexAendern.kt*

</details>

---

<details>
<summary> <b> Aufgabe 10 - Wert am Anfang einer MutableList hinzufügen </b> </summary>

In dieser Aufgabe hast du erneut eine MutableList mit Werten zu Obstsorten gegeben und
sollst den Wert “Kirschen” am Anfang der MutableList hinzufügen.

**Modul für die Aufgabe:** *Modul2*  
**Datei für die Aufgabe:** *10_WertAmAnfangEinerMutableListHinzufuegen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 11 - Wert am Ende einer MutableList löschen </b> </summary>

In dieser Aufgabe hast du erneut eine MutableList mit Werten zu Obstsorten gegeben und
sollst den letzten Wert am Ende der MutableList mit genau einer Anweisung löschen.

**Datei für die Aufgabe:** *11_WertAmEndeEinerMutableListLoeschen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 12 - Wert am Anfang einer MutableList hinzufügen </b> </summary>

In dieser Aufgabe hast du erneut eine MutableList mit Werten zu Obstsorten gegeben und
sollst diesmal den Wert “Kirschen” am Anfang der MutableList hinzufügen.

**Modul für die Aufgabe:** *Modul2*  
**Datei für die Aufgabe:** *12_WertAmAnfangEinerMutableListHinzufuegen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 13 - Wert am Anfang einer MutableList löschen </b> </summary>

In dieser Aufgabe hast du eine MutableList mit Werten gegeben und sollst den ersten Wert
am Anfang der MutableList löschen.

**Modul für die Aufgabe:** *Modul2*  
**Datei für die Aufgabe:** *13_WertAmAnfangEinerMutableListLoeschen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 14 - MutableList leeren </b> </summary>

In dieser Aufgabe hast du eine MutableList mit Werten gegeben und sollst die Liste komplett
mit nur einer Anweisung leeren.

**Modul für die Aufgabe:** *Modul2*  
**Datei für die Aufgabe:** *14_MutableListLeeren.kt*

</details>


</details>

---

<details>
<summary>
<h style="color:#997788;">
<b>Modul 3 - Übung - Listefunktionen II</b>
</h>
</summary>


---

<details>
<summary> <b> Aufgabe 15 - Index finden  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *15_IndexFinden.kt*

</details>

---

<details>
<summary> <b> Aufgabe 16 - Index finden bei gleichen Elementen  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *16_IndexVomLetztenAuftauchen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 17 - Integer sortieren  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *17_IntSortieren.kt*

</details>

---

<details>
<summary> <b> Aufgabe 18 - String sortieren  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *18_StringSortieren.kt*

</details>

---

<details>
<summary> <b> Aufgabe 19 - Liste mischen  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *19_ListeMischen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 20 - Prüfen, ob sich ein Element in der Liste befindet  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *20_BefindetSichElementInListe.kt*

</details>

---

<details>
<summary> <b> Aufgabe 21 - Prüfen, ob sich mehrere Elemente in der Liste befinden  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *21_BefindenSichElementeInListe.kt*

</details>

---

<details>
<summary> <b> Aufgabe 22 - Mehrere Elemente in Liste hinzufügen  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *22_MehrereElementeHinzufügen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 23 - Bestimmte Elemente aus der Liste behalten  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *23_BehalteBestimmteElemente.kt*

</details>


---


<details>
<summary> <b> Aufgabe 24 - Bestimmten zusammenhängenden Teil einer Liste zurückgeben  </b> </summary>

Aufgabenstellung im Kommentar der Aufgabe.

**Modul für die Aufgabe:** *Modul3*  
**Datei für die Aufgabe:** *24_TeillisteZurückGeben*

</details>
</details>
