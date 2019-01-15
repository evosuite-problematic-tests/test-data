/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:38:10 GMT 2018
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import org.apache.commons.lang3.SystemUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SystemUtils_ESTest extends SystemUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("7q{");
      assertEquals(7.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = SystemUtils.toJavaVersionIntArray("Index: ");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertEquals("tmp", file0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = SystemUtils.getJavaHome();
      assertTrue(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = SystemUtils.getUserDir();
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = SystemUtils.getUserHome();
      assertFalse(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SystemUtils systemUtils0 = new SystemUtils();
      assertFalse(SystemUtils.IS_OS_OS2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaAwtHeadless();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast((float) 317);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast((-3989.633F));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(950);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch("O@,OnkEVZai( eS", "O@,OnkEVZai( eS");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch((String) null, "X/P)gT", "X/P)gT", "1.11.8.0_191");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("WindowsLinux", (String) null, (String) null, "d.VUDJqN|n#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("1.4", "1.4", "1.4", "1.4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("X/P)gT", "java.awt.graphicsenv", "V(M?", "#I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("java.ext.dirs", "java.ext.dirs", "java.ext.dirs", "Mwy4\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch("O@,OnkEVZai( eS", "O@,OnkEVZai( eS");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = SystemUtils.toJavaVersionInt("1.8.0_191-b12");
      assertEquals(180, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat(".7kRn[w5sS3t[n");
      assertEquals(7.53F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = SystemUtils.toJavaVersionInt("~mJZ=");
      assertEquals(0, int0);
  }
}
