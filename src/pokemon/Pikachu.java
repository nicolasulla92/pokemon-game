package puchamon;

public class Pikachu extends Pokemon implements IElectrico {
	

	public Pikachu(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnQueAparece,
			String tipo) {
		super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaEnQueAparece, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Pikachu y estoy atacando con Placaje");
		
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Pikachu y estoy atacando con Ara�azo");
		
	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Pikachu y estoy atacando con Mordizco");
		
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
		
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Soy Pikachu y estoy atacando con Punio Trueno");
		
	}

	@Override
	public void atacarRayo() {
		System.out.println("Soy Pikachu y estoy atacando con Rayo");
		
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Soy Pikachu y estoy atacando con Rayo Carga");
		
	}

}
