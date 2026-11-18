import java.util.ArrayList;

public class Arrays {
    public static void main (String a[])
    {
        int[] numbers = {5, 2, 8, 1, 3};
        //System.out.println(numbers.length);

        for(int i = 0; i <= numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers [j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers [j + 1] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(numbers));

        String[] fruits = {"apple", "orange", "banana", "melon"};
        for(int s = 0; s <= fruits.length - 1; s++) {
            System.out.println(fruits[s]);
            //replacing banana with dragonfruit in the array
            if (fruits[s] == "banana"){
                fruits[s] = "dragonfruit";
            }
            
        }
        
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits.add("lemon");
        System.out.println(newFruits);

         System.out.println(java.util.Arrays.toString(fruits));
    }
}
