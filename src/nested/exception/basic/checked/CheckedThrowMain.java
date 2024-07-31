package nested.exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("여기 까지 안옴");
    }
}
