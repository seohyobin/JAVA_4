package mission;

import java.lang.StackWalker.Option;

public class MissionAgent {
    String name; //default 멤버변수
    public int codeNum; //public 멤버변수 : 중요한 비밀번호가 저장된다.

    public String getName(){ //getter 함수
        return name;
    }

    public void setName(String name){ //setter 함수
        this.name=name;
    }

    //진짜 코드는 은닉화 관리한다.
    private int getCodeNum(){ //getter 함수
        return codeNum  ;
        
    }

    public void show(){
        System.out.println("이름 : " + getName());
        //private 멤버를 같은 클래스에서 접근하여 사용한다.
        System.out.println("코드번호 : " + getCodeNum());
    }
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

    
    
}



