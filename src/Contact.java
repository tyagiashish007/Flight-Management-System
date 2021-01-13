public class Contact {
    String name;
    String phone;
    String email;

    //Parameterized constructor for object creation
    Contact(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;

    }

    String getContactDetails(){
        return name + ", " + phone + ", " + email;
    }

}
