package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.OptionalDouble;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        System.out.println("TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s");
        long nbr = teachers.stream()
                        .filter(teacher -> teacher.getName().startsWith("s"))
                                .count();

        System.out.println("TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter");
        long sum = teachers.stream()
                        .filter(teacher -> teacher.getSubject().equals(Subject.FLUTTER))
                                .mapToInt(Teacher::getSalary)
                                        .sum();


        System.out.println("TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom commence avec a");
        Double average = teachers.stream()
                        .filter(teacher -> teacher.getName().startsWith("a"))
                                .mapToDouble(Teacher::getSalary)
                                        .average()
                                                .getAsDouble();
        System.out.println("TO DO 4: Retourner la liste des enseignants dont le nom commence par f");
        List<Teacher> teachers1 = teachers.stream()
                                .filter(teacher -> teacher.getName().startsWith("f"))
                                .toList();

        System.out.println("TO DO 5: Retourner true si il y a au min un enseignants dont le salaire > 100000, false si non");
        boolean test = teachers.stream().anyMatch(teacher-> teacher.getSalary()>100000);

        System.out.println("TO DO 6: Afficher le premier enseignant Unity le nom commence avec g avec 2 manières différentes");
        System.out.println("First way:");
        teachers.stream()
                        .filter(teacher -> teacher.getName().startsWith("g"))
                                .filter(teacher -> teacher.getSubject().equals(Subject.UNITY))
                                        .findFirst()
                                                .ifPresent(System.out::println);

        System.out.println("Second way:");
        teachers.stream().filter(teacher -> teacher.getName().startsWith("g"))
                         .filter(teacher -> teacher.getSubject().equals(Subject.UNITY))
                                 .limit(1)
                                         .forEach(System.out::println);

        System.out.println("TO DO 7: Afficher le deuxième enseignant dont le nom commence avec s");
        teachers.stream()
                .filter(teacher -> teacher.getName().startsWith("s"))
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
