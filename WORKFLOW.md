# Workflow Guide / Ghid de Lucru

## 🇷🇴 Română

### Cum să lucrezi cu Greenfoot și GitHub Desktop

Acest ghid te ajută să înțelegi cum să lucrezi cu proiectul și să te asiguri că modificările tale nu se pierd.

#### 📁 Structura Proiectului

Proiectul tău Greenfoot este organizat astfel:
```
PiratesGame/
├── PiratesGame/          # Folder cu codul Java
│   ├── *.java           # Fișierele tale de cod
│   ├── *.class          # Fișiere compilate (ignorate de Git)
│   ├── *.ctxt           # Fișiere Greenfoot (ignorate de Git)
│   └── project.greenfoot # Configurația proiectului Greenfoot
├── README.md            # Descrierea proiectului
└── .gitignore          # Fișiere care sunt ignorate de Git
```

#### ❓ IMPORTANT: Două Situații Diferite

**Întrebarea ta:** "Am văzut modificările pe GitHub web. Trebuie să deschid GitHub Desktop, să scriu mesaj și să dau commit și push?"

**Răspuns scurt:** **NU!** Depinde de situație:

##### 🔵 Situația 1: Modificările sunt deja pe GitHub (făcute de altcineva sau de Copilot)

**Ce vezi:** 
- Pe GitHub.com vezi fișiere noi sau modificate (cum ar fi WORKFLOW.md, QUICK_REFERENCE.md)
- Ai deschis GitHub Desktop și NU vezi fișiere în panoul "Changes"

**Ce trebuie să faci:**
1. **Pull (Descarcă) modificările:**
   - Deschide GitHub Desktop
   - Click pe **"Fetch origin"** (sus, în toolbar)
   - Dacă apare **"Pull origin"**, click pe el
   - Acum fișierele noi sunt pe computerul tău!

2. **NU trebuie să faci commit sau push!** 
   - Modificările sunt deja salvate pe GitHub
   - Tu doar le descarci pe computerul tău
   - Poți vedea fișierele în folder-ul tău local

##### 🔴 Situația 2: AI făcut TU modificări locale (în Greenfoot)

**Ce vezi:**
- Ai editat fișiere în Greenfoot Desktop
- Ai salvat cu Ctrl+S
- GitHub Desktop arată fișierele modificate în panoul "Changes"

**Ce trebuie să faci:**
1. **Verifică modificările** în GitHub Desktop
2. **Scrie mesaj de commit**
3. **Click "Commit to [branch]"**
4. **Click "Push origin"**

##### 📊 Rezumat Vizual

```
┌─────────────────────────────────────────┐
│ Ai modificări pe GitHub web?            │
│ (făcute de altcineva/Copilot)          │
└──────────────┬──────────────────────────┘
               │
               ↓
        GitHub Desktop
               │
        ┌──────┴──────┐
        │             │
    DA există      NU există
    "Pull origin"  "Pull origin"
        │             │
        ↓             ↓
   Click PULL     Totul e la zi!
        │
        ↓
   Fișierele sunt
   acum pe PC-ul tău
```

```
┌─────────────────────────────────────────┐
│ Ai editat TU fișiere în Greenfoot?      │
└──────────────┬──────────────────────────┘
               │
               ↓
        Ai salvat cu Ctrl+S?
               │
        ┌──────┴──────┐
        │             │
       DA            NU
        │             │
        ↓             ↓
   GitHub Desktop  Salvează ACUM!
        │         (apoi continuă)
        ↓
   Vezi fișiere în
   panoul "Changes"?
        │
        ↓
   Scrie mesaj commit
        │
        ↓
   Click "Commit"
        │
        ↓
   Click "Push origin"
        │
        ↓
   Modificările tale
   sunt pe GitHub!
```

#### 🔄 Workflow Complet: Greenfoot → GitHub

##### Pasul 1: Lucrează în Greenfoot Desktop

1. **Deschide proiectul:**
   - Lansează Greenfoot Desktop
   - File → Open Project
   - Navighează la folder-ul `PiratesGame/PiratesGame`
   - Selectează folder-ul și dă click pe "Open"

2. **Fă modificări:**
   - Editează clasele existente (MyWorld, Pirate, Character, ArtIslandQuestions, etc.)
   - Adaugă clase noi dacă e necesar
   - Testează codul cu butonul "Run"

3. **IMPORTANT - Salvează modificările în Greenfoot:**
   - **Ctrl+S** (sau Cmd+S pe Mac) pentru a salva clasa curentă
   - Sau: Edit → Save All pentru a salva toate fișierele
   - **Salvează des!** Nu aștepta până la final
   - Greenfoot salvează automat când compilezi, dar e mai sigur să salvezi manual

4. **Verifică că s-au salvat:**
   - Închide și redeschide clasa în Greenfoot
   - Verifică că modificările tale sunt încă acolo

##### Pasul 2: Commit în GitHub Desktop

1. **Deschide GitHub Desktop:**
   - Asigură-te că repository-ul corect este selectat (`andrabel208/PiratesGame`)

2. **Verifică modificările:**
   - Vei vedea în panoul din stânga toate fișierele modificate
   - Fiecare fișier `.java` modificat va apărea în listă
   - Click pe fiecare fișier pentru a vedea ce s-a schimbat (linii verzi = adăugate, roșii = șterse)

3. **Commit modificările:**
   - Bifează toate fișierele pe care vrei să le salvezi
   - **NU** bifa fișierele `.class` sau `.ctxt` (ar trebui să fie deja ignorate de `.gitignore`)
   - Scrie un mesaj descriptiv în câmpul "Summary", de exemplu:
     - "Adăugat întrebări noi pentru Art Island"
     - "Reparat bug în clasa Pirate"
     - "Actualizat README cu instrucțiuni"
   - Click pe **"Commit to copilot/update-art-island-questions"** (sau numele branch-ului tău)

4. **Push la GitHub:**
   - După commit, apare butonul "Push origin" în partea de sus
   - Click pe **"Push origin"** pentru a încărca modificările pe GitHub
   - Așteaptă până apare confirmarea că s-a încărcat cu succes

##### Pasul 3: Verifică pe GitHub.com

1. Du-te la: https://github.com/andrabel208/PiratesGame
2. Verifică că branch-ul tău (`copilot/update-art-island-questions`) există
3. Click pe branch și verifică că fișierele tale modificate sunt acolo
4. Acum modificările tale sunt în siguranță pe GitHub! ✅

#### ⚠️ Probleme Comune și Soluții

##### "Modificările mele au dispărut!"

**Cauze posibile:**
- Nu ai salvat în Greenfoot (Ctrl+S)
- Ai editat în alt folder
- Ai făcut undo din greșeală

**Soluție:**
1. Verifică dacă ai salvat în Greenfoot
2. Verifică în GitHub Desktop dacă modificările apar
3. Dacă ai făcut commit și push, modificările sunt sigure pe GitHub chiar dacă se pierd local

##### "Nu văd modificările în GitHub Desktop"

**Soluție:**
1. Asigură-te că ai salvat fișierele în Greenfoot (Ctrl+S)
2. În GitHub Desktop, click pe "Fetch origin" pentru a sincroniza
3. Verifică că ești în folder-ul corect (`PiratesGame`)
4. Restart GitHub Desktop dacă e necesar

##### "Am modificări pe care nu vreau să le commit"

**Soluție:**
1. În GitHub Desktop, debifează fișierele pe care nu vrei să le salvezi
2. Sau: Right-click → Discard changes (ATENȚIE: asta șterge modificările!)

#### 💡 Best Practices (Practici Recomandate)

1. **Salvează des:**
   - Ctrl+S după fiecare modificare importantă
   - Nu aștepta să termini tot pentru a salva

2. **Commit des:**
   - Fă un commit după fiecare funcționalitate completată
   - E mai bine să ai multe commit-uri mici decât unul mare

3. **Push des:**
   - După fiecare commit sau la sfârșitul zilei
   - Astfel modificările tale sunt în siguranță pe GitHub

4. **Mesaje descriptive:**
   - Scrie mesaje clare pentru commit-uri
   - Ajută să înțelegi ce ai făcut când te uiți în istoric

5. **Verifică înainte de push:**
   - Citește modificările în GitHub Desktop
   - Asigură-te că nu uiți fișiere importante

#### 🔒 Cum să Nu Pierzi Niciodată Munca

1. **Backup automat cu Git:**
   - Fiecare commit și push este un backup
   - Poți reveni oricând la versiuni anterioare

2. **Verifică History:**
   - În GitHub Desktop: History tab
   - Vezi toate modificările tale anterioare
   - Poți restaura versiuni vechi dacă e necesar

3. **Branch-uri pentru experimente:**
   - Creează un branch nou pentru funcționalități noi
   - Astfel nu afectezi codul principal

---

## 🇬🇧 English

### How to Work with Greenfoot and GitHub Desktop

This guide helps you understand how to work with the project and ensure your changes are never lost.

#### 📁 Project Structure

Your Greenfoot project is organized as follows:
```
PiratesGame/
├── PiratesGame/          # Folder with Java code
│   ├── *.java           # Your code files
│   ├── *.class          # Compiled files (ignored by Git)
│   ├── *.ctxt           # Greenfoot files (ignored by Git)
│   └── project.greenfoot # Greenfoot project configuration
├── README.md            # Project description
└── .gitignore          # Files ignored by Git
```

#### ❓ IMPORTANT: Two Different Situations

**Your question:** "I see the changes on GitHub web. Do I need to open GitHub Desktop, write a message, commit and push?"

**Short answer:** **NO!** It depends on the situation:

##### 🔵 Situation 1: Changes are already on GitHub (made by someone else or Copilot)

**What you see:**
- On GitHub.com you see new or modified files (like WORKFLOW.md, QUICK_REFERENCE.md)
- You open GitHub Desktop and DON'T see files in the "Changes" panel

**What you need to do:**
1. **Pull (Download) the changes:**
   - Open GitHub Desktop
   - Click **"Fetch origin"** (top toolbar)
   - If **"Pull origin"** appears, click it
   - Now the new files are on your computer!

2. **You DON'T need to commit or push!**
   - Changes are already saved on GitHub
   - You're just downloading them to your computer
   - You can see the files in your local folder

##### 🔴 Situation 2: YOU made local changes (in Greenfoot)

**What you see:**
- You edited files in Greenfoot Desktop
- You saved with Ctrl+S
- GitHub Desktop shows modified files in the "Changes" panel

**What you need to do:**
1. **Review the changes** in GitHub Desktop
2. **Write a commit message**
3. **Click "Commit to [branch]"**
4. **Click "Push origin"**

##### 📊 Visual Summary

```
┌─────────────────────────────────────────┐
│ Do you have changes on GitHub web?      │
│ (made by someone else/Copilot)          │
└──────────────┬──────────────────────────┘
               │
               ↓
        GitHub Desktop
               │
        ┌──────┴──────┐
        │             │
    YES there's     NO "Pull
    "Pull origin"    origin"
        │             │
        ↓             ↓
   Click PULL    Everything
        │         is up to date!
        ↓
   Files are now
   on your PC
```

```
┌─────────────────────────────────────────┐
│ Did YOU edit files in Greenfoot?        │
└──────────────┬──────────────────────────┘
               │
               ↓
        Did you save with Ctrl+S?
               │
        ┌──────┴──────┐
        │             │
       YES            NO
        │             │
        ↓             ↓
   GitHub Desktop  Save NOW!
        │         (then continue)
        ↓
   See files in
   "Changes" panel?
        │
        ↓
   Write commit message
        │
        ↓
   Click "Commit"
        │
        ↓
   Click "Push origin"
        │
        ↓
   Your changes
   are on GitHub!
```

#### 🔄 Complete Workflow: Greenfoot → GitHub

##### Step 1: Work in Greenfoot Desktop

1. **Open the project:**
   - Launch Greenfoot Desktop
   - File → Open Project
   - Navigate to the `PiratesGame/PiratesGame` folder
   - Select the folder and click "Open"

2. **Make changes:**
   - Edit existing classes (MyWorld, Pirate, Character, ArtIslandQuestions, etc.)
   - Add new classes if needed
   - Test your code with the "Run" button

3. **IMPORTANT - Save changes in Greenfoot:**
   - **Ctrl+S** (or Cmd+S on Mac) to save the current class
   - Or: Edit → Save All to save all files
   - **Save often!** Don't wait until the end
   - Greenfoot auto-saves when compiling, but manual save is safer

4. **Verify they were saved:**
   - Close and reopen the class in Greenfoot
   - Verify your changes are still there

##### Step 2: Commit in GitHub Desktop

1. **Open GitHub Desktop:**
   - Make sure the correct repository is selected (`andrabel208/PiratesGame`)

2. **Check the changes:**
   - You'll see all modified files in the left panel
   - Each modified `.java` file will appear in the list
   - Click on each file to see what changed (green lines = added, red = deleted)

3. **Commit the changes:**
   - Check all files you want to save
   - Do **NOT** check `.class` or `.ctxt` files (should already be ignored by `.gitignore`)
   - Write a descriptive message in the "Summary" field, for example:
     - "Added new questions for Art Island"
     - "Fixed bug in Pirate class"
     - "Updated README with instructions"
   - Click **"Commit to copilot/update-art-island-questions"** (or your branch name)

4. **Push to GitHub:**
   - After committing, the "Push origin" button appears at the top
   - Click **"Push origin"** to upload changes to GitHub
   - Wait for confirmation that it uploaded successfully

##### Step 3: Verify on GitHub.com

1. Go to: https://github.com/andrabel208/PiratesGame
2. Verify your branch (`copilot/update-art-island-questions`) exists
3. Click on the branch and verify your modified files are there
4. Now your changes are safe on GitHub! ✅

#### ⚠️ Common Problems and Solutions

##### "My changes disappeared!"

**Possible causes:**
- Didn't save in Greenfoot (Ctrl+S)
- Edited in a different folder
- Accidentally did undo

**Solution:**
1. Check if you saved in Greenfoot
2. Check in GitHub Desktop if changes appear
3. If you committed and pushed, changes are safe on GitHub even if lost locally

##### "I don't see changes in GitHub Desktop"

**Solution:**
1. Make sure you saved files in Greenfoot (Ctrl+S)
2. In GitHub Desktop, click "Fetch origin" to sync
3. Verify you're in the correct folder (`PiratesGame`)
4. Restart GitHub Desktop if necessary

##### "I have changes I don't want to commit"

**Solution:**
1. In GitHub Desktop, uncheck files you don't want to save
2. Or: Right-click → Discard changes (WARNING: this deletes the changes!)

#### 💡 Best Practices

1. **Save often:**
   - Ctrl+S after each important modification
   - Don't wait until you finish everything to save

2. **Commit often:**
   - Make a commit after each completed feature
   - Better to have many small commits than one large one

3. **Push often:**
   - After each commit or at the end of the day
   - This way your changes are safe on GitHub

4. **Descriptive messages:**
   - Write clear messages for commits
   - Helps understand what you did when looking at history

5. **Review before pushing:**
   - Read the changes in GitHub Desktop
   - Make sure you're not forgetting important files

#### 🔒 How to Never Lose Your Work

1. **Automatic backup with Git:**
   - Each commit and push is a backup
   - You can return to previous versions anytime

2. **Check History:**
   - In GitHub Desktop: History tab
   - See all your previous changes
   - Can restore old versions if needed

3. **Branches for experiments:**
   - Create a new branch for new features
   - This way you don't affect the main code

---

---

## 📊 Wakatime Badge - Time Tracking

### 🇷🇴 Ce este Wakatime?

**Wakatime** este un instrument automat care monitorizează timpul pe care îl petreci programând. Badge-ul Wakatime afișat în README arată cât timp ai petrecut lucrând la acest proiect.

#### Cum funcționează?

1. **Badge-ul este automat** - nu trebuie să faci nimic special
2. Se actualizează automat când lucrezi la cod
3. Afișează timpul total petrecut pe proiect

#### Cum să adaugi tracking Wakatime (opțional)

Dacă vrei să vezi statistici detaliate despre timpul tău de lucru:

1. **Creează cont gratuit:**
   - Du-te la [wakatime.com](https://wakatime.com)
   - Înregistrează-te cu email-ul tău

2. **Instalează extensia pentru editorul tău:**
   - Pentru Greenfoot/IntelliJ IDEA: [wakatime.com/plugins](https://wakatime.com/plugins)
   - Urmărește instrucțiunile de instalare
   - Autentifică-te cu contul tău Wakatime

3. **Badge-ul este deja adăugat:**
   - Badge-ul din README funcționează automat
   - Nu trebuie să faci nimic special pentru a-l afișa

### 🇬🇧 What is Wakatime?

**Wakatime** is an automatic tool that tracks the time you spend coding. The Wakatime badge displayed in the README shows how much time has been spent working on this project.

#### How does it work?

1. **The badge is automatic** - you don't need to do anything special
2. It updates automatically when you work on code
3. Displays total time spent on the project

#### How to add Wakatime tracking (optional)

If you want to see detailed statistics about your coding time:

1. **Create free account:**
   - Go to [wakatime.com](https://wakatime.com)
   - Sign up with your email

2. **Install extension for your editor:**
   - For Greenfoot/IntelliJ IDEA: [wakatime.com/plugins](https://wakatime.com/plugins)
   - Follow installation instructions
   - Authenticate with your Wakatime account

3. **Badge is already added:**
   - The badge in README works automatically
   - You don't need to do anything special to display it

---

## 🔀 Consolidating Multiple Branches

### 🇷🇴 Cum să Consolidezi Mai Multe Branch-uri

Dacă ai mai multe branch-uri cu lucru diferit și vrei să le combini într-unul singur fără să pierzi munca, urmează acești pași:

#### Situația Curentă

Repository-ul are multiple branch-uri:
- `main` - branch-ul principal
- `andrabel208-patch-1` - modificări README
- `copilot/update-art-island-questions` - întrebări și documentație
- `feature/arta-islan` - implementare Art Island

#### Pasul 1: Înțelege Ce Conține Fiecare Branch

Înainte de a consolida, verifică ce modificări are fiecare branch:

1. **Pe GitHub.com:**
   - Du-te la repository: https://github.com/andrabel208/PiratesGame
   - Click pe dropdown-ul cu branch-uri (unde scrie "main")
   - Selectează fiecare branch și vezi ce fișiere sunt diferite

2. **În GitHub Desktop:**
   - Click pe "Current Branch" (sus)
   - Selectează un branch pentru a-l vedea
   - Click pe "History" pentru a vedea commit-urile

#### Pasul 2: Decide Care Este Branch-ul Principal

De obicei, `main` este branch-ul principal. Toate celelalte branch-uri ar trebui combinate în `main`.

#### Pasul 3: Mergeează (Combină) Branch-urile

**Metoda Recomandată - Folosind Pull Requests pe GitHub:**

1. **Pentru fiecare branch (andrabel208-patch-1, copilot/update-art-island-questions, feature/arta-islan):**

   a. **Creează Pull Request:**
   - Du-te pe GitHub.com: https://github.com/andrabel208/PiratesGame
   - Click pe "Pull requests" → "New pull request"
   - Setează:
     - **base:** `main` (unde vrei să mergi)
     - **compare:** branch-ul tău (ex: `feature/arta-islan`)
   - Click "Create pull request"
   - Adaugă o descriere despre ce conține branch-ul
   - Click "Create pull request"

   b. **Verifică Conflictele:**
   - GitHub îți va spune dacă sunt conflicte
   - Dacă sunt conflicte, click pe "Resolve conflicts"
   - Alege ce cod să păstrezi (de obicei vrei ambele modificări)
   - Click "Mark as resolved" apoi "Commit merge"

   c. **Merge Pull Request:**
   - Click pe "Merge pull request"
   - Click "Confirm merge"
   - Branch-ul este acum combinat în `main`!

2. **După ce ai combinat toate branch-urile:**
   - Branch-ul `main` conține toată munca
   - Poți șterge branch-urile vechi (GitHub oferă această opțiune după merge)
   - Sau le poți păstra pentru referință

#### Pasul 4: Actualizează Branch-ul Local

După ce ai făcut merge pe GitHub:

1. **În GitHub Desktop:**
   - Schimbă la branch-ul `main`
   - Click "Fetch origin"
   - Click "Pull origin"
   - Acum ai toate modificările locale!

#### Pasul 5: (Opțional) Curăță Branch-urile Vechi

După ce totul este în `main`:

1. **Pe GitHub.com:**
   - Du-te la repository → Settings → Branches
   - Sau șterge fiecare branch după merge (GitHub oferă butonul "Delete branch")

2. **În GitHub Desktop:**
   - Branch → Delete și selectează branch-urile vechi

### 🇬🇧 How to Consolidate Multiple Branches

If you have multiple branches with different work and want to combine them into one without losing work, follow these steps:

#### Current Situation

The repository has multiple branches:
- `main` - main branch
- `andrabel208-patch-1` - README changes
- `copilot/update-art-island-questions` - questions and documentation
- `feature/arta-islan` - Art Island implementation

#### Step 1: Understand What Each Branch Contains

Before consolidating, check what changes each branch has:

1. **On GitHub.com:**
   - Go to repository: https://github.com/andrabel208/PiratesGame
   - Click on the branches dropdown (where it says "main")
   - Select each branch and see which files are different

2. **In GitHub Desktop:**
   - Click on "Current Branch" (top)
   - Select a branch to view it
   - Click on "History" to see the commits

#### Step 2: Decide Which Is the Main Branch

Usually, `main` is the main branch. All other branches should be combined into `main`.

#### Step 3: Merge the Branches

**Recommended Method - Using Pull Requests on GitHub:**

1. **For each branch (andrabel208-patch-1, copilot/update-art-island-questions, feature/arta-islan):**

   a. **Create Pull Request:**
   - Go to GitHub.com: https://github.com/andrabel208/PiratesGame
   - Click "Pull requests" → "New pull request"
   - Set:
     - **base:** `main` (where you want to go)
     - **compare:** your branch (e.g., `feature/arta-islan`)
   - Click "Create pull request"
   - Add a description of what the branch contains
   - Click "Create pull request"

   b. **Check for Conflicts:**
   - GitHub will tell you if there are conflicts
   - If there are conflicts, click "Resolve conflicts"
   - Choose which code to keep (usually you want both changes)
   - Click "Mark as resolved" then "Commit merge"

   c. **Merge Pull Request:**
   - Click "Merge pull request"
   - Click "Confirm merge"
   - The branch is now combined into `main`!

2. **After you've merged all branches:**
   - The `main` branch contains all the work
   - You can delete old branches (GitHub offers this option after merge)
   - Or you can keep them for reference

#### Step 4: Update Local Branch

After merging on GitHub:

1. **In GitHub Desktop:**
   - Switch to `main` branch
   - Click "Fetch origin"
   - Click "Pull origin"
   - Now you have all changes locally!

#### Step 5: (Optional) Clean Up Old Branches

After everything is in `main`:

1. **On GitHub.com:**
   - Go to repository → Settings → Branches
   - Or delete each branch after merge (GitHub offers "Delete branch" button)

2. **In GitHub Desktop:**
   - Branch → Delete and select old branches

#### ⚠️ Important Tips for Branch Consolidation

1. **Backup first:**
   - Make sure all branches are pushed to GitHub before starting
   - You can always recover from GitHub if something goes wrong

2. **One branch at a time:**
   - Merge one branch at a time
   - Test after each merge to ensure everything works

3. **Resolve conflicts carefully:**
   - Read the conflicting code carefully
   - Usually you want to keep both sets of changes
   - Test the code after resolving conflicts

4. **Don't force delete:**
   - Only delete branches after successful merge
   - Keep branches if you're unsure

---

## 🆘 Need Help?

If you encounter issues:
1. Check this guide first
2. Look at the commit history in GitHub Desktop
3. Check the repository on GitHub.com
4. Create an issue on GitHub with details about the problem

Remember: **As long as you commit and push, your work is safe!** 🎉
