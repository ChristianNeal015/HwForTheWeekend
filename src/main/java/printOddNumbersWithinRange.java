public class printOddNumbersWithinRange {
    public static void main(String[] args){
        System.out.println(printOddNumbersInRange(15, 3));


    }
    public static String printOddNumbersInRange(int start, int end){

        //Type your code here
        String result = "";
        for (int i = start; i >= end; i--){
            if(i % 2 !=0 ){
                result += i;
            }

        }
        return result;
    }
}
