package jobsheet3.MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        int i = 0;

        while (i<20) {
            motor.nyalakanMesin();
            motor.printStatus();
            motor.tambahKecepatan();
            motor.printStatus();
            i++;
        }
        // motor.printStatus();
        // motor.tambahKecepatan();

        // motor.nyalakanMesin();
        // motor.printStatus();

        // motor.tambahKecepatan();
        // motor.printStatus();

        // motor.tambahKecepatan();
        // motor.printStatus();

        // motor.tambahKecepatan();
        // motor.printStatus();

        // motor.matikanMesin();
        // motor.printStatus();
    }
}
