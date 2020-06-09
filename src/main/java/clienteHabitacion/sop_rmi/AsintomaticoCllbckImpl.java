
package clienteHabitacion.sop_rmi;

import clienteHabitacion.GUICliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidorAlertas.dto.ClsAsintomaticoDTO;

public class AsintomaticoCllbckImpl extends UnicastRemoteObject implements AsintomaticoCllbckInt
{       
        public ClsAsintomaticoDTO pacienteAsintomatico;
        GUICliente GUIC;
        
        public AsintomaticoCllbckImpl() throws RemoteException
        {
                super(); //invoca al constructor de la clase base

        }

        public AsintomaticoCllbckImpl(ClsAsintomaticoDTO pacienteAsintomatico, GUICliente GUIC) throws RemoteException
        {
                this.pacienteAsintomatico = pacienteAsintomatico;   
                this.GUIC = GUIC;
        }
        
    @Override
    public ClsAsintomaticoDTO getPacienteAsintomatico() throws RemoteException {
        return this.pacienteAsintomatico;
    }
    
    @Override
    public void notificar(String mensaje) throws RemoteException {
        GUIC.fijarAlerta(mensaje);
        System.out.println("Mensaje enviado del servidor de alertas: "+mensaje); 
    }

}
