# Coinverter

🇧🇷 [Versão em Português](README-PT.md) | 🇫🇷 [Version Française](README-FR.md)

Challenge ONE | Java | Back End | Conversão de Moeda

Coinverter é um projeto de conversão de moeda backend desenvolvido como parte do programa ONE (Oracle Next Education), facilitado pela Oracle e Alura. Ele permite que o usuário converta valores entre diferentes moedas, como Dólar Americano (USD), Real Brasileiro (BRL), Peso Argentino (ARS), Boliviano Boliviano (BOB), Peso Chileno (CLP) e Peso Colombiano (COP).

## 🧰 Funcionalidades

- Exibir um menu com as opções de conversão disponíveis.
- Permitir que o usuário digite o valor a ser convertido.
- Realizar a conversão entre as moedas selecionadas.
- Exibir o resultado da conversão.
- Tratar erros e exceções durante a execução do programa.

## 🔧 Como Usar

1. Verifique a instalação do Java: 💻
    - Abra um terminal ou prompt de comando.
    - Execute o comando `java -version`.
    - Certifique-se de que a saída mostre que você tem o Java instalado e a versão é 8 ou superior.
2. Clone este repositório em sua máquina local. 📂
3. Navegue até o diretório do projeto. 📂
4. Obtenha o endereço da API e a chave: 🔑
    - Acesse o site [exchangerate-api.com](https://www.exchangerate-api.com/).
    - Digite seu melhor endereço de e-mail e clique em "Get Free Key!".
    - O site fornecerá o endereço da API e sua chave de API pessoal.
5. Atualize a classe `API` no projeto:
    - Abra o arquivo `API.java` localizado no pacote `br.com.mayor.connection`.
    - Localize as seguintes linhas de código:
      ```java
      String BASE_URL = "https://v6.exchangerate-api.com/v6/";
      String API_KEY = "SUA CHAVE";
      ```
    - Substitua `"SUA CHAVE"` pela chave de API pessoal obtida na etapa 4.
6. Compile e execute o projeto usando o IntelliJ IDEA Community Edition: 🚀
    - Instale o IntelliJ IDEA Community Edition no site oficial da JetBrains: https://www.jetbrains.com/idea/download/
    - Abra o IntelliJ e importe o projeto Coinverter indo para "File" > "Open" ou "Import" e navegando até a pasta do projeto.
    - No arquivo `API.java`, atualize a variável `API_KEY` com a chave de API obtida nas etapas 4 e 5.
    - Na barra de ferramentas do IntelliJ IDEA, clique no menu "Build" e selecione "Rebuild Project" para compilar o projeto.
    - Localize o arquivo `Menu.java` na estrutura do projeto, clique com o botão direito na classe `Menu` e selecione "Run 'Menu.main()'".
7. Siga as instruções exibidas no menu para selecionar a opção de conversão desejada e inserir o valor a ser convertido. 💰
8. O resultado da conversão será exibido no terminal.
9. Caso seja necessário, importe a biblioteca Gson indo em "File" > "Project Structure" > "Modules" > "Dependencies" e adicionando a dependência `com.google.code.gson:gson:2.8.7`.

## 🛠 Tecnologias Utilizadas

- Java
- Maven
- Biblioteca Gson para parsing de JSON

## 📝 Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).