package simuladormonitor;

import java.awt.JobAttributes;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SimuladorMonitor {
     public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena="",Fin="";
        //String aux,aux1;
        ArrayList listbin=new ArrayList();
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null){
            //if(band==0){
            Fin=Fin+cadena;
        }
        System.out.println(Fin);
     
        for(int i=0;i<Fin.length();i=i+2){
            char aux=Fin.charAt(i);
            char aux1=Fin.charAt(i+1);
            //int numero = Integer.parseInt(aux.concat(aux1), 16); 
            listbin.add(aux);
            String valor = Integer.toHexString((int)(listbin.get(i))).toUpperCase();
            System.out.println(valor);
           
        }
        
        
            /*System.out.println("llego");
            if(band==0){
               
               band++; 
               i++;
               System.out.println(i);
            }
            if(band==1){
               Fin= aux.concat(cadena.charAt(i));
               System.out.println("#"+aux);
               band=0;
               i++;               
               listbin.add(aux);
               System.out.println(i);
               aux=null;
            }
            if(cadena.equalsIgnoreCase("")){
                for(int j=0;j<listbin.size();j++)
                    System.out.println(listbin.get(j));
             }
             i++;
             System.out.println(i);
         }*/
        b.close();
    }
 
    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Users\\ELECTRONICA\\Documents\\Prueba\\Primeros Datos.txt");
    }
    
}
