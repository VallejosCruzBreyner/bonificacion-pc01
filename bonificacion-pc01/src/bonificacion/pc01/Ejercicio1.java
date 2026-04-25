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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Lector=new Scanner(System.in);
        System.out.println("Ingrese las horas (0-23)");
        int horas=Lector.nextInt();
        System.out.println("Ingrese los minutos(0-59)");
        int minutos=Lector.nextInt();
        System.out.println("Ingrese los segundos(0-59)");
        int segundos=Lector.nextInt();
        
        if((horas>=0&&horas<=23)&&(minutos>=0&&minutos<=59)&&(segundos>=0&&segundos<=59)){
            segundos++;
            if(segundos==60){
                segundos=0;
                minutos++;
                if(minutos==60){
                    minutos=0;
                    horas++;
                    if(horas==24){
                        horas=0;
                    }
                }
            }
            System.out.printf("La hora siguiente sera:%02d:%02d:%02d\n",horas,minutos,segundos);    
        }else{
            System.out.println("Error:Los datos que ingresaste estan fuera del rango");
        }
    }
    
}
