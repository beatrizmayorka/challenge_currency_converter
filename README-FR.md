# Coinverter

🇧🇷 [Version portugaise](README-PT.md) | 🇫🇷 [Version française](README-FR.md)

Challenge ONE | Java | Back End | Conversion de devises

## Description

Coinverter est un projet de conversion de devises backend développé dans le cadre du programme ONE (Oracle Next Education), facilité par Oracle et Alura. Il permet à l'utilisateur de convertir des valeurs entre différentes devises, telles que le dollar américain (USD), le real brésilien (BRL), le peso argentin (ARS), le boliviano bolivien (BOB), le peso chilien (CLP) et le peso colombien (COP).

## 🧰 Fonctionnalités

- Afficher un menu avec les options de conversion disponibles.
- Permettre à l'utilisateur de saisir la valeur à convertir.
- Effectuer la conversion entre les devises sélectionnées.
- Afficher le résultat de la conversion.
- Gérer les erreurs et les exceptions pendant l'exécution du programme.

## 🔧 Comment utiliser

1. Vérifiez votre installation de Java : 💻
    - Ouvrez un terminal ou une invite de commande.
    - Exécutez la commande `java -version`.
    - Assurez-vous que la sortie montre que vous avez Java installé et que la version est au moins 8 ou supérieure.
2. Clonez ce dépôt sur votre machine locale. 📂
3. Naviguez jusqu'au répertoire du projet. 📂
4. Obtenez l'adresse et la clé de l'API : 🔑
    - Allez sur le site web [exchangerate-api.com](https://www.exchangerate-api.com/).
    - Entrez votre meilleure adresse e-mail et cliquez sur "Get Free Key!".
    - Le site web vous fournira l'adresse de l'API et votre clé API personnelle.
5. Mettez à jour la classe `API` dans le projet :
    - Ouvrez le fichier `API.java` situé dans le package `br.com.mayor.connection`.
    - Localisez les lignes de code suivantes :
      ```java
      String BASE_URL = "https://v6.exchangerate-api.com/v6/";
      String API_KEY = "YOUR KEY";
      ```
    - Remplacez `"YOUR KEY"` par votre clé API personnelle obtenue à l'étape 4.
7. Compilez et exécutez le projet à l'aide d'IntelliJ IDEA Community Edition : 🚀
    - Installez IntelliJ IDEA Community Edition à partir du site officiel de JetBrains : https://www.jetbrains.com/idea/download/
    - Ouvrez IntelliJ et importez le projet Coinverter en allant dans "Fichier" > "Ouvrir" ou "Importer" et en naviguant jusqu'au dossier du projet.
    - Dans le fichier `API.java`, mettez à jour la variable `API_KEY` avec la clé API que vous avez obtenue aux étapes 4 et 5.
    - Dans la barre d'outils d'IntelliJ IDEA, cliquez sur le menu "Construire" et sélectionnez "Reconstruire le projet" pour compiler le projet.
    - Localisez le fichier `Menu.java` dans la structure du projet, cliquez avec le bouton droit sur la classe `Menu` et sélectionnez "Exécuter 'Menu.main()'".
8. Suivez les instructions affichées dans le menu pour sélectionner l'option de conversion souhaitée et saisir la valeur à convertir. 💰
9. Le résultat de la conversion sera affiché dans le terminal.
10. - Si nécessaire, importez la bibliothèque Gson en allant dans "

## 🛠 Technologies Used

- Java
- Maven
- Bibliothèque Gson pour l'analyse JSON

## 📝 Licence

Ce projet est sous licence [MIT License](LICENSE).