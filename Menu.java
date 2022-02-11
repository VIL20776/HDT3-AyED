import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    
    public int menuPrincipal() {
        System.out.println("Ingrese la opcion que desea:\n1. Asignar cantidad de elementos.");
        System.out.println("2. GnomeSort\n3. MergeSort\n4. QuickSort\n5. RadixSort\n6. HeapSort\n7. Salir");
        String opcion = scan.nextLine();
        switch (opcion) {
            case "1": //Cantidad de elementos
                return 1;
            case "2"://GnomeSort
                System.out.println("Ejecutando GnomeSort...");
                return 2;
            case "3"://MergeSort
                System.out.println("Ejecutando MergeSort...");
                return 3;
            case "4"://QuickSort
                System.out.println("Ejecutando QuickSort...");
                return 4;
            case "5"://RadixSort
                System.out.println("Ejecutando RadixSort...");
                return 5;
            case "6"://HeapSort
                System.out.println("Ejecutando HeapSort...");
                return 6;
            case "7"://Salir
                System.out.println("Saliendo...");
            default:
                return 7;
            
        }
    }

    public int cantidadNumeros() {
        System.out.println("\nIngrese cuantos elementos ordenar:");
        int op2 = Integer.parseInt(scan.nextLine());
        if (op2 > 3000) {
            System.out.println("Error: el maximo son 3000 elementos.");
            return cantidadNumeros();
        }
        return op2;
    }

    
}
