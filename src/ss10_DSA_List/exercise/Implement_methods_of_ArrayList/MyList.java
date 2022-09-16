package ss10_DSA_List.exercise.Implement_methods_of_ArrayList;

import java.util.Arrays;

public class MyList <E>{
    /**
     * số lượng phần tử có trong arraylist
     */
    int size = 0;
    /**
     * sức chứa của arraylist
     */
    private final int DEFAULT_CAPACITY = 10;
    /**
     * khai báo một mảng đối tượng
     */
    Object elements[];

    /**
     * sức chứa mặc định khi khởi tạo constructor không tham số
     */
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * phương thức constructor với sức chứa đc truyền vào
     * @param capacity
     */
    public MyList(int capacity) {
        if(capacity>=0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity: "+capacity);
        }

    }

    /**
     * phương thức trả về số lượng phần tử
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * phương thức clear một arraylist
     * @return
     */
    public void clear(){
        size = 0;
        for (int i = 0; i <elements.length ; i++) {
            elements[i]=null;
        }
    }

    /**
     * phương thức add một phần tử vào arraylist
     * @param element
     * @return
     */
    public boolean add(E element){
        if(elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element,int index){
        if(index>elements.length){
            throw new IllegalArgumentException("index: "+index);
        }else if (elements.length==size){
            this.ensureCapacity(5);
        }

        if (elements[index]==null){
            elements[index]=element;
        }else {
            for (int i = size+1; i >=index ; i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=element ;
            size++;
        }
    }

    /**
     * phương thức tăng kích thước arraylist
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("minCapacity:"+minCapacity);
        }
    }

}
