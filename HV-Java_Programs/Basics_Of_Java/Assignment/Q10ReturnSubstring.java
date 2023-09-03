public class Q10ReturnSubstring {
    public static void main(String[] args) {
        String stringName = "Mangalyaan";
    int startingIndex = 0;
    int endingIndex = 5;

    String substring = stringName.substring(startingIndex, endingIndex + 1);
    System.out.println("Substring of " + stringName + " from " + startingIndex + " to " + endingIndex + " is: " + substring);
    }
    
}
