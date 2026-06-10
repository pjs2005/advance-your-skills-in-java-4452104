package com.poojahshah.example.chaper.two;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return a DataContainer instances for Strings
    static public DataContainer createStringDataContainer() {
        // Alter this code to return a DataContainer with String for the parameterized type
        // Give it the value "Hello"
        DataContainer<String> stringDataContainer = new DataContainer<>("Hello");
        return stringDataContainer;
    }

    public static void main(String[] args) {
        DataContainer value = createStringDataContainer();
        System.out.println(value.getValue());
    }

}

// refactor this class to use a generic instead of Object
class DataContainer<T> {
    private T value;

    public DataContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
