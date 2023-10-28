package exercise2;

public class Image extends File{
    private String fileFormat;
    private PictureResolution pictureResolution;

    public Image(String name, int size, String formatName, String fileFormat, PictureResolution pictureResolution) {
        super(name, size,formatName);

        setFileFormat(fileFormat);
        setPictureResolution(pictureResolution);
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        if (fileFormat!=null && !fileFormat.isEmpty() && fileFormat.length()<=4){
            this.fileFormat = fileFormat;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void setPictureResolution(PictureResolution pictureResolution) {
        this.pictureResolution = pictureResolution;
    }

    @Override
    public void print() {
        System.out.print(getName()+"."+getFileFormat());
        System.out.print(space(getName(),getFileFormat())+"|");
        System.out.println(space2(getSize())+getSize()+"|"+getFormatName()+", "+ pictureResolution.getHeight()+"x"+pictureResolution.getWidth());
    }
}
