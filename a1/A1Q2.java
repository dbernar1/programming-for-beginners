import java.util.Scanner;

class A1Q2 {
  public static void main( String[] args ) {
    A1Q2.obtainAssignmentScoresFromUser();
    A1Q2.obtainMidTermTestScoreFromUser();
    A1Q2.obtainFinalExamScoreFromUser();

    double finalGrade = A1Q2.calculateFinalGrade();

    System.out.println( "The student's final grade is " + finalGrade );
  }

  private static Scanner in = new Scanner( System.in );

  // Grade breakdown
  private static double assignmentsAreWorth = 20 / 100.0;
  private static double midTermTestIsWorth = 30 / 100.0;
  private static double finalExamIsWorth = 50 / 100.0;

  private static int maxPossibleAssignmentScore = 10;
  private static int maxPossibleMidTermTestScore = 50;
  private static int maxPossibleFinalExamScore = 120;

  private static int numAssignments = 3;
  private static int assignmentScores[] = new int[ A1Q2.numAssignments ];
  private static int midTermTestScore;
  private static int finalExamScore;

  private static void obtainAssignmentScoresFromUser() {
    for ( int i = 0; i < A1Q2.numAssignments; i++ ) {
      do {
        System.out.print( "Assignment " + (i + 1) + " (/" + A1Q2.maxPossibleAssignmentScore + "): " );
        A1Q2.assignmentScores[ i ] = A1Q2.in.nextInt();
      } while ( 0 > A1Q2.assignmentScores[ i ] || A1Q2.assignmentScores[ i ] > A1Q2.maxPossibleAssignmentScore );
    }
  }
  
  private static void obtainMidTermTestScoreFromUser() {
    do {
      System.out.print( "Mid-term test (/" + A1Q2.maxPossibleMidTermTestScore + "): " );
      A1Q2.midTermTestScore = A1Q2.in.nextInt();
     } while ( 0 > A1Q2.midTermTestScore || A1Q2.midTermTestScore > A1Q2.maxPossibleMidTermTestScore );
   }

  private static void obtainFinalExamScoreFromUser() {
     do {
       System.out.print( "Final exam (/" + A1Q2.maxPossibleFinalExamScore + "): " );
       finalExamScore = A1Q2.in.nextInt();
     } while ( 0 > A1Q2.finalExamScore || A1Q2.finalExamScore > A1Q2.maxPossibleFinalExamScore );
  }

  private static double calculateFinalGrade() {
      return (
        ( A1Q2.assignmentScores[ 0 ] + A1Q2.assignmentScores[ 1 ] + A1Q2.assignmentScores[ 2 ] ) / ( (double) A1Q2.maxPossibleAssignmentScore * A1Q2.numAssignments ) * A1Q2.assignmentsAreWorth
        + A1Q2.midTermTestScore / (double) A1Q2.maxPossibleMidTermTestScore * A1Q2.midTermTestIsWorth
        + A1Q2.finalExamScore / (double) A1Q2.maxPossibleFinalExamScore * A1Q2.finalExamIsWorth
      ) * 100;
  }
}
