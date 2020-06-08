package servidorNotificaciones.dto;

import java.io.Serializable;

public class ClsMensajeNotificacionDTO implements Serializable
{
        /*
	private int id;
	private float ToC;
	*/
        private String mensaje;
	public ClsMensajeNotificacionDTO(String mensaje)
	{
            /*
		this.id = id;
		this.ToC = ToC;
            */       
	}
	/*
	public int getId(){return this.id;}
	public void setId(int id){this.id = id;}
	public float getToC(){return this.ToC;}
	public void setToC(float ToC){this.ToC = ToC;}
	*/

        public String getMensaje() {return mensaje;}
        
	
}