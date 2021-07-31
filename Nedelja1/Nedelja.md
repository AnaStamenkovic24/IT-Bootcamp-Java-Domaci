# Domaci zadatak I [Nedelja]
1. **Olimpijske medalje**<br>
	Na standardni ulaz se unose imena dva tima, a zatim i 6 celih pozitivnih brojeva koji oznacavaju broj osvojenih zlatnih, srebrnih odnosno bronzanih medalja, tim redom. 
	Prva 3 broja se odnose na prvi tim a druga tri broja na drugi tim. 
	Pobednicki tim je onaj koji ima vise osvojenih medalja, a u slucaju da oba tima imaju isto onda se gleda ko ima vise osvojenih zlatnih medalja. Ako i tada nema pobednika onda se gledaju srebrne medalje i na kraju bronzane.
	Na standarni izlazi ispisati ime pobednickog tima, a ako oba tima imaju potpuno iste medalje, ispisati nisku "Nereseno".
	| **Primer 1** |  **Primer 2**| **Primer 3** |
	|-----------------|-----------------|----------------|
	| *Input:*<br>Srbija<br>Italija<br> 3<br>5<br>3<br>4<br>1<br>2<br>*Output:* <br>Srbija| *Input:* <br>SAD<br>Japan<br>5<br>4<br>4<br>5<br>4<br>5<br>*Output:* <br>Japan|*Input:* <br>Francuska<br>Holandija<br>3<br>2<br>3<br>3<br>2<br>2<br>*Output:* <br>Francuska|
	
2. **FizzBuzz**<br>
	Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz" ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.
	| **Primer 1** | **Primer 2**|
	|--------------|-------------|
	| *Input:* <br>5<br>*Output:* <br>1: <br>2: <br>3: Fizz<br>4: <br>5: Buzz| *Input:* <br>18<br> *Output:* <br>1: <br>2: <br>3: Fizz<br>4: <br>5: Buzz<br>6: Fizz<br>7: <br>8: <br>9: Fizz<br>10: Buzz<br>11: <br>12: Fizz<br>13: <br>14: <br>15: FizzBuzz<br>16: <br>17: <br>18: Fizz|
	
3. **Prosecna vrednost**<br>
	Korisnik unosi cene proizvoda koje je kupio sve dok se ne unese 0. Na standardni izlaz ispisati prosecnu cenu proizvoda. Ukoliko korisnik unese negativnu vrednost za cenu proizvoda, onda taj unos treba zanemariti i nastaviti sa unosom.
	| **Primer 1** | **Primer 2**| **Primer 3**|
	|--------------|-------------|-------------|
	| *Input:* <br>3.5<br>3.0<br>4<br>0<br>*Output:* <br>3.5| *Input:* <br>1<br>2<br>3<br>-17<br>5<br>5<br>5<br>0<br>*Output:* <br>3.5| *Input:* <br>0<br>*Ouput:* <br>0|
	

4. **Prestupne godine**<br>
	Godina je prestupna ako je deljiva sa 4 i vazi da nije deljiva sa 100 ili je deljiva sa 400.<br>Korisnik unosi dve godine strogo vece od 0. Ispisati broj godina koje su prestupne u zadatom intervalu ukljucujuci i te dve.
	| **Primer 1** | **Primer 2** | **Primer 3** | **Primer 4** |
	|--------------|--------------|--------------|--------------|
	| *Input:* <br>1<br>400<br>*Output:* <br>97| *Input:* <br>400<br>2000<br>*Output:* <br>389| *Input:* <br>4<br>4<br>*Output:* <br>1| *Input:* <br>100<br>50<br>*Output:* <br>0|
	
5. **Skriveni broj**<br>
	Skriveni broj broja n je broj dobijen ponavljanjem postupka sabiranja svih njegovih cifara dokle god nije jednocifren. Napisati program koji za uneti celobrojni pozitivan broj racuna njegov skriven broj. Npr. skriveni broj broja 4567 je 4 jer je 4567 --> 4+5+6+7 = 22 --> 2+2 = 4; broja 9999 je 9 jer je 9999 --> 9+9+9+9 = 36 --> 3+6 = 9.
	| **Primer 1** | **Primer 2** | **Primer 3**|
	|--------------|--------------|-------------|
	| *Input:* <br>12345<br>*Output:* <br>6| *Input:* <br>244<br>*Output:* <br>1| *Input:* <br>345679<br>*Output:*<br>7|
	
6. **Jednakostranicni trougao**<br>
	Potrebno je nacrtati u konzoli pomocu znaka * jednakostranicni trougao proizvoljne duzine stranice, kao u test primerima.
	| **Primer 1**| ** Primer 2** | ** Primer 3**|
	|-------------|---------------|--------------|
	| *Input:* <br>1<br>*Output:* <br> * | *Input:* <br>2<br>*Output:* <br>&nbsp; * &nbsp;<br>* &nbsp; * <br>| *Input:* <br>6<br>*Output:* <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;* * &nbsp;&nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;&nbsp;* * * &nbsp;&nbsp;&nbsp;<br>&nbsp;&nbsp;* * * * &nbsp;&nbsp;<br>&nbsp;* * * * * &nbsp;<br>* * * * * * <br>|
