package edu.cnm.deepdive;

import java.util.stream.IntStream;

public class Gauss {

  private static Integer UPPER_BOUND;

  public static void main(String[] args) {

    UPPER_BOUND = (args.length > 0 ? Integer.parseInt(args[0]):100);
    System.out.println(computeNaiveSumLoop(UPPER_BOUND));
    System.out.println(computeNaiveSumStream(UPPER_BOUND));
    System.out.println(computeFunction(UPPER_BOUND));
  }

  static Integer computeNaiveSumStream(Integer upperBound){
    return IntStream.range(1, UPPER_BOUND +1).sum();
  }
  static Integer computeNaiveSumLoop(Integer upperBound){
    Integer sum = 0;
    for (int i = 0; i < upperBound +1 ; i++) {
      sum+=i;
    }
    return sum;
  }
  static Integer computeFunction(Integer upperBound){
    return (int) (Math.pow(upperBound, 2) + upperBound) / 2;
  }




}
