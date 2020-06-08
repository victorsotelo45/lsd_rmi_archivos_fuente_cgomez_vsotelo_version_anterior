/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorNotificaciones.sop_rmi;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidorNotificaciones.dto.ClsMensajeNotificacionDTO;


public class ClsNotificacion extends UnicastRemoteObject implements NotificacionesInt{

    public ClsNotificacion() throws RemoteException{
    }
    
    @Override
    public void notificarRegistro(ClsMensajeNotificacionDTO objNotificacion) throws RemoteException {
        
        int id = objNotificacion.getId();
        float temperatura = objNotificacion.getToC();
        System.out.println("El paciente con identificación ["+id+"] presenta una T C de ["+temperatura+"]\n" +"la cual esta fuera del rango normal");
        
    }
   
}
