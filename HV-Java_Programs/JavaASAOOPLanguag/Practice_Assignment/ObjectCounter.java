public class ObjectCounter {
    private static int counter = 0;

    public ObjectCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        ObjectCounter object1 = new ObjectCounter();
        ObjectCounter object2 = new ObjectCounter();
        ObjectCounter object3 = new ObjectCounter();

        System.out.println("Total number of objects created: " + ObjectCounter.getCounter());  // Output: 3
    }
}
