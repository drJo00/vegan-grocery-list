package com.veganunicorn.lib;

import java.util.ArrayList;

public class List {
    private int numberOfElements;
    private int numberOfDoneElements;
    private String name;
    private ArrayList<ListElement> arrayOfElements;
    private ListManager listManager;

    public int getNumberOfElements() {return numberOfElements;}
    public void setNumberOfElements(int numberOfElements) {this.numberOfElements = numberOfElements;}

    public int getNumberOfDoneElements() {return numberOfDoneElements;}
    public void setNumberOfDoneElements(int numberOfDoneElements) {this.numberOfDoneElements = numberOfDoneElements;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public ArrayList<ListElement> getArrayOfElements () {return arrayOfElements;}
    public void setArrayOfElements (ArrayList<ListElement> arrayOfElements) {this.arrayOfElements = arrayOfElements;}

    public ListManager getListManager() {return listManager;}
    public void setListManager(ListManager listManager) {this.listManager = listManager;}
}
