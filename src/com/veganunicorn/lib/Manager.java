package com.veganunicorn.lib;

import java.util.ArrayList;

public class Manager {
    private ArrayList<List> lists;

    public void addList (List list){
        lists.add(list);
    }

    public void removeList (List list){
        lists.remove(list);
    }

    // должно работать
    public void insertElement (int n1, int n2) {
        List tmp = lists.get(n1);
        if (n1 > n2) {
            for (int i = n1; i < n2; i--) {
                lists.set(i, lists.get(i - 1));
            }
            lists.set(n2, tmp);
        } else { //n1 < n2
            for (int i = n1; i < n2; i++) {
                lists.set(i, lists.get(i + 1));
            }
            lists.set(n2, tmp);
        }
    }
}
