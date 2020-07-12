package org.example;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.TokenFactory;

public enum CPPTokens {

    T__0(1, "!"),
    T__1(2, "not"),
    T__2(3, "&&"),
    T__3(4, "and"),
    T__4(5, "||"),
    T__5(6, "or"),
    MultiLineMacro(7),
    Directive(8),
    Alignas(9, "alignas"),
    Alignof(10, "alignof"),
    Asm(11, "asm"),
    Auto(12, "auto"),
    Bool(13, "bool"),
    Break(14, "break"),
    Case(15, "case"),
    Catch(16, "catch"),
    Char(17, "char"),
    Char16(18, "char16_t"),
    Char32(19, "char32_t"),
    Class(20, "class"),
    Const(21, "const"),
    Constexpr(22, "constexpr"),
    Const_cast(23, "const_cast"),
    Continue(24, "continue"),
    Decltype(25, "decltype"),
    Default(26, "default"),
    Delete(27, "delete"),
    Do(28, "do"),
    Double(29, "double"),
    Dynamic_cast(30, "dynamic_cast"),
    Else(31, "else"),
    Enum(32, "enum"),
    Explicit(33, "explicit"),
    Export(34, "export"),
    Extern(35, "extern"),
    False(36, "false"),
    Final(37, "final"),
    Float(38, "float"),
    For(39, "for"),
    Friend(40, "friend"),
    Goto(41, "goto"),
    If(42, "if"),
    Inline(43, "inline"),
    Int(44, "int"),
    Long(45, "long"),
    Mutable(46, "mutable"),
    Namespace(47, "namespace"),
    New(48, "new"),
    Noexcept(49, "noexcept"),
    Nullptr(50, "nullptr"),
    Operator(51, "operator"),
    Override(52, "override"),
    Private(53, "private"),
    Protected(54, "protected"),
    Public(55, "public"),
    Register(56, "register"),
    Reinterpret_cast(57, "reinterpret_cast"),
    Return(58, "return"),
    Short(59, "short"),
    Signed(60, "signed"),
    Sizeof(61, "sizeof"),
    Static(62, "static"),
    Static_assert(63, "static_assert"),
    Static_cast(64, "static_cast"),
    Struct(65, "struct"),
    Switch(66, "switch"),
    Template(67, "template"),
    This(68, "this"),
    Thread_local(69, "thread_local"),
    Throw(70, "throw"),
    True(71, "true"),
    Try(72, "try"),
    Typedef(73, "typedef"),
    Typeid_(74, "typeid"),
    Typename_(75, "typename"),
    Union(76, "union"),
    Unsigned(77, "unsigned"),
    Using(78, "using"),
    Virtual(79, "virtual"),
    Void(80, "void"),
    Volatile(81, "volatile"),
    Wchar(82, "wchar_t"),
    While(83, "while"),
    LeftParen(84, "("),
    RightParen(85, ")"),
    LeftBracket(86, "["),
    RightBracket(87, "]"),
    LeftBrace(88, "{"),
    RightBrace(89, "}"),
    Plus(90, "+"),
    Minus(91, "-"),
    Star(92, "*"),
    Div(93, "/"),
    Mod(94, "%"),
    Caret(95, "^"),
    And(96, "&"),
    Or(97, "|"),
    Tilde(98, "~"),
    Not(99),
    Assign(100),
    Less(101, "<"),
    Greater(102, ">"),
    PlusAssign(103),
    MinusAssign(104),
    StarAssign(105),
    DivAssign(106),
    ModAssign(107),
    XorAssign(108),
    AndAssign(109),
    OrAssign(110),
    LeftShift(111, "<<"),
    RightShift(112, ">>"),
    LeftShiftAssign(113),
    RightShiftAssign(114),
    Equal(115),
    NotEqual(116),
    LessEqual(117),
    GreaterEqual(118),
    AndAnd(119),
    OrOr(120),
    PlusPlus(121, "++"),
    MinusMinus(122, "--"),
    Comma(123, ","),
    ArrowStar(124, "->*"),
    Arrow(125, "->"),
    Question(126, "?"),
    Colon(127, ":"),
    Doublecolon(128, "::"),
    Semi(129, ";"),
    Dot(130, "."),
    DotStar(131, ".*"),
    Ellipsis(132, "..."),
    Identifier(133),
    Integerliteral(134),
    Decimalliteral(135),
    Octalliteral(136),
    Hexadecimalliteral(137),
    Binaryliteral(138),
    Integersuffix(139),
    Characterliteral(140),
    Floatingliteral(141),
    Stringliteral(142),
    Userdefinedintegerliteral(143),
    Userdefinedfloatingliteral(144),
    Userdefinedstringliteral(145),
    Userdefinedcharacterliteral(146),
    Whitespace(147),
    Newline(148),
    BlockComment(149),
    LineComment(150);

    // TODO additional token with values

    private int i;
    private String val;

    CPPTokens(int i) {
        this.i = i;
    }

    CPPTokens(int i, String val) {
        this.i = i;
        this.val = val;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public static CommonToken create(CPPTokens t) {
        TokenFactory<CommonToken> ctf = CommonTokenFactory.DEFAULT;
        return ctf.create(t.ordinal(), t.getVal());
    }

    public static int line = 0;

    public CommonToken create() {
        TokenFactory<CommonToken> ctf = CommonTokenFactory.DEFAULT;
        CommonToken ct = ctf.create(ordinal(), getVal());
        ct.setLine(line++);
        return ct;
    }

}