package com.nitendratech.datagenerator.vo;


import java.sql.Timestamp;
import java.util.Date;

/**
 * Domain Object for Vehicle Data for IOT Devices
 */
public class VehicleData {

    // Vin Id
    private String vehicleId; // Unique ID of Vehicle to dentify
    private String vehicleType;
    private String routeId;
    private String latitude;
    private String longitude;
    private Timestamp timeStamp;
    private double vehicleSpeed; // Vehicle Speed in Mile Per Hour
    private double fuelLevel;
    private int outsideTemperature; //Outside Temperature in Degree Fareheiheit
    private int engineTemperature; //Engine Temperature Degree Fareheiheit

    public VehicleData(){

    }

    public VehicleData(String vehicleId, String vehicleType, String routeId, String latitude, String longitude, Timestamp timeStamp, double vehicleSpeed, double fuelLevel, int outsideTemperature, int engineTemperature) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.routeId = routeId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeStamp = timeStamp;
        this.vehicleSpeed = vehicleSpeed;
        this.fuelLevel = fuelLevel;
        this.outsideTemperature = outsideTemperature;
        this.engineTemperature = engineTemperature;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public double getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getOutsideTemperature() {
        return outsideTemperature;
    }

    public void setOutsideTemperature(int outsideTemperature) {
        this.outsideTemperature = outsideTemperature;
    }

    public int getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(int engineTemperature) {
        this.engineTemperature = engineTemperature;
    }

    @Override
    public String toString() {
        return "VehicleData{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", routeId='" + routeId + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", timeStamp=" + timeStamp +
                ", vehicleSpeed=" + vehicleSpeed +
                ", fuelLevel=" + fuelLevel +
                ", outsideTemperature=" + outsideTemperature +
                ", engineTemperature=" + engineTemperature +
                '}';
    }
}