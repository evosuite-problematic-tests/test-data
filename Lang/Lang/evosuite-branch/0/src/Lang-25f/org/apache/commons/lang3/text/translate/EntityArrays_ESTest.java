/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:28:35 GMT 2018
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntityArrays_ESTest extends EntityArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.BASIC_ESCAPE();
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.BASIC_UNESCAPE();
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_UNESCAPE();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.ISO8859_1_ESCAPE();
      assertEquals(96, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_UNESCAPE();
      String[][] stringArray1 = EntityArrays.invert(stringArray0);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EntityArrays entityArrays0 = new EntityArrays();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_ESCAPE();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.ISO8859_1_UNESCAPE();
      assertEquals(96, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      assertEquals(151, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      assertEquals(5, stringArray0.length);
  }
}
