package com.jvvitor.pessoais.gerenciadordesenhas;

import java.util.ArrayList;
import java.util.Scanner;


public class Display {
    String[] details =  new String[4];
    Scanner scanner = new Scanner(System.in);
    int senha;

    public String displaySiteName(){
        System.out.println("Digite o nome do site/app: ");
        return scanner.nextLine();
    }

    public String displayUserName(){
        System.out.println("Digite o nome de usuário: ");
        return scanner.nextLine();
    }

    public String displayEmail(){
        System.out.println("Digite o email: ");
        return scanner.nextLine();
    }

    public String displayMenu(){
        System.out.println("Gerenciador de senhas");
        System.out.println("P - Pesquisar site");
        System.out.println("L - Listar sites");
        System.out.println("A - Adicionar site");
        System.out.println("R - Remover site");
        System.out.println("S - Sair");
        System.out.println("Digite a opção desejada: ");
        return scanner.nextLine();
    }

    public String displayPesquisa(){
        return displaySiteName();
    }
    
    public String[] displayAdicionar(){
        details[0] = displaySiteName();
        details[1] = displayEmail();
        details[2] = displayUserName();
        try{
            System.out.println("Digite o tamanho da senha (tamanho minimo --> 4):");
            senha = scanner.nextInt();
            details[3] = Integer.toString(senha);
        }catch(Exception e){
            System.out.println("Digite um numero");
            displayAdicionar();
        }
        return details;
    } 
    public void displayResultadoPesquisa(ArrayList<SiteFoco> listasites){
        for (SiteFoco site : listasites) {
            if(listasites.indexOf(site) == 0){
                System.out.println("--------------------------------------------------");
            }
            System.out.println("Site numero:" + listasites.indexOf(site));
            System.out.println("nome do site/App: " + site.getSiteName());
            System.out.println("nome do usuario: " + site.getUser());
            System.out.println("Email: " + site.getEmail());
            System.out.println("Senha: " + site.getPassword());
            System.out.println("--------------------------------------------------");
        }
        for(int i = 0; i < 3;){
            System.out.println();
        }
    }
}
