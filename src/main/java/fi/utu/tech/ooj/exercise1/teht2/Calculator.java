package fi.utu.tech.ooj.exercise1.teht2;

public class Calculator {
    public static float avg(int[] nums) throws EmptyArrayException {
        int sum = 0;
        if (nums == null || nums.length == 0)
            throw new EmptyArrayException();
        for(int n: nums) sum += n;
        return sum / nums.length;
    }
}
// Testi