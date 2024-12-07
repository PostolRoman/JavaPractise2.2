class PictureBuilder {
    protected Picture picture;

    public PictureBuilder() {
        picture = new Picture("Albert", (short) 100, "Albert", "ocean", "school", null , null, false, null);
    }

    public void setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.author = author;
    }

    public void setSizeParams(Size size) {
        picture.size = size;
    }

    public void setColorParams(String[] colors, boolean isWithFrames) {
        picture.colors = colors;
        picture.isWithFrames = isWithFrames;
    }

    public void setCategoryParams(String theme, String category) {
        picture.theme = theme;
        picture.category = category;
    }

    public Picture build() {
        return picture;
    }
}