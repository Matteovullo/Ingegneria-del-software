//DECORATOR implementa un oggetto COMPONENT e definisce una interfaccia conforme
//a quella di COMPONENT, inoltrando le richieste a COMPONENT e può fare
//operazioni prima e dopo l'inoltro della richiesta.
import java.util.List;

public class Incantesimo implements Spada
{
	private Spada component;
	
	public Incantesimo(Spada s)
	{
		component = s;
	}
	
	@Override
	public String getNome() 
	{
		return component.getNome();
	}

	@Override
	public int getDanno() 
	{
		return component.getDanno();
	}

	@Override
	public List<String> getEffetti() 
	{
		return component.getEffetti();
	}
}