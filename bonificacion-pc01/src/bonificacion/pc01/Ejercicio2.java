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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner Lector=new Scanner(System.in);
        System.out.println("Ingrese la tarifa por hora");
        double tarifa=Lector.nextDouble();
        System.out.println("Ingrese las horas trabajadas");
        int horas=Lector.nextInt();
        
        double sueldoBase,sueldoExtra,sueldoTotal;
        
        if(horas>40){
            sueldoBase=40*tarifa;
            sueldoExtra=(horas-40)*(tarifa*1.5);
        }else{
            sueldoBase=horas*tarifa;
            sueldoExtra=0;
        }
        sueldoTotal=sueldoBase+sueldoExtra;
        
        double bono=(sueldoTotal>1500)?100.0:0.0;
        double totalNeto=sueldoTotal+bono;
        
        System.out.println("---BOLETA DE PAGOS---");
        System.out.printf("Sueldo por horas normales:S/%.2f\n",sueldoBase);
        System.out.printf("Sueldo por horas extras trabajadas:S/%.2f\n",sueldoExtra);
        System.out.printf("Bono de movilidad:S/%.2f\n",bono);
        System.out.printf("Total a pagar:S/%.2f\n",totalNeto);
    }
    
}
