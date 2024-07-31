package nested.exception.ex3;

public class NetworkClientV3 {
    public final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3(address, address + "연결 실패");
        }

        System.out.println("연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(address, address + "전송 실패");
        }

        System.out.println("전송 성공");
    }

    public void disconnect() {
        System.out.println("서버 연결 실패");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        } if (data.contains("error2")) {
            sendError = true;
        }
    }
}
