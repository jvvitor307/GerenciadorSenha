package com.jvvitor.pessoais.gerenciadordesenhas;

import java.io.File;
import java.util.ArrayList;

public class SearchFile {
    String currentDirectory = System.getProperty("user.dir");
    String relativeFilePath = "senhas\\";
    String absoluteFilePath = currentDirectory + File.separator + relativeFilePath;
    File senhasFolder = new File(absoluteFilePath);
    File[] listFilesFolder = senhasFolder.listFiles();
    SiteFoco siteSearch;
    ArrayList<SiteFoco> sites = new ArrayList<SiteFoco>();
    ReaderFile reader = new ReaderFile();

    public ArrayList<SiteFoco> searchFile(String site){
        for (File file : listFilesFolder) {
            if (file.isFile()) {
                if(file.getName().contains(site)){
                    siteSearch = reader.readerFile(file);
                    if (siteSearch != null){
                        sites.add(siteSearch);
                        siteSearch = null;
                    }
                }
            }
        }
        if(sites != null){
            return sites;
        }
        else{
            return null;
        }
    }

}
