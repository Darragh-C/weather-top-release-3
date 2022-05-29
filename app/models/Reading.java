package models;

import play.db.jpa.Model;
import java.util.HashMap;
import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.Entity;

@Entity
public class Reading extends Model
{
    public int code;
    public double temperature;
    public double windSpeed;
    public int windDirection;
    public long pressure;
    
    public double maxTemperature;
    public double minTemperature;
    public long maxPressure;
    public long minPressure;
    public double maxWindSpeed;
    public double minWindSpeed;

    public Timestamp timestamp = Timestamp.from(Instant.now());
    
   public Reading(int code, double temperature, double windSpeed, long pressure, int windDirection, String date)
    {
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.windDirection = windDirection;
    }
    
    public Reading(int code, double temperature, double windSpeed, long pressure, int windDirection, double maxTemperature, double minTemperature, long maxPressure, long minPressure, double maxWindSpeed, double minWindSpeed)
    {
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.windDirection = windDirection;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.maxPressure = maxPressure;
        this.minPressure = minPressure;
        this.maxWindSpeed = maxWindSpeed;
        this.minWindSpeed = minWindSpeed;
    }
    
    public int getCode()
    {
        return code;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getMaxWindSpeed() {
        return maxWindSpeed;
    }

    public double getMinWindSpeed() {
        return minWindSpeed;
    }

    public int getWindDirection() {
        return windDirection;
    }

    public long getPressure() {
        return pressure;
    }

    public long getMaxPressure() {
        return maxPressure;
    }

    public long getMinPressure() {
        return minPressure;
    }
}
