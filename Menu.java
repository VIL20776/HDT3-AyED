import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    
    public int menuPrincipal() {
        System.out.println("Ingrese la opcion que desea:");
        String opcion = scan.nextLine();
        switch (opcion) {
            case "1": //Cantidad de elementos
                System.out.println();
                return 1;
            case "2"://GnomeSort
                System.out.println();
                return 2;
            case "3"://MergeSort
                System.out.println();
                return 3;
            case "4"://QuickSort
                System.out.println();
                return 4;
            case "5"://RadixSort
                System.out.println();
                return 5;
            case "6"://HeapSort
                System.out.println();
                return 6;
            case "7"://Salir
                System.out.println();
            default:
                return 7;
            
        }
    }

    public int cantidadNumeros() {
        System.out.println("Elija cuantos elementos ordenar.");
        String op2 = scan.nextLine();
        switch (op2) {
            case "1":
                return 10;
        
            default:
                return 0;
        }
    }

    
}
