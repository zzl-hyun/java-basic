package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //poly.childMethod();
        /**
         * 참조값을 사용해 인스턴스 찾는다
         * 인스턴스 안에서 사용할 타입을 찾는다(본인 타입)
         * Parent는 최상위 부모라 내려갈 수 없음
         * 고로 .childMethod()를 못찾아서 컴파일 에러
         */

        //다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();
        /**
         * 인스턴스를 호출하는 타입을 자식인 Child로 변경해서 호출하는거임 -> 다운캐스팅
         * Chlid chlid = new Parent 불가
         * 고로 다운캐스팅 사용해서 타입 변경??
         */

    }
}



