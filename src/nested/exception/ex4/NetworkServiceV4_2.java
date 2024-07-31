package nested.exception.ex4;

public class NetworkServiceV4_2 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        try (NetworkClientV4_2 client = new NetworkClientV4_2(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        }
    }
}
