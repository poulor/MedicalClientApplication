package client;

public class Main {

    public static void main(String[] args) throws Exception{
        Patient p = new Patient("John", "A", "Doe", "Male", "10/31/2003", "800000000", "21 Here St.", "Dobbs Ferry", "NY", 10000, "jadoe@gmail.com", "jdoe", "password", "Patient", 70, 165, "", "", 21);
        Administrator a = new Administrator("first_name", "middle_name", "last_name", "gender", "02/22/1922", "800000000", "street", "city", "state", 10000, "email", "username", "password", "user_type", "10/21/1995");
        Doctor d = new Doctor("first_name", "middle_name", "last_name", "gender", "03/25/1983", "phone_number", "street", "city", "state", 12000, "email", "username", "password", "user_type", "03/11/2005", "specialty", "department");
        Receptionist r = new Receptionist("first_name", "middle_name", "last_name", "gender", "05/23/1994", "phone_number", "street", "city", "state", 13045, "email", "username", "password", "user_type", "08/05/2008");
        // Patient q = new Patient("Jane", "A", "Doe", "Male", "10/31/2003", "800000000", "21 Here St.", 10000, "jdoe", "password", "Patient", 70, 165, "", "", 21);
        
        System.out.println(p);
        System.out.println(a);
        System.out.println(d);
        System.out.println(r);
        
        // System.out.println(q.getFirstName());
        

    }

}
