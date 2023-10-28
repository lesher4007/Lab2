package exercise2;

public class Video extends File {
    private String fileFormat;
    private String description;
    private Duration duration;
    private PictureResolution pictureResolution;

    public Video(String name, int size, String formatName, String fileFormat,String description, Duration duration, PictureResolution pictureResolution) {
        super(name, size,formatName);
        setFileFormat(fileFormat);
        setDescription(description);
        setDuration(duration);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setPictureResolution(PictureResolution pictureResolution) {
        this.pictureResolution = pictureResolution;
    }

    @Override
    public void print() {
        System.out.print(getName()+"."+getFileFormat());
        System.out.print(spaceName(getName(),getFileFormat())+"|");
        System.out.println(spaceSize(getSize())+getSize()+"|"+getFormatName()+", "+getDescription()+", "+duration.getHours()+":"+duration.getMinutes()+":"+ duration.getSeconds()+", "+pictureResolution.getHeight()+"x"+pictureResolution.getWidth());
    }
}
