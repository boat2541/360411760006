package lab9;

import java.io.*;

public class myFileDemo {
    public static void main(String[] args) {


        File myFile = new File("D:\\360411760006\\src\\lab9\\mit.txt");
        try {
            if (myFile.createNewFile())
                System.out.println("new File is created.");
            else
                System.out.println("File is already exited ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");

        whileMyFile(myFile);
        readMyFile(myFile);


    }//main

    private static void readMyFile(File myFile) {
        FileReader r = null;

        try {
            r = new FileReader(myFile);
            int i;
            while ((i = r.read())  !=-1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void whileMyFile(File myFile) {
        Writer w = null;
        try {
            w = new FileWriter(myFile,true);
            String content = "\n Boat Piyawat";
            w.write(content);
            System.out.println("Done.");
        }catch (IOException ex) {
            ex.printStackTrace();

        }finally {
            try {
                w.close();
            }catch (IOException e)  {
            e.printStackTrace();

            }
        }





    }//writMyFile


}//class
