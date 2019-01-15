/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 00:09:57 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.tz.DefaultNameProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultNameProvider_ESTest extends DefaultNameProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      Locale locale0 = Locale.CANADA_FRENCH;
      defaultNameProvider0.getShortName(locale0, "", "");
      String string0 = defaultNameProvider0.getName(locale0, "", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      Locale locale0 = Locale.CANADA_FRENCH;
      String string0 = defaultNameProvider0.getName(locale0, "", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      String string0 = defaultNameProvider0.getShortName((Locale) null, "=>:GY", "=>:GY");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      Locale locale0 = Locale.GERMAN;
      String string0 = defaultNameProvider0.getName(locale0, (String) null, "org.joda.time.Chronology");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      Locale locale0 = new Locale("E?o%rUwf", "E?o%rUwf");
      String string0 = defaultNameProvider0.getShortName(locale0, "E?o%rUwf", (String) null);
      assertNull(string0);
  }
}