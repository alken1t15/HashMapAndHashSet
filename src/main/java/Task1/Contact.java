package Task1;


import java.util.Objects;

public class Contact {
    private String number;

    private String name;

    public Contact(String name, String number){
        this.name =name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj == null || getClass() !=  obj.getClass()) return false;

        Contact contact = (Contact) obj;

        if(getNumber() != contact.getNumber()) return false;
        return Objects.equals(name, contact.name);
    }

    public int hashCode(){
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getNumber().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number=" + getNumber() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
