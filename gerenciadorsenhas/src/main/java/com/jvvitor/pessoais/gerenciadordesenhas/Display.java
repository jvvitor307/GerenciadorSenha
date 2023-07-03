package com.jvvitor.pessoais.gerenciadordesenhas;

import java.util.Scanner;

public class Display {
    Scanner input = new Scanner(System.in);
    String opcao;
    String site;
    String user;
    String email;
    int lenghtString;
    SiteFoco siteFoco;
    GeradorSenha geradorSenha = new GeradorSenha();

    public String displayMenu(){
        System.out.println("Gerenciador de senhas");
        System.out.println("P - Pesquisar site");
        System.out.println("L - Listar sites");
        System.out.println("A - Adicionar site");
        System.out.println("S - Sair");
        System.out.println("Digite a opção desejada: ");
        opcao = input.nextLine();
        return opcao;
    }

    public String displayPesquisa(){
        System.out.println("Digite o nome do site: ");
        opcao = input.nextLine();
        return opcao;
    }
    
    public SiteFoco displayAdicionar(){
    
        System.out.println("Digite o nome do site/app: ");
        site = input.nextLine();        
        System.out.println("Digite o nome de usuário: ");
        user = input.nextLine();
        System.out.println("Digite o email: ");
        email = input.nextLine();
        try{
            System.out.println("Digite o tamanho da senha: ");
            lenghtString = input.nextInt();
        }catch(Exception e){
            System.out.println("Digite o tamanho da senha (tamanho minimo --> 4):");
            displayAdicionar();
        }
        
        siteFoco = new SiteFoco(user, email, site);
        siteFoco.setPassword(geradorSenha.generatePassword(lenghtString));
        return siteFoco;
        
    }
    


    
}
