package hello.spring.basic;

public class Spring5App00 {
    //첫번째 사례: 간단한 인삿말을 출력하는 프로그램 작성
    public static void main(String[] args){
        //sayHello 메서드를 호출하기 위해서
        //Spring5App00의 객체화 필요!
        Spring5App00 app00=new Spring5App00();
        app00.sayHello("Spring");
    }
    private void sayHello(String msg){
        //매개변수를 활용하여 인삿말 변경 가능
        System.out.println("Hello, "+msg+"!!");
        //System.out.println("Hello, World!!");
    }
}
