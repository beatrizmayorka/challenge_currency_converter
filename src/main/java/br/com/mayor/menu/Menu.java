package br.com.mayor.menu;

import br.com.mayor.connection.API;
import br.com.mayor.models.Converter;
import br.com.mayor.models.CurrencyPair;

import java.util.Scanner;

public class Menu {
    private final CurrencyPair[] currencyPairs = {
            new CurrencyPair("USD", "BRL"),
            new CurrencyPair("BRL", "BOB"),
            new CurrencyPair("USD", "ARS"),
            new CurrencyPair("ARS", "CLP"),
            new CurrencyPair("BRL", "COP"),
            new CurrencyPair("ARS", "BRL")
    };

    public void displayMenu() {
        Scanner option = new Scanner(System.in);
        int choice = 0;
        API converter = new API();
        String menu = """
                *********************************************************
                    Bem vindo(a) ao Coinverter - Conversor de Moeda
                *********************************************************
                Escolha uma opção para converter:
                """;

        while (choice != currencyPairs.length + 1) {
            try {
                System.out.println(menu);
                for (int i = 0; i < currencyPairs.length; i++) {
                    System.out.println((i + 1) + ". " + currencyPairs[i].fromCurrency() + " para >>>> " + currencyPairs[i].toCurrency());
                }

                System.out.println(currencyPairs.length + 1 + ". SAIR");
                System.out.println("\nOpção: ");

                choice = option.nextInt();

                switch (choice) {
                    case 1:
                        convertUsdToBrl(converter);
                        break;
                    case 2:
                        convertBrlToBolivianBoliviano(converter);
                        break;
                    case 3:
                        convertUsdToArgentinePeso(converter);
                        break;
                    case 4:
                        convertArgentinePesoToChileanPeso(converter);
                        break;
                    case 5:
                        convertBrlToColombianPeso(converter);
                        break;
                    case 6:
                        convertArgentinePeseToBrl(converter);
                        break;
                    default:
                        System.out.println("Saindo do programa...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                option.nextLine(); // Limpa o buffer do Scanner
            }
        }
    }

    private void convertUsdToBrl(API converter) {
        System.out.println("Digite um valor");
        double value = new Scanner(System.in).nextDouble();
        Converter usdBrl = converter.getConverter("USD", "BRL", value);
        if (usdBrl != null) {
            System.out.println("\nVocê selecionou a opção 1. USD para BRL");
            System.out.println("O valor de: " + value + " Dólar Americano convertido em Real Brasileiro é: " + usdBrl.conversion_rates() + " BRL");
            System.out.println(" ");
        } else {
            System.out.println("Falha ao obter a cotação.");
        }
    }

    private void convertBrlToBolivianBoliviano(API converter) {
        System.out.println("Digite um valor");
        double value = new Scanner(System.in).nextDouble();
        Converter brlBob = converter.getConverter("BRL", "BOB", value);
        if (brlBob != null) {
            System.out.println("\nVocê selecionou a opção 2. BRL para BOB");
            System.out.println("O valor de: " + value + " Real Brasileiro convertido em Bolivianos Bolivianos é: " + brlBob.conversion_rates() + " BOB");
        } else {
            System.out.println("Falha ao obter a cotação.");
        }
    }

    private void convertUsdToArgentinePeso(API converter) {
        System.out.println("Digite um valor");
        double value = new Scanner(System.in).nextDouble();
        Converter usdARS = converter.getConverter("USD", "ARS", value);
        if (usdARS != null) {
            System.out.println("\nVocê selecionou a opção 3. USD para ARS");
            System.out.println("O valor de: " + value + " Dólar Americano convertido em Peso Argentino é: " + usdARS.conversion_rates() + " ARS");
        } else {
            System.out.println("Falha ao obter a cotação.");
        }
    }

    private void convertArgentinePesoToChileanPeso(API converter) {
        System.out.println("Digite um valor");
        double value = new Scanner(System.in).nextDouble();
        Converter arsCLP = converter.getConverter("ARS", "CLP", value);
        if (arsCLP != null) {
            System.out.println("\nVocê selecionou a opção 4. ARS para CLP");
            System.out.println("O valor de: " + value + " Peso Argentino convertido em Peso Chileno é: " + arsCLP.conversion_rates() + " CLP");
        } else {
            System.out.println("Falha ao obter a cotação.");
        }
    }

    private void convertBrlToColombianPeso(API converter) {
        System.out.println("Digite um valor");
        double value = new Scanner(System.in).nextDouble();
        Converter brlCOP = converter.getConverter("BRL", "COP", value);
        if (brlCOP != null) {
            System.out.println("\nVocê selecionou a opção 5. BRL para COP");
            System.out.println("O valor de: " + value + " Real Brasileiro convertido em Peso Colombiano é: " + brlCOP.conversion_rates() + " COP");
        } else {
            System.out.println("Falha ao obter a cotação.");
        }
    }

    private void convertArgentinePeseToBrl(API converter) {
        System.out.println("Digite um valor");
        double value = new Scanner(System.in).nextDouble();
        Converter arsBRL = converter.getConverter("ARS", "BRL", value);
        if (arsBRL != null) {
            System.out.println("\nVocê selecionou a opção 6. ARS para BRL");
            System.out.println("O valor de: " + value + " Peso Argentino convertido em Real Brasileiro é: " + arsBRL.conversion_rates() + " BRL");
        } else {
            System.out.println("Falha ao obter a cotação.");
        }
    }
}