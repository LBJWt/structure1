package array;

import stack.ArrayStackDemo;
import org.junit.Test;

/**
 * Created on 2019/3/3
 *
 * @author wang.teng
 */
public class ArrayStackDemoTest {

    @Test
    public void ArrayStackTest(){
        ArrayStackDemo arrayStackDemo = new ArrayStackDemo();
        arrayStackDemo.push(1);
        arrayStackDemo.push(2);
        arrayStackDemo.push(3);
        arrayStackDemo.push(4);

        for (int i = 0; i <10 ; i++) {
            System.out.println(arrayStackDemo.pop());
        }

//        Assert.assertTrue(arrayStackDemo.pop().equals(4));
    }
}
