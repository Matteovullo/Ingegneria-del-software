package DP_Facade;

public class facade {

    public static void main(String[] args) {
        facade bank = new facade();
        bank.bilancioConto();
        bank.richiediPrestito();
        bank.punteggioCredito();
    }

    private ContoBancario account;
    private PrestitoBancario loan;
    private CreditoBancario credit;

    public facade() {
        account = new ContoBancario();
        loan = new PrestitoBancario();
        credit = new CreditoBancario();
    }

    public void bilancioConto() {
        account.bilancio();
    }

    public void richiediPrestito() {
        loan.richiedi();
    }

    public void punteggioCredito() {
        credit.punteggio();
    }
}

// Sottosistemi
class ContoBancario {
    public void bilancio() {
        System.out.println("Controllo del bilancio del conto...");
    }
}

class PrestitoBancario {
    public void richiedi() {
        System.out.println("Richiesta di un prestito...");
    }
}

class CreditoBancario {
    public void punteggio() {
        System.out.println("Controllo del punteggio di credito...");
    }
}
