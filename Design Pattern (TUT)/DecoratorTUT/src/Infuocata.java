//CONCRETE DECORATOR implementa la responsabilità aggiunta a COMPONENT
//e possono essere molteplici
import java.util.List;

public class Infuocata extends Incantesimo
{
	public Infuocata(Spada s)
	{
		super(s);
	}
	
	@Override
	public String getNome()
	{
		return super.getNome() + " infuocata";
	}

	@Override
	public int getDanno() 
	{
		return super.getDanno() * 2;
	}

	@Override
	public List<String> getEffetti() 
	{
		List<String> effetti = super.getEffetti();
		effetti.add("ustione");
		return effetti;
	}
}