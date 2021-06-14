/**
 * @author David (1972038)
 */
package sample;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[5];
        for (int i=0; i < angka.length ;i++){
            System.out.print("Input array ke -"+i+" : ");
            angka[i]= input.nextInt();
        }
        System.out.println("## angka hasil imput ##");
        Arrays.stream(angka).forEach(System.out::println);
        System.out.println(("## Array setelah diurutkan ##"));
        Arrays.sort(angka);
        Arrays.stream(angka).forEach((System.out::println));
    }
}
