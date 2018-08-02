package ca.roumani.bmi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by user on 1/13/17.
 */
public class BMIModel
{
    private double weight;
    private double height;

    public BMIModel(String w, String h) {
        try {
            this.weight = Double.parseDouble(w);
            this.height = Double.parseDouble(h);
        } catch (NumberFormatException e) {
            // p did not contain a valid double
        }
    }

    public String getBMI() {
        double bmi = this.weight / Math.pow(this.height, 2);
        return String.format("%.1f", bmi);
    }

    public String getWeightInPound() {
        int weightInLb = (int) Math.round(this.weight * 2.20);
        return String.format("%d", weightInLb);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        BMIModel model1 = new BMIModel("67.1317", "1.79");
        output.println(String.format("Your weight in pound is %s and your BMI is %s", model1.getWeightInPound(), model1.getBMI()));

        BMIModel model2 = new BMIModel("55.2", "1.65");
        output.println(String.format("Your weight in pound is %s and your BMI is %s", model2.getWeightInPound(), model2.getBMI()));

        BMIModel model3 = new BMIModel("85.43", "2.2");
        output.println(String.format("Your weight in pound is %s and your BMI is %s", model3.getWeightInPound(), model3.getBMI()));
    }
}
