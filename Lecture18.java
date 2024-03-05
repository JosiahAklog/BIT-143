import java.util.*;

public class Lecture18 {

public static void mystery(int x) {
    int y = 1;
    int z = 0;

    while (2 * y <= x) {
        y = y * 2;
        z++;
    }
    System.out.println(y + " " + z);
}

public static void main(String[] args) {
    mystery(1);
    mystery(6);
    mystery(19);
    mystery(39);
    mystery(74);
}

}





