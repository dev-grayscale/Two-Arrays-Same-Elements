import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void checkSameElementsV1() {
    Assertions.assertFalse(Main.checkSameElementsV1(null, new int[] { 1, 2 }));
    Assertions.assertFalse(Main.checkSameElementsV1(null, null));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { 1, 2 }, null));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[0], new int[0]));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { 1,2,3 }, new int[] { 1,2 }));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { 1,2 }, new int[] { 1,2,3,4,5 }));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { 10,5,2,1,3 }, new int[] { 1,2,5,10 }));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { 10,5,2,1,3 }, new int[] { 10,5,2,1,4,6 }));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { -1,-2,-3,-4,-5,-6,-7,-8,-9,-10 }, new int[] { -11,-2,-3,-4,-5,-6,-7,-8,-9,-10 }));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { 25,-1,22,13,15,-122 }, new int[] { 25,-1,22,13,15,-122, 145, -55 }));
    Assertions.assertFalse(Main.checkSameElementsV1(new int[] { -10,-8,-6,-5,-4,-3,-2,-1,0,10 }, new int[] { -10,-8,-7,-5,-4,-3,-2,-1,0,10 }));

    Assertions.assertTrue(Main.checkSameElementsV1(new int[] { 1,2 }, new int[] { 1,2 }));
    Assertions.assertTrue(Main.checkSameElementsV1(new int[] { 1,2,5,10 }, new int[] { 1,2,5,10 }));
    Assertions.assertTrue(Main.checkSameElementsV1(new int[] { 2,5,1,10 }, new int[] { 1,2,5,10 }));
    Assertions.assertTrue(Main.checkSameElementsV1(new int[] { 10,5,2,1 }, new int[] { 1,2,5,10 }));
  }

  @Test
  void checkSameElementsV2() {
    Assertions.assertFalse(Main.checkSameElementsV2(null, new int[] { 1, 2 }));
    Assertions.assertFalse(Main.checkSameElementsV2(null, null));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { 1, 2 }, null));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[0], new int[0]));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { 1,2,3 }, new int[] { 1,2 }));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { 1,2 }, new int[] { 1,2,3,4,5 }));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { 10,5,2,1,3 }, new int[] { 1,2,5,10 }));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { 10,5,2,1,3 }, new int[] { 10,5,2,1,4,6 }));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { -1,-2,-3,-4,-5,-6,-7,-8,-9,-10 }, new int[] { -11,-2,-3,-4,-5,-6,-7,-8,-9,-10 }));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { 25,-1,22,13,15,-122 }, new int[] { 25,-1,22,13,15,-122, 145, -55 }));
    Assertions.assertFalse(Main.checkSameElementsV2(new int[] { -10,-8,-6,-5,-4,-3,-2,-1,0,10 }, new int[] { -10,-8,-7,-5,-4,-3,-2,-1,0,10 }));

    Assertions.assertTrue(Main.checkSameElementsV2(new int[] { 1,2 }, new int[] { 1,2 }));
    Assertions.assertTrue(Main.checkSameElementsV2(new int[] { 1,2,5,10 }, new int[] { 1,2,5,10 }));
    Assertions.assertTrue(Main.checkSameElementsV2(new int[] { 2,5,1,10 }, new int[] { 1,2,5,10 }));
    Assertions.assertTrue(Main.checkSameElementsV2(new int[] { 10,5,2,1 }, new int[] { 1,2,5,10 }));
  }

  @Test
  void checkSameElementsV3() {
    Assertions.assertFalse(Main.checkSameElementsV3(null, new int[] { 1, 2 }));
    Assertions.assertFalse(Main.checkSameElementsV3(null, null));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { 1, 2 }, null));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[0], new int[0]));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { 1,2,3 }, new int[] { 1,2 }));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { 1,2 }, new int[] { 1,2,3,4,5 }));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { 10,5,2,1,3 }, new int[] { 1,2,5,10 }));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { 10,5,2,1,3 }, new int[] { 10,5,2,1,4,6 }));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { -1,-2,-3,-4,-5,-6,-7,-8,-9,-10 }, new int[] { -11,-2,-3,-4,-5,-6,-7,-8,-9,-10 }));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { 25,-1,22,13,15,-122 }, new int[] { 25,-1,22,13,15,-122, 145, -55 }));
    Assertions.assertFalse(Main.checkSameElementsV3(new int[] { -10,-8,-6,-5,-4,-3,-2,-1,0,10 }, new int[] { -10,-8,-7,-5,-4,-3,-2,-1,0,10 }));

    Assertions.assertTrue(Main.checkSameElementsV3(new int[] { 1,2 }, new int[] { 1,2 }));
    Assertions.assertTrue(Main.checkSameElementsV3(new int[] { 1,2,5,10 }, new int[] { 1,2,5,10 }));
    Assertions.assertTrue(Main.checkSameElementsV3(new int[] { 2,5,1,10 }, new int[] { 1,2,5,10 }));
    Assertions.assertTrue(Main.checkSameElementsV3(new int[] { 10,5,2,1 }, new int[] { 1,2,5,10 }));
  }
}
