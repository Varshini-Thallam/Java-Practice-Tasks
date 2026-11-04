public class App {
    public static void main(String[] args) {
        byte sectorId = 0b00000111;

        int systemStatus = 0x2F;

        long distanceTraveled = 125000L;

        float batteryCharge = 26.9f;

        double orbitalSpeed = 12839.68;

        char signalGrade = 'A';

        boolean oxygenOK = true;

        int tick = 1;
        int missionCycle = ++tick;

        int truncatedSpeed = (int) orbitalSpeed;

        float powerConsumed = batteryCharge;

        float batteryLevel = 20.0f - batteryCharge; // 92.5f
        boolean isSystemFunctioning = (batteryLevel > 20.0f) && (oxygenOK == true);

        System.out.println("=========================================");
        System.out.println("       MARS ROVER TELEMETRY HUB          ");
        System.out.println("=========================================");
        System.out.println("Mission Cycle           : " + missionCycle);
        System.out.println("Sector ID (Binary 0b111): " + sectorId);
        System.out.println("System Hex Status       : " + systemStatus);
        System.out.println("Distance Traveled       : " + distanceTraveled + " m");
        System.out.println("Signal Grade            : " + signalGrade);
        System.out.println("-----------------------------------------");
        System.out.println("Orbital Speed (Exact)   : " + orbitalSpeed + " km/h");
        System.out.println("HUD Display Speed (int) : " + truncatedSpeed + " km/h");
        System.out.println("Power Consumed          : " + powerConsumed + "%");
        System.out.println("-----------------------------------------");
        System.out.println("Systems Nominal         : " + isSystemFunctioning);
        System.out.println("=========================================");
    }
}
