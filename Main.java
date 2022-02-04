/*Clase que permite escribir en un archivo de texto*/
import java.util.Random;


//Importamos clases que se usaran
import java.io.File;
import java.io.FileWriter;

public class Main{
	public static void main(String []args){
		
		int min = 1;
		int max = 8;

		Random random = new Random();

		int value = 0;
		String numeros = "";
		String numCadena = "";
		
		for(int i =1; i <= 3000; i = i + 1) {
			value = random.nextInt(max + min) + min;
			numCadena= String.valueOf(value);
			numeros = numeros+ numCadena +",";
		}
		
		System.out.println(numeros);
	
	
	try{
		
		//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
		File archivo=new File("Numeros.txt");
		
		//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
		FileWriter escribir=new FileWriter(archivo,true);
		
		//Escribimos en el archivo con el metodo write
		escribir.write(numeros);
		
		//Cerramos la conexion
		escribir.close();
	}
	
	//Si existe un problema al escribir cae aqui
	catch(Exception e){
	System.out.println("Error al escribir");
	}
	
	}
}
