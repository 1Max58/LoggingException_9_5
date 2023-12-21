package com.example.loggingexception;

public class BatteryCharger {

    public static void chargeLiIon(double batteryVoltage) throws LowVoltageException, HighVoltageException {
        if (batteryVoltage > 4.2) {
            throw new HighVoltageException();
        }
        System.out.println("LiIon battery has been charged");
    }

    public static void chargeLeadAcid(double batteryVoltage) throws LowVoltageException {
        if (batteryVoltage < 10.8) {
            throw new LowVoltageException();
        }
        System.out.println("Lead-acid battery has been charged");
    }
}
