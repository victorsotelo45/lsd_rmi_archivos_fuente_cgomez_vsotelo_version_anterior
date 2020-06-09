
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
        
        System.out.println("Alerta Generada");
        System.out.println("Id: "+pacienteAsintomatico.getId());
        System.out.println("Nombres: "+pacienteAsintomatico.getNombres());
        System.out.println("Apellidos: "+pacienteAsintomatico.getApellidos());
        System.out.println("Direccion: "+pacienteAsintomatico.getDireccion());
        System.out.println("Indicadores que generaron la Alerta");
        System.out.println("Frecuencia Cardiaca: "+objNotificacion.getFrecuenciaCardiaca());
        System.out.println("Frecuencia Respiratoria: "+objNotificacion.getFrecuenciaRespiratoria());
        System.out.println("Temperatura: "+objNotificacion.getTemperatura());
        System.out.println("El personal medico debe revisar el paciente");
        
        AsintomaticoDAOImpl objetoAsintomaticoDAO = new AsintomaticoDAOImpl();
        objetoAsintomaticoDAO.leerHistorialAsintomatico(pacienteAsintomatico.getId());
        
    }
   
}
