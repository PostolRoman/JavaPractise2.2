public class Main {
    public static void main(String[] args) {

        UkrainePictureBuilder builder = new UkrainePictureBuilder();
        builder.setBasicParams("Ukrainian Art", (short) 2023, "Artist Name");
        Size size = new Size();
        size.setHeight((short) 100);
        size.setWidth((short) 50);
        builder.setSizeParams(size);
        builder.setColorParams(new String[]{"Yellow", "Blue"}, true);
        builder.setCategoryParams("History", "Culture");

        Picture ukrainePicture = builder.build();
        System.out.println("Picture created: " + ukrainePicture.getName() + ", Canvas: " + ukrainePicture.canvas);
    }
}