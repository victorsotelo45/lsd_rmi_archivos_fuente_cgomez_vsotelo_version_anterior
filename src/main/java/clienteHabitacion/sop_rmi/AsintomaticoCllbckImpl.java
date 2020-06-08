
package clienteHabitacion.sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidorAlertas.dto.ClsAsintomaticoDTO;

public class AsintomaticoCllbckImpl extends UnicastRemoteObject implements AsintomaticoCllbckInt
{       
        public ClsAsintomaticoDTO pacienteAsintomatico;
        
        public AsintomaticoCllbckImpl() throws RemoteException
        {
                super(); //invoca al constructor de la clase base

        }

        public AsintomaticoCllbckImpl(ClsAsintomaticoDTO pacienteAsintomatico) throws RemoteException
        {
                this.pacienteAsintomatico = pacienteAsintomatico;     
        }
        
    @Override
    public ClsAsintomaticoDTO getPacienteAsintomatico() throws RemoteException {
        return this.pacienteAsintomatico;
    }
    
    @Override
    public void notificar(String mensaje) throws RemoteException {
        
        System.out.println("Mensaje enviado del servidor de alertas: "+mensaje); 
    }

}
