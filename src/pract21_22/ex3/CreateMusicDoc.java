package pract21_22.ex3;

public class CreateMusicDoc implements InterfaceDocument{

    @Override
    public Document CreateNew() {
        System.out.println("Music created");
        return new MusicDoc();
    }

    @Override
    public Document CrOpen() {
        System.out.println("Music played");
        return new MusicDoc();
    }
}
