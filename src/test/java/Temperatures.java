import java.util.ArrayList;

public class Temperatures {
    public static void main(String[] args) {
        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);

        System.out.println("The lowest temperature is: " + weeklyTemperatures.get(1));

        weeklyTemperatures.add(2, 111);
        System.out.println("New temperature is: " + weeklyTemperatures.get(2));

//        for (int j = 0; j< weeklyTemperatures.size(); j++ ){
//            System.out.println("There are weeklyTemperatures: " + weeklyTemperatures.get(j));

            for (Integer temperature :
                    weeklyTemperatures) {
                System.out.println("There are weeklyTemperatures: " + temperature);
            }
        }
    }

