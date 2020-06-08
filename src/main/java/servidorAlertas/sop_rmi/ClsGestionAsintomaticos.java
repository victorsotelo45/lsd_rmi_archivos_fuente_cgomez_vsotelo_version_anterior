
package servidorAlertas.sop_rmi;

import clienteHabitacion.sop_rmi.AsintomaticoCllbckInt;
import servidorAlertas.utilidades.UtilidadesRegistroC;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import servidorAlertas.dto.ClsAsintomaticoDTO;
import servidorNotificaciones.dto.ClsMensajeNotificacionDTO;
import servidorNotificaciones.sop_rmi.NotificacionesInt;

public class ClsGestionAsintomaticos extends UnicastRemoteObject implements GestionAsintomaticosInt {

    
    private static NotificacionesInt objetoRemotoServidorNotificaciones;
    private ArrayList<AsintomaticoCllbckInt> asintomaticos;
    

    public ClsGestionAsintomaticos(String direccionIpRMIRegistry, int numPuertoRMIRegistry) throws RemoteException, NotBoundException, MalformedURLException {
        this.asintomaticos = new ArrayList<AsintomaticoCllbckInt>();
        objetoRemotoServidorNotificaciones = (NotificacionesInt)UtilidadesRegistroC.ObtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry,"ObjetoRemotoNotificaciones");
             
    }
    
    @Override
    public boolean registrarAsintomatico(AsintomaticoCllbckInt objAsintomaticoCllbck) throws RemoteException {
            
        System.out.println("Desde registrarAsintomatico()...");
        boolean  bandera = false;
                
        if(this.asintomaticos.size()<5)
        {
              bandera = this.asintomaticos.add(objAsintomaticoCllbck);

        }
        
        System.out.println("Saliendo de registrarAsintomatico()...");
        return bandera;
           
    }
    
    @Override
    public ClsAsintomaticoDTO consultarAsintomatico(int id) throws RemoteException
    {
            System.out.println("Desde consultarAsintomatico()...");
            AsintomaticoCllbckInt objAsintomaticoCllbck = existeAsintomatico(id);
            ClsAsintomaticoDTO pacienteAsintomatico = null;
            if(objAsintomaticoCllbck != null)
            {   
                pacienteAsintomatico = objAsintomaticoCllbck.getPacienteAsintomatico();
                
            }
            System.out.println("Saliendo de consultarAsintomatico()...");
                
            return pacienteAsintomatico;
		
    }

    @Override
    public boolean enviarIndicadores(int id, int frecuenciaCardiaca, int frecuenciaRespiratoria,float temperatura) throws RemoteException {
            
        System.out.println("Desde enviarIndicadores()...");
        String nombres, apellidos, tipo_id, mensaje;
        boolean bandera = false;
        int puntuacion = 0;
        ClsMensajeNotificacionDTO objMensajeNotificacion;
        ClsAsintomaticoDTO pacienteAsintomatico;
        AsintomaticoCllbckInt objAsintomaticoCllbck = existeAsintomatico(id);
        if(objAsintomaticoCllbck != null)
        {
            if(frecuenciaCardiaca < 60 || frecuenciaCardiaca > 80) puntuacion++;
            if(frecuenciaRespiratoria < 70 || frecuenciaRespiratoria > 90) puntuacion++;
            if(temperatura < 36.2 || temperatura > 37.2) puntuacion++;
            
            //pacienteAsintomatico = objAsintomaticoCllbck.getPacienteAsintomatico();
            /*
            nombres = pacienteAsintomatico.getNombres();
            apellidos = pacienteAsintomatico.getApellidos();
            tipo_id = pacienteAsintomatico.getTipo_id();
            */    
            
            if(puntuacion == 0 || puntuacion == 1)
            {
                System.out.println("El paciente debe continuar monitorizacion!!!");
                
            }
            
            if(puntuacion == 2)
            {
                mensaje = "Alerta, el personal médico debe visitar al paciente!!!";
                objAsintomaticoCllbck.notificar(mensaje);
            }
            
            if(puntuacion >=3)
            {
                mensaje = "Alerta, el personal médico debe remitir el paciente al hospital!!!";
                objAsintomaticoCllbck.notificar(mensaje);
                objMensajeNotificacion = new ClsMensajeNotificacionDTO(mensaje);
                objetoRemotoServidorNotificaciones.notificarRegistro(objMensajeNotificacion);
            }
               
            bandera = true;
        }else System.out.println("El id del paciente asintomatico no existe!!!");
        
        System.out.println("Saliendo de enviarIndicadores()...");
        return bandera;
    }
    
    public  AsintomaticoCllbckInt existeAsintomatico(int id) throws RemoteException
    {
        AsintomaticoCllbckInt resultado = null;
        for(AsintomaticoCllbckInt objAsintomaticoCllbck:asintomaticos)
        {
            if(objAsintomaticoCllbck.getPacienteAsintomatico().getId() == id)
            {    resultado = objAsintomaticoCllbck;
                  break;  
            }
        }
        return resultado;
    }
    
}
