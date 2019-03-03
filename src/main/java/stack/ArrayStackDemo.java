package stack;

import java.util.Arrays;

/**
 * Created on 2019/3/3
 *
 * 使用数组实现顺序栈
 *
 * @author wang.teng
 */
public class ArrayStackDemo<T> {
    //使用数组实现这个栈结构
    private T[] dataArr;
    //当前元素的个数
    private int size;
    //默认容量
    private static final int DEFAULT_CAPACITY = 10;
    public ArrayStackDemo(){
        initArrayStack();
    }

    private void initArrayStack() {
        size=0;
        dataArr= (T[]) new Object[DEFAULT_CAPACITY];
    }
    /**
     * 出栈
     */
    public T pop(){
        if (isEmpty()){
            return null;
        }
        return dataArr[--size];
    }

    /**
     * 入栈
     * @param value
     */
    public void push(T value){
        //如果元素个数大于容量，则进行扩容
        ensureCapacity(size+1);
        dataArr[size++]=value;
    }

    /**
     * 扩容
     * @param minCapacity
     */
    void ensureCapacity(int minCapacity){
        if (minCapacity-dataArr.length > 0){
           dataArr = Arrays.copyOf(dataArr, dataArr.length*2);
        }
    }

    /**
     * 返回是否已经全部出栈
     * @return
     */
    boolean isEmpty(){
        return size==0?true:false;
    }





}
