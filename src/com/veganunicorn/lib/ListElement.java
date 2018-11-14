package com.veganunicorn.lib;

public class ListElement {
    private String name;
    private String category;
    private boolean warningStatus;
    private String warningText;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public boolean isWarningStatus() {return warningStatus;}
    public void setWarningStatus(boolean warningStatus) {this.warningStatus = warningStatus;}

    public String getWarningText() {return warningText;}
    public void setWarningText(String warningText) {this.warningText = warningText;}
}
