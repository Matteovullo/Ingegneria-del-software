// I client sono semplici, trattano strutture sia composte che semplici uniformemente
// In modo tale che non devono sapere se trattano un LEAF O UN COMPOSITE
// Inoltre nuovi tipi di elementi (leaf o composite) possono essere aggiunti e
// funzioneranno lo stesso.
// Non è possibile vincolare il COMPOSITE solo su certi componenti LEAF

public class TestPietanza{

    public static void main (String[] args){
		// Viene creata una nuova pietanza attraverso Ricettario, istanziando una nuova
		// lista di Preparato con "getPreparato", e all'interno di esso
		// utilizziamo "getIngrediente" che ritorna appunto un ingrediente
        Pietanza tagliatelle = Ricettario.getPreparato("tagliatelle")
				.add(Ricettario.getIngrediente("farina", 80))
				.add(Ricettario.getIngrediente("uova", 20))
				.add(Ricettario.getIngrediente("sale", 5))
				.add(Ricettario.getIngrediente("acqua", 50));

		// Per la salsa
		Pietanza salsa = Ricettario.getPreparato("salsa")
				.add(Ricettario.getIngrediente("pomodoro", 60))
				.add(Ricettario.getIngrediente("olio", 10))
				.add(Ricettario.getIngrediente("aglio", 3))
				.add(Ricettario.getIngrediente("basilico", 3));

		// E per il macinato alla cipolla
		Pietanza macinato = Ricettario.getPreparato("macinato alla cipolla")
				.add(Ricettario.getIngrediente("macinato", 80))
				.add(Ricettario.getIngrediente("cipolla", 50))
				.add(Ricettario.getIngrediente("olio", 10))
				.add(Ricettario.getIngrediente("pepe", 2))
				.add(Ricettario.getIngrediente("sale", 3));

		// Mettiamo assieme la salsa e il macinato,
		// e giusto un po' di burro, per preparare il ragu
		Pietanza ragu = Ricettario.getPreparato("ragu")
				.add(macinato)
				.add(salsa)
				.add(Ricettario.getIngrediente("burro", 50));

		// Tutto e' pronto per le nostre tagliatelle alla bolognese!
		Pietanza bolognese = Ricettario.getPreparato("tagliatelle alla bolognese")
				.add(tagliatelle)
				.add(ragu);

        bolognese.mostra("");
        System.out.println("Calorie totali: " + bolognese.calcolaCalorie());

        bolognese.remove(ragu);
        System.out.println();
        bolognese.mostra("");
        System.out.println("Calorie totali: " + bolognese.calcolaCalorie());

        Pietanza salsaFunghi = Ricettario.getPreparato("salsa panna e funghi")
				.add(Ricettario.getIngrediente("panna", 40))
				.add(Ricettario.getIngrediente("funghi", 40))
				.add(Ricettario.getIngrediente("olio", 10))
				.add(Ricettario.getIngrediente("prezzemolo", 5))
				.add(Ricettario.getIngrediente("parmigiano", 20));

                bolognese.add(salsaFunghi);
                System.out.println();
                bolognese.mostra("");
                System.out.println("Calorie totali: " + bolognese.calcolaCalorie());
    }
}