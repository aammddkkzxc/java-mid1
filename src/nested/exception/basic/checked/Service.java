package nested.exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
