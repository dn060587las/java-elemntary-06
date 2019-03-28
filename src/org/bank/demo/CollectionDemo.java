package org.bank.demo;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        /*Collection collection;
        List list;
        Set set;
        Queue queue;

        //List implementation
        list = new ArrayList(1);
        //autoboxing - new Integer(1);
        list.add(1);
        //autoboxing - new Integer(1);
        list.add(1);
        list.add(1);
        list.add(1);
        //get
        //indexOf
        //autoboxing - new Integer(1);
        int position = -1;
        System.out.println("Old Element position " + position);
        position = list.indexOf(1);
        //System.out.println("Element position " + position);
        position = list.lastIndexOf(1);
        //System.out.println("Last Element position " + position);
        Iterator iterator = list.iterator();
        int valueToSearch = 1;
        int counter = 0;
        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            if (i == valueToSearch) {
                System.out.println("Position of " + valueToSearch + " is " + counter);
            }
            counter++;
        }
*/
        //////
        Object [] array = {1, 2, 3, 4, 5};
        UnmodifiableArrayList list2 = new UnmodifiableArrayList(array);
        Object element = list2.get(0);
        System.out.println("Element 0 is " + element);
        list2.add(10);
        int position = list2.indexOf(10);
        System.out.println("Position of 10 is " + position);
        list2.clear();
        System.out.println("Array is " + Arrays.toString(list2.toArray()));

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.remove(1);

    }
}
