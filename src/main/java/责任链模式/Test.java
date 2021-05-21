package 责任链模式;

public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        Level1Handler level1Handler = new Level1Handler(5);
        Level2Handler level2Handler = new Level2Handler(9);
        Level3Handler level3Handler = new Level3Handler(13);
        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);
        level1Handler.LoadMessage(11, "级别为11的请求");
        level1Handler.LoadMessage(15, "级别为15的请求");
    }
}
