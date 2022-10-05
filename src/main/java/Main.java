import java.util.ArrayList;
import java.util.List;


/*
Erstelle eine abstrakte Klasse Contact mit dem Attribut:

Name des Kontakts
und der Methode:
getName()
Erstelle eine Klasse Frienddie von der KlasseContact` erbt.
Zusätzlich soll die Klasse das Attribut:
Telefonnummer
und die Methoden:
einen leeren/default Konstruktor und einen Konstruktor mit dem Namen und der Telefonnummer haben.
die toString() Methode soll den Namen und die Telefonnummer zurückgeben.
Erstelle ein Interface Radio mit den Funktionen:
startRadio()`
stopRadio()`
Erstelle ein Interface GPS mit der Funktion:
getPosition()`
Erstelle eine Klasse Smartphone, die beide Interfaces implementiert und folgende Attributen hat:
Name des Modells
Name des Herstellers
Array mit allen Kontakten
implementiere die Methoden:
startRadio gibt den String "Radio started" aus und gibt true zurück
stopRadio gibt den String "Radio stopped" aus und false zurück
getPosition() gibt den Standort "Köln" zurück.
default Konstruktor und einen Konstruktor mit allen Werten.
Getter/Setter für alle Attribute.
toString die den Namen des Modells und Herstellers und eine Liste mit allen Kontakten zurückgibt.

Bonus I

Novice:

Erstelle eine Klasse BuisnessContact die auch von der Klasse Contact erbt.
Sie soll zusätzlich das Attribut companyName haben.
Erstelle getter/setter und passe die toString() an.
Intermediate

addContact(Contact contact) die einen neuen Kontakt in deine Kontaktliste aufnimmt.
getContact(int index) gibt den Kontakt an Stelle des indexes zurück.

Bonus II

Expert:

getContactByName(String name) gibt den ersten Kontakt mit diesem Namen zurück.
removeContactByName(String name) entfernt den ersten Kontakt mit diesem Namen aus der Kontakt Liste.


 */
public class Main {
    public static void main(String[] args) {
        Contact a = new Friend("peter",011241412312);
        Contact b = new Friend("Lisa",01141412312);
        ArrayList<Contact> contacts = new ArrayList<>(List.of(a,b));
        Smartphone huawai = new Smartphone("mate10","huawai",contacts);
        System.out.println(huawai);
        huawai.removeContactByName("peter");
        System.out.println(huawai);

        }
    }

