/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 13:40:06 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("+0F");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("EX?M@{~^uXW9");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("8");
      assertEquals(8, number0);
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        NumberUtils.createNumber("L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // L is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("------/U");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".0");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        NumberUtils.createNumber("D.ES");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // D.ES is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0EX");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0EX is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("4D");
      assertEquals(4.0, number0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        NumberUtils.createNumber("PLfVi4xel<!&4OuetL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // PLfVi4xel<!&4OuetL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        NumberUtils.createNumber("rtlGZQUusad");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // rtlGZQUusad is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        NumberUtils.createNumber(":zq'=f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // :zq'=f is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        NumberUtils.createNumber("t.LB8'Qz7 t[sRdbkl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // t.LB8'Qz7 t[sRdbkl is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("2l");
      assertEquals(2L, number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-IjL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -IjL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("+8F");
      assertEquals(8.0F, number0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0EX?M:{^e=9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"E\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0EX?M@{~^uXW9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.|h?0_!{Q9^=9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".28");
      assertEquals(0.28F, number0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.0");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long long0 = NumberUtils.minimum(1L, 1L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, (-2278L), 1L);
      assertEquals((-2278L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = NumberUtils.minimum(1, (-1), 741);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = NumberUtils.minimum(1, 1, (-842));
      assertEquals((-842), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, (-4412L), (-4963L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long long0 = NumberUtils.maximum((-1696L), (-457L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = NumberUtils.maximum((-2927), 0, 102);
      assertEquals(102, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = NumberUtils.compare(1.0, (-162.7809052799594));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = NumberUtils.compare((-838.6019), (double) (-1.0F));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = NumberUtils.compare((-623.549614), (-623.549614));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = NumberUtils.compare((-1.0F), (-1.0F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = NumberUtils.compare((-1.0F), (float) 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = NumberUtils.compare((-1053.8822F), (-2131.968F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("B7*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xea0r>4}P`C1X<:|!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x6+A59tv!Py5G'=$a-`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xEX?M@{~^uXW9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".28");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8Ee_:B7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("ea0r>4}P`C1X<:|!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6+A59tv!Py5G'=$a-`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--ff\"OE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-6e-.2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2l");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0El");
      assertFalse(boolean0);
  }
}
