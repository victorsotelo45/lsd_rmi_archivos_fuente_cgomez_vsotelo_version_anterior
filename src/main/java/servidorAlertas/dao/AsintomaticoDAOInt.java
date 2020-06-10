
package servidorAlertas.dao;

import servidorAlertas.dto.ClsAsintomaticoDTO;


public interface AsintomaticoDAOInt {
    
    public void leerHistorialAsintomatico(int id_Asintomatico);
    public void escribirHistorialAsintomatico(ClsAsintomaticoDTO pacienteAsintomatico, String fechaAlerta, String horaAlerta, int puntuacion);
    
}
