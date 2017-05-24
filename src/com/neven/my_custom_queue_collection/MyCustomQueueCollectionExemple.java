package com.neven.my_custom_queue_collection;

public class MyCustomQueueCollectionExemple {

    public static void main(String[] args) {
        MyCustomQueueCollection<Integer> defaultCollection = new MyCustomQueueCollection<>();
        MyCustomQueueCollection<Integer> myTestCustomQueueCollection = new MyCustomQueueCollection<>(10);

        System.out.println("Default collection size : " + defaultCollection.size());
        System.out.println("myTestCustomQueueCollection collection size : " + myTestCustomQueueCollection.size());
        System.out.println("Lets feel the test collection and test method .add() and toString() :");
        for (int i = 0; i < myTestCustomQueueCollection.size(); i++) {
            myTestCustomQueueCollection.add(i + 1);
            System.out.println(myTestCustomQueueCollection.toString());
        }
        System.out.println("===============================================================");
        System.out.println("Our filled collection");
        System.out.println(myTestCustomQueueCollection.toString());
        System.out.println("Collection work with all Objects types, for example String :");
        MyCustomQueueCollection<String> stringTestCollection = new MyCustomQueueCollection<>(10);
        for (int i = 0; i < stringTestCollection.size(); i++) {
            stringTestCollection.add(String.valueOf(i + 1) + " : a");
            System.out.println(stringTestCollection.toString());
        }
        System.out.println("===============================================================");
        System.out.println(myTestCustomQueueCollection.toString());
        System.out.println("Let's add to our integer test array couple more elements, 22, 33 and 44 but also in " +
                "collection to test method .addAll() ");
        MyCustomQueueCollection<Integer> integers = new MyCustomQueueCollection<>(10);
        integers.add(22);
        integers.add(33);
        integers.add(44);
        System.out.println("Our collection to adding :");
        System.out.println(integers.toString());
        System.out.println("After adding :");
        myTestCustomQueueCollection.addAll(integers);
        System.out.println(myTestCustomQueueCollection.toString());
        System.out.println("Let's remove elements 10 and 33 to test method remove()");
        myTestCustomQueueCollection.remove(10);
        myTestCustomQueueCollection.remove(33);
        System.out.println(myTestCustomQueueCollection.toString());
        System.out.println("Let's remove couple more elements 4, 5 and 7, but also in collection" +
                " to test method removeAll()");
        integers.clear();
        integers.add(4);
        integers.add(7);
        integers.add(5);
        myTestCustomQueueCollection.removeAll(integers);
        System.out.println(myTestCustomQueueCollection.toString());
        System.out.println("Lets test method retainAll() with collection 6, 22 and 44 :");
        integers.clear();
        integers.add(6);
        integers.add(22);
        integers.add(44);
        myTestCustomQueueCollection.retainAll(integers);
        System.out.println(myTestCustomQueueCollection.toString());
        System.out.println("Method contains() with exist integer 44");
        System.out.println(myTestCustomQueueCollection.contains(44));
        System.out.println("Method contains() with nonexistent integer 99");
        System.out.println(myTestCustomQueueCollection.contains(99));
        System.out.println("Method containsAll() with collection 44, 22 and 6 :");
        System.out.println(myTestCustomQueueCollection.containsAll(integers));
        System.out.println("Method containsAll() with collection 10, 44 and 22 :");
        integers.remove(6);
        integers.add(10);
        System.out.println(myTestCustomQueueCollection.containsAll(integers));
        System.out.println("Method clear()");
        myTestCustomQueueCollection.clear();
        System.out.println(myTestCustomQueueCollection.toString());
    }
}
