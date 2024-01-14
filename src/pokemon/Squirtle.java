package puchamon;

public class Squirtle extends Pokemon implements IAgua {

	public Squirtle(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnQueAparece,
			String tipo) {
		super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaEnQueAparece, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacarHidrobomba() {
		System.out.println("Soy Squirtle y estoy atacando con Hidro bomba");
		
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Soy Squirtle y estoy atacando con Pistola de agua");
		
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Soy Squirtle y estoy atacando con Burbuja");
		
	}

	@Override
	public void atacarHidropulso() {
		System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
		
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Squirtle y estoy atacando con Placaje");
		
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Squirtle y estoy atacando con Ara�azo");
		
	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Squirtle y estoy atacando con Mordizco");
		
	}

}
