

//No se les olvide la tarea :v
package escrituraarchivos;
import java.io.IOException;
import java.io.FileWriter;

public class EscrituraSinBuffer{
    public void escribir(){
        try{
            String cadena = "Hola perro\n";
            FileWriter fw = new FileWriter("/home/ricks/Documentos/pruebaescritura");
            for(int i=0; i<cadena.length(); i++){
                fw.Write(cadena.charAt(i));

            }
            fw.close()
        }catch(IOException e){}
    }
}

