public class ConcreteCreator extends Creator {

    @Override
    public Product getPosto(int tipo){
        if( 1 == tipo) return new ConcreteProductB();
        return new ConcreteProductB();
    }
    
}
