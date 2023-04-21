package member;

public class Gaib{
    public static void main(String[] args) {

        SignUp newSignuUp = new SignUp();
        newSignuUp.setId("luck1409");
        newSignuUp.setPw("dkssudgktpdy");
        newSignuUp.setName("서효빈");
        newSignuUp.setEmail("seohyobin@gmail.com");
        newSignuUp.setPh("010-7561-2132");
        newSignuUp.setGender("여자");
        newSignuUp.setBirth("1993-05-30");

        System.out.println();
        System.out.println("아이디 : " + newSignuUp.getId());
        System.out.println("비밀번호 : " + newSignuUp.getPw());
        System.out.println("이름 : " + newSignuUp.getName());
        System.out.println("이메일 : " + newSignuUp.getEmail());
        System.out.println("전화번호 : " + newSignuUp.getPh());
        System.out.println("성별 : " + newSignuUp.getGender());
        System.out.println("생년월일 : " + newSignuUp.getBirth());
        System.out.println();

        
    }
}


   class SignUp {
    
     private String id;
     private String pw;
     private String name;
     private String email;
     private String ph;
     private String gender;
     private String birth;

     public String getId() {
         return this.id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getPw() {
         return this.pw;
     }

     public void setPw(String pw) {
         this.pw = pw;
     }

     public String getName() {
         return this.name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEmail() {
         return this.email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getPh() {
         return this.ph;
     }

     public void setPh(String ph) {
         this.ph = ph;
     }

     public String getGender() {
         return this.gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
     }

     public String getBirth() {
         return this.birth;
     }

     public void setBirth(String birth) {
         this.birth = birth;
     }

}
