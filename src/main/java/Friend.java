public class Friend extends Contact {

  private int telNumber;

    public Friend() {
        super();

    }

    public Friend(String name, int telNumber) {
        super(name);
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telNumber=" + telNumber +
                "} " + super.toString();
    }
}

