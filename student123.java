public class student {
    int id;
    String name;
    String email;
    double cgpa;
    String hometown;
   
    void display()
           
    {
       
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Cgpa:"+cgpa);
        System.out.println("Home Town:"+hometown);
       
    }
    public static void main(String[]args){
        student s1=new student();
        s1.id=213;
        s1.name="shovon";
        s1.email="shovon@gmail.com";
        s1.cgpa=2.56;
        s1.hometown="barisal";
       
       
        student s2=new student();
        s2.id=233;
        s2.name="hovon";
        s2.email="hovon@gmail.com";
        s2.cgpa=2.36;
        s2.hometown="khulna";
       
        s1.display();
       
        System.out.println("ID:"+s2.id);
        System.out.println("Name:"+s2.name);
        System.out.println("Email:"+s2.email);
        System.out.println("Cgpa:"+s2.cgpa);
        System.out.println("Home Town:"+s2.hometown);
       
       
       
    }
           
   
}