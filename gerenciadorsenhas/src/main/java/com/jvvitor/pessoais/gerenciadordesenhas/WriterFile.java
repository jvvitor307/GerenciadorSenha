package com.jvvitor.pessoais.gerenciadordesenhas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

    public void writerFile(File file, SiteFoco site){
        try{
            FileWriter writer = new FileWriter(file);
            writer.write(site.getSiteName() + "\n");
            writer.write(site.getUser() + "\n");
            writer.write(site.getEmail() + "\n");
            writer.write(site.getPassword() + "\n");
            writer.close();
            System.out.println("Arquivo escrito com sucesso.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
