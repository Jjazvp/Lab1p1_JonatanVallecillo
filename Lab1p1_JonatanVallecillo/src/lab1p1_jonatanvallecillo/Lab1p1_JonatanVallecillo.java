package lab1p1_jonatanvallecillo;

import java.util.Scanner;


public class Lab1p1_JonatanVallecillo {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int numero = 2;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        System.out.println("Elija el ejercicio");
        numero = scanner.nextInt();
        
        if (numero == 1){
            int num1 = 15;
            int num2 = 30;
            int resultado;
            resultado = 15*30;
            System.out.print("resultado");
            System.out.println(resultado);        
                                
        }else if (numero == 2){            
            System.out.println("Ingrese un número entero: ");
            int numeroUsuario = scanner.nextInt();            
            System.out.println("Ingrese un número entero: ");
            int numeroUsuario2 = scanner.nextInt();
            System.out.println("Ingrese un número entero: ");
            int numeroUsuario3 = scanner.nextInt();
            
            double promedio = (numeroUsuario + numeroUsuario2 + numeroUsuario3) / 3;
                    
            System.out.println("promedio");
            System.out.println(promedio);
            
        }else{    
            System.out.println("Salió del programa");
        }
    }
    
}
