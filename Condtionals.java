public class Condtionals {
    
    public static void main(String[] args) {
        int count = 0;

        while(true){

            System.out.printf("Counter: %d\n", count);
            count++;

            if(count > 10){
                System.out.println("Completed.");
                break;
            }
            else {
                System.out.println("Keep looping.");
            }

        }
    }
}
