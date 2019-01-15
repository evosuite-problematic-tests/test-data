/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 11:31:31 GMT 2019
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.DefaultKeyedValues2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultKeyedValues2D_ESTest extends DefaultKeyedValues2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeRow(comparable0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      defaultKeyedValues2D0.clear();
      assertEquals(0, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Byte byte0 = new Byte((byte)90);
      defaultKeyedValues2D0.addValue(byte0, byte0, byte0);
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.removeValue(byte0, comparable0);
      assertEquals(1, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      defaultKeyedValues2D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Byte byte0 = new Byte((byte) (-2));
      defaultKeyedValues2D0.setValue(byte0, byte0, byte0);
      Long long0 = new Long(624L);
      defaultKeyedValues2D0.setValue(long0, long0, long0);
      Object object0 = defaultKeyedValues2D0.clone();
      boolean boolean0 = defaultKeyedValues2D0.equals(object0);
      assertEquals(2, defaultKeyedValues2D0.getColumnCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(959L);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.addValue(long0, (Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Long long0 = new Long(632L);
      defaultKeyedValues2D0.setValue(long0, long0, long0);
      Object object0 = defaultKeyedValues2D0.clone();
      Integer integer0 = new Integer((-6801));
      defaultKeyedValues2D0.setValue(integer0, long0, long0);
      boolean boolean0 = defaultKeyedValues2D0.equals(object0);
      assertEquals(1, defaultKeyedValues2D0.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(959L);
      int int0 = defaultKeyedValues2D0.getColumnIndex(long0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getColumnIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(678L);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((Comparable) long0, (Comparable) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised columnKey: 678
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((Comparable) 871, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(678L);
      defaultKeyedValues2D0.setValue((Number) null, long0, long0);
      Number number0 = defaultKeyedValues2D0.getValue((Comparable) long0, (Comparable) long0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(1867L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      defaultKeyedValues2D0.removeRow(0);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.getValue((Comparable) long0, (Comparable) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised rowKey: 1867
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Float float0 = new Float(0.0F);
      defaultKeyedValues2D0.addValue(float0, float0, float0);
      Float float1 = new Float((-1406.01761));
      defaultKeyedValues2D0.addValue(float1, float1, float1);
      Number number0 = defaultKeyedValues2D0.getValue((Comparable) float1, (Comparable) float0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(0L);
      defaultKeyedValues2D0.setValue(long0, long0, long0);
      Comparable<DefaultKeyedValues2D> comparable0 = (Comparable<DefaultKeyedValues2D>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues2D0.removeValue(comparable0, comparable0);
      assertEquals(1, defaultKeyedValues2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Byte byte0 = new Byte((byte)90);
      Long long0 = new Long(959L);
      defaultKeyedValues2D0.addValue(byte0, long0, byte0);
      defaultKeyedValues2D0.removeValue(byte0, byte0);
      assertEquals(1, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Byte byte0 = new Byte((byte)90);
      defaultKeyedValues2D0.addValue(byte0, byte0, byte0);
      Long long0 = new Long(959L);
      defaultKeyedValues2D0.addValue(long0, long0, long0);
      defaultKeyedValues2D0.removeColumn(1);
      assertEquals(2, defaultKeyedValues2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeColumn((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      // Undeclared exception!
      try { 
        defaultKeyedValues2D0.removeColumn(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown key: Mock for Comparable, hashCode: 1200258591
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      boolean boolean0 = defaultKeyedValues2D0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(1867L);
      boolean boolean0 = defaultKeyedValues2D0.equals(long0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(false);
      Long long0 = new Long(656L);
      defaultKeyedValues2D0.setValue(long0, long0, long0);
      DefaultKeyedValues2D defaultKeyedValues2D1 = new DefaultKeyedValues2D();
      boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
      Long long0 = new Long(656L);
      defaultKeyedValues2D0.setValue(long0, long0, long0);
      defaultKeyedValues2D0.removeRow(0);
      DefaultKeyedValues2D defaultKeyedValues2D1 = new DefaultKeyedValues2D();
      boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
      assertEquals(1, defaultKeyedValues2D0.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
      Long long0 = new Long(678L);
      defaultKeyedValues2D0.setValue((Number) null, long0, long0);
      DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D)defaultKeyedValues2D0.clone();
      assertTrue(defaultKeyedValues2D1.equals((Object)defaultKeyedValues2D0));
      
      defaultKeyedValues2D1.addValue(long0, long0, long0);
      boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
      assertFalse(defaultKeyedValues2D1.equals((Object)defaultKeyedValues2D0));
      assertFalse(boolean0);
  }
}