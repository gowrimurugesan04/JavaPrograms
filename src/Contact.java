public class Contact {
    private String name;
    private String phno;

    public Contact(String name, String phno) {
        this.name = name;
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phno;
    }

    public static Contact createContact(String name, String phno) {
        return new Contact(name, phno);
    }
}