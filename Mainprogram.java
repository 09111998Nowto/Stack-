package OnCTDL;

public class Mainprogram {
    public static void main(String[] args) {
        LinkedStack s =new LinkedStack<>();
        s.push(10);
        s.push(12);
        s.push(15);
        System.out.println("stack: "+s);
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
