🌮 TacoDeli App
A Java‑based console application that simulates ordering from a Texas‑style taco shop. Users can build tacos, choose ingredients, add drinks/appetizers, and generate receipts — all through an interactive CLI experience.

🚀 Features
Interactive CLI menus for navigating the app

Custom Taco Builder with multiple ingredients

Appetizers & Drinks selection

Receipt generation with itemized totals

Modular OOP design (Taco, MenuItem, Screens, ReceiptWriter, etc.)

Expandable architecture for future menu items or UI layers

🧱 Project Structure
Code
tacodeli-app/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tacodeli/
│   │   │       ├── screens/
│   │   │       ├── models/
│   │   │       ├── utils/
│   │   │       └── TacoDeliApp.java
│   │   └── resources/
│   └── test/
│       └── java/
│
├── README.md
└── pom.xml (if using Maven)
🧩 How It Works
1. Home Screen
Users choose what they want to do:

Build a taco

Add appetizers

Add drinks

View cart

Checkout

2. Taco Builder
Users can select:

Tortilla type

Protein

Toppings (multiple supported)

Salsa

Specialty add‑ons

3. Receipt Writer
At checkout, the app:

Calculates totals

Formats a receipt

Saves it to a file (if implemented)

🛠️ Technologies Used
Java 17+

OOP principles

JUnit (optional)

Maven or Gradle (depending on your setup)

▶️ Running the App
Using Terminal
bash
cd tacodeli-app
javac -d out $(find src/main/java -name "*.java")
java -cp out com.tacodeli.TacoDeliApp
Using IntelliJ / VS Code
Open the project folder

Build the project

Run TacoDeliApp.java

🧪 Testing
If you have JUnit tests:

bash
mvn test
📌 Future Enhancements
GUI version (JavaFX or React frontend)

Persistent order history

User accounts & loyalty points

Online ordering API

🤝 Contributing
Pull requests are welcome. For major changes, open an issue first to discuss what you’d like to change.
