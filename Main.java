package intershipTest;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        int [] array = {10, -20, 61, -15};
        Notebook notebook = new Notebook();
        notebook.insertCharges(array);
        System.out.println(notebook.getBattery());
    }
}