import paquete1.Clase2;

public class TestingModificadores {
    public static void main(String[] args) {
        Padre papa = new Padre();
        Hijo chamaco = new Hijo();
        Hijo chamaca = new Hijo();
        Clase2 objeto2 = new Clase2();
        

        // asignar valores a miembros de la clase Padre
        // asignar valores es un método de acceso a los miembros
        papa.setVariable2(10); // propiedad privada
        papa.variable1 = -25; // propiedad pública


        // leer valores de los miembros de la clase Padre
        // leer valores de otro método de acceso a los miembros
        System.out.println("Valor de variable2: " + papa.getVariable2());
        System.out.println("Valor de variable1: " + papa.variable1); 

        chamaco.setVariable3(16);
        chamaco.setVarsPadre();
        System.out.println("Info del chamaco: " + chamaco.toString());

        chamaca.setVariable3(98);
        chamaca.variable1 = 32;
        chamaca.setVariable2(22);
        System.out.println("Info de la chamaca: " + chamaca.toString());

        System.out.println();
        objeto2.x = 500;
        // Esto no se puede hacer porque y es protected y Testibg esta
        // fuera del paquete1
        // objeto2.y = 100;
        objeto2.setZ(40);
        System.out.println(objeto2.getData());
    }
}
