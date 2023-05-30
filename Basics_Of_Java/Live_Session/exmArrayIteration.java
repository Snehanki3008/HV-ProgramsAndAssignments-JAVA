import java.util.Arrays;

public class exmArrayIteration {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        String[] array2 = {"a" , "b" , "c" , "d" , "e", "f" };

        System.out.println(array1);
        // here in this sout we get memory location as o/p


        // Iteration to access the array using FOR LOOP
        for(int i = 0 ; i < array1.length ; i ++){
            System.out.println(array1[i]);
        }

        // Iteration to access the array using FOR EACH LOOP
        for(int i : array1){
            System.out.println(i);
        }

        int i = 0;
        // while loop
        while(i < array1.length){
            System.out.println(array1[i]);
            i++;
            }
            System.out.println(Arrays.toString(array2));

            // converting array to string
            String s = "Snehanki";
            char[] c = s.toCharArray();
            for (char ik : c)
            {
                System.out.println(ik);
            }
            
        
        
            // removing an element from array
                int[] s3 = {1,3,5,7,9,11,13,15,17};
                 int removed_value = 9;
                 int index = -1; 
                     for( int j=0;j<s3.length;j++)
                        {
                             if(s3[j]==removed_value)
                                 {
                                   index=j;
                                      break;
                                 }
                         }
                    if(index!=-1)
                        {
                            int [] s4= new int[s3.length-1];
                              System.arraycopy(s3, 0, s4, 0, index);
                             System.arraycopy(s3, index+1, s4, index, s3.length-index-1);
                             s3=s4;
                          }
                    for(int l : s3)
                         {
                              System.out.println(l);
                         }

    
    }
}
