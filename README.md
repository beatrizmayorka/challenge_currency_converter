# Coinverter 

🇧🇷 [Portuguese Version](README-PT.md)  | 🇫🇷 [French Version](README-FR.md)

Challenge ONE | Java | Back End | Currency Conversion

Coinverter is a backend currency conversion project developed as part of the ONE (Oracle Next Education) program, facilitated by Oracle and Alura. It allows the user to convert values between different currencies, such as US Dollar (USD), Brazilian Real (BRL), Argentine Peso (ARS), Bolivian Boliviano (BOB), Chilean Peso (CLP), and Colombian Peso (COP).

## 🧰 Features

- Display a menu with the available conversion options.
- Allow the user to enter the value to be converted.
- Perform the conversion between the selected currencies.
- Display the conversion result.
- Handle errors and exceptions during program execution.

## 🔧 How to Use

1. Verify your Java installation: 💻
    - Open a terminal or command prompt.
    - Run the command `java -version`.
    - Ensure that the output shows you have Java installed and the version is at least 8 or higher.
2. Clone this repository to your local machine. 📂
3. Navigate to the project directory. 📂
4. Obtain the API address and key: 🔑
    - Go to the [exchangerate-api.com](https://www.exchangerate-api.com/) website.
    - Enter your best email address and click "Get Free Key!".
    - The website will provide you with the API address and your personal API key.
5. Update the `API` class in the project:
    - Open the `API.java` file located in the `br.com.mayor.connection` package.
    - Locate the following lines of code:
      ```java
      String BASE_URL = "https://v6.exchangerate-api.com/v6/";
      String API_KEY = "YOUR KEY";
      ```
    - Replace `"YOUR KEY"` with your personal API key obtained in step 4.
7. Compile and run the project using IntelliJ IDEA Community Edition: 🚀
    - Install IntelliJ IDEA Community Edition from the official JetBrains website: https://www.jetbrains.com/idea/download/
    - Open IntelliJ and import the Coinverter project by going to "File" > "Open" or "Import" and navigating to the project folder.
    - In the `API.java` file, update the `API_KEY` variable with the API key you obtained in step 4 and 5.
    - In the IntelliJ IDEA toolbar, click on the "Build" menu and select "Rebuild Project" to compile the project.
    - Locate the `Menu.java` file in the project structure, right-click on the `Menu` class, and select "Run 'Menu.main()'".
8. Follow the instructions displayed in the menu to select the desired conversion option and enter the value to be converted. 💰
9. The conversion result will be displayed on the terminal.
10. - If necessary, import the Gson library by going to "File" > "Project Structure" > "Modules" > "Dependencies" and adding the dependency `com.google.code.gson:gson:2.8.7`.

## 🛠 Technologies Used

- Java
- Maven
- Gson library for JSON parsing

## 📝 License

This project is licensed under the [MIT License](LICENSE).