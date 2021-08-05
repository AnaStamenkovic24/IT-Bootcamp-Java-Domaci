# Nedelja 2 [Nedelja]

1. **Tekuci racuni**<br>
  Privredna komora Srbije zeli da napravi program koji proverava da li su uneti racuni validni i da ispise koliko ima novca na tim racunima.<br>
  Prilikom pokretanja programa unosi se koliko ce racuna biti obradjeno. Zatim se unose niske oblika "bbb-rrrr-kk", gde je<br>
  - bbb - trocifren broj banke
  - rrrr - cetvorocifren broj racuna
  - kk - dvocifren kontrolni broj
  Potrebno je da se naprave tri niza tipa int, "brojBanke", "brojRacuna", "kontrolniBroj" koji ce cuvati redom cifre tekuceg racuna.<br>
  Dakle, broj tekucih racuna je podeljen u 3 niza, tj brojevi na poziciji i su povezani za jedan isti tekuci racun (brojBanke[i], brojRacuna[i], kontrolniBroj[i])<br>
  Zatim se unosi niska sa tekucim racunom sve dok se ne unese prazna niska. Napisati funkciju koja proverava da li postoji u bazi zadati racun i funkciju koja vraca kolicinu novca sa racauna i pozivati ih za svaki unos.<br>
  
2. **Suma cifara broja, ponovo**<br>
  Korisniki unosi broj kao String. Na standardni izlaz ispisati zbir njegovih cifara. Za racunanje zbira cifara napraviti zasebnu funkciju koja vraca int.<br>
  Raditi pomocu String metode toCharArray()!<br>
 
3. **Levo Desno**<br>
  Korisnik unosi broj n koji oznacava koliko double brojeva kod treba da ocekuje. Zatim, unosi n double brojeva, pozitivnih, negativnih ili 0.0. Smestiti sve te brojeve u niz, tako da idu prvo svi negativni, pa onda sve 0.0, pa tek onda svi pozitivni brojevi (brojevi nemoraju da budu sortirani). Napraviti zasebnu funkciju koja smesta brojeve na njihove odgovarajuce lokacije u nizu i zasebnu funkciju koja ispisuje ceo niz.<br>
  
4. **Parovi**<br>
  Korisnik unosi niz pozitivnih celih brojeva cija je duzina paran broj. Napraviti funkciju koja vraca novi niz ciji su elementi zbir parova uzastopnih elemenata starog niza.<br>
  Dakle, 0. element novog niza je jednak zbiru 0. i 1. elmenta starog niza, 1. element novog niza je jednak zbiru 2. i 3. elementa novog niza, itd.<br>
