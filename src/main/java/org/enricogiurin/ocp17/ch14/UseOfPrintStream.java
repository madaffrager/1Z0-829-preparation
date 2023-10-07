package org.enricogiurin.ocp17.ch14;

import java.io.PrintStream;

public class UseOfPrintStream {

  public static void main(String[] args) {
    new UseOfPrintStream().error();
  }

  void close() {
    try (PrintStream out = System.out) {
      out.println("this will be printed!");
    }
    //this won't be printed because I close the stream
    //in the try resources
    System.out.println("this won't be printed!");
  }

  void error() {
    try (PrintStream err = System.err) {
      err.println("this will be printed!");
    }
    //this won't be printed because I close the stream
    //in the try resources
    System.err.println("this won't be printed!");
  }

}
