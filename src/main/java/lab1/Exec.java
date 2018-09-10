package lab1;

import java.util.Date;

public class Exec {

    public static void main(String[] args) {
        String name = "Артём";
        String surName = "Попов";
        String lastName = "Романович";
        String teacherName = "Елена";
        String teacherSurName = "Владимирова";
        String teacherLastName = "Сергеевна";
        String groupCode = "ИВТ/б-11о";
        int Variant = 16;
        int prod = 5, pack = 5, whole;
        whole = prod + pack;

        System.out.println("Программу выполнил: \n" + fullName(name,surName,lastName));
        System.out.println("Дата, " + new Date());
        System.out.println("Шифр группы, " + groupCode);
        System.out.println("Вариант: " + Variant);
        System.out.println("Вес товара:" + prod);
        System.out.println("Вес тары:" + pack);
        System.out.println("Общий вес:" + whole);
        System.out.println("Проверил: \n" + fullName(teacherName,teacherSurName,teacherLastName));
    }

    public static String  fullName(String a,String b,String c) {
        return a + " " + b + " " +  c;
    }
}
