package com.jvvitor.pessoais.gerenciadordesenhas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderFile {
    SiteFoco site;
    Scanner myReader;
    ArrayList<SiteFoco> sites = new ArrayList<SiteFoco>();
    SiteFoco siteSearch;
    String currentDirectory = System.getProperty("user.dir");
    String relativeFilePath = "senhas\\";
    String absoluteFilePath = currentDirectory + File.separator + relativeFilePath;
    File senhasFolder = new File(absoluteFilePath);
    File[] listFilesFolder = senhasFolder.listFiles();

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

    public void ListSite(){
        listFilesFolder = senhasFolder.listFiles();
        for (File file : listFilesFolder) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
