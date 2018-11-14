package com.veganunicorn.lib;

public class ListManager {
    private List list;

    //изменить название списка
    public void changeListName (String name){
        list.setName(name);
    }

    //изменить название элемента списка, меняется элемент с индексом number
    public void changeListElementName (String name, int number){
        list.getArrayOfElements().get(number).setName(name);
    }

    //добавление элемента в список
    public void addElement (ListElement element) {
        list.getArrayOfElements().add(element);
    }

    //добавление элемента в список, хз зачем вторая версия
    public void addElement (String name, String category, boolean warningStatus, String warningText) {
        ListElement element = new ListElement();
        element.setName(name);
        element.setCategory(category);
        element.setWarningStatus(warningStatus);
        element.setWarningText(warningText);
        list.getArrayOfElements().add(element);

    }

    //удалить элемент из списка
    public void removeElement (ListElement element) {
        list.getArrayOfElements().remove(element);
    }

    // n1 номер элемента, n2 позиция куда перемещать
    // не работает
    public void insertElement (int n1, int n2){
        ListElement tmp = list.getArrayOfElements().get(n1);
        if (n1 > n2) {
            for (int i = n2 + 1; i <= n1; i++) {
                list.getArrayOfElements().set(i, list.getArrayOfElements().get(i - 1));
            }
            list.getArrayOfElements().set(n2, tmp);
        }
        else { //n1 < n2
            for (int i = n1; i < n2; i++){
                list.getArrayOfElements().set(i, list.getArrayOfElements().get(i + 1));
            }
            list.getArrayOfElements().set(n2, tmp);
        }

    }

}
