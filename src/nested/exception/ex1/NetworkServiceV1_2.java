package nested.exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();

        if (isError(connectResult)) {
            System.out.println(connectResult);
            return;
        }

        String sendResult = client.send(data);

        if (isError(connectResult)) {
            System.out.println(sendResult);
            return;
        }

        client.disconnect();
    }

    private boolean isError(String result) {
        return !result.contains("success");
    }
}
