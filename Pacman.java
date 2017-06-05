package pacman;
import java.util.Scanner;
public class Pacman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w;
        lintasan gp = new lintasan();
        gp.koord(1,7);
        gp.display();
        while (gp.play()){
            System.out.print("Move : ");
            String move = in.next();
            switch (move){
                case "w":gp.w(); gp.display(); break;
                case "d":gp.d(); gp.display(); break;
                case "s":gp.s(); gp.display(); break;
                case "a":gp.a(); gp.display();break;
            }

        }
                
    }
    
}
