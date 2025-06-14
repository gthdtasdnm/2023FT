# 🧾 Altklausur 2023FT – Formenbibliothek & Zustandsautomat

Dieses Repository enthält eine vollständige Lösung zur **OOP-Klausur 2023FT** der Universität der Bundeswehr München (27. Juni 2023).

## 📁 Struktur

Der Code ist in zwei Teile untergliedert:

### 📌 `A1/` – Allgemeine Java-Aufgaben (Aufgabe 1)
- Enthält kleine Klassen zur Analyse von Java-Code (z. B. `Foo`, `Overload`, `MagicNumber`, `SimpleNumber`)
- Relevante Themen: Konstruktoren, `this`, Overloading, Vererbung, Initialisierung

### 📐 `shapes/` – Hauptteil des Projekts (Aufgaben 2–5)
- **Formen**
  - `Circle`, `Rectangle` – Umsetzung einfacher 2D-Formen
  - `Shape` – Interface für alle Formen mit Visitor-Support
- **Geometrie & Daten**
  - `Pos` – 2D-Position (unveränderlich, equals, hashCode, toString)
- **Visitor Pattern**
  - `Visitor` – Interface für alle Besucher
  - `PrintVisitor` – Konkreter Visitor mit fortlaufender Nummerierung
- **Zustandsautomat (State Pattern)**
  - `DrawRectangle` – Hauptklasse zum Zeichnen per Klick und Drag
  - `WaitForClick`, `Dragging` – Zustandsklassen zur Rechteck-Erstellung
  - `State` – Interface für Mausereignisse
- **Tests & Visualisierung**
  - `PosTest`, `DrawRectangleTest` – JUnit-Tests
  - `ShapesUML.png`, `StateUML.png` – UML-Diagramme
  - `.puml`-Dateien zur eigenen PlantUML-Nutzung
  - `VisitorDemo` – Beispielausgabe für `PrintVisitor`

## 🧪 Tests

- Die enthaltenen Tests (`PosTest`, `DrawRectangleTest`) prüfen u. a.:
  - Konstruktion und Darstellung von `Pos`
  - korrekte Zustandsübergänge bei Mausklicks
  - Konsolenausgabe der `PrintVisitor`-Funktionalität

## 🎯 Verwendete Entwurfsmuster

- **Visitor Pattern** – für flexible Erweiterung der Zeichenoperationen
- **State Pattern** – zur Steuerung von Benutzerinteraktionen (Zeichenprozess)
- **Encapsulation & Immutability** – z. B. in `Pos`

---

Viel Erfolg beim Durcharbeiten der Aufgaben und beim Üben fürs nächste Mal!
