package puchamon;

public class Charmander extends Pokemon implements IFuego {

	public Charmander(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnQueAparece,
			String tipo) {
		super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaEnQueAparece, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Soy Charmander y estoy atacando con Punio fuego");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Soy Charmander y estoy atacando con Ascuas");
		
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Soy Charmander y estoy atacando con Lanzallamas");
		
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Charmander y estoy atacando con Placaje");
		
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Charmander y estoy atacando con Ara�azo");
		
	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Charmander y estoy atacando con Mordizco");
		
	}
	

}
