<h1>Head or Tail - Fej vagy írás</h1>
<h2>Informatika érettségi emelt szintű feladat: 2015. október</h2> 
<p>Ha egy szabályos pénzérmét feldobunk, ugyanannyi a valószínűsége annak, hogy leesés után az érme értéke lesz felül (írás, I), mint annak, hogy a címert tartalmazó másik oldala (fej, F). Ezért gyakran „pénzfeldobással” sorsolnak, például így döntik el, hogy melyik csapat kezdhet el egy futballmeccset.</p>
<p>Feladata a pénzfeldobás szimulálása, illetve pénzfeldobással kapott sorozatok elemzése lesz. A feladatok során az írást az I, a fejet az F nagybetű jelzi. Például egy 5 feldobásból álló sorozat esetén:</p>
<pre>
I
I
F
I
F
</pre>
<p>Készítsen programot <code>fejvagyiras</code> néven a következő feladatok megoldására! A program futása során a képernyőre való kiíráskor, illetve az adatok billentyűzetről való beolvasásakor utaljon a feladat sorszámára és a kiírandó, illetve bekérendő adatra! Az ékezetmentes kiírás is elfogadott.</p>
<ol>
<li>Szimuláljon egy pénzfeldobást, ahol azonos esélye van a fejnek és az írásnak is! Az eredményt írassa ki a képernyőre a mintának megfelelően!</li>
<li>Kérjen be a felhasználótól egy tippet, majd szimuláljon egy pénzfeldobást! Írassa ki a képernyőre a felhasználó tippjét és a dobás eredményét is, majd tájékoztassa a felhasználót az eredményről következő formában: „<code>Ön eltalálta.</code>” vagy „<code>Ön nem találta el.</code>”!</li>
<p>A <code>kiserlet.txt</code> állományban egy pénzfeldobás-sorozat eredményét találja. Mivel a sorozat hossza tetszőleges lehet, ezért az összes adat memóriában történő egyidejű eltárolása nélkül oldja meg a következő feladatokat! Feltételezheti, hogy egymilliónál több adata nem lesz.</p>
<li>Állapítsa meg, hány dobásból állt a kísérlet, és a választ a mintának megfelelően írassa ki a képernyőre!</li>
<li>Milyen relatív gyakorisággal dobtunk a kísérlet során fejet? (A fej relatív gyakorisága a fejet eredményező dobások és az összes dobás hányadosa.) A relatív gyakoriságot a mintának megfelelően két tizedesjegy pontossággal, százalék formátumban írassa ki a képernyőre!</li>
<li>Hányszor fordult elő ebben a kísérletben, hogy egymás után pontosan két fejet dobtunk? A választ a mintának megfelelően írassa ki a képernyőre! (Feltételezheti, hogy a kísérlet legalább 3 dobásból állt.)<br />
Például az IFFFFIIFFIFFFIFF sorozatban kétszer fordult elő, hogy egymás után pontosan két fejet dobtunk.</li>
<li>Milyen hosszú volt a leghosszabb, csak fejekből álló részsorozat? Írassa ki a választ a képernyőre a mintának megfelelően, és adja meg egy ilyen részsorozat első tagjának helyét is! (A minta tagjainak számozását eggyel kezdjük.)</li>
<p>Sokan azt hiszik, hogy ha már elég sok fejet dobtunk, akkor a következő dobás nagyobb valószínűséggel lesz írás, mint fej. Ennek ellenőrzésére vonatkozik a következő feladat.</p>
<li>Állítson elő és tároljon a memóriában 1000 db négy dobásból álló sorozatot! Számolja meg, hogy hány esetben követett egy háromtagú „tisztafej” sorozatot fej, illetve hány esetben írás! Az eredményt írassa ki a <code>dobasok.txt</code> állományba úgy, hogy az első sorba kerüljön az eredmény, a második sorban pedig egy-egy szóközzel elválasztva, egyetlen sorban szerepeljenek a dobássorozatok! <br />
Például:<br />
<pre>
FFFF: 12, FFFI: 14
FIFI IIIF IFIF IIII FFII FFFF IIFI FFII FFFI …
</pre>
</li>
</ol>
<hr>
<h3>Források:</h3>
<li><a href="https://www.oktatas.hu/bin/content/dload/erettsegi/feladatok_2015osz_emelt/e_inf_15okt_fl.pdf">Feladatlap</a>
<li><a href="https://www.oktatas.hu/bin/content/dload/erettsegi/feladatok_2015osz_emelt/e_inffor_15okt_fl.zip">Forrásállományok</a>


