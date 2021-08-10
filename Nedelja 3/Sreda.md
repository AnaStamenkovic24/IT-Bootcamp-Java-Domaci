# Nedelja III [Sreda]


1. Biblord na autoputu treba da ispise poruku koja joj je prosledjena dalekovodima. Kako su dalekovodi stari, cesto u prenosu poruke dodaju karaktere '$', '#' i '@' negde u poruku.<br>
  Napisati funkciju koja ispisuje originalnu poruku, bez tih dodatih simbola. Npr "Vo$z$ite $#@pazlj@i######vo!#" -> "Vozite pazljivo!"<br>
  
2. Napisati funkciju koja transformise cenzurisane ruzne reci natrag u originalni oblik i vraca taj oblik nazad.<br>
   Funkciji se prolsedjuje niska, niz niski u kome se nalaze kljucevi i niz niski u kome se nalaze desifrovane poruke, tako da kljuc[i] -> decode[i];<br>
   Npr:<br>
   String poruka = "Jedi #$%^ !@#$!!!@# mali!"<br>
   String[] kljuc = {"#$%^", "!@#$!!!@#"}<br>
   String[] decode = {"pite", "moroncinu"}<br>
   String res = "Jedi pite moroncinu mali!" <-- ovo treba vratiti<br> 
  Ni jedan kljuc nije podstring drugog (osim samog sebe, naravno)

3. Napisati funkciju koja za prosledjeni password proverava da li je validan, tj.:<br>
  - Da li postoji barem jedno veliko slovo. (Hint: Hmm, sta je bese ono Strahinja pominjao da pogledamo osim, String i Integer klasa ?")
  - Je duzi od 8 karaktera.
  
