import org.apache.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class Main {
    final static Logger logger= Logger.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.println("შემოიტანეთ საძიებო სიტყვა: ");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();



        File dir = new File("C:\\Users\\gzaraspishvili.EURONEWSGEORGIA\\Desktop\\news");

        File[] listFiles = dir.listFiles(new FilenameFilter () {
            public boolean accept(File dir, String name) {

                if(name.startsWith((in))) {
                    System.out.println( "მოიძებნა :" + name);
                    logger.info(name);
                }
                return name.startsWith(" ");
            }
        });
    }
}
