package ahorcado;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lectura {
    FileReader fr;
    BufferedReader br;
    
    public Lectura(String ruta)throws FileNotFoundException{
        fr=new FileReader(ruta);
    }
    public ArrayList leer()throws FileNotFoundException, IOException{
        String cad="";
        ArrayList <String> cadenas=new ArrayList();
        int i=0;
        br=new BufferedReader(fr);
        while((cad=br.readLine())!=null){
            cadenas.add(cad);
            i++;
        }
        return cadenas;
    }
}
