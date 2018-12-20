package com.heima;

/**
 * 正则表达式 一套规则 可以用于匹配
 * boolean matches(String regex)
 *
 * 字符
 * x	字符 x
 * \\	反斜线字符
 * \0n	带有八进制值 0 的字符 n (0 <= n <= 7)
 * \0nn	带有八进制值 0 的字符 nn (0 <= n <= 7)
 * \0mnn	带有八进制值 0 的字符 mnn（0 <= m <= 3、0 <= n <= 7）
 * \xhh	带有十六进制值 0x 的字符 hh
 * \	带有十六进制值 0x 的字符 hhhh
 * \t	制表符 ('\u0009')
 * \n	新行（换行）符 ('\u000A')
 * \r	回车符 ('\u000D')
 * \f	换页符 ('\u000C')
 * \a	报警 (bell) 符 ('\u0007')
 * \e	转义符 ('\u001B')
 * \cx	对应于 x 的控制符
 */

/**
 * 字符类
 * [abc]	a、b 或 c（简单类）
 * [^abc]	任何字符，除了 a、b 或 c（否定）
 * [a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围）
 * [a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集）
 * [a-z&&[def]]	d、e 或 f（交集）
 * [a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去）
 * [a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
 *
 * 预定义字符类
 * .	任何字符（与行结束符可能匹配也可能不匹配）
 * \d	数字：[0-9]
 * \D	非数字： [^0-9]
 * \s	空白字符：[ \t\n\x0B\f\r]
 * \S	非空白字符：[^\s]
 * \w	单词字符：[a-zA-Z_0-9]
 * \W	非单词字符：[^\w]
 *
 *
 * Greedy 数量词
 * X?	X，一次或一次也没有
 * X*	X，零次或多次
 * X+	X，一次或多次
 * X{n}	X，恰好 n 次
 * X{n,}	X，至少 n 次
 * X{n,m}	X，至少 n 次，但是不超过 m 次
 */
public class RegexDemo {
    public static void main(String[] args) {
        String qq = "01100221";
        boolean flag = qq.matches( "[1-9][0-9]{4,14}" );
        System.out.println( flag );
    }
}
