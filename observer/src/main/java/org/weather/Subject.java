package org.weather;

/**
 * Created by ainacio on Oct, 2023
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
