/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 23:57:38 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(0L, 0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 0, (-4116), (-2108));
      assertEquals((-4018), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = FieldUtils.safeNegate((-4018));
      assertEquals(4018, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeNegate(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, 1873);
      assertEquals(1873, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, (-4116));
      assertEquals((-4116), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long long0 = FieldUtils.safeAdd((long) (-489), (long) (-489));
      assertEquals((-978L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(0L, (-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-934L), (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -934 + -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(5200L, 0L);
      assertEquals(5200L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(0L, 15308640144L);
      assertEquals((-15308640144L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeSubtract(0L, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 0 - -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(23034375, (-2070));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 23034375 * -2070
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(0, (-2108));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(236548258, 236548258);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 236548258 * 236548258
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(86400000L, (-1));
      assertEquals((-86400000L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(179L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(2058L, 1);
      assertEquals(2058L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) (-1812), (-1812));
      assertEquals(3283344L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), 2169);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 2169
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 1, (long) 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1L, (-1009L));
      assertEquals((-1009L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(43200000L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(31556952000L, 31556952000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 31556952000 * 31556952000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), (-1L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((long) (-1), (-9223372036854775784L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -1 * -9223372036854775784
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(Integer.MIN_VALUE, 366);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -785979015168
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeToInt(30962844000000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 30962844000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 1, 1012, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for secondOfDay must be in the range [1012,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 1, (-1936), (-1936));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for hourOfHalfday must be in the range [-1936,-1936]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 4404, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for millisOfDay must be in the range [4404,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-79271564338999L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for year must be in the range [0,-2147483648]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("", (-1), 633, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for  must be in the range [633,-1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FieldUtils.verifyValueBounds("6onrOGO-", (-3461), Integer.MIN_VALUE, 366);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds((String) null, 491, (-3031), (-3031));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 491 for null must be in the range [-3031,-3031]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue((-2745), (-2745), (-2745), (-2745));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, (-2179), 12, 1979);
      assertEquals(1757, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(871, (-2147483646), 2147483646);
      assertEquals((-2147483646), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) "xj,D", (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = FieldUtils.equals((Object) integer0, (Object) integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, (Object) " 7:");
      assertFalse(boolean0);
  }
}
