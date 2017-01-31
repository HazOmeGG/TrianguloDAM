import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 47974952B on 20/12/2016.
 */
public class MainTriangulo {

    public static void main(String[] args) {

        TrianguloIsosceles stucom1 = new TrianguloIsosceles("One", 4, 8, "azul");
        TrianguloIsosceles stucom2 = new TrianguloIsosceles("Two", 2, 6, "amarillo");
        TrianguloIsosceles stucom3 = new TrianguloIsosceles("Three", 3, 9, "rojo");
        TrianguloIsosceles stucom4 = new TrianguloIsosceles("Four", 5, 42, "rosa");
        TrianguloIsosceles stucom5 = new TrianguloIsosceles("Five", 7, 19, "negro");

        List<TrianguloIsosceles> TrianguloIsoscelesList = new ArrayList<>();
        TrianguloIsoscelesList.add(stucom1);
        TrianguloIsoscelesList.add(stucom2);
        TrianguloIsoscelesList.add(stucom3);
        TrianguloIsoscelesList.add(stucom4);
        TrianguloIsoscelesList.add(stucom5);

        System.out.println("Lista de todos los triangulos Isósceles:");

        for (TrianguloIsosceles v : TrianguloIsoscelesList.subList(0, 5)) {
            System.out.println(v);
        }

        System.out.println("--------------------------------");

        System.out.println("Triángulo Isósceles con el area más grande:");
        TrianguloIsoscelesList.sort(Comparator.comparing(TrianguloIsosceles::CalcularArea)
                .thenComparing(TrianguloIsosceles::getColor)
                .reversed());
        System.out.println(TrianguloIsoscelesList.get(0));
        System.out.println("La area es de: " + TrianguloIsoscelesList.get(0).CalcularArea());

        System.out.println("--------------------------------");

        System.out.println("Lista de Perimetros");
        for (TrianguloIsosceles v : TrianguloIsoscelesList.subList(0, 5)) {

            for (int i = 0; i < 5; i++) {
                System.out.println("El Perimetro de " + v + " es de: " + TrianguloIsoscelesList.get(i).CalcularPerimetro());
            }
        }

        System.out.println("--------------------------------");


    }
}