package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("enter integer");
        int n2 = ap.nextInt("enter integer 2");
        double avg = (double)(n1 + n2)/2;
        System.out.println("Your average is " + avg);
    }


  //  double avg = (double)(n1 + n2)/2;
    //private String[] args;
  //  ArgsProcessor ap = new ArgsProcessor(args);








}
