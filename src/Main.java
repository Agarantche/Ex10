

public class Main {
    public static void main(String[] args) {
    Contact myContact = new Contact("Adam","adam.gg@gmail.com");
       
    People myPeople = new People();
    myPeople.addContact(myContact);

        for (Contact a: myPeople) {
            System.out.println(a);
        }


    }
}