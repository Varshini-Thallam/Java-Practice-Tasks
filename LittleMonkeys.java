public class LittleMonkeys {

    public static void main(String[] args) {
        int monkeyCount = 4;
        int isJumping = 0;

        isJumping = (monkeyCount > 0) ? 1 : 0; // ternary operator to check the state of the monkeys


        if (isJumping == 1) {        
            System.out.println(monkeyCount + " little monkeys jumping on the bed,");
            System.out.println("One fell off and bumped his head,");
            System.out.println("Mama called the doctor and the doctor said,");
        }
        else
            System.out.println("\"No little monkeys jumping on the bed!\"");
    
        switch(monkeyCount > 0 && isJumping == 1 ? monkeyCount : 0) {
            case 4:
                System.out.println("\"Four little monkeys jumping on the bed!\"");
                break;
            case 3:
                System.out.println("\"Three little monkeys jumping on the bed!\"");
                break;
            case 2:
                System.out.println("\"Two little monkeys jumping on the bed!\"");
                break;
            case 1:
                System.out.println("\"One little monkey jumping on the bed!\"");
                break;
            default:
                System.out.println("\"No more monkeys jumping on the bed!\"");
        }
    }   
 
}
