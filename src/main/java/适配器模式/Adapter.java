package 适配器模式;

public class Adapter implements Translate{
    Speaker speaker;

    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }


    @Override
    public String translate() {
        String string = speaker.speak();
        System.out.println("把"+string+"转换为手语");
        return "把"+string+"转换为手语";
    }
}
