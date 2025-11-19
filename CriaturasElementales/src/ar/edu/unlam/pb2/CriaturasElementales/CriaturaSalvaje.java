package ar.edu.unlam.pb2.CriaturasElementales;

public class CriaturaSalvaje extends Criatura {

	private CriaturaSalvaje(String nombre, Integer energia, Afinidad afinidad, Emocion emocion) {
		super(nombre, energia, afinidad, emocion);
	}

	@Override
	public void incrementarEnergia(Integer cantidad) {
		this.energia += cantidad;
		if (this.energia > 200) {
			throw new IllegalStateException("Salvaje '" + this.nombre + "' excede 200 de energía: " + this.energia);
		}
	}
}
