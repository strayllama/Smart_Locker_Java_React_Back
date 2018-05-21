package com.paul;

import static org.junit.Assert.assertTrue;

import com.paul.models.Parcel;
import org.junit.Test;

import java.util.HashMap;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public HashMap<Integer, Parcel> parcels;
    public Parcel parcel1;
    public Parcel parcel2;
    public Parcel parcel3;
    /**
     * Rigorous Test :-)
     */
    public AppTest() {
        parcel1 = new Parcel(
                1001,"Bob", "Maplins",
                "Liberton", 1,
                9991,8881,
                7771);
        parcel2 = new Parcel(
                1002,"Steve", "Maplins",
                "Liberton", 2,
                9992,8882,
                7772);
        parcel3 = new Parcel(
                1003,"Joe", "Maplins",
                "Liberton", 3,
                9993,8883,
                7773);

        parcels = new HashMap<>();
        parcels.put(parcel1.getId(), parcel1);
        parcels.put(parcel2.getId(), parcel2);
        parcels.put(parcel3.getId(), parcel3);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}