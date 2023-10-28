package exercise2;

public class Main {
    public static void main(String[] args) {
        Docx doc1 = new Docx("j110-lab2-hiers",23212,"docx","docx",2);
        Image doc2 = new Image("spb-map",1703527,"image","png",new PictureResolution( 1024,3072));
        Audio doc3 = new Audio("06-PrettyGirl",7893454,"audio","mp3","Eric Clapton, Pretty Girl",new Duration(5,28));
        Video doc4 = new Video("BackToTheFuture1",1470984192,"video","avi","Back to the future I, 1985",new Duration(1,48,8),new PictureResolution(640,352));

        File[] files = new File[]{doc1,doc2,doc3,doc4};

        File.printAll(files);

        Audio audio1 = new Audio("1.«Mutter»",6892354,"audio","mp3","Rammstien, Mutter",new Duration(4,29));
        Audio audio2 = new Audio("2.«Links 2-3-4»",6833454,"audio","mp3","Rammstien, Links 2-3-4",new Duration(3,36));
        Audio audio3 = new Audio("3.«Sonne»",8893454,"audio","mp3","Rammstien, Sonne",new Duration(4,32));
        Audio audio4 = new Audio("4.«Ich will»",7432554,"audio","mp3","Rammstien, Ich will",new Duration(3,37));
        Audio audio5 = new Audio("5.«Feuer frei!»",5993454,"audio","mp3","Rammstien, Mutter",new Duration(3,8));

        Audio[] mutter = new Audio[]{audio1,audio2,audio3,audio4,audio5};

        File.printAll(mutter);
        System.out.println("Дочерний тип может обращяться к методу родительского типа, так как явлется видом этого типа.");



    }
}
