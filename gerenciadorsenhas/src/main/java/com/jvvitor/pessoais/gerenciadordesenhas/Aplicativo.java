package com.jvvitor.pessoais.gerenciadordesenhas;

import java.io.File;
import java.util.ArrayList;

public class Aplicativo {
    public static void aplicativo() {
        String opcao;
        SiteFoco siteFoco;
        String siteName;
        File file;
        ArrayList<SiteFoco> sites = new ArrayList<SiteFoco>();
        Display display = new Display();
        WriterReader writerReader = new WriterReader();

        opcao = display.displayMenu();
        opcao = opcao.toUpperCase();
        if(opcao.equals("P")){
            LimparTela();
            siteName = display.displayPesquisa();
            sites = writerReader.searchFile(siteName);
            if (sites == null) {
                System.out.println("Site não encontrado");
            }
            else{
                for (SiteFoco site : sites) {
                    System.out.println(site.getSiteName());
                    System.out.println(site.getUser());
                    System.out.println(site.getEmail());
                    System.out.println(site.getPassword());
                }
            }
        }
        else if(opcao.equals("A")){
            LimparTela();
            siteFoco = display.displayAdicionar();
            file = writerReader.createFile(siteFoco);
            writerReader.writerFile(file, siteFoco);
        }
        else if(opcao.equals("L")){
            LimparTela();
            writerReader.ListSite();
        }
        else if(opcao.equals("S")){
            LimparTela();
            System.exit(0);
        }
        else{
            LimparTela();
            System.out.println("Opção inválida");   
        }
    }
    public static void LimparTela(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
