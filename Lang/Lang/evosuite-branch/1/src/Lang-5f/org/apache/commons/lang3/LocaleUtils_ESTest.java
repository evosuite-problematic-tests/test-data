/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 11:26:56 GMT 2018
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertEquals(160, set0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocaleUtils.availableLocaleList();
      LocaleUtils.countriesByLanguage(")hEEq(7l");
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.GERMANY;
      Locale locale1 = Locale.ENGLISH;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertTrue(list0.contains(locale1));
      assertEquals(3, list0.size());
      
      LocaleUtils.languagesByCountry(")hEEq(7l");
      Locale locale2 = Locale.CANADA_FRENCH;
      List<Locale> list1 = LocaleUtils.localeLookupList(locale2);
      assertEquals(2, list1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("it");
      assertEquals("ita", locale0.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("_CyVwHCj?0Lr}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _CyVwHCj?0Lr}
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("_9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _9
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("_,oW89");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _,oW89
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("_CTi");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _CTi
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("_CT");
      assertEquals("_CT", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("_CVwHCij?0Lr}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _CVwHCij?0Lr}
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("_RI_V<yhP&{y\n");
      assertEquals("", locale0.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale(";6<1=7$0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ;6<1=7$0
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("s@[/guGL{.5YVCh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: s@[/guGL{.5YVCh
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("if_ND");
      assertEquals("if", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("vs}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: vs}
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("org.apache.commons.lang3.LocaleUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.commons.lang3.LocaleUtils
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("qf__aM$/i[rh1hEFp");
      assertEquals("qf__aM$/i[rh1hEFp", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("if_eNhGJ.r]IYg0=@)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: if_eNhGJ.r]IYg0=@)
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("if_N8GJ.rR]Yg0=@)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: if_N8GJ.rR]Yg0=@)
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("if_NJ_{]=");
      assertEquals("if_NJ_{]=", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("if_ND=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: if_ND=
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("if_NGJrR]Yg0=@)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: if_NGJrR]Yg0=@)
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.localeLookupList((Locale) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = new Locale("", "", "Invalid locale format: ");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      Locale locale1 = Locale.ITALIAN;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertEquals(3, list0.size());
      assertTrue(list0.contains(locale1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale("", "595|.", "");
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("TH");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("no");
      assertFalse(list0.isEmpty());
  }
}
