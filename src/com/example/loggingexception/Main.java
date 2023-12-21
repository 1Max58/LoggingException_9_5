package com.example.loggingexception;

public class Main {
    public static void main(String[] args) {
        try {
            BatteryCharger.chargeLiIon(8.4);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            BatteryCharger.chargeLeadAcid(8.4);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
