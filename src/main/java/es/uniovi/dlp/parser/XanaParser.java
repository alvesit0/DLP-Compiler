// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaParser extends Parser {
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
  public static final int RULE_program = 0,
      RULE_var_definition = 1,
      RULE_func_definitions = 2,
      RULE_type = 3;

  private static String[] makeRuleNames() {
    return new String[] {"program", "var_definition", "func_definitions", "type"};
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

  @Override
  public String getGrammarFileName() {
    return "java-escape";
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
  public ATN getATN() {
    return _ATN;
  }

  public XanaParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ProgramContext extends ParserRuleContext {
    public List<Var_definitionContext> var_definition() {
      return getRuleContexts(Var_definitionContext.class);
    }

    public Var_definitionContext var_definition(int i) {
      return getRuleContext(Var_definitionContext.class, i);
    }

    public List<Func_definitionsContext> func_definitions() {
      return getRuleContexts(Func_definitionsContext.class);
    }

    public Func_definitionsContext func_definitions(int i) {
      return getRuleContext(Func_definitionsContext.class, i);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(11);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(8);
                var_definition();
              }
            }
          }
          setState(13);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
        }
        setState(17);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(14);
              func_definitions();
            }
          }
          setState(19);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Var_definitionContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public Var_definitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_var_definition;
    }
  }

  public final Var_definitionContext var_definition() throws RecognitionException {
    Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_var_definition);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(20);
        match(ID);
        setState(21);
        match(T__0);
        setState(22);
        type();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_definitionsContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public Func_definitionsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_definitions;
    }
  }

  public final Func_definitionsContext func_definitions() throws RecognitionException {
    Func_definitionsContext _localctx = new Func_definitionsContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_func_definitions);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(24);
        match(ID);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TypeContext extends ParserRuleContext {
    public TypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_type;
    }
  }

  public final TypeContext type() throws RecognitionException {
    TypeContext _localctx = new TypeContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_type);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(26);
        _la = _input.LA(1);
        if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
      "\u0004\u0001\u000b\u001d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"
          + "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000"
          + "\n\b\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0005\u0000\u0010\b\u0000"
          + "\n\u0000\f\u0000\u0013\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000"
          + "\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0002\u0004"
          + "\u001a\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000"
          + "\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006\u001a\u0001\u0000\u0000"
          + "\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\r\u0001"
          + "\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000"
          + "\u0000\u0000\f\u0011\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"
          + "\u0000\u000e\u0010\u0003\u0004\u0002\u0000\u000f\u000e\u0001\u0000\u0000"
          + "\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"
          + "\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0001\u0001\u0000\u0000"
          + "\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005\b\u0000\u0000"
          + "\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0017\u0003\u0006\u0003\u0000"
          + "\u0017\u0003\u0001\u0000\u0000\u0000\u0018\u0019\u0005\b\u0000\u0000\u0019"
          + "\u0005\u0001\u0000\u0000\u0000\u001a\u001b\u0007\u0000\u0000\u0000\u001b"
          + "\u0007\u0001\u0000\u0000\u0000\u0002\u000b\u0011";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
