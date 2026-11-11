public class LittleMonkeysLoops {
    public static void main(String[] args) {
        int monkeyCount = 3;

        System.out.println("=== 1. For Loop: The Nursery Rhyme Countdown ===");

        for(int i = monkeyCount; i > 0; i--) {
            System.out.println(i + " little monkeys jumping on the bed,");
            System.out.println("One fell off and bumped his head,");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("\"No more monkeys jumping on the bed!\"\n");
        }

        System.out.println("\n=== 2. While Loop: Doctor's Checkup Routine ===");
        int checkUpCount = 1;
        while(checkUpCount <= monkeyCount) {
            System.out.println("Doctor is examining monkey #" + checkUpCount +"... All cleared!");
            checkUpCount++;
        }

        System.out.println("\n=== 3. Do-While Loop: Bedtime Verification ===");
        do {
            System.out.println("Tucking in monkey #" + monkeyCount +"... Fast asleep!");
            monkeyCount--;
        } while(monkeyCount <= 3 && monkeyCount > 0);
    }
}
