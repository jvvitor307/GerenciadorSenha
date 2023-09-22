package com.jvvitor.pessoais.gerenciadordesenhas;

import java.io.File;
import java.util.ArrayList;

public class Aplicativo {
    public void aplicativo() {
        String opcao;
        String[] details = new String[4];
        SiteFoco siteFoco = new SiteFoco(null, null, null);
        String siteName;
        File file;
        ArrayList<SiteFoco> listasites = new ArrayList<SiteFoco>();
        GeradorSenha geradorSenha = new GeradorSenha();
        Display display = new Display();
        SearchFile SearchFile = new SearchFile();
        CreaterFile CreaterFile = new CreaterFile();
        WriterFile WriterFile = new WriterFile();
        ReaderFile ReaderFile = new ReaderFile();

        LimparTela();
        opcao = display.displayMenu();
        opcao = opcao.toUpperCase();
        if(opcao.equals("P")){
            LimparTela();
            siteName = display.displayPesquisa();
            listasites = SearchFile.searchFile(siteName);
            if (listasites == null) {
                System.out.println("Site não encontrado");
            }
            else{
                display.displayResultadoPesquisa(listasites);
            }
            pressionetoExit();
        }
        else if(opcao.equals("A")){
            LimparTela();
            details = display.displayAdicionar();
            siteFoco.setSiteName(details[0]);
            siteFoco.setEmail(details[1]);
            siteFoco.setUser(details[2]);
            siteFoco.setPassword(geradorSenha.generatePassword(Integer.parseInt(details[3])));  
            file = CreaterFile.createFile(siteFoco);
            WriterFile.writerFile(file, siteFoco);
            pressionetoExit();
        }
        else if(opcao.equals("R")){
            LimparTela();
            siteName = display.displayPesquisa();
            listasites = SearchFile.searchFile(siteName);
            if (listasites == null) {
                System.out.println("Site não encontrado");
            }
            else{
                
                
            }
        }
        else if(opcao.equals("L")){
            LimparTela();
            ReaderFile.ListSite();
            pressionetoExit();
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
    public static void pressionetoExit(){
        System.out.println("Pressione enter para sair");
        try{
            System.in.read();
        }  
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
