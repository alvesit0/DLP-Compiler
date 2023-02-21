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
  public static final int T__0 = 1,
      T__1 = 2,
      T__2 = 3,
      T__3 = 4,
      INT_CONSTANT = 5,
      CHAR_CONSTANT = 6,
      REAL_CONSTANT = 7,
      ID = 8,
      SINGLE_LINE_COMMENT = 9,
      MULTI_LINE_COMMENT = 10,
      WS = 11;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "T__0",
      "T__1",
      "T__2",
      "T__3",
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
    return new String[] {null, "'::'", "'int'", "'double'", "'char'"};
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      null,
      null,
      null,
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
      "\u0004\u0000\u000br\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"
          + "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"
          + "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"
          + "\u0001\u0004\u0004\u0004,\b\u0004\u000b\u0004\f\u0004-\u0001\u0005\u0001"
          + "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"
          + "\u0005\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001\u0005\u0001"
          + "\u0005\u0001\u0006\u0004\u0006?\b\u0006\u000b\u0006\f\u0006@\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0003\u0006F\b\u0006\u0003\u0006H\b\u0006\u0001"
          + "\u0006\u0004\u0006K\b\u0006\u000b\u0006\f\u0006L\u0001\u0007\u0001\u0007"
          + "\u0005\u0007Q\b\u0007\n\u0007\f\u0007T\t\u0007\u0001\b\u0001\b\u0005\b"
          + "X\b\b\n\b\f\b[\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"
          + "\t\u0005\td\b\t\n\t\f\tg\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"
          + "\t\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003"
          + "\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"
          + "\t\u0013\n\u0015\u000b\u0001\u0000\u0005\u0001\u000009\u0003\u0000AZ_"
          + "_az\u0004\u000009AZ__az\u0002\u0000\t\n\r\r\u0003\u0000\t\n\r\r  |\u0000"
          + "\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"
          + "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"
          + "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"
          + "\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"
          + "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"
          + "\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u001a"
          + "\u0001\u0000\u0000\u0000\u0005\u001e\u0001\u0000\u0000\u0000\u0007%\u0001"
          + "\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000"
          + "\u0000\r>\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011"
          + "U\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000\u0015n\u0001"
          + "\u0000\u0000\u0000\u0017\u0018\u0005:\u0000\u0000\u0018\u0019\u0005:\u0000"
          + "\u0000\u0019\u0002\u0001\u0000\u0000\u0000\u001a\u001b\u0005i\u0000\u0000"
          + "\u001b\u001c\u0005n\u0000\u0000\u001c\u001d\u0005t\u0000\u0000\u001d\u0004"
          + "\u0001\u0000\u0000\u0000\u001e\u001f\u0005d\u0000\u0000\u001f \u0005o"
          + "\u0000\u0000 !\u0005u\u0000\u0000!\"\u0005b\u0000\u0000\"#\u0005l\u0000"
          + "\u0000#$\u0005e\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005c\u0000"
          + "\u0000&\'\u0005h\u0000\u0000\'(\u0005a\u0000\u0000()\u0005r\u0000\u0000"
          + ")\b\u0001\u0000\u0000\u0000*,\u0007\u0000\u0000\u0000+*\u0001\u0000\u0000"
          + "\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"
          + "\u0000\u0000.\n\u0001\u0000\u0000\u0000/9\u0005\'\u0000\u00000:\t\u0000"
          + "\u0000\u000012\u0005\\\u0000\u00002:\u0005t\u0000\u000034\u0005\\\u0000"
          + "\u00004:\u0005n\u0000\u000056\u0005\\\u0000\u000067\u0007\u0000\u0000"
          + "\u000078\u0007\u0000\u0000\u00008:\u0007\u0000\u0000\u000090\u0001\u0000"
          + "\u0000\u000091\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u000095\u0001"
          + "\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005\'\u0000\u0000<\f"
          + "\u0001\u0000\u0000\u0000=?\u0007\u0000\u0000\u0000>=\u0001\u0000\u0000"
          + "\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"
          + "\u0000\u0000AG\u0001\u0000\u0000\u0000BH\u0005.\u0000\u0000CE\u0005E\u0000"
          + "\u0000DF\u0005-\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"
          + "\u0000FH\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000"
          + "\u0000\u0000HJ\u0001\u0000\u0000\u0000IK\u0007\u0000\u0000\u0000JI\u0001"
          + "\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"
          + "LM\u0001\u0000\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NR\u0007\u0001"
          + "\u0000\u0000OQ\u0007\u0002\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001"
          + "\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"
          + "S\u0010\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UY\u0005#\u0000"
          + "\u0000VX\b\u0003\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"
          + "\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000"
          + "\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0006\b\u0000\u0000]\u0012\u0001"
          + "\u0000\u0000\u0000^_\u0005\"\u0000\u0000_`\u0005\"\u0000\u0000`a\u0005"
          + "\"\u0000\u0000ae\u0001\u0000\u0000\u0000bd\t\u0000\u0000\u0000cb\u0001"
          + "\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"
          + "ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"
          + "\u0000hi\u0005\"\u0000\u0000ij\u0005\"\u0000\u0000jk\u0005\"\u0000\u0000"
          + "kl\u0001\u0000\u0000\u0000lm\u0006\t\u0000\u0000m\u0014\u0001\u0000\u0000"
          + "\u0000no\u0007\u0004\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0006\n\u0000"
          + "\u0000q\u0016\u0001\u0000\u0000\u0000\n\u0000-9@EGLRYe\u0001\u0006\u0000"
          + "\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
