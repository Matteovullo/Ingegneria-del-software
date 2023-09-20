//I TEST
public class TestSpada 
{
	public static void main(String[] args) 
	{
		print(Emporio.compraSpada());
		print(Emporio.compraSpadaInfuocata());
		print(Emporio.compraSpadaSpettraleInfuocata());
		print(Emporio.compraSpadaInfuocataPesante()); // l'ordine puÃ² essere importante!
		print(Emporio.compraSpadaPesanteInfuocata());
		print(Emporio.compraSpadaPesantePesante());
        print(Emporio.compraSpadaSpettraleInfuocataPesante());

	}

	private static void print(Spada s) 
	{
		System.out.println();
		System.out.println(s.getNome() + ": " + s.getDanno() + " danni");
		System.out.println("Effetti:");
		s.getEffetti().forEach(e -> System.out.println("- " + e));
	}

}