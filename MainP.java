import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainP {
	public static void main(String []args){
		ArrayList<String> lista = new ArrayList<>();
		
		 try(FileReader fileReader = new FileReader("Numeros.txt")){
		        int caracterLeido = fileReader.read();
		        while(caracterLeido!= -1) {
		            char caracter = (char) caracterLeido;
		            String caracter1 = String.valueOf(caracter);
		            lista.add(caracter1);
		            caracterLeido = fileReader.read();
		        }
		    }catch(IOException ex){
		        System.err.println("Erorr al leer el archivo");
		        ex.printStackTrace();

		    }
		 
		 ArrayList<String>removed = new ArrayList<>();  
		 removed.add(",");
		 
		 lista.removeAll(removed);
		 System.out.print(lista);
	}
}
