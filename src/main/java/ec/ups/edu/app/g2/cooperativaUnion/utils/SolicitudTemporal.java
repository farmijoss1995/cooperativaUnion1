package ec.ups.edu.app.g2.cooperativaUnion.utils;

import java.util.Arrays;

import javax.persistence.Lob;

public class SolicitudTemporal {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private String numeroCuenta;
	private int id;
	private Double montoPoliza;
	private int plazoPoliza;
	
	
	private byte[] cedulaImagen;
	
	private byte[] planillaImagen;
	
	private byte[] rolPagosImagen;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Double getMontoPoliza() {
		return montoPoliza;
	}
	public void setMontoPoliza(Double montoPoliza) {
		this.montoPoliza = montoPoliza;
	}
	public int getPlazoPoliza() {
		return plazoPoliza;
	}
	public void setPlazoPoliza(int plazoPoliza) {
		this.plazoPoliza = plazoPoliza;
	}
	public byte[] getCedulaImagen() {
		return cedulaImagen;
	}
	public void setCedulaImagen(byte[] cedulaImagen) {
		this.cedulaImagen = cedulaImagen;
	}
	public byte[] getPlanillaImagen() {
		return planillaImagen;
	}
	public void setPlanillaImagen(byte[] planillaImagen) {
		this.planillaImagen = planillaImagen;
	}
	public byte[] getRolPagosImagen() {
		return rolPagosImagen;
	}
	public void setRolPagosImagen(byte[] rolPagosImagen) {
		this.rolPagosImagen = rolPagosImagen;
	}
	@Override
	public String toString() {
		return "SolicitudTemporal [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", numeroCuenta=" + numeroCuenta + ", id=" + id + ", montoPoliza=" + montoPoliza + ", plazoPoliza="
				+ plazoPoliza + ", cedulaImagen=" + Arrays.toString(cedulaImagen) + ", planillaImagen="
				+ Arrays.toString(planillaImagen) + ", rolPagosImagen=" + Arrays.toString(rolPagosImagen) + "]";
	}
	
	
	
	

}
