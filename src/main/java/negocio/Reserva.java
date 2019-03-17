package negocio;

import java.sql.Timestamp;
import java.util.Date;

public class Reserva implements VOReserva
{
	private long id,idTipoDocumentoPersona, documentoPersona;
	
	private String numeroHabitacion;
	
	private Double costo;
	
	private Integer numeroPersonas;
	
	private Boolean checkIn, checkOut;
	
	private Date fechaEntrada, fechaSalida;
	
	public Reserva() 
	{
		this.id = 0;
		this.idTipoDocumentoPersona = 0;
		this.documentoPersona = 0;
		this.numeroHabitacion = "";
		this.costo = 0.0;
		this.numeroPersonas = 0;
		this.checkIn = false;
		this.checkOut = false;
		this.fechaEntrada = new Timestamp(0);
		this.fechaSalida = new Timestamp(0);
	}

	public Reserva(long id, long idTipoDocumentoPersona, long documentoPersona, String numeroHabitacion, Double costo,
			Integer numeroPersonas, Boolean checkIn, Boolean checkOut, Date fechaEntrada, Date fechaSalida) 
	{
		this.id = id;
		this.idTipoDocumentoPersona = idTipoDocumentoPersona;
		this.documentoPersona = documentoPersona;
		this.numeroHabitacion = numeroHabitacion;
		this.costo = costo;
		this.numeroPersonas = numeroPersonas;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
	}

	public long getId() {return id;}

	public long getIdTipoDocumentoPersona() {return idTipoDocumentoPersona;}

	public long getDocumentoPersona() {return documentoPersona;}

	public String getNumeroHabitacion() {return numeroHabitacion;}

	public Double getCosto() {return costo;}

	public Integer getNumeroPersonas() {return numeroPersonas;}

	public Boolean getCheckIn() {return checkIn;}

	public Boolean getCheckOut() {return checkOut;}

	public Date getFechaEntrada() {	return fechaEntrada;}

	public Date getFechaSalida() {return fechaSalida;}

	public void setId(long id) {this.id = id;}

	public void setIdTipoDocumentoPersona(long idTipoDocumentoPersona) {this.idTipoDocumentoPersona = idTipoDocumentoPersona;}

	public void setDocumentoPersona(long documentoPersona) {this.documentoPersona = documentoPersona;}

	public void setNumeroHabitacion(String numeroHabitacion) {this.numeroHabitacion = numeroHabitacion;}

	public void setCosto(Double costo) {this.costo = costo;}

	public void setNumeroPersonas(Integer numeroPersonas) {this.numeroPersonas = numeroPersonas;}

	public void setCheckIn(Boolean checkIn) {this.checkIn = checkIn;}

	public void setCheckOut(Boolean checkOut) {	this.checkOut = checkOut;}

	public void setFechaEntrada(Date fechaEntrada) {this.fechaEntrada = fechaEntrada;}

	public void setFechaSalida(Date fechaSalida) {this.fechaSalida = fechaSalida;}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", idTipoDocumentoPersona=" + idTipoDocumentoPersona + ", documentoPersona="
				+ documentoPersona + ", numeroHabitacion=" + numeroHabitacion + ", costo=" + costo + ", numeroPersonas="
				+ numeroPersonas + ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	
	
}