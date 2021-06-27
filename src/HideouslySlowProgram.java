public class HideouslySlowProgram {

    public static void main(String[] args){


        //this is funny because you're printing the entire Long value out
        Long sum = 0l;
        for (long i =0 ; i < Integer.MAX_VALUE; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
