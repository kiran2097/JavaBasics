package LeetCode;

public class ContTestedDevices {
    public static void main(String[] args) {
            // 2960
        int[] batteryPercentages = {1,1,2,1,3};
        int tested = 0;
        for(int i = 0; i < batteryPercentages.length; i++) {

            if (batteryPercentages[i] <= 0) {
                continue;
            }
            else {
                tested++;
                for(int j = i + 1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }
        for (int i = 0; i < batteryPercentages.length; i++) {
            System.out.print(batteryPercentages[i] + " ");
        }
        System.out.println();
        System.out.println(tested);
    }
}
