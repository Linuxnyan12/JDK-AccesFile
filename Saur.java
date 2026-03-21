import java.util.Scanner;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Saur {
    public static void main(String[] args) {
        
        String name;
        Scanner dino = new Scanner(System.in);

        do {
            try {
                System.out.print("Enter file name: ");
                name = dino.nextLine();

                Path cat = Paths.get(name);
                Path lion = cat.toAbsolutePath();
                System.out.println("Full Path is " + lion);

                if (Files.exists(cat)){
                    BasicFileAttributes zzz = Files.readAttributes(cat, BasicFileAttributes.class);
                    System.out.println("File exists");
                    System.out.println("Creation time " + zzz.creationTime());
                    System.out.println("Last modified time " + zzz.lastModifiedTime());
                    System.out.println("Size " + zzz.size() + " bytes");
                } else {
                    System.out.println("File not found");
                }
            }
            catch (Exception e){
                System.out.println("error");
            }

            System.out.print("Repeat? (y/n): ");
            name = dino.nextLine();

        } while (name.equalsIgnoreCase("y"));

        dino.close();
    }
}
