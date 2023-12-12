package org.example.seminar.Apteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//Лекарство
public class Pharmacy implements Iterable<PharmancyComponent>, Comparable<Pharmacy> {

    private List<PharmancyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmancyComponent component){
        components.add(component);
        return this;
    }

    public List<PharmancyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmancyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public PharmancyComponent next() {
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                '}' + "\n";
    }

    // вынесенный класс Iterable
//    @Override
//    public Iterator<PharmancyComponent> iterator() {
//        return new IteratorComponent(this);
//    }

    //анонимный класс Iterable
    @Override
    public Iterator<PharmancyComponent> iterator() {
        return new Iterator<PharmancyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmancyComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int hashCode() {
        int hcd=0;
        for (PharmancyComponent p: this.components) {
            hcd = 31*hcd + p.hashCode();
        }
        return hcd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Pharmacy){
            Pharmacy pharmacy = (Pharmacy) obj;

            if (pharmacy.components.containsAll (this.components)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (this.hashCode() > o.hashCode()){
            return -1;
        } else if (this.hashCode() < o.hashCode()){
            return 1;
        }
        return 0;
    }


}
