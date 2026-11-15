public class Motor {
    public static void main(String a[]) {
        String brandName = "sparkMAX";
        double runningSpeed = 0.0;
        boolean isRunning = false;

        MotorFunction motorRef = new MotorFunction();

        if (runningSpeed == 0.0 && isRunning == false) {
            motorRef.displayInfo(runningSpeed, isRunning, brandName);
            runningSpeed = 2500.5;
            isRunning = motorRef.setSpeed(brandName,runningSpeed);  
            if (isRunning == true) {                
                motorRef.displayInfo(runningSpeed, isRunning, brandName);
            } 
        }
    }
}

class MotorFunction {
    public boolean start(String brandName, double speed) {
        System.out.println(brandName + " Motor is starting setting the speed to " + speed + " RPM");
        return true;            
    }
    
    public int stop() {
        //System.out.println("Motor is stopped");
        return 0;
    }

    public boolean setSpeed(String brandName,double speed) {
        System.out.println(brandName + " speed set to " + speed + " RPM");
        if (speed > 0.0) {
            start(brandName, speed);
            return true;
        }
        else {
            System.out.println("We cannot start the " + brandName + " because the speed is set to " + speed + " RPM");
            return false;
        }

    }

    public void displayInfo(double speed, boolean isRunning, String brandName) {
            System.out.println("-----------------------------");
        if (isRunning == true) {    
            System.out.println(brandName + " Motor is currently running.");
            System.out.println("Speed: " + speed + " RPM");
            System.out.println("Status: RUNNING");
            System.out.println("-----------------------------");
        } else {
            System.out.println(brandName + " Motor is currently stopped");
            System.out.println("Speed: " + speed + " RPM");
            System.out.println("Status: STOPPED");
            System.out.println("-----------------------------");
        }       
    }
}