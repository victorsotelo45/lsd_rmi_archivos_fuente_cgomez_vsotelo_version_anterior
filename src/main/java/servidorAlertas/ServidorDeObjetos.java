package servidorAlertas;

import clienteHabitacion.utilidades.UtilidadesConsola;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import servidorAlertas.utilidades.UtilidadesRegistroS;
import servidorAlertas.sop_rmi.ClsGestionAsintomaticosImpl;

public class ServidorDeObjetos
{
     	public static void main (String args[]) throws RemoteException, NotBoundException, MalformedURLException
	{
		int numPuertoRMIRegistry = 0;
		String direccionIpRMIRegistry = "";
		System.out.print("Cual es la direccion ip donde se encuentra el rmiregistry: ");
		direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
		System.out.print("Cual es el numero de puerto por el cual escucha el rmiregistry: ");
		numPuertoRMIRegistry = UtilidadesConsola.leerEntero();
		ClsGestionAsintomaticosImpl objRemoto = new ClsGestionAsintomaticosImpl(direccionIpRMIRegistry,numPuertoRMIRegistry);
		
		try
		{
			UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry);
			UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionIpRMIRegistry, numPuertoRMIRegistry, "ObjetoGestionAsintomaticos");
                        
                        
		}catch(RemoteException e)
		{
			System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
			
		}
	}

}