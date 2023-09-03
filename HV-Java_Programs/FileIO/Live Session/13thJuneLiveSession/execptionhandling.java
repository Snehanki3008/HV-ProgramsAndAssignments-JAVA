public class execptionhandling extends Exception {
    public static void main(String[] args) throws Exception {
        try {
            int x = 10 / 10;
            System.out.println(x);

            int[] a1 = {1,2,3,4,5};
            System.out.println(a1[8]);

            // USING THROW Method
            int age = -18;
            if (age < 0) {
                throw new Exception("Age is Negative");
                }
        

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception,since the denominator number is 0");
               } 
    //          finally {
    //         System.out.println("This piece will get executed everytime");
    //     }
     }
}
