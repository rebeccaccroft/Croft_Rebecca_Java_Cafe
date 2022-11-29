public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double pouroverPrice = 3.25;
        double cortadoPrice = 3.25;
        double macchiatoPrice = 2.50;
        

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean orderComplete = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println("--------------------------");
        System.out.println(generalGreeting + customer1 + displayTotalMessage + pouroverPrice); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println("--------------------------");
        if (!isReadyOrder1){
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }
        else{
        System.out.println(generalGreeting + customer4 + readyMessage);
        }
        System.out.println("--------------------------");
        if (!orderComplete){
            System.out.println(generalGreeting + customer2);
            System.out.println(displayTotalMessage + cortadoPrice*2 );
        }
        System.out.println("--------------------------");
        System.out.println(customer3 + displayTotalMessage + (mochaPrice-macchiatoPrice) + ". We apologize for the inconvenience");
        System.out.println("--------------------------");
        

        
        
    	// ** Your customer interaction print statements will go here ** //
    }
}
