package puchamon;

public class Ejecutable {
	
	public static void main(String[] args) {
		
		Pikachu pika = new Pikachu(1, "Pikachu", 12.5, "Macho", 1, "Electrico");
		Charmander cha = new Charmander(2, "Charmander", 12.5, "Macho", 1, "Fuego");
		Bulbasaur bul = new Bulbasaur(3, "Bulbasaur", 12.5, "Macho", 1, "Planta");
		Squirtle sq = new Squirtle (4, "Squirtle", 12.5, "Macho", 1, "Agua");
		
		System.out.println("Soy " + pika.getNombrePokemon());
		System.out.println("Mi numero de pokedex es  " + pika.getNum_pokedex());
		System.out.println("Peso " + pika.getPesoPokemon() + " Kg");
		System.out.println("Mi sexo es: " + pika.getSexo());
		System.out.println("Aparezco en la temporada N°" + pika.getTemporadaEnQueAparece());
		System.out.println("Soy del tipo " + pika.getTipo());
		pika.atacarAraniazo();
		pika.atacarImpactrueno();
		pika.atacarMordizco();
		pika.atacarPlacaje();
		pika.atacarPunioTrueno();
		pika.atacarRayo();
		pika.atacarRayoCarga();
		System.out.println("Soy " + cha.getNombrePokemon());
		System.out.println("Mi numero de pokedex es  " + cha.getNum_pokedex());
		System.out.println("Peso " + cha.getPesoPokemon() + " Kg");
		System.out.println("Mi sexo es: " + cha.getSexo());
		System.out.println("Aparezco en la temporada N°" + cha.getTemporadaEnQueAparece());
		System.out.println("Soy del tipo " + cha.getTipo());
		cha.atacarAraniazo();
		cha.atacarAscuas();
		cha.atacarLanzallamas();
		cha.atacarMordizco();
		cha.atacarPlacaje();
		cha.atacarPlacaje();
		cha.atacarPunioFuego();
		System.out.println("Soy " + bul.getNombrePokemon());
		System.out.println("Mi numero de pokedex es  " + bul.getNum_pokedex());
		System.out.println("Peso " + bul.getPesoPokemon() + " Kg");
		System.out.println("Mi sexo es: " + bul.getSexo());
		System.out.println("Aparezco en la temporada N°" + bul.getTemporadaEnQueAparece());
		System.out.println("Soy del tipo " + bul.getTipo());
		bul.atacarAraniazo();
		bul.atacarDrenaje();
		bul.atacarHojaAfilada();
		bul.atacarLatigoCepa();
		bul.atacarMordizco();
		bul.atacarParalizar();
		bul.atacarPlacaje();
		System.out.println("Soy " + sq.getNombrePokemon());
		System.out.println("Mi numero de pokedex es  " + sq.getNum_pokedex());
		System.out.println("Peso " + sq.getPesoPokemon() + " Kg");
		System.out.println("Mi sexo es: " + sq.getSexo());
		System.out.println("Aparezco en la temporada N°" + sq.getTemporadaEnQueAparece());
		System.out.println("Soy del tipo " + sq.getTipo());
		sq.atacarAraniazo();
		sq.atacarBurbuja();
		sq.atacarHidrobomba();
		sq.atacarHidropulso();
		sq.atacarMordizco();
		sq.atacarPistolaAgua();
		sq.atacarPlacaje();
		
	}

}
