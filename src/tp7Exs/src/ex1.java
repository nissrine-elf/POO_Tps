public class ex1 {
    public static void main(String[] args)  {
        for (int i = 1; i <= 10; i++) {
          Talkative t=new Talkative(i);
          Thread th=new Thread(t);
          th.start();
        }
    }
}
