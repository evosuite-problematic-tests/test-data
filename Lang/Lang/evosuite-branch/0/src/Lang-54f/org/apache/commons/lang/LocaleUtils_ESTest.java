/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:36:23 GMT 2018
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("|R]tv");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: |R]tv
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("d~tviwR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: d~tviwR
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("mj_TR");
      assertEquals("TR", locale0.getCountry());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("uei*^#(Z@u@}<n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: uei*^#(Z@u@}<n
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("mj__g |Du");
      assertEquals("g |Du", locale0.getVariant());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("mj_*ag |Zhi");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: mj_*ag |Zhi
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("mj_lag |Zhu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: mj_lag |Zhu
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("mj_T0 |Z u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: mj_T0 |Z u
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("mj_Tg |Zhu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: mj_Tg |Zhu
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("mj_TRbp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: mj_TRbp
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("mg_TR_bp");
      assertEquals("mg_TR_bp", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List list0 = LocaleUtils.localeLookupList((Locale) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = new Locale("A,)1OpB4X</0t)p", "org.apache.commons.lang.LocaleUtils", "A,)1OpB4X</0t)p");
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      Locale locale1 = new Locale("");
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocaleUtils.availableLocaleSet();
      Set set0 = LocaleUtils.availableLocaleSet();
      assertEquals(160, set0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      locale0.getScript();
      Locale.setDefault(locale0);
      locale0.getUnicodeLocaleKeys();
      locale0.getExtension('T');
      locale0.toLanguageTag();
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.languagesByCountry("");
      LocaleUtils.languagesByCountry("zrAE");
      LocaleUtils.toLocale("ko");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0);
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list1);
      LocaleUtils.availableLocaleList();
      LocaleUtils.toLocale("ko");
      String string0 = "";
      LocaleUtils.countriesByLanguage("");
      LocaleUtils.languagesByCountry("Dl>");
      LocaleUtils.languagesByCountry("");
      LocaleUtils.availableLocaleList();
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.languagesByCountry("LuGDR|");
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "";
      LocaleUtils.languagesByCountry("");
      LocaleUtils localeUtils0 = new LocaleUtils();
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("nQzbIcm7QC.;0A+TCe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: nQzbIcm7QC.;0A+TCe
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocaleUtils.languagesByCountry("M:ZJF'");
      LocaleUtils.languagesByCountry("");
      LocaleUtils.languagesByCountry("TH");
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocaleUtils.languagesByCountry("!Rv1'/ol/");
      LocaleUtils.countriesByLanguage("!Rv1'/ol/");
      LocaleUtils.toLocale("fi");
      LocaleUtils.languagesByCountry("org.apache.commons.lang.LocaleUtils");
      LocaleUtils.countriesByLanguage("org.apache.commons.lang.LocaleUtils");
      String string0 = "ar";
      LocaleUtils.languagesByCountry("ar");
      LocaleUtils.countriesByLanguage("fi");
      LocaleUtils.languagesByCountry("sv");
      LocaleUtils.languagesByCountry("ar");
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.toLocale("sv");
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry("ar");
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry("ar");
      LocaleUtils.toLocale(string0);
      LocaleUtils.countriesByLanguage(string0);
      String string1 = "Invalid locale format: ";
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale(string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: Invalid locale format: 
         //
         verifyException("org.apache.commons.lang.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.languagesByCountry("lp^o|'ikK~5Ibaig|");
      LocaleUtils localeUtils0 = new LocaleUtils();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1, locale_FilteringMode0);
      Locale.lookup(linkedList0, list0);
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocaleUtils.countriesByLanguage("s RDhV`e=5(=6G{c");
      LocaleUtils.countriesByLanguage("no");
      LocaleUtils.languagesByCountry("no");
      LocaleUtils.countriesByLanguage("s RDhV`e=5(=6G{c");
      LocaleUtils.countriesByLanguage("s RDhV`e=5(=6G{c");
      LocaleUtils.countriesByLanguage("f61O}KW|eE jeR>@}");
      LocaleUtils.countriesByLanguage("dGVK8G)% OsR~.>n");
      LocaleUtils.countriesByLanguage("zcc%u0A");
      List list0 = LocaleUtils.languagesByCountry("zcc%u0A");
      assertEquals(0, list0.size());
  }
}
