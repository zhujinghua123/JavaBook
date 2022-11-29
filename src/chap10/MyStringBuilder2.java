package chap10;

/**
 * @Description 10.27
 * @Author 住京华
 * @Date 2022/11/15-10:34
 */
public class MyStringBuilder2 {
    String s = "";

    public MyStringBuilder2() {
    }

    public MyStringBuilder2(char[] chars) {
        for (char aChar : chars) {
            s += aChar;
        }
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] src = new char[this.s.length()];
        for (int i = 0; i < src.length; i++) {
            src[i] = this.s.charAt(i);
        }
        char[] inp = new char[s.s.length()];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = s.s.charAt(i);
        }
        char[] to = new char[src.length + inp.length];
        int index = 0;
        for (; index < offset; index++) {
            to[index] = src[index];
        }
        for (int i = 0; index < inp.length; index++) {
            to[index] = inp[i];
            i++;
        }
        for (int i = offset; index < to.length; index++) {
            to[index] = src[i];
        }
        return new MyStringBuilder2(to);
    }

    public MyStringBuilder2 reverse() {
        String res = new StringBuffer(s).reverse().toString();
        return new MyStringBuilder2(res);
    }

    public MyStringBuilder2 substring(int begin) {
        char[] src = new char[s.length()];
        for (int i = 0; i < src.length; i++) {
            src[i] = this.s.charAt(i);
        }
        char[] feedback = new char[src.length - begin];
        for (int i = 0; begin < src.length; begin++) {
            feedback[i] = src[begin];
            i++;
        }
        return new MyStringBuilder2(feedback);
    }

    public MyStringBuilder2 toUpperCase() {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            res[i] = s.charAt(i);
        }
        for (char aChar : res) {
            aChar = Character.toUpperCase(aChar);
        }
        return new MyStringBuilder2(res);
    }

}
