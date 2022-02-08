import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    String lista = "";
		
	public String[] readFile (){
		 try(FileReader fileReader = new FileReader("Numeros.txt")){
		        int caracterLeido = fileReader.read();
		        while(caracterLeido!= -1) {
		            char caracter = (char) caracterLeido;
		            String caracterS = String.valueOf(caracter);
		            lista = lista + caracterS;
		            caracterLeido = fileReader.read();
		        }
		    }catch(IOException ex){
		        System.err.println("Erorr al leer el archivo");
		        ex.printStackTrace();

		    }
		 
		 return lista.split(",");
    }
}
