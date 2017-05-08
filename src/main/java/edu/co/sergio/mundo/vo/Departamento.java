package edu.co.sergio.mundo.vo;

public class Departamento {
	private int id_departamento;
	private String nom_departamento;
        private double porcentaje;
        private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
	
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getNom_departamento() {
		return nom_departamento;
	}
	public void setNom_departamento(String nom_departamento) {
		this.nom_departamento = nom_departamento;
	}
	
	

}
