public class name {
    public static void main(String[] args) {
       


            name_[] n = new name_[7];
            n[0]=new name_("효빈");
            n[1]=new name_("미연", 23);
            n[2]=new name_("슬기", 24, "103");
            n[3]=new name_("혜선", 25, "104");
            n[4]=new name_("다미", "109");
            n[5]=new name_("예지", 27, "106");
            n[6]=new name_("경현", 28, "107");

            for(int i =0; i<n.length; i++){
                n[i].show();
            }            
    }
}


 class name_ {
    String name;
    int age;
    String number;

    public name_(String n){
        this.name = n;
        this.age = 0;
        this.number="모름";

    }
    public name_(String n , int a){
        this.name = n;
        this.age = a;
        this.number="모름";

    }
    public name_(String n , String ph){
        this.name = n;
        this.age = 0;
        this.number=ph;

    }

    public name_ (String n , int a , String ph){
        this.name= n;
        this.age=a;
        this.number=ph;
    }

    void show(){
        System.out.println("이름 : " + name + "  나이 : " + age + "  전화번호 : " + number);
    }




}
