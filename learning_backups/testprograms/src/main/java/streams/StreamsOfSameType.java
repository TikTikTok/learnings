package main.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsOfSameType {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(new Integer[]{1,2,3,4,5});

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) integerArrayList.add(i);

        Stream<Integer> integerStream1 = integerArrayList.stream();
        Stream<Integer> integerStream2 = integerArrayList.parallelStream();

        System.out.println(" Hello Git  ");

        integerArrayList.forEach(i -> System.out.println(i));

        System.out.println(" Hello ");

    }



    public void testSuccess()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);


    }

    public ArrayList<Integer> addItems()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        return arrayList;
    }
}
