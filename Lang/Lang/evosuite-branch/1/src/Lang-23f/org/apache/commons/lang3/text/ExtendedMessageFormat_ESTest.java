/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 12:08:33 GMT 2018
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.apache.commons.lang3.text.FormatFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtendedMessageFormat_ESTest extends ExtendedMessageFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      Format[] formatArray0 = new Format[0];
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("B`CpJ?,B+Vn``");
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(100, dateFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
      Format[] formatArray0 = new Format[0];
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormats(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
      String string0 = extendedMessageFormat0.toPattern();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("}*j");
      extendedMessageFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex(0, (Format) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("o<{2,R|$v'", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 5
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("t{2}^>'xs[@c/");
      ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat("t{2}^>'xs[@c/", hashMap0);
      boolean boolean0 = extendedMessageFormat0.equals(extendedMessageFormat1);
      assertEquals("t{2}^>xs[@c/", extendedMessageFormat1.toPattern());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("6?<DX<b/m", (Locale) null);
      boolean boolean0 = extendedMessageFormat0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("''");
      MessageFormat messageFormat0 = new MessageFormat("''");
      boolean boolean0 = extendedMessageFormat0.equals(messageFormat0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
      Object object0 = extendedMessageFormat0.clone();
      boolean boolean0 = extendedMessageFormat0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("$^{27}>|{OR*U[eFa", (Locale) null, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 9: O
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("'\"", locale0, hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("Lf|yZVW_,)+M6Hqu{3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 17
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.US;
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("k{}", locale0, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 2: }
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = new Locale("y\"V  ", "y\"V  ");
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("y\"V  ", locale0, hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("o<{2,O{0R$xkGA1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 5
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("OpaVsaiq{ >z]MU", (Locale) null, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 9:  >
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("OpoPaVsaiq{ ", (Locale) null, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 11
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }
}