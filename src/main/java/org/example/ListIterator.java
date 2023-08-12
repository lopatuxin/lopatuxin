package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator implements Iterator<ArrayList<Integer>> {

    private final int sizeArray;
    private int[] array;

    private int currentIndex;

    public ListIterator(int sizeArray) {
        this.sizeArray = sizeArray;
        this.array = new int[sizeArray];
        init();
        currentIndex = 0;
    }

    private void init() {
        for (int i = 0; i < sizeArray; i++) {
            array[i] = i;
        }
    }

    @Override
    public boolean hasNext() {
        return ++currentIndex < sizeArray;
    }

    @Override
    public ArrayList<Integer> next() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(array[currentIndex]);
        return list;
    }
}
