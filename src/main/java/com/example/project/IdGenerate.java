package com.example.project;


public class IdGenerate{
    //This class contains statics variable and methods, you do not initalize an object to use it.
    private static String currentID = "99";
    // //requires 1 private attribute String currentId. You must initialize it to 99

    // //requires one empty constructor
    public IdGenerate() {}

    public static String getCurrentId() {
        return currentID;
    }

    public static void reset(){
        currentID = "99";
    } //must reset the currentId back to 99

    public static String generateID(){
        int newId = Integer.parseInt(currentID);
        newId++;
        currentID = String.valueOf(newId);
        return currentID;
    } //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
}
