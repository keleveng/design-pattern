package 适配器模式;

public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Speaker());
        //InputStreamReader inputStreamReader=new InputStreamReader(in);
        adapter.translate();
        //inputStreamReader.read()
    }
}
