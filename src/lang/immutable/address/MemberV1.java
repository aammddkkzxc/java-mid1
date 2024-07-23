package lang.immutable.address;

public class MemberV1 {
    private String name;
    private ImmutableAddress immutableAddress;

    public MemberV1(String name, ImmutableAddress immutableAddress) {
        this.name = name;
        this.immutableAddress = immutableAddress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", immutableAddress=" + immutableAddress +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImmutableAddress getImmutableAddress() {
        return immutableAddress;
    }

    public void setImmutableAddress(ImmutableAddress immutableAddress) {
        this.immutableAddress = immutableAddress;
    }
}
