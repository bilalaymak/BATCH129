package mentorship.practices.x2;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice05 {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> days;
    static ArrayList<Double> dailyIncomes;

    public static void main(String[] args) {
        Practice05 grocery =new Practice05();
        grocery();
        getIncome();
        System.out.println("Average Income: " + getAverageIncome() );
        System.out.println("Days of lower-Average Income: " + grocery.getDaysOfIncomeLowerAverage());
        System.out.println("Days of over-Average Income: " + grocery.getDaysOfIncomeOverAverage());
    }
    public static void grocery(){
        days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
    }
    public static void getIncome(){
        dailyIncomes = new ArrayList<>();
        for (int i = 0; i < days.size(); i++){
            System.out.println(" enter your income for the day of " +days.get(i) + " : " );
            double dailyIncome = input.nextDouble();
            dailyIncomes.add(dailyIncome);
        }
    }
    public static double getAverageIncome(){
        double sum =0;
        for (double w : dailyIncomes){
            sum += w;
        }
        return  sum / days.size();
    }
    public ArrayList<String> getDaysOfIncomeOverAverage(){
        ArrayList<String> daysOfOverIncome = new ArrayList<>();
        double averageIncome = getAverageIncome();
        for(int i = 0; i<days.size(); i++){
            if(dailyIncomes.get(i)> averageIncome){
                daysOfOverIncome.add(days.get(i));
            }
        }
        return daysOfOverIncome;
    }
    public ArrayList<String> getDaysOfIncomeLowerAverage(){
        ArrayList<String> daysOfLowerIncome = new ArrayList<>();
        double averageIncome = getAverageIncome();
        for (int i = 0; i < days.size(); i++){
            if (dailyIncomes.get(i)< averageIncome){
                daysOfLowerIncome.add(days.get(i));
            }
        }
        return  daysOfLowerIncome;
    }
}
















