class waffle {
    //리턴값이 있는 매소드

    //1.매개변수 없는 매소드
    String name(){
        return "와플";
    }

    //2.매개변수 문자열 1개 있는 매소드
    String name(String sauce){
        return sauce + "와플";
    }

    //3.매개변수 문자열 2개 있는 매소드
    String name(String sauce1, String sauce2 ){
        return (sauce1 + sauce2) + "와플" ;
    }

    //4.매개변수 문자열 3개 있는 매소드
    String name(String sauce, String sauce2 ,int count){
        return sauce + sauce2 + "와플" + count + "개";
    }
}
