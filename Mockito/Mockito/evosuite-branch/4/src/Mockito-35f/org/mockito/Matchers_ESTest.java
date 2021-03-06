/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 18:37:03 GMT 2019
 */

package org.mockito;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.hamcrest.Matcher;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.IsAnything;
import org.hamcrest.core.IsNull;
import org.hamcrest.core.IsSame;
import org.hamcrest.number.OrderingComparison;
import org.hamcrest.object.HasToString;
import org.junit.runner.RunWith;
import org.mockito.Matchers;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Matchers_ESTest extends Matchers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IsAnything<Float> isAnything0 = new IsAnything<Float>("");
      float float0 = Matchers.floatThat(isAnything0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Matcher<Short> matcher0 = HasToString.hasToString("");
      Short short0 = Matchers.argThat(matcher0);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      Set<String> set0 = Matchers.anySetOf(class0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = Matchers.isNotNull();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char char0 = Matchers.eq('s');
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Matcher<Boolean> matcher0 = OrderingComparison.comparesEqualTo(boolean0);
      boolean boolean1 = Matchers.booleanThat(matcher0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = Matchers.doubleThat((Matcher<Double>) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Matchers.eq(62);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Matcher<Integer> matcher0 = IsNull.notNullValue(class0);
      int int0 = Matchers.intThat(matcher0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte byte0 = Matchers.byteThat((Matcher<Byte>) null);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Matcher<Long> matcher0 = OrderingComparison.greaterThan((Long) null);
      AnyOf<Long> anyOf0 = AnyOf.anyOf(matcher0, (Matcher<? super Long>) matcher0, (Matcher<? super Long>) matcher0, (Matcher<? super Long>) matcher0);
      long long0 = Matchers.longThat(anyOf0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = Matchers.isNull();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char char0 = Matchers.anyChar();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Long long0 = Matchers.any(class0);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Matchers.endsWith("/~0V@ZoKp`]) aJB");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Collection<String> collection0 = Matchers.anyCollectionOf(class0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Matchers.contains("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Collection collection0 = Matchers.anyCollection();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Map map0 = Matchers.anyMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = Matchers.startsWith(".j");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Matchers.anyString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      short short0 = Matchers.eq((short)2363);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Long long0 = Matchers.refEq((Long) null, stringArray0);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Matchers.anyVararg();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Matcher<Short> matcher0 = HasToString.hasToString("");
      short short0 = Matchers.shortThat(matcher0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte byte0 = Matchers.eq((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = Matchers.anyInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Double double0 = Matchers.isA(class0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Character character0 = new Character('r');
      IsSame<Character> isSame0 = new IsSame<Character>(character0);
      char char0 = Matchers.charThat(isSame0);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte byte0 = Matchers.anyByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Short short0 = new Short((short)0);
      Short short1 = Matchers.same(short0);
      assertTrue(short1.equals((Object)short0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = Matchers.matches("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      float float0 = Matchers.eq(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Double double0 = Double.valueOf((double) (short)0);
      Double double1 = Matchers.eq(double0);
      assertEquals((double)double1, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = Matchers.anyLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double double0 = Matchers.eq(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      short short0 = Matchers.anyShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Matchers.anyBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      float float0 = Matchers.anyFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double double0 = Matchers.anyDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long long0 = Matchers.eq(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Set set0 = Matchers.anySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Short> class0 = Short.class;
      List<Short> list0 = Matchers.anyListOf(class0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      List list0 = Matchers.anyList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Double double0 = Matchers.any();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Matchers matchers0 = new Matchers();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = Matchers.eq(true);
      assertFalse(boolean0);
  }
}
