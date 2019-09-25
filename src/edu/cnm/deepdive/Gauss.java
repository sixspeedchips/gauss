package edu.cnm.deepdive;

import java.util.stream.LongStream;

public class Gauss {

  private final static Long UPPER_BOUND = 100L;

  public static void main(String[] args) {

    Long upperBound;
    try {
      upperBound = Long.parseLong(args[0]);
    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
      upperBound = UPPER_BOUND;
    }

    System.out.println(computeNaiveSumStream(upperBound));
    System.out.println(computeNaiveSumLoop(upperBound));
    System.out.println(computeFunction(upperBound));
  }

  static Long computeNaiveSumStream(Long upperBound){
    return LongStream.range(1, upperBound + 1).sum();
  }
  static Long computeNaiveSumLoop(Long upperBound){
    Long sum = 0L;
    for (Integer i = 0; i < upperBound +1 ; i++) {
      sum+=i;
    }
    return sum;
  }
  static Long computeFunction(Long upperBound){
    return ((long) (Math.pow(upperBound, 2) + upperBound) / 2);
  }




}
