# Analiza Codului din Branch-ul Main

## Structura Proiectului

Branch-ul `main` conține **5 fișiere Java** care formează nucleul jocului:

1. **MyWorld.java** - Lumea principală a jocului
2. **Character.java** - Clasa de bază pentru toate personajele
3. **Pirate.java** - Clasa pentru pirați (are două implementări în același fișier)
4. **Question.java** - Clasa pentru întrebări
5. **ArtIslandQuestions.java** - Banca de întrebări pentru insula artei

## Ce Face Fiecare Fișier

### 1. MyWorld.java - Lumea Principală

**Funcția principală**: Creează și gestionează lumea jocului (600x400 pixeli)

**Ce face:**
- Creează un pirat principal la coordonatele (300, 200)
- Afișează mesajul "Welcome to Art Island!"
- Rulează metoda `runArtIsland()` care:
  - Obține întrebări de artă din QuestionBank (dar această clasă lipsește!)
  - Pentru fiecare întrebare:
    - Cere răspunsul jucătorului folosind `Greenfoot.ask()`
    - Dacă răspunsul e corect: adaugă 10 puncte și 5 monede
    - Dacă răspunsul e greșit: afișează răspunsul corect
  - La final afișează scorul și monetele
- Adaugă 3 pirați suplimentari la poziții aleatorii

**PROBLEMĂ**: Codul încearcă să folosească clasa `QuestionBank` care nu există în repository!

### 2. Character.java - Clasa de Bază pentru Personaje

**Funcția principală**: Clasa părinte pentru toate personajele din joc

**Proprietăți:**
- `speed` - viteza personajului
- `health` - viața personajului
- `name` - numele personajului

**Metode importante:**
- `move()` - mișcare (trebuie suprascrisă în subclase)
- `checkBoundaries()` - verifică dacă personajul a ajuns la margine și îl elimină
- `takeDamage(int damage)` - primește damage și elimină personajul dacă `health <= 0`
- `removeSelf()` - elimină personajul din lume

### 3. Pirate.java - Clasa Piratului

**PROBLEMĂ MAJORĂ**: Acest fișier conține DOUĂ clase diferite cu același nume!

#### Prima implementare (liniile 6-36):
- Moștenește `Actor` direct (nu `Character`)
- Are `score` și `coins`
- Metode simple: `addScore()`, `addCoins()`, `getScore()`, `getCoins()`

#### A doua implementare (liniile 42-101):
- Moștenește `Character`
- Are `attackPower` = 15
- Constructorul primește un `name` și setează health=100, speed=3
- Creează o imagine simplă (cerc maro cu litera "P")
- Mișcare aleatorie: schimbă direcția random și se mișcă
- Metodă `attack()` care face damage unui alt personaj

**CONFLICTUL**: Java nu permite două clase cu același nume în același fișier. Codul nu va compila!

### 4. Question.java - Clasa pentru Întrebări

**Funcția principală**: Reprezentă o întrebare cu multiple răspunsuri acceptabile

**Caracteristici:**
- `prompt` - textul întrebării
- `acceptableAnswers` - listă de răspunsuri corecte
- Metoda `normalize()` care:
  - Elimină spațiile albe
  - Transformă în lowercase
  - Elimină diacriticele (ă, â, î, ș, ț)
  - Elimină caracterele speciale
- `isCorrect(answer)` - verifică dacă răspunsul e corect comparând cu lista normalizată
- `getPrimaryAnswer()` - returnează primul răspuns acceptabil

### 5. ArtIslandQuestions.java - Banca de Întrebări pentru Artă

**Funcția principală**: Conține 20 de întrebări despre artă

**Structura:**
- **10 întrebări multiple choice** (A, B, C, D)
  - Exemple: "Ce este arta?", "Cine a pictat Mona Lisa?", "Ce sunt culorile primare?"
  - Fiecare are opțiuni, răspuns corect (A/B/C/D), și un hint
  
- **10 întrebări cu răspuns scris**
  - Exemple: "Ce curent artistic se concentrează pe emoții?", "Ce tehnică folosește pete rapide de culoare?"
  - Fiecare are răspunsuri posibile, hints, și răspunsul corect

**Metoda principală:**
- `getRandomQuestionSet()` - generează un set aleatoriu de:
  - 2 întrebări multiple choice
  - 2 întrebări cu răspuns scris
  - Total: 4 întrebări per set

**Clase interne:**
- `MultipleChoiceQuestion` - pentru întrebări tip test
- `WrittenAnswerQuestion` - pentru întrebări cu răspuns liber
- `QuestionSet` - conține un set de întrebări

## PROBLEME MAJORE GĂSITE ÎN COD

### 1. **Duplicate Class Definition** (Pirate.java)
Fișierul `Pirate.java` conține două implementări diferite ale clasei `Pirate`. Acest lucru va cauza o eroare de compilare în Java.

### 2. **Missing Class** (QuestionBank)
`MyWorld.java` încearcă să folosească clasa `QuestionBank` care nu există:
```java
QuestionBank bank = new QuestionBank();
List<Question> questions = bank.getArtQuestions();
```

### 3. **Incompatibilitate între clase**
- `MyWorld` așteaptă o listă de tip `Question` de la `QuestionBank`
- `ArtIslandQuestions` oferă `MultipleChoiceQuestion` și `WrittenAnswerQuestion`
- Aceste tipuri nu sunt compatibile!

## CONCLUZIE

Codul din branch-ul `main` are **structura de bază a unui joc educațional**, dar conține **erori critice** care împiedică compilarea și rularea:

1. ❌ Clasa `Pirate` este definită de două ori
2. ❌ Clasa `QuestionBank` lipsește complet
3. ❌ Tipurile de întrebări nu se potrivesc între `MyWorld` și `ArtIslandQuestions`

**Pentru a funcționa**, codul ar trebui să:
- Aleagă o singură implementare pentru `Pirate`
- Creeze clasa `QuestionBank` sau să modifice `MyWorld` să folosească `ArtIslandQuestions`
- Unifice sistemul de întrebări

Jocul **intenționează** să fie un quiz educațional despre artă, unde jucătorul răspunde la întrebări pentru a câștiga puncte și monede, iar pirați suplimentari apar în lume după completarea quiz-ului.
