package homework5;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[5];
    private Pet pet;

    public Family() {
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    void addChild (Human name) {
        for (int i = 0; i < children.length; i++) {
            if(children[i]==null) {
                children[i]=name;
                break;
            }
        }
    }
    


    void deleteChild (Human name) {

    }

    @Override
    public String toString()
    {return String.format( "Family{Father name=" + getFather() + " Mother name=" + getMother() + ", children=" + Arrays.toString(getChildren()) +  ", pet=" + pet + "}"); }


}
