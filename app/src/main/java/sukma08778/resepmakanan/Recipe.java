package sukma08778.resepmakanan;

/**
 * Created by Sukma
 */

public class Recipe {
    private String Tittle, Detail, Make;
    private int Picture;

    public Recipe(String tittle, int picture, String detail, String make) {
        Tittle = tittle;
        Detail = detail;
        Make = make;
        Picture = picture;
    }

    public String getTittle() {
        return Tittle;
    }

    public String getDetail() {
        return Detail;
    }

    public String getMake() {
        return Make;
    }

    public int getPicture() {
        return Picture;
    }
}
