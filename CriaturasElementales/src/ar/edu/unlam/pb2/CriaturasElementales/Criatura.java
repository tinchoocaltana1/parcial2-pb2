package ar.edu.unlam.pb2.CriaturasElementales;

public abstract class Criatura {
	protected final String nombre;
	protected Integer energia; // 0-200
	protected Afinidad afinidad;
	protected Emocion emocion;

	protected Criatura(String nombre, Integer energia, Afinidad afinidad, Emocion emocion) {
		this.nombre = nombre;
		this.energia = energia;
		this.afinidad = afinidad;
		this.emocion = emocion;
	}

	public Emocion getEmocion() {
		return emocion;
	}

	public void setEmocion(Emocion emocion) {
		this.emocion = emocion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public Afinidad getAfinidad() {
		return afinidad;
	}

	public void decrementarEnergia(Integer cantidad) {
		this.energia -= cantidad;
		if(this.energia < 0) {
			this.energia = 0;
		}
	}
	
	public void incrementarEnergia(Integer cantidad) {
		this.energia += cantidad;
		if(this.energia > 200) {
			this.energia = 200;
		}
		}

}