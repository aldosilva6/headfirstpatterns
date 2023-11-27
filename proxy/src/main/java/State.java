import java.io.Serializable;

/**
 * Created by ainacio on Nov, 2023
 */
public interface State extends Serializable {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();

    public void refill();
}
