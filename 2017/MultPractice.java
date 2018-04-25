package practice;

/**
 *
 * @author JZSUPERME
 */
  public class MultPractice implements StudyPractice{
  private int first;
  private int second;

  public MultPractice(int First, int Second)
  {
    first = First;
    second = Second;
  }

  public String getProblem()
  {
    return first + " TIMES " + second;
  }

  public void nextProblem()
  {
    second++;
  }
}

