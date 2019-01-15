/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 11:34:50 GMT 2018
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
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
      Locale locale0 = Locale.FRANCE;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1958), "D+E+|F+|G+|H+|K+|M+|S+|W+|Za+|d+|h+|k+|m+|s+|w+yy|z+m''|'['++(''[,'**+)*'|^XA-Na-z]b+");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("D+E+|F+|G+|H+|K+|M+|S+|W+|Za+|d+|h+|k+|m+|s+|w+yy|z+m''|'['++(''[,'**+)*'|^XA-Na-z]b+", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"D+E+|F+|G+|H+|K+|M+|S+|W+|Za+|d+|h+|k+|m+|s+|w+yy|z+m''|'['++(''[,'**+)*'|^XA-Na-z]b+\" ; gave up at index 75
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "D+|E+|F+|G+|H+|K+6M+|S+|W+|Z+|a+|d+|h+|kZ|m+|s+|:+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+6M+|S+|W+|Z+|a+|d+|h+|kZ|m+|s+|:+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"D+|E+|F+|G+|H+|K+6M+|S+|W+|Z+|a+|d+|h+|kZ|m+|s+|:+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++\" ; gave up at index 83
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|da|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      Locale locale0 = new Locale("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|da|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|da|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|da|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++\" ; gave up at index 83
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("mD", timeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals("mD", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "d&", 2, 2, 2, 2, 2, 2, 2, 2);
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("d&", simpleTimeZone0, locale0);
      Object object0 = fastDateParser0.parseObject("2&,?K6%b");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(678, "3");
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("3", simpleTimeZone0, locale0);
      fastDateParser0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser(",", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[,,en_CA,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, 0, 0, 0, 0, 0, 0);
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("&", simpleTimeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Object object0 = fastDateParser0.parseObject("", parsePosition0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser(",", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("en_CA", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser(",", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertSame(timeZone1, timeZone0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("m_", timeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      assertEquals("(\\p{IsNd}++)_", pattern0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("G");
      Locale locale0 = Locale.JAPAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("N=W5Be{`:V+ag", timeZone0, locale0);
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
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "d&", 0, 2, 0, 0, 0, 2, 0, 0);
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("d&", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "zM$w", (-1079), 0, 13, 5, (-1079), 0, (-1079), (-3146));
      Locale locale0 = Locale.KOREA;
      FastDateParser fastDateParser0 = new FastDateParser("zM$w", simpleTimeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateParser fastDateParser0 = new FastDateParser("]", timeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("^@$", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("8", timeZone0, locale0);
      Locale locale1 = Locale.UK;
      FastDateParser fastDateParser1 = new FastDateParser("8", timeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "", 0, 0, 0, 0, 0, 0, 0, 0);
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("&", simpleTimeZone0, locale0);
      try { 
        fastDateParser0.parseObject("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"\" does not match &
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("]", timeZone0, locale0);
      try { 
        fastDateParser0.parse("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"\" does not match \\]
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1697, " 6'_on|?\"xrN}NM4'~R");
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(" 6'_on|?\"xrN}NM4'~R", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \" 6'_on|?\"xrN}NM4'~R\" ; gave up at index 18
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1325, "U6");
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("{zHO}KOh}.w%V_1w", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"{zHO}KOh}.w%V_1w\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(678, "3");
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("3", simpleTimeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(107);
      assertEquals(2007, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "d&", 2, 2, 2, 2, 2, 2, 2, 2);
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("d&", simpleTimeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(2);
      assertEquals(2002, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("PST");
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("(*!#D@>=o8toof", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"(*!#D@>=o8toof\" ; gave up at index 8
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1), ")$1y\"La>");
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(")$1y\"La>", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \")$1y\"La>\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.JAPAN;
      FastDateParser fastDateParser0 = new FastDateParser("*!![G9,", timeZone0, locale0);
      assertEquals("*!![G9,", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "'Z'-S~fsdZ]3Cw8B");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("'Z'-S~fsdZ]3Cw8B", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"'Z'-S~fsdZ]3Cw8B\" ; gave up at index 6
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("<k.h2eIqE md*", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"<k.h2eIqE md*\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("/vdeuV>wcQWx");
      Locale locale0 = Locale.KOREA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("/vdeuV>wcQWx", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"/vdeuV>wcQWx\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("a0/Kg");
      Locale locale0 = Locale.forLanguageTag("");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("a0/Kg", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"a0/Kg\" ; gave up at index 4
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("1a^B#tid+2*!._+", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"1a^B#tid+2*!._+\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("4", timeZone0, locale0);
      assertEquals("4", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Hc wIx(x=(");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("5ejo|[}J3T", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"5ejo|[}J3T\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("6Ic~(`{P|5%h577&el", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"6Ic~(`{P|5%h577&el\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("a0/jg");
      Locale locale0 = Locale.forLanguageTag("#B9>TkDZ,/bBt['*");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("7#MIT", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"7#MIT\" ; gave up at index 3
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(23, "!%0[S:<W0zGNDL");
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("!%0[S:<W0zGNDL", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"!%0[S:<W0zGNDL\" ; gave up at index 11
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(";$Uz|h OO3jm;w[PP", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \";$Uz|h OO3jm;w[PP\" ; gave up at index 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "'Z'-S~fsdZ]3Cw8B");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("=[$7*", simpleTimeZone0, locale0);
      assertEquals("=[$7*", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser(">mD", timeZone0, locale0);
      assertEquals(">mD", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-725), "");
      Locale locale0 = new Locale("");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("?o9RI.<H&z|", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"?o9RI.<H&z|\" ; gave up at index 1
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("n!niFx", "n!niFx");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser(",<9H9f1eE#.b#[W<", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \",<9H9f1eE#.b#[W<\" ; gave up at index 5
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "`d&", 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("`d&", simpleTimeZone0, locale0);
      assertEquals("`d&", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-4124), "Z$LMyb");
      Locale locale0 = Locale.JAPAN;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("Z$LMyb", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to parse \"Z$LMyb\" ; gave up at index 2
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }
}
