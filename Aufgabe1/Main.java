        package WichtigUndRichtig;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 

        Hund hund1 = new Hund("Bello", "schwarz", 5, "Labrador");
        System.out.println(hund1.name);
        System.out.println(hund1.Pelzfarbe);
        System.out.println(hund1.Alter);
        System.out.println(hund1.Rasse);

        String kName = sc.next();
        String kFarb = sc.next();
        int kAlter = sc.nextInt();
        
        Katze katze1 = new Katze(kName, kFarb, kAlter);

        System.out.println(katze1.name);
        System.out.println(katze1.Pelzfarbe);
        System.out.println(katze1.Alter);

        sc.close();
    }

}