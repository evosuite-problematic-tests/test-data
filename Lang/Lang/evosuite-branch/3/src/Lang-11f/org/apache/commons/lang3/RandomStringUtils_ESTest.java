/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 12:28:31 GMT 2019
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = RandomStringUtils.randomAscii(507);
      assertEquals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.randomAlphabetic(2653);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.randomAlphanumeric(1612);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.randomNumeric((-291));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -291 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = RandomStringUtils.random(459, "U31\"j!");
      assertEquals("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.random(128, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The chars array must not be empty
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[4];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      RandomStringUtils.random(305, 0, 0, true, true, charArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.random(1467, false, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.random(31, 31, 31, false, false, (char[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter end (31) must be greater than start (31)
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'P';
      MockRandom mockRandom0 = new MockRandom();
      String string0 = RandomStringUtils.random(305, 0, 0, true, true, charArray0, (Random) mockRandom0);
      assertEquals("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom((-1291));
      String string0 = RandomStringUtils.random((int) 'V', true, true);
      assertEquals("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = RandomStringUtils.random(1, (-918), 57343, false, false);
      assertEquals("\uFC6A", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(55296);
      // Undeclared exception!
      RandomStringUtils.random(31);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = RandomStringUtils.random(0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = RandomStringUtils.random(1, (char[]) null);
      assertEquals("\u0000", string0);
  }
}
