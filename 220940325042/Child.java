
// Q4 : Constructor chaining

class GrandParent{
    String grandFatherName;
    String grandMotherName;

    GrandParent(){

    }

    GrandParent(String grandFatherName, String grandMotherName){
        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;

        System.out.println("The Grand Parents Are: ");
        System.out.println("Grand Father's Name is: " + this.grandFatherName);
        System.out.println("Grand Mother's Name is: " + this.grandMotherName);
    }
}

class Parent extends GrandParent{
    String fatherName;
    String motherName;

    Parent(){

    }

    Parent(String grandfathername, String grandmothername){
        super(grandfathername, grandmothername);
    }

    Parent(String fathername, String mothername, String grandfathername, String grandmothername){
        this.fatherName = fathername;
        this.motherName = mothername;

        new Parent(grandfathername, grandmothername);
        
        System.out.println();
        System.out.println("The Parents Are: ");
        System.out.println("Father's Name is: " + this.fatherName);
        System.out.println("Mother's Name is: " + this.motherName);
    }

}

class Child extends Parent{
    Child(String fathername, String mothername, String grandfathername, String grandmothername){
        super(fathername, mothername, grandfathername, grandmothername);
    }

    public static void main(String[] args) {
        Child obj = new Child("Firoz", "Shahin", "Sharrif", "Zulekha");
    }
}

