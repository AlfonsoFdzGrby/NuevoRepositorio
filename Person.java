public class Person {
    /*
    TIPOS DE ATRIBUTOS
    public
    private
    protected
    */
    public String name = "bananarama";
    public int age = 17;
    private String password = "*******";

    public void Saludar(){
        System.out.println("Saludos humano");
    }
    public String printName() {
        return name;
    }

}
