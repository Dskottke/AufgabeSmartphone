import java.util.ArrayList;
import java.util.Arrays;

public class Smartphone implements GPS, Radio {

    private String modelName;
    private String brandName;

    private ArrayList<Contact> allContacts;


    public Smartphone() {

    }

    public Smartphone(String modelName, String brandName, ArrayList allContacts) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.allContacts = allContacts;
    }

    public Contact getContactByName(String name) {
        for (Contact c : allContacts) {
            if (c.getName() == name) {
                return c;
            }

        }
        throw new RuntimeException("kein Kontakt gefunden");


    }

    public void removeContactByName(String name) {
        for (Contact c : allContacts) {
            if (c.getName() == name) {
                allContacts.remove(c);

            }
        }
    }
        public void addContact (Contact contact){
            allContacts.add(contact);
        }

        public Contact getContact ( int index){
            return allContacts.get(index);
        }

        @Override
        public String getPosition () {
            return "Köln";
        }

        @Override
        public boolean radioOn () {
            System.out.println("radio startet");
            return true;

        }

        @Override
        public boolean radioOut () {
            System.out.println("radio ist aus");
            return true;

        }

        public String getModelName () {
            return modelName;
        }

        public void setModelName (String modelName){
            this.modelName = modelName;
        }

        public String getBrandName () {
            return brandName;
        }

        public void setBrandName (String brandName){
            this.brandName = brandName;
        }

        public ArrayList<Contact> getAllContacts () {
            return allContacts;
        }

        public void setAllContacts (ArrayList < Contact > allContacts) {
            this.allContacts = allContacts;
        }

        @Override
        public String toString () {
            return "Smartphone{" +
                    "modelName='" + modelName + '\'' +
                    ", brandName='" + brandName + '\'' +
                    ", allContacts=" + allContacts +
                    '}';
        }
    }
