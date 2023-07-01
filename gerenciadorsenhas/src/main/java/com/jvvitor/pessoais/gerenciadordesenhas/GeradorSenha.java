package com.jvvitor.pessoais.gerenciadordesenhas;

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

    public String generatePassword(int length){
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    password += lettersMinusculus.charAt((int) (Math.random() * lettersMinusculus.length()));
                    useLettersMinusculus = true;
                case 1:
                    password += lettersMaiusculus.charAt((int) (Math.random() * lettersMaiusculus.length()));
                    useLettersMaiusculus = true;
                case 2:
                    password += numbers.charAt((int) (Math.random() * numbers.length()));
                    useNumbers = true;
                case 3:
                    password += symbols.charAt((int) (Math.random() * symbols.length()));
                    useSymbols = true;
            }
        }
        if(useLettersMaiusculus == true && useLettersMinusculus == true && useNumbers == true && useSymbols == true){
            return password;
        }
        else{
            return generatePassword(length);
        }
    }
}
