package stack;

/**
 * Created on 2019/3/3
 * 用链表实现一个链式栈
 * @author wang.teng
 */
public class LinkedStackDemo<T> {
    //定义一个数据链表
    private class Node{
        T data;
        Node next;
        public Node(T data ,Node next){
            this.data=data;
            this.next=next;
        }
    }

    private int size;
    /**
     * 栈顶元素
     */
    private Node top;
    public LinkedStackDemo(){
        top=null;
    }
    public LinkedStackDemo(T value){
        top=new Node(value,null);
    }
    public T pop(){
        if (size==0){
            return null;
        }
        Node old = top;
        top=top.next;
        old.next=null;
        size--;
        return old.data;
    }
    public void push(T value){
        top=new Node(value,top);
        size++;
    }


}
