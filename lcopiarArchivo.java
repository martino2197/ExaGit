import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author rodrigov
 */

class copiarBuffer{
    public void copia(){
        try{
            File f = new File("/home/rodrigov/Documentos/pruebalectura")
            FileReader fr = new FileReader(); //caracter por caracter
            BufferedReader br = new BufferedReader(fr); //linea por linea
            String linea;

            File archivo = new File("/home/rodrigov/Documentos/archivocopia");
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            While((linea=br.readLine()) != null){
                 bw.write(linea+"\n");
            }

            br.close();
            fr.close();
            bw.close();
            fw.close();
        }
        catch(IOException e){}
    }
}


/*public class EscrituraConBuffer {
    public void escribe(String escribiendo){
        String cadena;
        File archivo;
        FileWriter fw;
        BufferedWriter bw;
        try{
            archivo = new File("/home/rodrigov/Documentos/pruebadeescritura");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            Scanner teclado = new Scanner(System.in);
            do{
                cadena = teclado.nextLine();
                bw.write(cadena+"\n");
            }while(!cadena.equals("adios"));
            bw.flush();
            bw.close();
            fw.close();
        }
        catch(IOException e){}
        
    }
}*/