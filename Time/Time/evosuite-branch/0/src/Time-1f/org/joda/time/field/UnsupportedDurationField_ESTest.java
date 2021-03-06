/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 09:37:21 GMT 2018
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnsupportedDurationField_ESTest extends UnsupportedDurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      Instant instant0 = Instant.now();
      Chronology chronology0 = instant0.getChronology();
      boolean boolean0 = durationFieldType0.isSupported(chronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getMillis(1602, (-1L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.add(0L, 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weekyears field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.add((long) (-1260), 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // halfdays field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getDifferenceAsLong(5675L, 5675L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getValue((-2524L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getValueAsLong((-649L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weekyears field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getMillis(10L, 317L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // null field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      
      int int0 = unsupportedDurationField0.compareTo((DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      unsupportedDurationField0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getDifference(0L, 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // centuries field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
      assertSame(durationFieldType0, durationFieldType1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getValue((long) 7, (-2784L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // null field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      boolean boolean0 = unsupportedDurationField0.isPrecise();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getMillis(0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weeks field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getMillis(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // centuries field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.getValueAsLong((-781L), (-1271L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weekyears field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      String string0 = unsupportedDurationField0.toString();
      assertEquals("UnsupportedDurationField[weekyears]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      boolean boolean0 = unsupportedDurationField0.equals(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
      // Undeclared exception!
      try { 
        unsupportedDurationField0.equals(unsupportedDurationField1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }
}
