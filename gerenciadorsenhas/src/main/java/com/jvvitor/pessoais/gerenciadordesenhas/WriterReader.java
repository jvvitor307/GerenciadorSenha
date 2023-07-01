package com.jvvitor.pessoais.gerenciadordesenhas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterReader {
    File file;
    FileWriter writer;
    String data;
    SiteFoco site;
    Scanner myReader;

    public void createFile(String site, String email) {
        try{
            file = new File("T:\\Projetos\\Pessoais\\GerenciadorSenha\\Senhas\\" + site + email + ".txt");
            if(file.createNewFile()){
                System.out.println("Arquivo criado: " + file.getName());
            }
            else{
                System.out.println("Arquivo já existe.");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public File writerFile(File file, String site, String user, String password, String email){
        try{
            FileWriter writer = new FileWriter(file);
            writer.write(site + "\n");
            writer.write(user + "\n");
            writer.write(email + "\n");
            writer.write(password + "\n");
            writer.close();
            System.out.println("Arquivo escrito com sucesso.");
            return file;
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public SiteFoco readerFile(File file){
        try {
            myReader = new Scanner(file);
            site = new SiteFoco(myReader.nextLine(), myReader.nextLine(), myReader.nextLine());
            site.setPassword(myReader.nextLine());
            myReader.close();
            return site;
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("erro ao ler arquivo");
            return null;
        }
    }

    public 
}
