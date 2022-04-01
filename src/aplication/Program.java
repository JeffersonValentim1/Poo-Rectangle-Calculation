package aplication;

import entites.Rectangle;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public  static  void  main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter data Rectangle: ");
        System.out.println(" Enter data Width: ");
        rectangle.width = sc.nextDouble();

        System.out.println(" Enter data heigth: ");
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.Area());
        System.out.println(rectangle.Perimeter());
        System.out.println(rectangle.Diagonal());







        sc.close();
    }
}
