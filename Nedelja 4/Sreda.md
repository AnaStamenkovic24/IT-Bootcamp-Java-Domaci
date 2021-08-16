# Nedelja IV [Sreda]
1. **Karatisti**<br>
Napraviti klasu za Karatistu. Ta klasa sadrzi naredna privatna polja:
- String ime; Ime karatiste
- int godine; Kolko karatista ima godina
- String rang; Koji je njegov rang. Rangovi u karateu ide od 10Kyu, 9Kyu, ..., 1kyu, 1Dan, 2Dan, ..., 10Dan
- String[] kata; Lista karate formi
<br>
Napraviti gettere i setter za sve ove atribute, ali paziti na validnost polja!<br>
Napraviti metod napadni(int index), koja za prosledjeni indeks ispisuje poruku: "Karatista {ime} napada sa {kata[index]} katom".<br>
Napraviti metod vatreniNapad(), koja ispisuje istu poruku kao i napadni() metod, osim sto bira nasumicnu katu.<br>
Napraviti metod log() koji ispisuje narednu prouku: "Karatistia: {ime], {godine}, {rang} - zna naredne kate {kata}"
