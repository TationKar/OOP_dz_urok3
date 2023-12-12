package org.example.seminar.Apteca;
//Создайте несколько экземпляров Pharmacy, причем, чтобы среди них было хотя бы два экземпляра
//с полностью идентичными значениями полей.
//
//Сделать так, чтобы после выполнения кода ниже, в сете result были только уникальные объекты.
//Set<Pharmacy> result = new HashSet<>(множество из нескольких лекарств);
//System.out.println(result.size()); // тут вывод должен быть равен количеству УНИКАЛЬНЫХ экземпляров Pharmacy!
//
//Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo()
//подсказка: можно добавить, а можно не добавлять в класс поля;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        PharmancyComponent azitroment = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent azitroment1 = new Azitronit("Azitronit", "10 Мг", 50);
        PharmancyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmancyComponent water = new Water("Water", "10 Мг", 20);
        PharmancyComponent water2 = new Water("Water", "100 Мг", 50);

        List<PharmancyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);

        System.out.println(pharmancyComponents);

        Collections.sort(pharmancyComponents);
        System.out.println(pharmancyComponents);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(water);

        for (PharmancyComponent comp: pharmacy1) {
            System.out.println(comp.getName());
        }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);


        Set<PharmancyComponent> set = new HashSet<>();
        set.add(azitroment);
        set.add(azitroment1);
        set.add(azitroment);

        System.out.println("/////////////////////////");
        System.out.println(set);

        //Collections.sort(pharmacies, new );


        //Iterator<PharmancyComponent> iterator = pharmacy1;

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        while (((Iterator<PharmancyComponent>) pharmacy1).hasNext()) {
//            System.out.println(((Iterator<PharmancyComponent>) pharmacy1).next());
//        }

        // ДОМАШНЕЕ ЗАДАНИЕ Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
        Pharmacy pharmacy3 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy4 = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy5 = new Pharmacy().addComponent(azitroment1).addComponent(water);
        Pharmacy pharmacy6 = new Pharmacy().addComponent(pinicilin).addComponent(water2);
        Pharmacy pharmacy7 = new Pharmacy().addComponent(azitroment1).addComponent(water2);
        Pharmacy pharmacy8 = new Pharmacy().addComponent(pinicilin).addComponent(water);

        Set<Pharmacy> result = new HashSet<>();

        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);
        result.add(pharmacy6);
        result.add(pharmacy7);
        result.add(pharmacy8);
        System.out.println("\nДОМАШНЕЕ ЗАДАНИЕ Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования\n");
        System.out.println(result);
        System.out.println(result.size());

    }
}
