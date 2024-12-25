package Exam;

public class PowerCalculator {

    // Method to calculate power
    public double calculatePower(double voltage, double current) {
        return voltage * current;
    }

    // Main method for standalone usage
    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        double voltage = 230.0; // Voltage in volts
        double current = 5.0;   // Current in amperes

        double power = Double.parseDouble(String.valueOf(calculator.calculatePower(voltage, current)));
        System.out.println("Power: " + power + " Watts"); // Output: Power: 1150.0 Watts
    }
}