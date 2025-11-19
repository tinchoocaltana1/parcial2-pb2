package ar.edu.unlam.pb2.CriaturasElementales;

public class CriaturaAncestral extends Criatura{

	protected CriaturaAncestral(String nombre, Integer energia, Afinidad afinidad, Emocion emocion) {
		super(nombre, energia, afinidad, emocion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void decrementarEnergia(Integer cantidad) {
		this.energia -= cantidad;
		if(this.energia < 100) {
			this.energia = 100;
		}
	}
	
}
