public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        person.Saludar();
        System.out.println(person.printName());
        String myName = person.printName();
        System.out.println(myName);
    }
}