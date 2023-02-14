// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int INT_CONSTANT = 1,
      CHAR_CONSTANT = 2,
      REAL_CONSTANT = 3,
      ID = 4,
      SINGLE_LINE_COMMENT = 5,
      MULTI_LINE_COMMENT = 6,
      WS = 7;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "INT_CONSTANT",
      "CHAR_CONSTANT",
      "REAL_CONSTANT",
      "ID",
      "SINGLE_LINE_COMMENT",
      "MULTI_LINE_COMMENT",
      "WS"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {};
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      "INT_CONSTANT",
      "CHAR_CONSTANT",
      "REAL_CONSTANT",
      "ID",
      "SINGLE_LINE_COMMENT",
      "MULTI_LINE_COMMENT",
      "WS"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  public XanaLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  public String getGrammarFileName() {
    return "Xana.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\u0004\u0000\u0007R\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"
          + "\u0004\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0001\u0001"
          + "\u0001\u0003\u0001\u0017\b\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002"
          + "\f\u0002 \u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0003"
          + "\u0002(\b\u0002\u0001\u0002\u0004\u0002+\b\u0002\u000b\u0002\f\u0002,"
          + "\u0001\u0003\u0001\u0003\u0005\u00031\b\u0003\n\u0003\f\u00034\t\u0003"
          + "\u0001\u0004\u0001\u0004\u0005\u00048\b\u0004\n\u0004\f\u0004;\t\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0005\u0005D\b\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0001\u0001\u0003"
          + "\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000"
          + "\u0006\u0001\u000009\u0001\u0000\t\n\u0003\u0000AZ__az\u0003\u000009A"
          + "Zaz\u0002\u0000\t\n\r\r\u0003\u0000\t\n\r\r  [\u0000\u0001\u0001\u0000"
          + "\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"
          + "\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"
          + "\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"
          + "\u0001\u0010\u0001\u0000\u0000\u0000\u0003\u0014\u0001\u0000\u0000\u0000"
          + "\u0005\u001e\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t"
          + "5\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\rN\u0001\u0000"
          + "\u0000\u0000\u000f\u0011\u0007\u0000\u0000\u0000\u0010\u000f\u0001\u0000"
          + "\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000"
          + "\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0002\u0001\u0000"
          + "\u0000\u0000\u0014\u0019\u0005\'\u0000\u0000\u0015\u0017\t\u0000\u0000"
          + "\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"
          + "\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u001a\u0007\u0001\u0000"
          + "\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000"
          + "\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\'\u0000\u0000"
          + "\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001f\u0007\u0000\u0000\u0000"
          + "\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e"
          + "\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\'\u0001\u0000\u0000"
          + "\u0000\"(\u0005.\u0000\u0000#%\u0005E\u0000\u0000$&\u0005-\u0000\u0000"
          + "%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000"
          + "\u0000\'\"\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000(*\u0001"
          + "\u0000\u0000\u0000)+\u0007\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"
          + "+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"
          + "\u0000-\u0006\u0001\u0000\u0000\u0000.2\u0007\u0002\u0000\u0000/1\u0007"
          + "\u0003\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"
          + "20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\b\u0001\u0000\u0000"
          + "\u000042\u0001\u0000\u0000\u000059\u0005#\u0000\u000068\b\u0004\u0000"
          + "\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000"
          + "\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001"
          + "\u0000\u0000\u0000<=\u0006\u0004\u0000\u0000=\n\u0001\u0000\u0000\u0000"
          + ">?\u0005\"\u0000\u0000?@\u0005\"\u0000\u0000@A\u0005\"\u0000\u0000AE\u0001"
          + "\u0000\u0000\u0000BD\t\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001"
          + "\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"
          + "FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\"\u0000\u0000"
          + "IJ\u0005\"\u0000\u0000JK\u0005\"\u0000\u0000KL\u0001\u0000\u0000\u0000"
          + "LM\u0006\u0005\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0007\u0005\u0000"
          + "\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\u0006\u0000\u0000Q\u000e\u0001"
          + "\u0000\u0000\u0000\u000b\u0000\u0012\u0016\u0019 %\',29E\u0001\u0006\u0000"
          + "\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
