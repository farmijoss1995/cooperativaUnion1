package ec.ups.edu.app.g2.cooperativaUnion.utils;

import java.io.Serializable;

public class SolicitudpPolTemp implements Serializable {
	private int plazo_meses;
	private String proposito_poliza;
	private int monto_poliza;
	private String  tipo_empleado;
	private String estado_civil;
	private int avaluo_vivienda;
	private String   activos;
	private String  vivienda;
	private String  empleo;
	private String  trabajador_extranjero;
	public int getPlazo_meses() {
		return plazo_meses;
	}
	public void setPlazo_meses(int plazo_meses) {
		this.plazo_meses = plazo_meses;
	}
	
	public String getProposito_poliza() {
		return proposito_poliza;
	}
	public void setProposito_poliza(String proposito_poliza) {
		this.proposito_poliza = proposito_poliza;
	}
	public int getMonto_poliza() {
		return monto_poliza;
	}
	public void setMonto_poliza(int monto_poliza) {
		this.monto_poliza = monto_poliza;
	}
	public String getTipo_empleado() {
		return tipo_empleado;
	}
	public void setTipo_empleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public int getAvaluo_vivienda() {
		return avaluo_vivienda;
	}
	public void setAvaluo_vivienda(int avaluo_vivienda) {
		this.avaluo_vivienda = avaluo_vivienda;
	}
	public String getActivos() {
		return activos;
	}
	public void setActivos(String activos) {
		this.activos = activos;
	}
	public String getVivienda() {
		return vivienda;
	}
	public void setVivienda(String vivienda) {
		this.vivienda = vivienda;
	}
	public String getEmpleo() {
		return empleo;
	}
	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}
	public String getTrabajador_extranjero() {
		return trabajador_extranjero;
	}
	public void setTrabajador_extranjero(String trabajador_extranjero) {
		this.trabajador_extranjero = trabajador_extranjero;
	}
	
	
	
	

}
