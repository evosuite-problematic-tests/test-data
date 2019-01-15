/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:58:18 GMT 2018
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = RandomStringUtils.randomAscii(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = RandomStringUtils.random(2570, 2570, 1922, true, true, (char[]) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.randomAlphabetic(128);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = RandomStringUtils.randomAlphanumeric(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.randomNumeric((-368));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -368 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        RandomStringUtils.random(3924, 3924, 3924, true, true, charArray0);
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
      char[] charArray0 = new char[5];
      String string0 = RandomStringUtils.random(2103, 0, 0, false, false, charArray0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.random(56192, "C|I6#UXJ}RW73sm");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.randomNumeric(56320);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = RandomStringUtils.random(55, 55, (-2848), false, true);
      assertEquals("7777777777777777777777777777777777777777777777777777777", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Random.setNextRandom(56320);
      // Undeclared exception!
      RandomStringUtils.random(1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = RandomStringUtils.random(1833, (-333), 1833, false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(56177);
      Random.setNextRandom(56320);
      // Undeclared exception!
      RandomStringUtils.random(56177, 56177, 33, false, false, (char[]) null, (java.util.Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(56176);
      // Undeclared exception!
      RandomStringUtils.random(1931, 56176, 33, false, false, (char[]) null, (java.util.Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      RandomStringUtils.random(56192, 56192, 57343, false, false, (char[]) null, (java.util.Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = RandomStringUtils.random(0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = RandomStringUtils.random(0, (char[]) null);
      assertEquals("", string0);
  }
}
