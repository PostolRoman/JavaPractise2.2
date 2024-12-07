class UsaPictureBuilder extends PictureBuilder {
    public UsaPictureBuilder() {
        super();
    }

    @Override
    public void setBasicParams(String name, short year, String author) {
        super.setBasicParams(name, year, author);
    }

    @Override
    public Picture build() {
        picture.canvas = "USA Canvas";
        return picture;
    }
}