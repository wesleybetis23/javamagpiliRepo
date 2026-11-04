public class SupportRouter {
    public static void main(String[] args) {
        
        int menuOption = 3;

        
        switch (menuOption) {
            case 1:
                System.out.print("Transferring to Technical Support...");
                break;
            case 2:
                System.out.print("Transferring to Billing & Accounts...");
                break;
            case 3:
                System.out.print("Transferring to Sales & Inquiries...");
                break;
            case 4:
                System.out.print("Connecting to Human Representative...");
                break;
            default:
                
                System.out.print("Invalid Selection. Please choose options 1 to 4.");
                break;
        }
    }
}