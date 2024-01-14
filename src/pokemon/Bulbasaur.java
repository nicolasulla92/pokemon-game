package puchamon;

public class Bulbasaur extends Pokemon implements IPlanta {

	public Bulbasaur(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnQueAparece,
			String tipo) {
		super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaEnQueAparece, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Soy Bulbasaur y estoy atacando con Paralizar");
		
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Soy Bulbasaur y estoy atacando con Drenaje");
		
	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println("Soy Bulbasaur y estoy atacando con Hoja afilada");
		
	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println("Soy Bulbasaur y estoy atacando con Latigo cepa");
		
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Bulbasaur y estoy atacando con Placaje");
		
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Bulbasaur y estoy atacando con Ara�azo");
		
	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Bulbasaur y estoy atacando con Mordizco");
		
	}

}
