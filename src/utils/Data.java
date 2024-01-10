package utils;


import models.Subject;
import models.Teacher;

import java.util.ArrayList;
import java.util.List;


public class Data {

    public static List<Teacher> employees() {
        List<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("khaled", Subject.IOS, 62000));
        teachers.add(new Teacher("wiem", Subject.FLUTTER, 98000));
        teachers.add(new Teacher("sana", Subject.JAVA, 80000));
        teachers.add(new Teacher("imed", Subject.J2ME, 91000));
        teachers.add(new Teacher("abdelaziz", Subject.IOS, 100000));
        teachers.add(new Teacher("karray", Subject.TIZEN, 110000));
        teachers.add(new Teacher("abdelmonem", Subject.UNITY, 73000));
        teachers.add(new Teacher("salma", Subject.JAVA, 84000));
        teachers.add(new Teacher("emna", Subject.FLUTTER, 73000));
        teachers.add(new Teacher("skander", Subject.JAVA, 63000));
        teachers.add(new Teacher("fakhreddine", Subject.BLOCKCHAIN, 70000));
        teachers.add(new Teacher("mourad", Subject.UNITY, 79000));
        teachers.add(new Teacher("ghassen", Subject.ANDROID, 110000));
        teachers.add(new Teacher("nouha", Subject.UNITY, 92000));
        teachers.add(new Teacher("chaima", Subject.JAVA, 72000));
        teachers.add(new Teacher("dora", Subject.IOS, 85000));
        teachers.add(new Teacher("hosni", Subject.ANDROID, 71000));
        teachers.add(new Teacher("sana", Subject.PTM, 94000));
        teachers.add(new Teacher("maroua", Subject.PTM, 87000));
        teachers.add(new Teacher("ghassen", Subject.IOS, 76000));
        teachers.add(new Teacher("ghazi", Subject.UNITY, 76000));



        return teachers;
    }
}
