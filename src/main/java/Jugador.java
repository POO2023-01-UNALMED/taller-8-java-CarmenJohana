package futbol;

public class Jugador extends Futbolista{

	public short golesMarcados;
	public byte dorsal;

	public Jugador(String nombre,int edad, String posicion, short golesMarcados, byte dorsal) {

		super(nombre,edad,posicion);
		this.dorsal=dorsal;
		this.golesMarcados=golesMarcados;

	}
	public Jugador() {
		super();
		this.dorsal=7;
		this.golesMarcados=289;
	}
	/***
	@Override
	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad()- o.getEdad());
	}***/


	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	@Override
	public String toString() {

		return "El futbolista "+this.getNombre()+ " tiene "+this.getEdad()+ ", y juega de "+ this.getPosicion()+" con el dorsal "+ this.dorsal+ ". Ha marcado "+this.golesMarcados;

	}
	@Override
	public int compareTo(Object o) {
		return Math.abs(this.getEdad()- ((Futbolista)o).getEdad());
	}


}
