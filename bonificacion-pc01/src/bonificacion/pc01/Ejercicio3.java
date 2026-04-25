/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonificacion.pc01;
import java.util.Scanner;
/**
 *
 * @author BREYNER
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Areas ---");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Rectangulo");
        System.out.print("Seleccione una figura: ");

        int opcion = scanner.nextInt();
        System.out.println(); 

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del circulo:");
                double radio = scanner.nextDouble();
      
                double areaCirculo = 3.1416 * radio * radio;
 
                System.out.printf("El area del Circulo es: %5.2f\n", areaCirculo);
                break;

            case 2:
                System.out.print("Ingrese el lado del cuadrado:");
                double lado = scanner.nextDouble();

                double areaCuadrado = lado * lado;

                System.out.printf("El area del Cuadrado es: %5.2f\n", areaCuadrado);
                break;

            case 3:
                System.out.print("Ingrese la base del triangulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triangulo:");
                double alturaTriangulo = scanner.nextDouble();

                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2.0;

                System.out.printf("El area del Triangulo es: %5.2f\n", areaTriangulo);
                break;

            case 4:
                System.out.print("Ingrese la base del rectangulo:");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectangulo:");
                double alturaRectangulo = scanner.nextDouble();
                double areaRectangulo = baseRectangulo * alturaRectangulo;
                System.out.printf("El area del Rectangulo es: %5.2f\n", areaRectangulo);
                break;

            default:
                System.out.println("Figura invalida");
                break;
        }
    }
}

