public class StringTest {
    //String str = new String("good");
    String str = "good";
    char[] ch = { 't', 'e', 's', 't' };
    public void change(String str, char ch[]) {
        System.out.println(str);
        str = "test ok";
        ch[0] = 'b';
        System.out.println(str);
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
    }
}
