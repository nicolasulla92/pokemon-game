package puchamon;

public abstract class Pokemon {

	private int num_pokedex;
	private String nombrePokemon;
	private double pesoPokemon;
	private String sexo;
	private int temporadaEnQueAparece;
	private String tipo;
	
	public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaEnQueAparece,
			String tipo) {
		this.num_pokedex = num_pokedex;
		this.nombrePokemon = nombrePokemon;
		this.pesoPokemon = pesoPokemon;
		this.sexo = sexo;
		this.temporadaEnQueAparece = temporadaEnQueAparece;
		this.tipo = tipo;
	}
	
	public int getNum_pokedex() {
		return num_pokedex;
	}

	public String getNombrePokemon() {
		return nombrePokemon;
	}

	public double getPesoPokemon() {
		return pesoPokemon;
	}

	public String getSexo() {
		return sexo;
	}

	public int getTemporadaEnQueAparece() {
		return temporadaEnQueAparece;
	}

	public String getTipo() {
		return tipo;
	}

	public abstract void atacarPlacaje();
	public abstract void atacarAraniazo();
	public abstract void atacarMordizco();
	
}
