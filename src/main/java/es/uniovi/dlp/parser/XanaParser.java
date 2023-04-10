// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import java.util.ArrayList;
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
      T__4 = 5,
      T__5 = 6,
      T__6 = 7,
      T__7 = 8,
      T__8 = 9,
      T__9 = 10,
      T__10 = 11,
      T__11 = 12,
      T__12 = 13,
      T__13 = 14,
      T__14 = 15,
      T__15 = 16,
      T__16 = 17,
      T__17 = 18,
      T__18 = 19,
      T__19 = 20,
      T__20 = 21,
      T__21 = 22,
      T__22 = 23,
      T__23 = 24,
      T__24 = 25,
      T__25 = 26,
      T__26 = 27,
      T__27 = 28,
      T__28 = 29,
      T__29 = 30,
      T__30 = 31,
      T__31 = 32,
      T__32 = 33,
      T__33 = 34,
      T__34 = 35,
      T__35 = 36,
      T__36 = 37,
      T__37 = 38,
      INT_CONSTANT = 39,
      CHAR_CONSTANT = 40,
      REAL_CONSTANT = 41,
      ID = 42,
      SINGLE_LINE_COMMENT = 43,
      MULTI_LINE_COMMENT = 44,
      WS = 45;
  public static final int RULE_program = 0,
      RULE_definition_list = 1,
      RULE_definition = 2,
      RULE_var_definition_list = 3,
      RULE_function_definition = 4,
      RULE_main_function = 5,
      RULE_params = 6,
      RULE_function_body = 7,
      RULE_statement = 8,
      RULE_statement_list = 9,
      RULE_if_else_statement = 10,
      RULE_while_statement = 11,
      RULE_assignment_statement = 12,
      RULE_return_statement = 13,
      RULE_puts_statement = 14,
      RULE_in_statement = 15,
      RULE_io_list = 16,
      RULE_expression = 17,
      RULE_function_invocation = 18,
      RULE_function_invocation_params = 19,
      RULE_type = 20,
      RULE_struct_field_list = 21,
      RULE_struct_field = 22,
      RULE_function_type = 23,
      RULE_primitive_type = 24;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "definition_list",
      "definition",
      "var_definition_list",
      "function_definition",
      "main_function",
      "params",
      "function_body",
      "statement",
      "statement_list",
      "if_else_statement",
      "while_statement",
      "assignment_statement",
      "return_statement",
      "puts_statement",
      "in_statement",
      "io_list",
      "expression",
      "function_invocation",
      "function_invocation_params",
      "type",
      "struct_field_list",
      "struct_field",
      "function_type",
      "primitive_type"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "','",
      "'::'",
      "'def'",
      "'('",
      "')'",
      "'do'",
      "'end'",
      "'main'",
      "'if'",
      "'else'",
      "'while'",
      "'='",
      "'return'",
      "'puts'",
      "'in'",
      "'.'",
      "'['",
      "']'",
      "'as'",
      "'+'",
      "'-'",
      "'*'",
      "'/'",
      "'%'",
      "'!'",
      "'||'",
      "'&&'",
      "'<'",
      "'>'",
      "'<='",
      "'>='",
      "'=='",
      "'!='",
      "'defstruct'",
      "'void'",
      "'int'",
      "'double'",
      "'char'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
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
    public es.uniovi.dlp.ast.Program ast;
    public Definition_listContext definition_list;

    public Definition_listContext definition_list() {
      return getRuleContext(Definition_listContext.class, 0);
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
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(50);
        ((ProgramContext) _localctx).definition_list = definition_list();
        ((ProgramContext) _localctx).ast =
            new es.uniovi.dlp.ast.Program(0, 0, ((ProgramContext) _localctx).definition_list.list);
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
  public static class Definition_listContext extends ParserRuleContext {
    public List<Definition> list = new ArrayList<Definition>();
    ;
    public DefinitionContext definition;
    public Main_functionContext main_function;

    public Main_functionContext main_function() {
      return getRuleContext(Main_functionContext.class, 0);
    }

    public List<DefinitionContext> definition() {
      return getRuleContexts(DefinitionContext.class);
    }

    public DefinitionContext definition(int i) {
      return getRuleContext(DefinitionContext.class, i);
    }

    public Definition_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_definition_list;
    }
  }

  public final Definition_listContext definition_list() throws RecognitionException {
    Definition_listContext _localctx = new Definition_listContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_definition_list);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(58);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(53);
                ((Definition_listContext) _localctx).definition = definition();
                _localctx.list.addAll(((Definition_listContext) _localctx).definition.list);
              }
            }
          }
          setState(60);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
        }
        setState(61);
        ((Definition_listContext) _localctx).main_function = main_function();
        _localctx.list.add(((Definition_listContext) _localctx).main_function.ast);
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
  public static class DefinitionContext extends ParserRuleContext {
    public List<Definition> list = new ArrayList<Definition>();
    ;
    public Var_definition_listContext var_definition_list;
    public Function_definitionContext function_definition;
    public Main_functionContext main_function;

    public Var_definition_listContext var_definition_list() {
      return getRuleContext(Var_definition_listContext.class, 0);
    }

    public Function_definitionContext function_definition() {
      return getRuleContext(Function_definitionContext.class, 0);
    }

    public Main_functionContext main_function() {
      return getRuleContext(Main_functionContext.class, 0);
    }

    public DefinitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_definition;
    }
  }

  public final DefinitionContext definition() throws RecognitionException {
    DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_definition);
    try {
      setState(73);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(64);
            ((DefinitionContext) _localctx).var_definition_list = var_definition_list();
            _localctx.list.addAll(((DefinitionContext) _localctx).var_definition_list.list);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(67);
            ((DefinitionContext) _localctx).function_definition = function_definition();
            _localctx.list.add(((DefinitionContext) _localctx).function_definition.ast);
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(70);
            ((DefinitionContext) _localctx).main_function = main_function();
            _localctx.list.add(((DefinitionContext) _localctx).main_function.ast);
          }
          break;
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
  public static class Var_definition_listContext extends ParserRuleContext {
    public List<VarDefinition> list = new ArrayList<VarDefinition>();
    ;
    public Token ID;
    public List<Token> ids = new ArrayList<Token>();
    public TypeContext t;
    public TypeContext type;

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public Var_definition_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_var_definition_list;
    }
  }

  public final Var_definition_listContext var_definition_list() throws RecognitionException {
    Var_definition_listContext _localctx = new Var_definition_listContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_var_definition_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(75);
        ((Var_definition_listContext) _localctx).ID = match(ID);
        ((Var_definition_listContext) _localctx)
            .ids.add(((Var_definition_listContext) _localctx).ID);
        setState(80);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(76);
              match(T__0);
              setState(77);
              ((Var_definition_listContext) _localctx).ID = match(ID);
              ((Var_definition_listContext) _localctx)
                  .ids.add(((Var_definition_listContext) _localctx).ID);
            }
          }
          setState(82);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(83);
        match(T__1);
        setState(84);
        ((Var_definition_listContext) _localctx).t =
            ((Var_definition_listContext) _localctx).type = type();

        for (var id : ((Var_definition_listContext) _localctx).ids) {
          _localctx.list.add(
              new VarDefinition(
                  id.getLine(),
                  id.getCharPositionInLine() + 1,
                  id.getText(),
                  ((Var_definition_listContext) _localctx).type.ast));
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
  public static class Function_definitionContext extends ParserRuleContext {
    public FunctionDefinition ast;
    public Token f;
    public ParamsContext params;
    public Function_typeContext t;
    public Function_bodyContext function_body;

    public ParamsContext params() {
      return getRuleContext(ParamsContext.class, 0);
    }

    public Function_bodyContext function_body() {
      return getRuleContext(Function_bodyContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public Function_typeContext function_type() {
      return getRuleContext(Function_typeContext.class, 0);
    }

    public Function_definitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_function_definition;
    }
  }

  public final Function_definitionContext function_definition() throws RecognitionException {
    Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_function_definition);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(87);
        match(T__2);
        setState(88);
        ((Function_definitionContext) _localctx).f = match(ID);
        setState(89);
        match(T__3);
        setState(90);
        ((Function_definitionContext) _localctx).params = params();
        setState(91);
        match(T__4);
        setState(92);
        match(T__1);
        setState(93);
        ((Function_definitionContext) _localctx).t = function_type();
        setState(94);
        match(T__5);
        setState(95);
        ((Function_definitionContext) _localctx).function_body = function_body();
        setState(96);
        match(T__6);
        ((Function_definitionContext) _localctx).ast =
            new FunctionDefinition(
                ((Function_definitionContext) _localctx).f.getLine(),
                1,
                new FuncType(
                    ((Function_definitionContext) _localctx).t.ast.getLine(),
                    ((Function_definitionContext) _localctx).t.ast.getColumn(),
                    ((Function_definitionContext) _localctx).params.list,
                    ((Function_definitionContext) _localctx).t.ast),
                (((Function_definitionContext) _localctx).f != null
                    ? ((Function_definitionContext) _localctx).f.getText()
                    : null),
                ((Function_definitionContext) _localctx).function_body.statementList,
                ((Function_definitionContext) _localctx).function_body.varDefinitionList);
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
  public static class Main_functionContext extends ParserRuleContext {
    public FunctionDefinition ast;
    public Token m;
    public ParamsContext params;
    public Function_bodyContext function_body;

    public ParamsContext params() {
      return getRuleContext(ParamsContext.class, 0);
    }

    public Function_bodyContext function_body() {
      return getRuleContext(Function_bodyContext.class, 0);
    }

    public Main_functionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_main_function;
    }
  }

  public final Main_functionContext main_function() throws RecognitionException {
    Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_main_function);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(99);
        match(T__2);
        setState(100);
        ((Main_functionContext) _localctx).m = match(T__7);
        setState(101);
        match(T__3);
        setState(102);
        ((Main_functionContext) _localctx).params = params();
        setState(103);
        match(T__4);
        setState(104);
        match(T__5);
        setState(105);
        ((Main_functionContext) _localctx).function_body = function_body();
        setState(106);
        match(T__6);
        ((Main_functionContext) _localctx).ast =
            new FunctionDefinition(
                ((Main_functionContext) _localctx).m.getLine(),
                ((Main_functionContext) _localctx).m.getCharPositionInLine() + 1,
                new FuncType(
                    ((Main_functionContext) _localctx).m.getLine(),
                    ((Main_functionContext) _localctx).m.getCharPositionInLine() + 1,
                    ((Main_functionContext) _localctx).params.list,
                    new VoidType(
                        ((Main_functionContext) _localctx).m.getLine(),
                        ((Main_functionContext) _localctx).m.getCharPositionInLine() + 1)),
                "main",
                ((Main_functionContext) _localctx).function_body.statementList,
                ((Main_functionContext) _localctx).function_body.varDefinitionList);
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
  public static class ParamsContext extends ParserRuleContext {
    public List<VarDefinition> list = new ArrayList<VarDefinition>();
    ;
    public Token var1;
    public TypeContext t1;
    public Token var2;
    public TypeContext t2;

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public List<TypeContext> type() {
      return getRuleContexts(TypeContext.class);
    }

    public TypeContext type(int i) {
      return getRuleContext(TypeContext.class, i);
    }

    public ParamsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_params;
    }
  }

  public final ParamsContext params() throws RecognitionException {
    ParamsContext _localctx = new ParamsContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_params);
    int _la;
    try {
      setState(125);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case ID:
          enterOuterAlt(_localctx, 1);
          {
            setState(109);
            ((ParamsContext) _localctx).var1 = match(ID);
            setState(110);
            match(T__1);
            setState(111);
            ((ParamsContext) _localctx).t1 = type();
            _localctx.list.add(
                new VarDefinition(
                    ((ParamsContext) _localctx).var1.getLine(),
                    ((ParamsContext) _localctx).var1.getCharPositionInLine() + 1,
                    (((ParamsContext) _localctx).var1 != null
                        ? ((ParamsContext) _localctx).var1.getText()
                        : null),
                    ((ParamsContext) _localctx).t1.ast));
            setState(121);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
              {
                {
                  setState(113);
                  match(T__0);
                  setState(114);
                  ((ParamsContext) _localctx).var2 = match(ID);
                  setState(115);
                  match(T__1);
                  setState(116);
                  ((ParamsContext) _localctx).t2 = type();
                  _localctx.list.add(
                      new VarDefinition(
                          ((ParamsContext) _localctx).var2.getLine(),
                          ((ParamsContext) _localctx).var2.getCharPositionInLine() + 1,
                          (((ParamsContext) _localctx).var2 != null
                              ? ((ParamsContext) _localctx).var2.getText()
                              : null),
                          ((ParamsContext) _localctx).t2.ast));
                }
              }
              setState(123);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
          break;
        case T__4:
          enterOuterAlt(_localctx, 2);
          {
          }
          break;
        default:
          throw new NoViableAltException(this);
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
  public static class Function_bodyContext extends ParserRuleContext {
    public List<Statement> statementList = new ArrayList<>();
    public List<VarDefinition> varDefinitionList = new ArrayList<>();
    public Var_definition_listContext var_definition_list;
    public StatementContext statement;

    public List<Var_definition_listContext> var_definition_list() {
      return getRuleContexts(Var_definition_listContext.class);
    }

    public Var_definition_listContext var_definition_list(int i) {
      return getRuleContext(Var_definition_listContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Function_bodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_function_body;
    }
  }

  public final Function_bodyContext function_body() throws RecognitionException {
    Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_function_body);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(132);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(127);
                ((Function_bodyContext) _localctx).var_definition_list = var_definition_list();
                _localctx.varDefinitionList.addAll(
                    ((Function_bodyContext) _localctx).var_definition_list.list);
              }
            }
          }
          setState(134);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
        }
        setState(140);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246372919824L) != 0) {
          {
            {
              setState(135);
              ((Function_bodyContext) _localctx).statement = statement();
              _localctx.statementList.addAll(((Function_bodyContext) _localctx).statement.list);
            }
          }
          setState(142);
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
  public static class StatementContext extends ParserRuleContext {
    public List<Statement> list = new ArrayList<Statement>();
    ;
    public If_else_statementContext if_else_statement;
    public While_statementContext while_statement;
    public Assignment_statementContext assignment_statement;
    public Function_invocationContext function_invocation;
    public Return_statementContext return_statement;
    public Puts_statementContext puts_statement;
    public In_statementContext in_statement;

    public If_else_statementContext if_else_statement() {
      return getRuleContext(If_else_statementContext.class, 0);
    }

    public While_statementContext while_statement() {
      return getRuleContext(While_statementContext.class, 0);
    }

    public Assignment_statementContext assignment_statement() {
      return getRuleContext(Assignment_statementContext.class, 0);
    }

    public Function_invocationContext function_invocation() {
      return getRuleContext(Function_invocationContext.class, 0);
    }

    public Return_statementContext return_statement() {
      return getRuleContext(Return_statementContext.class, 0);
    }

    public Puts_statementContext puts_statement() {
      return getRuleContext(Puts_statementContext.class, 0);
    }

    public In_statementContext in_statement() {
      return getRuleContext(In_statementContext.class, 0);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_statement);
    try {
      setState(164);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(143);
            ((StatementContext) _localctx).if_else_statement = if_else_statement();
            _localctx.list.add(((StatementContext) _localctx).if_else_statement.ast);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(146);
            ((StatementContext) _localctx).while_statement = while_statement();
            _localctx.list.add(((StatementContext) _localctx).while_statement.ast);
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(149);
            ((StatementContext) _localctx).assignment_statement = assignment_statement();
            _localctx.list.add(((StatementContext) _localctx).assignment_statement.ast);
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(152);
            ((StatementContext) _localctx).function_invocation = function_invocation();
            _localctx.list.add(((StatementContext) _localctx).function_invocation.ast);
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(155);
            ((StatementContext) _localctx).return_statement = return_statement();
            _localctx.list.add(((StatementContext) _localctx).return_statement.ast);
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(158);
            ((StatementContext) _localctx).puts_statement = puts_statement();
            _localctx.list.addAll(((StatementContext) _localctx).puts_statement.list);
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(161);
            ((StatementContext) _localctx).in_statement = in_statement();
            _localctx.list.addAll(((StatementContext) _localctx).in_statement.list);
          }
          break;
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
  public static class Statement_listContext extends ParserRuleContext {
    public List<Statement> list = new ArrayList<Statement>();
    ;
    public StatementContext statement;

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Statement_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement_list;
    }
  }

  public final Statement_listContext statement_list() throws RecognitionException {
    Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_statement_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(171);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246372919824L) != 0) {
          {
            {
              setState(166);
              ((Statement_listContext) _localctx).statement = statement();
              _localctx.list.addAll(((Statement_listContext) _localctx).statement.list);
            }
          }
          setState(173);
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
  public static class If_else_statementContext extends ParserRuleContext {
    public If ast;
    public Statement_listContext sl1;
    public Statement_listContext sl2;

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public List<Statement_listContext> statement_list() {
      return getRuleContexts(Statement_listContext.class);
    }

    public Statement_listContext statement_list(int i) {
      return getRuleContext(Statement_listContext.class, i);
    }

    public If_else_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_if_else_statement;
    }
  }

  public final If_else_statementContext if_else_statement() throws RecognitionException {
    If_else_statementContext _localctx = new If_else_statementContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_if_else_statement);
    try {
      setState(190);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(174);
            match(T__8);
            setState(175);
            expression(0);
            setState(176);
            match(T__5);
            setState(177);
            ((If_else_statementContext) _localctx).sl1 = statement_list();
            setState(178);
            match(T__6);
            ((If_else_statementContext) _localctx).ast =
                new If(null, ((If_else_statementContext) _localctx).sl1.list, null);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(181);
            match(T__8);
            setState(182);
            expression(0);
            setState(183);
            match(T__5);
            setState(184);
            ((If_else_statementContext) _localctx).sl1 = statement_list();
            setState(185);
            match(T__9);
            setState(186);
            ((If_else_statementContext) _localctx).sl2 = statement_list();
            setState(187);
            match(T__6);
            ((If_else_statementContext) _localctx).ast =
                new If(
                    null,
                    ((If_else_statementContext) _localctx).sl1.list,
                    ((If_else_statementContext) _localctx).sl2.list);
          }
          break;
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
  public static class While_statementContext extends ParserRuleContext {
    public While ast;
    public ExpressionContext e;
    public Statement_listContext sl;

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Statement_listContext statement_list() {
      return getRuleContext(Statement_listContext.class, 0);
    }

    public While_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_while_statement;
    }
  }

  public final While_statementContext while_statement() throws RecognitionException {
    While_statementContext _localctx = new While_statementContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_while_statement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(192);
        match(T__10);
        setState(193);
        ((While_statementContext) _localctx).e = expression(0);
        setState(194);
        match(T__5);
        setState(195);
        ((While_statementContext) _localctx).sl = statement_list();
        setState(196);
        match(T__6);
        ((While_statementContext) _localctx).ast =
            new While(
                ((While_statementContext) _localctx).e.ast,
                ((While_statementContext) _localctx).sl.list);
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
  public static class Assignment_statementContext extends ParserRuleContext {
    public Assignment ast;
    public ExpressionContext e1;
    public ExpressionContext e2;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignment_statement;
    }
  }

  public final Assignment_statementContext assignment_statement() throws RecognitionException {
    Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_assignment_statement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(199);
        ((Assignment_statementContext) _localctx).e1 = expression(0);
        setState(200);
        match(T__11);
        setState(201);
        ((Assignment_statementContext) _localctx).e2 = expression(0);
        ((Assignment_statementContext) _localctx).ast =
            new Assignment(
                ((Assignment_statementContext) _localctx).e1.ast,
                ((Assignment_statementContext) _localctx).e2.ast);
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
  public static class Return_statementContext extends ParserRuleContext {
    public Return ast;
    public ExpressionContext expression;

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public Return_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_return_statement;
    }
  }

  public final Return_statementContext return_statement() throws RecognitionException {
    Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_return_statement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(204);
        match(T__12);
        setState(205);
        ((Return_statementContext) _localctx).expression = expression(0);
        ((Return_statementContext) _localctx).ast =
            new Return(((Return_statementContext) _localctx).expression.ast);
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
  public static class Puts_statementContext extends ParserRuleContext {
    public List<Write> list = new ArrayList<>();
    public Io_listContext io_list;

    public Io_listContext io_list() {
      return getRuleContext(Io_listContext.class, 0);
    }

    public Puts_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_puts_statement;
    }
  }

  public final Puts_statementContext puts_statement() throws RecognitionException {
    Puts_statementContext _localctx = new Puts_statementContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_puts_statement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(208);
        match(T__13);
        setState(209);
        ((Puts_statementContext) _localctx).io_list = io_list();

        for (Expression e : ((Puts_statementContext) _localctx).io_list.list)
          _localctx.list.add(new Write(e));
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
  public static class In_statementContext extends ParserRuleContext {
    public List<Read> list = new ArrayList<>();
    public Io_listContext io_list;

    public Io_listContext io_list() {
      return getRuleContext(Io_listContext.class, 0);
    }

    public In_statementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_in_statement;
    }
  }

  public final In_statementContext in_statement() throws RecognitionException {
    In_statementContext _localctx = new In_statementContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_in_statement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(212);
        match(T__14);
        setState(213);
        ((In_statementContext) _localctx).io_list = io_list();

        for (Expression e : ((In_statementContext) _localctx).io_list.list)
          _localctx.list.add(new Read(e));
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
  public static class Io_listContext extends ParserRuleContext {
    public List<Expression> list = new ArrayList<Expression>();
    ;
    public ExpressionContext expression;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public Io_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_io_list;
    }
  }

  public final Io_listContext io_list() throws RecognitionException {
    Io_listContext _localctx = new Io_listContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_io_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(216);
        ((Io_listContext) _localctx).expression = expression(0);
        _localctx.list.add(((Io_listContext) _localctx).expression.ast);
        setState(224);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(218);
              match(T__0);
              setState(219);
              ((Io_listContext) _localctx).expression = expression(0);
              _localctx.list.add(((Io_listContext) _localctx).expression.ast);
            }
          }
          setState(226);
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
  public static class ExpressionContext extends ParserRuleContext {
    public Expression ast;
    public ExpressionContext expr;
    public ExpressionContext array;
    public ExpressionContext expr1;
    public Token id;
    public Token intconst;
    public Token charconst;
    public Token realconst;
    public Function_invocationContext function_invocation;
    public ExpressionContext expression;
    public Token op;
    public ExpressionContext expr2;
    public Token attribute;
    public List<ExpressionContext> indexes = new ArrayList<ExpressionContext>();
    public TypeContext type;

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TerminalNode CHAR_CONSTANT() {
      return getToken(XanaParser.CHAR_CONSTANT, 0);
    }

    public TerminalNode REAL_CONSTANT() {
      return getToken(XanaParser.REAL_CONSTANT, 0);
    }

    public Function_invocationContext function_invocation() {
      return getRuleContext(Function_invocationContext.class, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    return expression(0);
  }

  private ExpressionContext expression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
    ExpressionContext _prevctx = _localctx;
    int _startState = 34;
    enterRecursionRule(_localctx, 34, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(252);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
          case 1:
            {
              setState(228);
              ((ExpressionContext) _localctx).id = match(ID);
              ((ExpressionContext) _localctx).ast =
                  new Variable(
                      ((ExpressionContext) _localctx).id.getLine(),
                      ((ExpressionContext) _localctx).id.getCharPositionInLine() + 1,
                      (((ExpressionContext) _localctx).id != null
                          ? ((ExpressionContext) _localctx).id.getText()
                          : null));
            }
            break;
          case 2:
            {
              setState(230);
              ((ExpressionContext) _localctx).intconst = match(INT_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new IntLiteral(
                      ((ExpressionContext) _localctx).intconst.getLine(),
                      ((ExpressionContext) _localctx).intconst.getCharPositionInLine() + 1,
                      LexerHelper.lexemeToInt(
                          (((ExpressionContext) _localctx).intconst != null
                              ? ((ExpressionContext) _localctx).intconst.getText()
                              : null)));
            }
            break;
          case 3:
            {
              setState(232);
              ((ExpressionContext) _localctx).charconst = match(CHAR_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new CharLiteral(
                      ((ExpressionContext) _localctx).charconst.getLine(),
                      ((ExpressionContext) _localctx).charconst.getCharPositionInLine() + 1,
                      LexerHelper.lexemeToChar(
                          (((ExpressionContext) _localctx).charconst != null
                              ? ((ExpressionContext) _localctx).charconst.getText()
                              : null)));
            }
            break;
          case 4:
            {
              setState(234);
              ((ExpressionContext) _localctx).realconst = match(REAL_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new DoubleLiteral(
                      ((ExpressionContext) _localctx).realconst.getLine(),
                      ((ExpressionContext) _localctx).realconst.getCharPositionInLine() + 1,
                      LexerHelper.lexemeToReal(
                          (((ExpressionContext) _localctx).realconst != null
                              ? ((ExpressionContext) _localctx).realconst.getText()
                              : null)));
            }
            break;
          case 5:
            {
              setState(236);
              ((ExpressionContext) _localctx).function_invocation = function_invocation();
              ((ExpressionContext) _localctx).ast =
                  ((ExpressionContext) _localctx).function_invocation.ast;
            }
            break;
          case 6:
            {
              setState(239);
              match(T__24);
              setState(240);
              ((ExpressionContext) _localctx).expression = expression(5);
              ((ExpressionContext) _localctx).ast =
                  new BooleanNot(
                      ((ExpressionContext) _localctx).expression.ast.getLine(),
                      ((ExpressionContext) _localctx).expression.ast.getColumn(),
                      ((ExpressionContext) _localctx).expression.ast);
            }
            break;
          case 7:
            {
              setState(243);
              match(T__3);
              setState(244);
              ((ExpressionContext) _localctx).expression = expression(0);
              setState(245);
              match(T__4);
              ((ExpressionContext) _localctx).ast = ((ExpressionContext) _localctx).expression.ast;
            }
            break;
          case 8:
            {
              setState(248);
              match(T__20);
              setState(249);
              ((ExpressionContext) _localctx).expression = expression(1);
              ((ExpressionContext) _localctx).ast =
                  new Negative(
                      ((ExpressionContext) _localctx).expression.ast.getLine(),
                      ((ExpressionContext) _localctx).expression.ast.getColumn(),
                      ((ExpressionContext) _localctx).expression.ast);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(295);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(293);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.expr1 = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(254);
                    if (!(precpred(_ctx, 6)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                    setState(255);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(256);
                    ((ExpressionContext) _localctx).expr2 =
                        ((ExpressionContext) _localctx).expression = expression(7);
                    ((ExpressionContext) _localctx).ast =
                        new ArithmeticOperation(
                            ((ExpressionContext) _localctx).op.getLine(),
                            ((ExpressionContext) _localctx).op.getCharPositionInLine() + 1,
                            (((ExpressionContext) _localctx).op != null
                                ? ((ExpressionContext) _localctx).op.getText()
                                : null),
                            ((ExpressionContext) _localctx).expr1.ast,
                            ((ExpressionContext) _localctx).expr2.ast);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.expr1 = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(259);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(260);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__25 || _la == T__26)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(261);
                    ((ExpressionContext) _localctx).expr2 =
                        ((ExpressionContext) _localctx).expression = expression(5);
                    ((ExpressionContext) _localctx).ast =
                        new ComparisonOperation(
                            ((ExpressionContext) _localctx).op.getLine(),
                            ((ExpressionContext) _localctx).op.getCharPositionInLine() + 1,
                            (((ExpressionContext) _localctx).op != null
                                ? ((ExpressionContext) _localctx).op.getText()
                                : null),
                            ((ExpressionContext) _localctx).expr1.ast,
                            ((ExpressionContext) _localctx).expr2.ast);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.expr1 = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(264);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(265);
                    ((ExpressionContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) {
                      ((ExpressionContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(266);
                    ((ExpressionContext) _localctx).expr2 =
                        ((ExpressionContext) _localctx).expression = expression(4);
                    ((ExpressionContext) _localctx).ast =
                        new BooleanOperation(
                            ((ExpressionContext) _localctx).op.getLine(),
                            ((ExpressionContext) _localctx).op.getCharPositionInLine() + 1,
                            (((ExpressionContext) _localctx).op != null
                                ? ((ExpressionContext) _localctx).op.getText()
                                : null),
                            ((ExpressionContext) _localctx).expr1.ast,
                            ((ExpressionContext) _localctx).expr2.ast);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.expr = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(269);
                    if (!(precpred(_ctx, 10)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                    setState(270);
                    match(T__15);
                    setState(271);
                    ((ExpressionContext) _localctx).attribute = match(ID);
                    ((ExpressionContext) _localctx).ast =
                        new StructAccess(
                            ((ExpressionContext) _localctx).expr.ast.getLine(),
                            ((ExpressionContext) _localctx).expr.ast.getColumn(),
                            ((ExpressionContext) _localctx).expr.ast,
                            (((ExpressionContext) _localctx).attribute != null
                                ? ((ExpressionContext) _localctx).attribute.getText()
                                : null));
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.array = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(273);
                    if (!(precpred(_ctx, 9)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                    setState(274);
                    match(T__16);
                    setState(275);
                    ((ExpressionContext) _localctx).expression =
                        ((ExpressionContext) _localctx).expression = expression(0);
                    ((ExpressionContext) _localctx)
                        .indexes.add(((ExpressionContext) _localctx).expression);
                    setState(276);
                    match(T__17);
                    setState(283);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                      if (_alt == 1) {
                        {
                          {
                            setState(277);
                            match(T__16);
                            setState(278);
                            ((ExpressionContext) _localctx).expression =
                                ((ExpressionContext) _localctx).expression = expression(0);
                            ((ExpressionContext) _localctx)
                                .indexes.add(((ExpressionContext) _localctx).expression);
                            setState(279);
                            match(T__17);
                          }
                        }
                      }
                      setState(285);
                      _errHandler.sync(this);
                      _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                    }

                    List<Expression> aux = new ArrayList<Expression>();
                    ((ExpressionContext) _localctx).indexes.forEach(e -> aux.add(e.ast));
                    ((ExpressionContext) _localctx).ast =
                        new ArrayAccess(
                            ((ExpressionContext) _localctx).array.ast.getLine(),
                            ((ExpressionContext) _localctx).array.ast.getColumn(),
                            ((ExpressionContext) _localctx).array.ast,
                            aux);
                  }
                  break;
                case 6:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.expr = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(288);
                    if (!(precpred(_ctx, 8)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                    setState(289);
                    match(T__18);
                    setState(290);
                    ((ExpressionContext) _localctx).type = type();
                    ((ExpressionContext) _localctx).ast =
                        new Cast(
                            ((ExpressionContext) _localctx).expr.ast.getLine(),
                            ((ExpressionContext) _localctx).expr.ast.getColumn(),
                            ((ExpressionContext) _localctx).expr.ast,
                            ((ExpressionContext) _localctx).type.ast);
                  }
                  break;
              }
            }
          }
          setState(297);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Function_invocationContext extends ParserRuleContext {
    public Invocation ast;
    public Token f;
    public Function_invocation_paramsContext function_invocation_params;

    public Function_invocation_paramsContext function_invocation_params() {
      return getRuleContext(Function_invocation_paramsContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public Function_invocationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_function_invocation;
    }
  }

  public final Function_invocationContext function_invocation() throws RecognitionException {
    Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_function_invocation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(298);
        ((Function_invocationContext) _localctx).f = match(ID);
        setState(299);
        match(T__3);
        setState(300);
        ((Function_invocationContext) _localctx).function_invocation_params =
            function_invocation_params();
        setState(301);
        match(T__4);
        ((Function_invocationContext) _localctx).ast =
            new Invocation(
                ((Function_invocationContext) _localctx).f.getLine(),
                ((Function_invocationContext) _localctx).f.getCharPositionInLine() + 1,
                new Variable(
                    ((Function_invocationContext) _localctx).f.getLine(),
                    ((Function_invocationContext) _localctx).f.getCharPositionInLine() + 1,
                    (((Function_invocationContext) _localctx).f != null
                        ? ((Function_invocationContext) _localctx).f.getText()
                        : null)),
                ((Function_invocationContext) _localctx).function_invocation_params.list);
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
  public static class Function_invocation_paramsContext extends ParserRuleContext {
    public List<Expression> list = new ArrayList<Expression>();
    public ExpressionContext expr1;
    public ExpressionContext expr2;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public Function_invocation_paramsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_function_invocation_params;
    }
  }

  public final Function_invocation_paramsContext function_invocation_params()
      throws RecognitionException {
    Function_invocation_paramsContext _localctx =
        new Function_invocation_paramsContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_function_invocation_params);
    int _la;
    try {
      setState(316);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__3:
        case T__20:
        case T__24:
        case INT_CONSTANT:
        case CHAR_CONSTANT:
        case REAL_CONSTANT:
        case ID:
          enterOuterAlt(_localctx, 1);
          {
            setState(304);
            ((Function_invocation_paramsContext) _localctx).expr1 = expression(0);
            _localctx.list.add(((Function_invocation_paramsContext) _localctx).expr1.ast);
            setState(312);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
              {
                {
                  setState(306);
                  match(T__0);
                  setState(307);
                  ((Function_invocation_paramsContext) _localctx).expr2 = expression(0);
                  _localctx.list.add(((Function_invocation_paramsContext) _localctx).expr2.ast);
                }
              }
              setState(314);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
          break;
        case T__4:
          enterOuterAlt(_localctx, 2);
          {
          }
          break;
        default:
          throw new NoViableAltException(this);
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
    public Type ast;
    public Primitive_typeContext primitive_type;
    public Token t;
    public Token size;
    public TypeContext at;
    public Struct_field_listContext struct_field_list;

    public Primitive_typeContext primitive_type() {
      return getRuleContext(Primitive_typeContext.class, 0);
    }

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public Struct_field_listContext struct_field_list() {
      return getRuleContext(Struct_field_listContext.class, 0);
    }

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
    enterRule(_localctx, 40, RULE_type);
    try {
      setState(334);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__35:
        case T__36:
        case T__37:
          enterOuterAlt(_localctx, 1);
          {
            setState(318);
            ((TypeContext) _localctx).primitive_type = primitive_type();
            ((TypeContext) _localctx).ast = ((TypeContext) _localctx).primitive_type.ast;
          }
          break;
        case T__16:
          enterOuterAlt(_localctx, 2);
          {
            setState(321);
            ((TypeContext) _localctx).t = match(T__16);
            setState(322);
            ((TypeContext) _localctx).size = match(INT_CONSTANT);
            setState(323);
            match(T__1);
            setState(324);
            ((TypeContext) _localctx).at = type();
            setState(325);
            match(T__17);
            ((TypeContext) _localctx).ast =
                new Array(
                    ((TypeContext) _localctx).t.getLine(),
                    ((TypeContext) _localctx).t.getCharPositionInLine() + 1,
                    LexerHelper.lexemeToInt(
                        (((TypeContext) _localctx).size != null
                            ? ((TypeContext) _localctx).size.getText()
                            : null)),
                    ((TypeContext) _localctx).at.ast);
          }
          break;
        case T__33:
          enterOuterAlt(_localctx, 3);
          {
            setState(328);
            ((TypeContext) _localctx).t = match(T__33);
            setState(329);
            match(T__5);
            setState(330);
            ((TypeContext) _localctx).struct_field_list = struct_field_list();
            setState(331);
            match(T__6);
            ((TypeContext) _localctx).ast =
                new Struct(
                    ((TypeContext) _localctx).t.getLine(),
                    ((TypeContext) _localctx).t.getCharPositionInLine() + 1,
                    ((TypeContext) _localctx).struct_field_list.list);
          }
          break;
        default:
          throw new NoViableAltException(this);
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
  public static class Struct_field_listContext extends ParserRuleContext {
    public List<StructField> list = new ArrayList<StructField>();
    ;
    public Struct_fieldContext struct_field;

    public List<Struct_fieldContext> struct_field() {
      return getRuleContexts(Struct_fieldContext.class);
    }

    public Struct_fieldContext struct_field(int i) {
      return getRuleContext(Struct_fieldContext.class, i);
    }

    public Struct_field_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_struct_field_list;
    }
  }

  public final Struct_field_listContext struct_field_list() throws RecognitionException {
    Struct_field_listContext _localctx = new Struct_field_listContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_struct_field_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(341);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(336);
              ((Struct_field_listContext) _localctx).struct_field = struct_field();
              _localctx.list.addAll(((Struct_field_listContext) _localctx).struct_field.list);
            }
          }
          setState(343);
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
  public static class Struct_fieldContext extends ParserRuleContext {
    public List<StructField> list = new ArrayList<StructField>();
    ;
    public Token ID;
    public List<Token> ids = new ArrayList<Token>();
    public TypeContext t;
    public TypeContext type;

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public Struct_fieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_struct_field;
    }
  }

  public final Struct_fieldContext struct_field() throws RecognitionException {
    Struct_fieldContext _localctx = new Struct_fieldContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_struct_field);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(344);
        ((Struct_fieldContext) _localctx).ID = match(ID);
        ((Struct_fieldContext) _localctx).ids.add(((Struct_fieldContext) _localctx).ID);
        setState(349);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(345);
              match(T__0);
              setState(346);
              ((Struct_fieldContext) _localctx).ID = match(ID);
              ((Struct_fieldContext) _localctx).ids.add(((Struct_fieldContext) _localctx).ID);
            }
          }
          setState(351);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(352);
        match(T__1);
        setState(353);
        ((Struct_fieldContext) _localctx).t = ((Struct_fieldContext) _localctx).type = type();

        for (var id : ((Struct_fieldContext) _localctx).ids) {
          _localctx.list.add(
              new StructField(
                  id.getLine(),
                  id.getCharPositionInLine() + 1,
                  id.getText(),
                  ((Struct_fieldContext) _localctx).type.ast));
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
  public static class Function_typeContext extends ParserRuleContext {
    public Type ast;
    public Primitive_typeContext primitive_type;
    public Token t;

    public Primitive_typeContext primitive_type() {
      return getRuleContext(Primitive_typeContext.class, 0);
    }

    public Function_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_function_type;
    }
  }

  public final Function_typeContext function_type() throws RecognitionException {
    Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_function_type);
    try {
      setState(361);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__35:
        case T__36:
        case T__37:
          enterOuterAlt(_localctx, 1);
          {
            setState(356);
            ((Function_typeContext) _localctx).primitive_type = primitive_type();
            ((Function_typeContext) _localctx).ast =
                ((Function_typeContext) _localctx).primitive_type.ast;
          }
          break;
        case T__34:
          enterOuterAlt(_localctx, 2);
          {
            setState(359);
            ((Function_typeContext) _localctx).t = match(T__34);
            ((Function_typeContext) _localctx).ast =
                new VoidType(
                    ((Function_typeContext) _localctx).t.getLine(),
                    ((Function_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        default:
          throw new NoViableAltException(this);
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
  public static class Primitive_typeContext extends ParserRuleContext {
    public Type ast;
    public Token t;

    public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_primitive_type;
    }
  }

  public final Primitive_typeContext primitive_type() throws RecognitionException {
    Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_primitive_type);
    try {
      setState(369);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__35:
          enterOuterAlt(_localctx, 1);
          {
            setState(363);
            ((Primitive_typeContext) _localctx).t = match(T__35);
            ((Primitive_typeContext) _localctx).ast =
                new IntType(
                    ((Primitive_typeContext) _localctx).t.getLine(),
                    ((Primitive_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        case T__36:
          enterOuterAlt(_localctx, 2);
          {
            setState(365);
            ((Primitive_typeContext) _localctx).t = match(T__36);
            ((Primitive_typeContext) _localctx).ast =
                new DoubleType(
                    ((Primitive_typeContext) _localctx).t.getLine(),
                    ((Primitive_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        case T__37:
          enterOuterAlt(_localctx, 3);
          {
            setState(367);
            ((Primitive_typeContext) _localctx).t = match(T__37);
            ((Primitive_typeContext) _localctx).ast =
                new CharType(
                    ((Primitive_typeContext) _localctx).t.getLine(),
                    ((Primitive_typeContext) _localctx).t.getCharPositionInLine() + 1);
          }
          break;
        default:
          throw new NoViableAltException(this);
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

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 17:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 6);
      case 1:
        return precpred(_ctx, 4);
      case 2:
        return precpred(_ctx, 3);
      case 3:
        return precpred(_ctx, 10);
      case 4:
        return precpred(_ctx, 9);
      case 5:
        return precpred(_ctx, 8);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001-\u0174\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
          + "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"
          + "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"
          + "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"
          + "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0005\u00019\b\u0001\n\u0001\f\u0001<\t\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002"
          + "\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003"
          + "R\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0005\u0006x\b\u0006\n\u0006\f\u0006{\t\u0006\u0001\u0006"
          + "\u0003\u0006~\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"
          + "\u0083\b\u0007\n\u0007\f\u0007\u0086\t\u0007\u0001\u0007\u0001\u0007\u0001"
          + "\u0007\u0005\u0007\u008b\b\u0007\n\u0007\f\u0007\u008e\t\u0007\u0001\b"
          + "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"
          + "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"
          + "\b\u0001\b\u0001\b\u0003\b\u00a5\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00aa"
          + "\b\t\n\t\f\t\u00ad\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"
          + "\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0001\n\u0003\n\u00bf\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"
          + "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"
          + "\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"
          + "\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"
          + "\u0010\u00df\b\u0010\n\u0010\f\u0010\u00e2\t\u0010\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"
          + "\u00fd\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u011a\b\u0011"
          + "\n\u0011\f\u0011\u011d\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"
          + "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0126\b\u0011\n"
          + "\u0011\f\u0011\u0129\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"
          + "\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"
          + "\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0137\b\u0013\n\u0013\f\u0013"
          + "\u013a\t\u0013\u0001\u0013\u0003\u0013\u013d\b\u0013\u0001\u0014\u0001"
          + "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"
          + "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"
          + "\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u014f\b\u0014\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0005\u0015\u0154\b\u0015\n\u0015\f\u0015\u0157\t\u0015"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015c\b\u0016\n\u0016"
          + "\f\u0016\u015f\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"
          + "\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"
          + "\u016a\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"
          + "\u0001\u0018\u0003\u0018\u0172\b\u0018\u0001\u0018\u0000\u0001\"\u0019"
          + "\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"
          + "\u001c\u001e \"$&(*,.0\u0000\u0003\u0001\u0000\u0014\u0018\u0001\u0000"
          + "\u001a\u001b\u0001\u0000\u001c!\u0182\u00002\u0001\u0000\u0000\u0000\u0002"
          + ":\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006K\u0001"
          + "\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000"
          + "\f}\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010"
          + "\u00a4\u0001\u0000\u0000\u0000\u0012\u00ab\u0001\u0000\u0000\u0000\u0014"
          + "\u00be\u0001\u0000\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018"
          + "\u00c7\u0001\u0000\u0000\u0000\u001a\u00cc\u0001\u0000\u0000\u0000\u001c"
          + "\u00d0\u0001\u0000\u0000\u0000\u001e\u00d4\u0001\u0000\u0000\u0000 \u00d8"
          + "\u0001\u0000\u0000\u0000\"\u00fc\u0001\u0000\u0000\u0000$\u012a\u0001"
          + "\u0000\u0000\u0000&\u013c\u0001\u0000\u0000\u0000(\u014e\u0001\u0000\u0000"
          + "\u0000*\u0155\u0001\u0000\u0000\u0000,\u0158\u0001\u0000\u0000\u0000."
          + "\u0169\u0001\u0000\u0000\u00000\u0171\u0001\u0000\u0000\u000023\u0003"
          + "\u0002\u0001\u000034\u0006\u0000\uffff\uffff\u00004\u0001\u0001\u0000"
          + "\u0000\u000056\u0003\u0004\u0002\u000067\u0006\u0001\uffff\uffff\u0000"
          + "79\u0001\u0000\u0000\u000085\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"
          + "\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000"
          + "\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0003\n\u0005\u0000>?\u0006\u0001"
          + "\uffff\uffff\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0003\u0006\u0003"
          + "\u0000AB\u0006\u0002\uffff\uffff\u0000BJ\u0001\u0000\u0000\u0000CD\u0003"
          + "\b\u0004\u0000DE\u0006\u0002\uffff\uffff\u0000EJ\u0001\u0000\u0000\u0000"
          + "FG\u0003\n\u0005\u0000GH\u0006\u0002\uffff\uffff\u0000HJ\u0001\u0000\u0000"
          + "\u0000I@\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000IF\u0001\u0000"
          + "\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KP\u0005*\u0000\u0000LM\u0005"
          + "\u0001\u0000\u0000MO\u0005*\u0000\u0000NL\u0001\u0000\u0000\u0000OR\u0001"
          + "\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"
          + "QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0002\u0000"
          + "\u0000TU\u0003(\u0014\u0000UV\u0006\u0003\uffff\uffff\u0000V\u0007\u0001"
          + "\u0000\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0005*\u0000\u0000YZ\u0005"
          + "\u0004\u0000\u0000Z[\u0003\f\u0006\u0000[\\\u0005\u0005\u0000\u0000\\"
          + "]\u0005\u0002\u0000\u0000]^\u0003.\u0017\u0000^_\u0005\u0006\u0000\u0000"
          + "_`\u0003\u000e\u0007\u0000`a\u0005\u0007\u0000\u0000ab\u0006\u0004\uffff"
          + "\uffff\u0000b\t\u0001\u0000\u0000\u0000cd\u0005\u0003\u0000\u0000de\u0005"
          + "\b\u0000\u0000ef\u0005\u0004\u0000\u0000fg\u0003\f\u0006\u0000gh\u0005"
          + "\u0005\u0000\u0000hi\u0005\u0006\u0000\u0000ij\u0003\u000e\u0007\u0000"
          + "jk\u0005\u0007\u0000\u0000kl\u0006\u0005\uffff\uffff\u0000l\u000b\u0001"
          + "\u0000\u0000\u0000mn\u0005*\u0000\u0000no\u0005\u0002\u0000\u0000op\u0003"
          + "(\u0014\u0000py\u0006\u0006\uffff\uffff\u0000qr\u0005\u0001\u0000\u0000"
          + "rs\u0005*\u0000\u0000st\u0005\u0002\u0000\u0000tu\u0003(\u0014\u0000u"
          + "v\u0006\u0006\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000wq\u0001\u0000"
          + "\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"
          + "\u0000\u0000\u0000z~\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"
          + "|~\u0001\u0000\u0000\u0000}m\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000"
          + "\u0000~\r\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0006\u0003\u0000"
          + "\u0080\u0081\u0006\u0007\uffff\uffff\u0000\u0081\u0083\u0001\u0000\u0000"
          + "\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000"
          + "\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"
          + "\u0000\u0085\u008c\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"
          + "\u0000\u0087\u0088\u0003\u0010\b\u0000\u0088\u0089\u0006\u0007\uffff\uffff"
          + "\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000"
          + "\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"
          + "\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u000f\u0001\u0000\u0000"
          + "\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0014\n\u0000"
          + "\u0090\u0091\u0006\b\uffff\uffff\u0000\u0091\u00a5\u0001\u0000\u0000\u0000"
          + "\u0092\u0093\u0003\u0016\u000b\u0000\u0093\u0094\u0006\b\uffff\uffff\u0000"
          + "\u0094\u00a5\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096"
          + "\u0097\u0006\b\uffff\uffff\u0000\u0097\u00a5\u0001\u0000\u0000\u0000\u0098"
          + "\u0099\u0003$\u0012\u0000\u0099\u009a\u0006\b\uffff\uffff\u0000\u009a"
          + "\u00a5\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u001a\r\u0000\u009c\u009d"
          + "\u0006\b\uffff\uffff\u0000\u009d\u00a5\u0001\u0000\u0000\u0000\u009e\u009f"
          + "\u0003\u001c\u000e\u0000\u009f\u00a0\u0006\b\uffff\uffff\u0000\u00a0\u00a5"
          + "\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3"
          + "\u0006\b\uffff\uffff\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u008f"
          + "\u0001\u0000\u0000\u0000\u00a4\u0092\u0001\u0000\u0000\u0000\u00a4\u0095"
          + "\u0001\u0000\u0000\u0000\u00a4\u0098\u0001\u0000\u0000\u0000\u00a4\u009b"
          + "\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u00a1"
          + "\u0001\u0000\u0000\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00a7"
          + "\u0003\u0010\b\u0000\u00a7\u00a8\u0006\t\uffff\uffff\u0000\u00a8\u00aa"
          + "\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ad"
          + "\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"
          + "\u0001\u0000\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00ab"
          + "\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\t\u0000\u0000\u00af\u00b0\u0003"
          + "\"\u0011\u0000\u00b0\u00b1\u0005\u0006\u0000\u0000\u00b1\u00b2\u0003\u0012"
          + "\t\u0000\u00b2\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b4\u0006\n\uffff"
          + "\uffff\u0000\u00b4\u00bf\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\t\u0000"
          + "\u0000\u00b6\u00b7\u0003\"\u0011\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000"
          + "\u00b8\u00b9\u0003\u0012\t\u0000\u00b9\u00ba\u0005\n\u0000\u0000\u00ba"
          + "\u00bb\u0003\u0012\t\u0000\u00bb\u00bc\u0005\u0007\u0000\u0000\u00bc\u00bd"
          + "\u0006\n\uffff\uffff\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00ae"
          + "\u0001\u0000\u0000\u0000\u00be\u00b5\u0001\u0000\u0000\u0000\u00bf\u0015"
          + "\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u000b\u0000\u0000\u00c1\u00c2"
          + "\u0003\"\u0011\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4\u0003"
          + "\u0012\t\u0000\u00c4\u00c5\u0005\u0007\u0000\u0000\u00c5\u00c6\u0006\u000b"
          + "\uffff\uffff\u0000\u00c6\u0017\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003"
          + "\"\u0011\u0000\u00c8\u00c9\u0005\f\u0000\u0000\u00c9\u00ca\u0003\"\u0011"
          + "\u0000\u00ca\u00cb\u0006\f\uffff\uffff\u0000\u00cb\u0019\u0001\u0000\u0000"
          + "\u0000\u00cc\u00cd\u0005\r\u0000\u0000\u00cd\u00ce\u0003\"\u0011\u0000"
          + "\u00ce\u00cf\u0006\r\uffff\uffff\u0000\u00cf\u001b\u0001\u0000\u0000\u0000"
          + "\u00d0\u00d1\u0005\u000e\u0000\u0000\u00d1\u00d2\u0003 \u0010\u0000\u00d2"
          + "\u00d3\u0006\u000e\uffff\uffff\u0000\u00d3\u001d\u0001\u0000\u0000\u0000"
          + "\u00d4\u00d5\u0005\u000f\u0000\u0000\u00d5\u00d6\u0003 \u0010\u0000\u00d6"
          + "\u00d7\u0006\u000f\uffff\uffff\u0000\u00d7\u001f\u0001\u0000\u0000\u0000"
          + "\u00d8\u00d9\u0003\"\u0011\u0000\u00d9\u00e0\u0006\u0010\uffff\uffff\u0000"
          + "\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc"
          + "\u00dd\u0006\u0010\uffff\uffff\u0000\u00dd\u00df\u0001\u0000\u0000\u0000"
          + "\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"
          + "\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"
          + "\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3"
          + "\u00e4\u0006\u0011\uffff\uffff\u0000\u00e4\u00e5\u0005*\u0000\u0000\u00e5"
          + "\u00fd\u0006\u0011\uffff\uffff\u0000\u00e6\u00e7\u0005\'\u0000\u0000\u00e7"
          + "\u00fd\u0006\u0011\uffff\uffff\u0000\u00e8\u00e9\u0005(\u0000\u0000\u00e9"
          + "\u00fd\u0006\u0011\uffff\uffff\u0000\u00ea\u00eb\u0005)\u0000\u0000\u00eb"
          + "\u00fd\u0006\u0011\uffff\uffff\u0000\u00ec\u00ed\u0003$\u0012\u0000\u00ed"
          + "\u00ee\u0006\u0011\uffff\uffff\u0000\u00ee\u00fd\u0001\u0000\u0000\u0000"
          + "\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0\u00f1\u0003\"\u0011\u0005\u00f1"
          + "\u00f2\u0006\u0011\uffff\uffff\u0000\u00f2\u00fd\u0001\u0000\u0000\u0000"
          + "\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4\u00f5\u0003\"\u0011\u0000\u00f5"
          + "\u00f6\u0005\u0005\u0000\u0000\u00f6\u00f7\u0006\u0011\uffff\uffff\u0000"
          + "\u00f7\u00fd\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0015\u0000\u0000"
          + "\u00f9\u00fa\u0003\"\u0011\u0001\u00fa\u00fb\u0006\u0011\uffff\uffff\u0000"
          + "\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00e3\u0001\u0000\u0000\u0000"
          + "\u00fc\u00e6\u0001\u0000\u0000\u0000\u00fc\u00e8\u0001\u0000\u0000\u0000"
          + "\u00fc\u00ea\u0001\u0000\u0000\u0000\u00fc\u00ec\u0001\u0000\u0000\u0000"
          + "\u00fc\u00ef\u0001\u0000\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000\u0000"
          + "\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fd\u0127\u0001\u0000\u0000\u0000"
          + "\u00fe\u00ff\n\u0006\u0000\u0000\u00ff\u0100\u0007\u0000\u0000\u0000\u0100"
          + "\u0101\u0003\"\u0011\u0007\u0101\u0102\u0006\u0011\uffff\uffff\u0000\u0102"
          + "\u0126\u0001\u0000\u0000\u0000\u0103\u0104\n\u0004\u0000\u0000\u0104\u0105"
          + "\u0007\u0001\u0000\u0000\u0105\u0106\u0003\"\u0011\u0005\u0106\u0107\u0006"
          + "\u0011\uffff\uffff\u0000\u0107\u0126\u0001\u0000\u0000\u0000\u0108\u0109"
          + "\n\u0003\u0000\u0000\u0109\u010a\u0007\u0002\u0000\u0000\u010a\u010b\u0003"
          + "\"\u0011\u0004\u010b\u010c\u0006\u0011\uffff\uffff\u0000\u010c\u0126\u0001"
          + "\u0000\u0000\u0000\u010d\u010e\n\n\u0000\u0000\u010e\u010f\u0005\u0010"
          + "\u0000\u0000\u010f\u0110\u0005*\u0000\u0000\u0110\u0126\u0006\u0011\uffff"
          + "\uffff\u0000\u0111\u0112\n\t\u0000\u0000\u0112\u0113\u0005\u0011\u0000"
          + "\u0000\u0113\u0114\u0003\"\u0011\u0000\u0114\u011b\u0005\u0012\u0000\u0000"
          + "\u0115\u0116\u0005\u0011\u0000\u0000\u0116\u0117\u0003\"\u0011\u0000\u0117"
          + "\u0118\u0005\u0012\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"
          + "\u0115\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b"
          + "\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"
          + "\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e"
          + "\u011f\u0006\u0011\uffff\uffff\u0000\u011f\u0126\u0001\u0000\u0000\u0000"
          + "\u0120\u0121\n\b\u0000\u0000\u0121\u0122\u0005\u0013\u0000\u0000\u0122"
          + "\u0123\u0003(\u0014\u0000\u0123\u0124\u0006\u0011\uffff\uffff\u0000\u0124"
          + "\u0126\u0001\u0000\u0000\u0000\u0125\u00fe\u0001\u0000\u0000\u0000\u0125"
          + "\u0103\u0001\u0000\u0000\u0000\u0125\u0108\u0001\u0000\u0000\u0000\u0125"
          + "\u010d\u0001\u0000\u0000\u0000\u0125\u0111\u0001\u0000\u0000\u0000\u0125"
          + "\u0120\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127"
          + "\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"
          + "#\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b"
          + "\u0005*\u0000\u0000\u012b\u012c\u0005\u0004\u0000\u0000\u012c\u012d\u0003"
          + "&\u0013\u0000\u012d\u012e\u0005\u0005\u0000\u0000\u012e\u012f\u0006\u0012"
          + "\uffff\uffff\u0000\u012f%\u0001\u0000\u0000\u0000\u0130\u0131\u0003\""
          + "\u0011\u0000\u0131\u0138\u0006\u0013\uffff\uffff\u0000\u0132\u0133\u0005"
          + "\u0001\u0000\u0000\u0133\u0134\u0003\"\u0011\u0000\u0134\u0135\u0006\u0013"
          + "\uffff\uffff\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0132\u0001"
          + "\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001"
          + "\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013d\u0001"
          + "\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013d\u0001"
          + "\u0000\u0000\u0000\u013c\u0130\u0001\u0000\u0000\u0000\u013c\u013b\u0001"
          + "\u0000\u0000\u0000\u013d\'\u0001\u0000\u0000\u0000\u013e\u013f\u00030"
          + "\u0018\u0000\u013f\u0140\u0006\u0014\uffff\uffff\u0000\u0140\u014f\u0001"
          + "\u0000\u0000\u0000\u0141\u0142\u0005\u0011\u0000\u0000\u0142\u0143\u0005"
          + "\'\u0000\u0000\u0143\u0144\u0005\u0002\u0000\u0000\u0144\u0145\u0003("
          + "\u0014\u0000\u0145\u0146\u0005\u0012\u0000\u0000\u0146\u0147\u0006\u0014"
          + "\uffff\uffff\u0000\u0147\u014f\u0001\u0000\u0000\u0000\u0148\u0149\u0005"
          + "\"\u0000\u0000\u0149\u014a\u0005\u0006\u0000\u0000\u014a\u014b\u0003*"
          + "\u0015\u0000\u014b\u014c\u0005\u0007\u0000\u0000\u014c\u014d\u0006\u0014"
          + "\uffff\uffff\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u013e\u0001"
          + "\u0000\u0000\u0000\u014e\u0141\u0001\u0000\u0000\u0000\u014e\u0148\u0001"
          + "\u0000\u0000\u0000\u014f)\u0001\u0000\u0000\u0000\u0150\u0151\u0003,\u0016"
          + "\u0000\u0151\u0152\u0006\u0015\uffff\uffff\u0000\u0152\u0154\u0001\u0000"
          + "\u0000\u0000\u0153\u0150\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"
          + "\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"
          + "\u0000\u0000\u0156+\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000"
          + "\u0000\u0158\u015d\u0005*\u0000\u0000\u0159\u015a\u0005\u0001\u0000\u0000"
          + "\u015a\u015c\u0005*\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c"
          + "\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"
          + "\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f"
          + "\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0002\u0000\u0000\u0161"
          + "\u0162\u0003(\u0014\u0000\u0162\u0163\u0006\u0016\uffff\uffff\u0000\u0163"
          + "-\u0001\u0000\u0000\u0000\u0164\u0165\u00030\u0018\u0000\u0165\u0166\u0006"
          + "\u0017\uffff\uffff\u0000\u0166\u016a\u0001\u0000\u0000\u0000\u0167\u0168"
          + "\u0005#\u0000\u0000\u0168\u016a\u0006\u0017\uffff\uffff\u0000\u0169\u0164"
          + "\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a/\u0001"
          + "\u0000\u0000\u0000\u016b\u016c\u0005$\u0000\u0000\u016c\u0172\u0006\u0018"
          + "\uffff\uffff\u0000\u016d\u016e\u0005%\u0000\u0000\u016e\u0172\u0006\u0018"
          + "\uffff\uffff\u0000\u016f\u0170\u0005&\u0000\u0000\u0170\u0172\u0006\u0018"
          + "\uffff\uffff\u0000\u0171\u016b\u0001\u0000\u0000\u0000\u0171\u016d\u0001"
          + "\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u01721\u0001\u0000"
          + "\u0000\u0000\u0016:IPy}\u0084\u008c\u00a4\u00ab\u00be\u00e0\u00fc\u011b"
          + "\u0125\u0127\u0138\u013c\u014e\u0155\u015d\u0169\u0171";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
