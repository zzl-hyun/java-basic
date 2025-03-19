package pack;

//import pack.a.User;
import pack.a.User;
import pack.b.*;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
//      pack.a.User user = new pack.a.User(); // fullName
        User userA = new User(); // import
        pack.b.User userB = new pack.b.User(); // import
    }
}

/*
패키지 규칙
- 패키지 이름은 모두 소문자 (관례)
패키지 이름 앞 부분은 일반적으로 회사의 도메인이름을 거꾸로 사용?
com.company.myapp ?? 관례라는디요;;

보기에 계층적 구조를 이루더라도 패키지 끼린 서로 완전히 연관이 없음 ㅇㅎ 무조건 import

패키지 활용(사례)
com.helloshop
    user
        User
        UserService
    product
        Proudct
        ProductService
    order
        Order
        OrderService
        OrderHistory
 */