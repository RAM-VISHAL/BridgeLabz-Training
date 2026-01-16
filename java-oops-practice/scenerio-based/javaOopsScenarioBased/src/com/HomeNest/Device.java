package com.HomeNest;

public abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;           // encapsulated
    protected double energyUsage;

    // protected firmware logs (secured)
    protected String firmwareLog = "Firmware v1.0 installed";

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.energyUsage = 0;
    }

    public boolean getStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage (energy accumulation)
    public void addEnergyUsage(double usage) {
        this.energyUsage += usage;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    // Secure firmware update
    protected void updateFirmware(String log) {
        firmwareLog = log;
    }
}
