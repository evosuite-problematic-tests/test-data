/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 12:41:41 GMT 2019
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
      int[] intArray0 = SystemUtils.toJavaVersionIntArray("/tmp");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertEquals(0L, file0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = SystemUtils.getJavaHome();
      assertFalse(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = SystemUtils.getUserDir();
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = SystemUtils.getUserHome();
      assertFalse(file0.exists());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemUtils systemUtils0 = new SystemUtils();
      assertFalse(SystemUtils.IS_JAVA_1_6);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaAwtHeadless();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast((float) 72);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(0.0F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(218);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(72);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch("dnc,!\"WSe8cA+Mi,=$G", "dnc,!\"WSe8cA+Mi,=$G");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch((String) null, ", Length: 0", ", Length: 0", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("Array element ", "Array element ", "Array element ", "Array element ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("4.1", (String) null, "4.1", "1.11.8.0_191");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("EF]zjD}KbU1El!-MI", "EF]zjD}KbU1El!-MI", "88dx", "EF]zjD}KbU1El!-MI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("", "{XArnOx?q", "", ", Length: 0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch("qw<[bx{\"XJ", "qw<[bx{\"XJ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = SystemUtils.toJavaVersionInt("1.11.8.0_191");
      assertEquals(218, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("dnc,!\"WSe8cA+Mi,=$G");
      assertEquals(8.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = SystemUtils.toJavaVersionInt("tjL");
      assertEquals(0, int0);
  }
}