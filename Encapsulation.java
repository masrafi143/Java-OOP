class Encapsulation {
    public String name;
    private int id;

    public Encapsulation(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void setId(int id){
        if(id>0){
            this.id = id;
        } else {
            System.out.println("Invalid id given.");
        }
    }
    public int getId(){
        return id;
    }

    static void main(String[] args) {
        Encapsulation s1 = new Encapsulation("Masrafi", 369);
        s1.setId(-55);
        System.out.println(s1.getId());;
    }
}
