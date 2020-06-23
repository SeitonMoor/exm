package com.company.lab13.generics;

import com.company.lab13.generics.storage.Storage;
import com.company.lab13.generics.weights.*;

public class MainGenerics {

    public static void main(String[] args) {
        Storage storage1 = new Storage();
        Storage storage2 = new Storage();
        Storage storage3 = new Storage();

        Bar bar1 = new Bar();
        Bar bar2 = new Bar();
        Bar bar3 = new Bar();

        Bar bar4 = new Bar();
        Bar bar5 = new Bar();

        Plates plates1 = new Plates();
        Plates plates2 = new Plates();

        bar1.setWeight(10);
        bar2.setWeight(15);
        bar3.setWeight(5);

        bar4.setWeight(2);
        bar5.setWeight(4);

        plates1.setWeight(20);
        plates2.setWeight(15);

        storage1.addToStorage(bar1);
        storage1.addToStorage(bar2);
        storage1.addToStorage(bar3);
        storage1.addToStorage(plates1);

        storage3.addToStorage(bar4);
        storage3.addToStorage(bar5);

        storage2.addToStorage(plates1);
        storage2.addToStorage(plates2);

        storage1.storageWeight(storage2);

        storage1.storageWeight(storage3);

        storage1.combineStorage(storage2);
        storage1.combineStorage(storage3);

        storage1.storageWeight(storage2);
    }
}
