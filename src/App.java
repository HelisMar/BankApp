public class App {
    public static void main(String[] args) throws Exception {
       
        Account customer1 = new Account(); //Lõi uue account objecti - uue kliendi
        customer1.deposit(500);     //Lisasin 500 raha

        Account customer2 = new Account();
        customer2.deposit(100);
        

        System.out.println("Esimesel kleindil on kontol raha: " + (customer1.getBalance()) + " eurot" );
        System.out.println("Teisel kleindil on kontol raha: " + (customer2.getBalance()) + " eurot" );

        customer2.withdraw(500);    // ei ole piisavalt raha, et maha läheks ja siis ongi balance saama

        
        System.out.println("Esimesel kleindil on kontol raha: " + (customer1.getBalance()) + " eurot" );
        System.out.println("Teisel kleindil on kontol raha: " + (customer2.getBalance()) + " eurot" );  

    }
}
