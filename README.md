# TechStore Inventory – Java Generics Mini-Project

A tiny, self-contained Java console application that demonstrates **inheritance**, **generics**, and **basic CRUD operations** on an in-memory catalogue of products (Books, Notebooks, Accessories).
It was designed as a university assignment and intentionally keeps external dependencies to **zero** so it can be compiled with nothing more than the JDK.

---

## ✨ Features

| Feature | Details |
|---------|---------|
| **Abstract Product hierarchy** | `Product` → concrete subclasses `Book`, `Notebook`, `Accessory` |
| **Four-digit unique IDs** | A fixed prefix (`1`, `2`, `3`) + three-digit static counter (`001-999`) |
| **Generic repository** | `Inventory<T extends Product>` with add / remove / find / discount / list |
| **Utility method** | Static `Main.calculateTotalPrice()` sums prices of any `Inventory<? extends Product>` |
| **Input-free demo** | `Main` seeds demo data, performs the operations required in the assignment and prints the results in the exact order expected |
| **Validation** | Negative prices / invalid discount percentages throw `IllegalArgumentException` |
| **100 % pure Java** | No databases, no external libs, no build tools required (but Maven sample provided) |

---

## 📁 Project structure

```
src/
 ├─ inventory/
 │   └─ Inventory.java       # Generic repository
 ├─ products/
 │   ├─ Product.java         # Abstract base class
 │   ├─ Book.java
 │   ├─ Notebook.java
 │   └─ Accessory.java
 └─ Main.java                # Demo runner
```

---

## 🛠 Prerequisites

* **JDK 17** or later  
  _(any LTS ≥ 11 actually works, but 17 is tested)_
* A terminal / command prompt


---

## 🚀 Build & Run

### 1. Vanilla JDK

```bash
# 1 ) compile
javac -d out $(find src -name "*.java")

# 2 ) run
java -cp out Main
```

---

## 🖥 Sample console output

<details>
<summary>Click to expand</summary>

```
===  محصولات افزوده‌شده  ===
--- BOOKS ---
Title=Clean Code ,Price=55.0 ,ID=1001 ,Author=R. Martin ,Publication=Prentice-Hall ,Genre=Programming
Title=Effective Java ,Price=60.0 ,ID=1002 ,Author=J. Bloch ,Publication=Addison-Wesley ,Genre=Programming

--- NOTEBOOKS ---
Title=Graph Paper ,Price=5.5 ,ID=2001 ,PageCount=120 ,isHardCover=false
Title=Sketch Pad ,Price=7.0 ,ID=2002 ,PageCount=80 ,isHardCover=true

--- ACCESSORIES ---
Title=Pen Blue ,Price=1.2 ,ID=3001 ,Color=Blue
Title=Pen Black ,Price=1.2 ,ID=3002 ,Color=Black


===  مجموع قیمت پس از حذف  ===
Books total   : 60.00
Notebooks total: 12.50
Accessories total: 1.20


===  جستجو با findItemsById  ===
Existing id 2001 → Title=Graph Paper ,Price=5.5 ,ID=2001 ,PageCount=120 ,isHardCover=false
Non-existing id 9999 → null

===  وضعیت نهایی محصولات  ===
--- BOOKS ---
Title=Effective Java ,Price=48.0 ,ID=1002 ,Author=J. Bloch ,Publication=Addison-Wesley ,Genre=Programming

--- NOTEBOOKS ---
Title=Graph Paper ,Price=5.5 ,ID=2001 ,PageCount=120 ,isHardCover=false
Title=Sketch Pad ,Price=6.3 ,ID=2002 ,PageCount=80 ,isHardCover=true

--- ACCESSORIES ---
Title=Pen Black ,Price=1.2 ,ID=3002 ,Color=Black
```
</details>

---

Happy coding!
