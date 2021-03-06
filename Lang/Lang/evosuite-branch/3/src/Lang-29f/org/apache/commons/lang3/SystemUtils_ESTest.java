/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 13:04:53 GMT 2019
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import org.apache.commons.lang3.SystemUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SystemUtils_ESTest extends SystemUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = SystemUtils.toJavaVersionIntArray("Mac");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = SystemUtils.toJavaVersionInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = SystemUtils.getJavaHome();
      assertFalse(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = SystemUtils.getUserDir();
      assertEquals(0L, file0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = SystemUtils.getUserHome();
      assertEquals(0L, file0.getFreeSpace());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SystemUtils systemUtils0 = new SystemUtils();
      assertFalse(SystemUtils.IS_OS_WINDOWS_95);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaAwtHeadless();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast((float) 180);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast((float) 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(3065);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch("wOM<kY9", "wOM<kY9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch((String) null, "\"Hwz<WM:zDE@g>", "java.class.path", "Linux");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("UTF-8", "sun.print.PSPrinterJob", "\n", "25.191-b12");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("<YVU\"h.m<Sd", (String) null, "<YVU\"h.m<Sd", "<YVU\"h.m<Sd");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("wOM<kY9", "wOM<kY9", "wOM<kY9", "wOM<kY9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("#<@Jey6gc'AAQ9", "#<@Jey6gc'AAQ9", "", "Lin");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch("52.0", "Oracle Corporation");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch((String) null, "/tmp/EvoSuite_pathingJar7361441600699174276.jar");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("1.71.8.0_191");
      assertEquals(1.718F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = SystemUtils.toJavaVersionInt("', has a length less than 2");
      assertEquals(200, int0);
  }
}
