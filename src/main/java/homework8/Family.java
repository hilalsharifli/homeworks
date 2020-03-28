package homework8;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List <Human> children = new ArrayList<Human>();
    private Set <Pet> pet= new HashSet<>();

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Collection<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    StringBuilder printChildren(){
        StringBuilder childrenPrint = new StringBuilder();
        for (Human el: children) {
            if(el!=null) childrenPrint.append(", children= ")
                    .append(el);
            else childrenPrint.append(", there is no children in this family");
            break;
        }
        return childrenPrint;
    }

    void addChild(Human c){
        children.add(c);
        c.setFamily(this);
    }

    void deleteChild(Human c) {
        children.remove(c);
    }



    int countFamily(Family family) {
        int counter=0;
        if(getFather() != null) counter++;
        if(getMother() != null) counter++;
        counter=counter+children.size();
        return counter;
    }



    @Override
    public String toString()
    {return "Family{Father name=" + getFather() + " Mother name=" + getMother()  + printChildren() +  ", pet=" + pet + "}"; }


}
