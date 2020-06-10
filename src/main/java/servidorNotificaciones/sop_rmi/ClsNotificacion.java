
package servidorNotificaciones.sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidorAlertas.dao.AsintomaticoDAOImpl;
import servidorAlertas.dto.ClsAsintomaticoDTO;
import servidorNotificaciones.dto.ClsMensajeNotificacionDTO;


public class ClsNotificacion extends UnicastRemoteObject implements NotificacionesInt{

    public ClsNotificacion() throws RemoteException{
    }
    
    @Override
    public void notificarRegistro(ClsMensajeNotificacionDTO objNotificacion) throws RemoteException {
        
        ClsAsintomaticoDTO pacienteAsintomatico = objNotificacion.getPacienteAsintomatico();
        int frecuanciaCardiaca, frecuenciaRespiratoria;
        float temperatura;
        
        System.out.println("Alerta Generada");
        System.out.println("Id: "+pacienteAsintomatico.getId());
        System.out.println("Nombres: "+pacienteAsintomatico.getNombres());
        System.out.println("Apellidos: "+pacienteAsintomatico.getApellidos());
        System.out.println("Direccion: "+pacienteAsintomatico.getDireccion());
        frecuanciaCardiaca = objNotificacion.getFrecuenciaCardiaca();
        frecuenciaRespiratoria = objNotificacion.getFrecuenciaRespiratoria();
        temperatura = objNotificacion.getTemperatura();
        System.out.println("Indicadores que generaron la Alerta");
        if(frecuanciaCardiaca != 0)
            System.out.println("Frecuencia Cardiaca: "+frecuanciaCardiaca);
        if(frecuenciaRespiratoria != 0)
            System.out.println("Frecuencia Respiratoria: "+frecuenciaRespiratoria);
        if(temperatura != 0)
            System.out.println("Temperatura: "+temperatura);
        
        System.out.println("El personal medico debe revisar el paciente");
        AsintomaticoDAOImpl objetoAsintomaticoDAO = new AsintomaticoDAOImpl();
        objetoAsintomaticoDAO.leerHistorialAsintomatico(pacienteAsintomatico.getId());
        
    }
   
}
