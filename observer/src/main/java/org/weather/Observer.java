package org.weather;

/**
 * Created by ainacio on Oct, 2023
 */
public interface Observer {

    public void update(float temperature, float humidity, float pressure);
}
