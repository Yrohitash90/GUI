# Simple Swing Login

A minimal single-class Java Swing example that creates a basic login window with username and password fields and a Login button. The program checks for hard-coded credentials (`admin` / `admin`) and shows a result message in a label.

---

## Files

* `main.java` — contains the entire program in one class (as provided).

---

## Description

This is a tiny demo meant for learning how Swing event listeners work (`ActionListener`) and how to read values from `JTextField` components. It's intentionally simple and **not** meant for production use (credentials are hard-coded and not secure).

---

## Requirements

* Java Development Kit (JDK) 8 or later.
* No external libraries required — uses only standard Swing classes (`javax.swing.*`).

---

## How to compile and run

Save the code into a file named `main.java` and run these commands:

```bash
javac main.java
java main
```

That will open the login window.

---

## What it does

* Creates a `JFrame` titled **Login**.
* Adds labels: a welcome label and labels for username/password.
* Adds two text fields (`JTextField`) for username and password input.
* Ad
