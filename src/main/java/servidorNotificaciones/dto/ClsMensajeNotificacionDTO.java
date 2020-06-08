package servidorNotificaciones.dto;

import java.io.Serializable;

public class ClsMensajeNotificacionDTO implements Serializable
{
	private int id;
	private float ToC;
	
	public ClsMensajeNotificacionDTO(int id, float ToC)
	{
		this.id = id;
		this.ToC = ToC;
	}
	
	public int getId(){return this.id;}
	public void setId(int id){this.id = id;}
	public float getToC(){return this.ToC;}
	public void setToC(float ToC){this.ToC = ToC;}
	
	
}