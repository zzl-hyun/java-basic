package access;

public class SpeackerMain {
    public static void main(String[] args) {
        Speacker speacker = new Speacker(90);
        speacker.showVolume();

        speacker.volumeUp();
        speacker.showVolume();

        speacker.volumeUp();
        speacker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speacker.volume = 200;
        speacker.showVolume();
    }
}

/*
접근 제어자 access modifier 종류
- private: 모든 외부 호출 비허용
- default: 같은 패키지안에서 호출 허용 -> package-private
- protected: 같은 패키지안에서 호출 허용, 패키지 달라도 상속관계면 호출
- public: 모든 외부 호출 허용

클래스 레벨의 접근 제어자는 public, default만 사용
public 클래스는 파일명과 같아야 함


 */