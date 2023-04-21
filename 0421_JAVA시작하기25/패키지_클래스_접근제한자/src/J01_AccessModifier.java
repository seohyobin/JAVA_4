//public 은 모두 가져온다.
import mission.MissionAgent; //패키지이름.클래스이름



public class J01_AccessModifier {
    public static void main(String[] args) {
        //생성자 생성

     MissionAgent newMissionAgent = new MissionAgent();

     newMissionAgent.setName("서효빈"); // public method 어디서든지 접근가능!!!!
     newMissionAgent.codeNum=1993; //public 접근 제한자 -> 어디서든지 접근가능!!!!
     newMissionAgent.show();
     System.out.println();


     ////////////////생성자 생성

     Agent newAgent = new Agent();

        newAgent.setAge(33);
        newAgent.setName("서효빈");
        System.out.println();

        //agent 에서 이름과 나이를 출력하라
        System.out.println("이름: " + newAgent.getName());
        System.out.println("나이: " + newAgent.getAge());
   
    }
}


   //Default 접근제한자
   class Agent{
    //멤버변수 private
    //public method 접근 지정
    
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age = age*-1; //양수변환
        }
        else{
            this.age = age;
        }
    }
    
    


}
