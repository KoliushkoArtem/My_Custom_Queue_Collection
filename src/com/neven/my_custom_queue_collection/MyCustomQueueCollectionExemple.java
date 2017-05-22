package com.neven.my_custom_queue_collection;

public class MyCustomQueueCollectionExemple {

    public static void main(String[] args) {
        MyCustomQueueCollection<Integer> myCustomQueueCollection1 = new MyCustomQueueCollection<>();
        MyCustomQueueCollection<Integer> myCustomQueueCollection2 = new MyCustomQueueCollection<>(25);

        System.out.println(myCustomQueueCollection1.size());
        System.out.println(myCustomQueueCollection2.size());

        for (int i = 0; i < 16; i++) {
            myCustomQueueCollection1.add(i);
        }
        System.out.println(myCustomQueueCollection1.toString());
        System.out.println(myCustomQueueCollection2.toString());

        myCustomQueueCollection1.add(13);
        myCustomQueueCollection1.add(55);
        myCustomQueueCollection1.add(11);
        myCustomQueueCollection1.add(1234);
        myCustomQueueCollection1.add(1234213);
        System.out.println(myCustomQueueCollection1.toString());
        System.out.println(myCustomQueueCollection1.contains(55));

    }

}
