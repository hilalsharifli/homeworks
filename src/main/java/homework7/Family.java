package homework7;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[5];
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children) {
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

    void addChild(Human child){
        for (int i = 0; i < children.length; i++) {
            if(children[i]==null) {
                children[i]=child;
                break;
            }
        }
        child.setFamily(this);
    }

    Boolean deleteChild(int index) {
        if (children[index] == null) return false;
        else {
            Human[] childrenNew=new Human[children.length];
            for (int i = 0; i <children.length ; i++) {
                if(children[index] != children[i]) {
                    childrenNew[i]=children[i];
                    children=childrenNew.clone();
                }
            }
            return true;
        }
    }

    int countFamily(Family family) {
        int counter=0;
        if(getFather() != null) counter++;
        if(getMother() != null) counter++;
        for (Human el: children) {
            if(el!=null) counter++;
        }
        return counter;
    }



    @Override
    public String toString()
    {return String.format( "Family{Father name=" + getFather() + " Mother name=" + getMother()  + printChildren() +  ", pet=" + pet + "}"); }


}
