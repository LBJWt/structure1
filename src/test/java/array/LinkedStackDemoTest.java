package array;

import org.junit.Test;
import stack.ArrayStackDemo;
import stack.LinkedStackDemo;

/**
 * Created on 2019/3/3
 *
 * @author wang.teng
 */
public class LinkedStackDemoTest {

    @Test
    public void LinkedStackTest(){
        LinkedStackDemo linkedStackDemo = new LinkedStackDemo();
        linkedStackDemo.push(1);
        linkedStackDemo.push(2);
        linkedStackDemo.push(3);
        linkedStackDemo.push(4);

        for (int i = 0; i <10 ; i++) {
            System.out.println(linkedStackDemo.pop());
        }

//        Assert.assertTrue(arrayStackDemo.pop().equals(4));
    }
}
