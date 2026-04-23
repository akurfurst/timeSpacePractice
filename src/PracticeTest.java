import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test 
  public void mostCommonTimeEfficientTest(){
    int[] test = {1,2,3,3,4,5,5,6,6,6,7,7,7};
    int actual = Practice.mostCommonTimeEfficient(test);
    assertEquals(6, actual);
  }

  @Test
  public void testMostCommonSpaceEfficientDuplicates(){
    //arrange
    int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
    //act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //assert
    assertEquals(4, actual);
  }
  @Test
  public void testMostCommonSpaceEfficientSameAmt(){
    //arrange
    int[] nums = {1, 1, 1, 2, 2, 2};
    //act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //assert
    assertEquals(1, actual);
  }
}
