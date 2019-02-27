package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created on 2019/2/27
 *
 * @author wang.teng
 */
public class DynamicArrayTest {


    /**
     * 动态数组测试
     */
    @Test
    public void dynamicLength() {
        int[] array = new int[10];
        int[] newArray = (int[]) ArrayStructure.dynamicGrow(array,10);
        Assert.assertTrue(newArray.length==20);
    }
    @Test
    public void fixedLength() {
        int[] newArray = ArrayStructure.fixedSortAdd(5);
        for (int array:newArray) {
            System.out.print(array + " ");
        }
    }

    @Test
    public void fixedDelete(){
        int[] newArray = ArrayStructure.fixedSortedDelete(3);
        for (int array:newArray) {
            System.out.print(array + " ");
        }
    }
    @Test
    public void fixedUpdate(){
        ArrayStructure.fixedUpdate(7,15);
        for (int array:ArrayStructure.a) {
            System.out.print(array + " ");
        }
    }

}
