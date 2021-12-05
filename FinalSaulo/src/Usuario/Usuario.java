package Usuario;

import recursos.Recursos;

public class Usuario {
	
	
	private String nombreUsuario;
	private Recursos recursos = new Recursos();
	
	
	
	public Usuario(String usuario) {
		
		this.nombreUsuario = usuario;
		
		
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public Recursos getRecursos() {
		return recursos;
	}


	public void setRecursos(Recursos recursos) {
		this.recursos = recursos;
	}


	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", recursos=" + recursos + "]";
	}
	
	
	

}
