public class Client {
    public static void main(String[] args) {
        // Creazione di un oggetto User
        User user = new User();
        user.setName("John");
        user.setAge(30);
        
        Address address = new Address();
        address.setStreet("123 Main Street");
        address.setCity("New York");
        
        user.setAddress(address);
        
        try {
            // Clonazione dell'oggetto User
            User clonedUser = user.clone();
            
            // Modifica dei dati nel clonedUser
            clonedUser.setName("Jane");
            clonedUser.getAddress().setCity("San Francisco");
            
            // Stampa dei dati dell'oggetto User originale
            System.out.println("User: " + user.getName() + ", " + user.getAge() + ", " + user.getAddress().getCity());
            
            // Stampa dei dati dell'oggetto User clonato
            System.out.println("Cloned User: " + clonedUser.getName() + ", " + clonedUser.getAge() + ", " + clonedUser.getAddress().getCity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
