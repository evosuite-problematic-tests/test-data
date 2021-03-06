/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 16:53:45 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "mf7-");
      Locale locale0 = new Locale("org.apache.commons.lang3.time.FastDateParser$5", "org.apache.commons.lang3.time.FastDateParser$5");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("/}?zhn{n", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"/}?zhn{n\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("ywwz$x@9", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"ywwz$x@9\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("EWE>^v=!", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"EWE>^v=!\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";Ka_*,", timeZone0, locale0);
      fastDateParser0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("2Zk", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[2Zk,it,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";Ka_*,", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Object object0 = fastDateParser0.parseObject(";Ka_*,", parsePosition0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(787, "NrFT)Ym/1#N;q4~K", 787, 0, 1, 0, 0, 2, 2, 2);
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("S`=F<", simpleTimeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals("S`=F<", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";Ka_*,", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("ko", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("2", timeZone0, locale0);
      Object object0 = fastDateParser0.parseObject("2");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";Ka_*,", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertSame(timeZone1, timeZone0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";Ka_*,", timeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      assertEquals(";(\\p{IsNd}++)(\uC624\uC804|\uC624\uD6C4)_\\*,", pattern0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2255, "");
      Locale locale0 = Locale.ITALY;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("2", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";Ka_*,", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(timeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("2", timeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("}!>+", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(39, "2");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("2", simpleTimeZone0, locale0);
      Locale locale1 = Locale.JAPANESE;
      FastDateParser fastDateParser1 = new FastDateParser("2", simpleTimeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";Ka_*,", timeZone0, locale0);
      try { 
        fastDateParser0.parse(";Ka_*,");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \";Ka_*,\" does not match ;(\\p{IsNd}++)(\uC624\uC804|\uC624\uD6C4)_\\*,
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "!]7-");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("!]7-", simpleTimeZone0, locale0);
      try { 
        fastDateParser0.parseObject("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"\" does not match !\\]7-
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("$D+s?|@", simpleTimeZone0, locale0);
      assertEquals("$D+s?|@", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.forLanguageTag("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++\" ; gave up at index 83
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("MMM9K&99,S?{");
      Locale locale0 = new Locale("MMM9K&99,S?{", "MMM9K&99,S?{", "MMM9K&99,S?{");
      FastDateParser fastDateParser0 = new FastDateParser("MMM9K&99,S?{", timeZone0, locale0);
      assertEquals("MMM9K&99,S?{", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("}+)", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(117);
      assertEquals(2017, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("}+)", "}+)", "}+)");
      FastDateParser fastDateParser0 = new FastDateParser("}+)", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear((-71));
      assertEquals(1929, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("(K=FGkNftOt", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"(K=FGkNftOt\" ; gave up at index 6
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "F)");
      FastDateParser fastDateParser0 = new FastDateParser("F)", simpleTimeZone0, locale0);
      assertEquals("F)", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(";a*,", timeZone0, locale0);
      assertEquals(";a*,", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(",");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser(",", timeZone0, locale0);
      assertEquals(",", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("B1<qSJXHgzDwos");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("-+O5+", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"-+O5+\" ; gave up at index 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser(".;", timeZone0, locale0);
      assertEquals(".;", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("GK0(zY~");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("GK0(zY~", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"GK0(zY~\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("B1<qSJXHgzDwos");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("1-O5+", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"1-O5+\" ; gave up at index 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "3M]YF@>D{^%Gr5Z<F+");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("3M]YF@>D{^%Gr5Z<F+", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"3M]YF@>D{^%Gr5Z<F+\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2310, "");
      Locale locale0 = new Locale("(The ");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("H4-Ht9?jO_DKJ", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"H4-Ht9?jO_DKJ\" ; gave up at index 4
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(787, "NrFT)Ym/1#N;q4~K", 787, 0, 1, 0, 0, 2, 2, 2);
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("5;}y", simpleTimeZone0, locale0);
      assertEquals("5;}y", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("6Wv\rQOO?Bk", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"6Wv\rQOO?Bk\" ; gave up at index 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("7)J%|;*N.%v;r-", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"7)J%|;*N.%v;r-\" ; gave up at index 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(420, "!|3V`[)EqE");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("8Y=nagG", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"8Y=nagG\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(":sT|J");
      Locale locale0 = Locale.ROOT;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(":sT|J", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \":sT|J\" ; gave up at index 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("GMTBET");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("@+}UpGDy", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"@+}UpGDy\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("\noS91oQhoVdg");
      Locale locale0 = new Locale("\noS91oQhoVdg");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("\noS91oQhoVdg", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"
         // oS91oQhoVdg\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("^&6EXd", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"^&6EXd\" ; gave up at index 4
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }
}
