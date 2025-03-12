/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiky
 */
import java.util.Scanner;

public class ProgramaTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del lado a:");
        double a = scanner.nextDouble();
        
        System.out.println("Ingrese la longitud del lado b:");
        double b = scanner.nextDouble();
        
        System.out.println("Ingrese la longitud del lado c:");
        double c = scanner.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Las medidas ingresadas forman un triángulo válido.");
            
            double h; // Altura
            System.out.println("Ingrese la altura h:");
            h = scanner.nextDouble();
            
            if (a == b && b == c) {
                System.out.println("El triángulo es equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("El triángulo es isósceles.");
                
            } else {
                System.out.println("El triángulo es escaleno.");
            }
            
            double cosA = (b * b + c * c - a * a) / (2 * b * c);
            double anguloA = Math.toDegrees(Math.acos(cosA));
            
            double cosB = (a * a + c * c - b * b) / (2 * a * c);
            double anguloB = Math.toDegrees(Math.acos(cosB));
            
            double anguloC = 180 - anguloA - anguloB;
            
            System.out.println("Ángulo A: " + anguloA + " grados");
            System.out.println("Ángulo B: " + anguloB + " grados");
            System.out.println("Ángulo C: " + anguloC + " grados");
            
            double area = 0.5 * b * h;
            System.out.println("Área del triángulo: " + area);
        } else {
            System.out.println("Las medidas ingresadas no forman un triángulo válido.");
        }
    }
}
