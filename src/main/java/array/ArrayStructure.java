package array;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created on 2019/2/27
 *
 * @author wang.teng
 */
public class ArrayStructure {
    /**
     *  实现一个支持动态扩容的数组
     * @param array 数组
     * @param length 长度
     * @return
     */
    static Object dynamicGrow(Object array,int length) {

        Class clazz = array.getClass();
        //先判断是否是数组
        if (!clazz.isArray()){
            return null;
        }
        Class componentType = clazz.getComponentType();
        Object newArray = Array.newInstance(componentType, Array.getLength(array) + length);

        System.arraycopy(array,0,newArray,0,Array.getLength(array));
        return newArray;
    }

    /**实现一个大小固定的有序数组，支持动态增删改操作*/

    static int[] fixedSortAdd(int element){
        int[] newArray = (int[]) dynamicGrow(a,1);
        newArray[a.length] = element;
        Arrays.sort(newArray);
        return newArray;
    }

    /**
     * 删除某个数组的元素,索引更简单
     * @param element
     */
    static int[] a = {1,2,3,4,5,6,7,8};
   static int[] fixedSortedDelete(int element){
        for (int index=0;index <a.length;index++){
            if (a[index]==element) {
                //计算需要复制的元素的个数
                int numMoved = a.length - index -1;
                int[] newArray = new int[a.length-1];
                System.arraycopy(a,index+1,a,index,numMoved);
                System.arraycopy(a,0,newArray,0,newArray.length);
                return newArray;
            }
        }
       return a;
    }

    /**
     * 更新某个数组的元素,索引更简单
     * @param oldvalue
     */
    static void fixedUpdate(int oldvalue,int newValue){
        for (int index=0;index <a.length;index++){
            if (a[index]==oldvalue) {
                a[index] = newValue;
                Arrays.sort(a);
            }
        }

    }


    /**
     * 实现两个有序数组合并为一个有序数组
     */
    static int[] sortArray(int a[],int b[]){
        int[] newArray = new int[a.length+b.length];
        System.arraycopy(a,0,newArray,0,a.length);
        System.arraycopy(b,0,newArray,a.length,b.length);
        Arrays.sort(newArray);
        return newArray;
    }




}
