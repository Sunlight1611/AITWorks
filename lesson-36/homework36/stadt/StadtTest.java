package homework36.stadt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class StadtTest {
    Stadt[] stadts;


    @BeforeEach
    void setUp(){
        stadts = new Stadt[7];
        stadts[0] = new Stadt("Frankfurt",800_000,"Germany",10.0);
        stadts[1] = new Stadt("Novosibirsk",1_600_000,"Russia",7.0);
        stadts[2] = new Stadt("Vein",1_900_000,"Austria",6.5);
        stadts[3] = new Stadt("Milano",1_350_000,"Italy",9.0);
        stadts[4] = new Stadt("Barcelona",1_660_000,"Spain",5.0);
        stadts[5] = new Stadt("Seoul",9_442_770,"Korea",8.0);
        stadts[6] = new Stadt("Luxembourg",650_000,"Luxembourg",6.0);

    }
    private void printArray(Object[]arr,String title) {
        System.out.println("===========" + title + "=============");
        for (Object o : arr) {
            System.out.println(o);

        }
    }
    @Test
    void testComparable(){
        printArray(stadts,"Original array: ");
        Arrays.sort(stadts);
        printArray(stadts,"Native sorting - by population");
        Stadt stadt = new Stadt(null,0,null,0);
        int index = Arrays.binarySearch(stadts,stadt);
        System.out.println("Index = " + index);
    }
    @Test
    void TestComparator(){
        Comparator<Stadt> comparatorByName = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(stadts,comparatorByName);
        printArray(stadts,"Sorting by name");

    }
}

