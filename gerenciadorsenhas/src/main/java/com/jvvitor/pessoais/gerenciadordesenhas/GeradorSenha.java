package com.jvvitor.pessoais.gerenciadordesenhas;

import java.util.Random;

public class GeradorSenha {
    String lettersMinusculus = "abcdefghijklmnopqrstuvwxyz";
    String lettersMaiusculus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numbers = "0123456789";
    String symbols = "!@#$%&*()_+-=[]|,./?><";
    boolean useLettersMinusculus = false;
    boolean useLettersMaiusculus = false;
    boolean useNumbers = false;
    boolean useSymbols = false;
    String password = "";
    Random random = new Random();
    int randomInt;

    public String generatePassword(int length){
        if(length < 4){
            length = 4;
            System.out.println("A senha é muito curta, define um tamanho de 4 caracteres");
        }
        useLettersMaiusculus = false;
        useLettersMinusculus = false;
        useNumbers = false;
        useSymbols = false;
        for (int i = 0; i < length; i++) {
            randomInt = random.nextInt(4);
            switch (randomInt) {
                case 0:
                    password += lettersMinusculus.charAt(random.nextInt(lettersMinusculus.length()));
                    useLettersMinusculus = true;
                    break;
                case 1:
                    password += lettersMaiusculus.charAt(random.nextInt(lettersMaiusculus.length()));
                    useLettersMaiusculus = true;
                    break;
                case 2:
                    password += numbers.charAt(random.nextInt(numbers.length()));
                    useNumbers = true;
                    break;
                case 3:
                    password += symbols.charAt(random.nextInt(symbols.length()));
                    useSymbols = true;
                    break;
            }
        }
        if(useLettersMaiusculus == true && useLettersMinusculus == true && useNumbers == true && useSymbols == true){
            return password;
        }
        else{
            password = "";
            return generatePassword(length);
        }
    }
}
