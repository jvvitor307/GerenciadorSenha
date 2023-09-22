package com.jvvitor.pessoais.gerenciadordesenhas;

import java.io.File;
import java.io.IOException;


public class CreaterFile {
    
    File file;

    public File createFile(SiteFoco site) {
        try{
            String currentDirectory = System.getProperty("user.dir");

             // Define a relative path to the file.txt from the current directory
            String relativeFilePath = "senhas\\" + site.getSiteName() + site.getEmail() + ".txt";

             // Construct the absolute path by concatenating the current directory and the relative path
            String absoluteFilePath = currentDirectory + File.separator + relativeFilePath;

             // Now, you can access the file using the absolute path
            file = new File(absoluteFilePath);
            if(file.createNewFile()){
                System.out.println("Arquivo criado: " + file.getName());
            }
            else{
                System.out.println("Arquivo já existe.");
            }
            return file;
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }
}
