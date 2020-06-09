/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorAlertas.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import servidorAlertas.dto.ClsAsintomaticoDTO;


public interface AsintomaticoDAOInt extends Remote{
    
    public void leerHistorialAsintomatico(int id_Asintomatico)throws RemoteException;
    public void escribirHistorialAsintomatico(ClsAsintomaticoDTO pacienteAsintomatico, String fechaAlerta, String horaAlerta, int puntuacion)throws RemoteException;
    
}
