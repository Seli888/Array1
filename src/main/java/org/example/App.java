package org.example;
import lombok.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Data
public class App {

    public static void main( String[] args ) {
        ArrayList<Person> persona = new ArrayList<>();
        persona.add(new Person("Kolya", 15));
        persona.add(new Person("Vanya", 17));
        persona.add(new Person("Dima", 12));
        persona.add(new Person("Andrey", 10));

        Collections.sort(persona);
        System.out.println(persona);
    }
}
