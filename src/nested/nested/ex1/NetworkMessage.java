package nested.nested.ex1;

public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void printMessage() {
        System.out.println(content);
    }
}
