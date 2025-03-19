package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "인생은 무한 루프";
        MovieReview aboutTIme = new MovieReview();
        aboutTIme.title = "aboutTIme";
        aboutTIme.review = "인생 시간 영화!";

        MovieReview[] reviews = {inception, aboutTIme};
        for (MovieReview r : reviews){System.out.println(r.title + r.review);}

    }
}
