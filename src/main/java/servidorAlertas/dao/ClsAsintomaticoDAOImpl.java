
package servidorAlertas.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.exit;
import servidorAlertas.dto.ClsAsintomaticoDTO;

public class ClsAsintomaticoDAOImpl implements AsintomaticoDAOInt{
    
    @Override
    public void escribirHistorialAsintomatico(ClsAsintomaticoDTO pacienteAsintomatico,String fechaAlerta, String horaAlerta, int puntuacion)
    {
        int id;
        String tipo_id, nombres, apellidos, directorioArchivo;
        id = pacienteAsintomatico.getId();
        tipo_id = pacienteAsintomatico.getTipo_id();
        nombres = pacienteAsintomatico.getNombres();
        apellidos = pacienteAsintomatico.getApellidos();
        FileWriter archivo = null;
        PrintWriter pw = null;
        
        directorioArchivo = "src/main/java/servidorAlertas/";
        
        try
        {
            archivo = new FileWriter(directorioArchivo+"historialDeAlertas.txt",true);
            
            if(archivo == null)
            {
                System.out.println("Error al abrir el archivo para escritura!!!");
                exit(0);
            }
                pw = new PrintWriter(archivo);
                pw.println(id+" "+tipo_id+" "+nombres+" "+apellidos+" "+fechaAlerta+" "+horaAlerta+" "+puntuacion);

        } catch (IOException e) {
            e.printStackTrace();
        } finally 
        {
           try 
           {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != archivo)
              archivo.close();
           } 
           catch (IOException e2) {
              e2.printStackTrace();
           }
        }
        
    }
    
    @Override
    public void leerHistorialAsintomatico(int id_asintomatico)
    {
        String directorioArchivo;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        directorioArchivo = "src/main/java/servidorAlertas/";

        try 
        {
             // Apertura del fichero y creacion de BufferedReader para poder
             // hacer una lectura comoda (disponer del metodo readLine()).
             archivo = new File (directorioArchivo+"historialDeAlertas.txt");
             fr = new FileReader (archivo);
             br = new BufferedReader(fr);
             
            if(archivo.exists() == false)
            {
                System.out.println("Error al abrir el archivo para lectura!!!");
                exit(0);
            }
             // Lectura del fichero
             int i;
             String[] datos_asintomatico = null; 
             String linea;
             System.out.println("Fecha_Alerta Hora_de_Alerta Puntuacion");
             while((linea=br.readLine())!=null)
             {   datos_asintomatico = linea.split(" ");
                 i = datos_asintomatico.length - 1;
                if(Integer.parseInt(datos_asintomatico[0]) == id_asintomatico)
                {
                    System.out.println(datos_asintomatico[i-2]+"   "+datos_asintomatico[i-1]+"       "+datos_asintomatico[i]);
                }
             }      
        }
        catch(IOException e){
             e.printStackTrace();
         }finally
         {
             // En el finally cerramos el fichero, para asegurarnos
             // que se cierra tanto si todo va bien como si salta 
             // una excepcion.
             try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
             }catch (IOException e2){ 
                e2.printStackTrace();
             }
         }
    }
    
}
