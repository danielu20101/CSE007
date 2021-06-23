public class TVShow {
    String name; 
    private String stream;
    private String genre;
    private double avgLength;
    int episodes=0;
    static int shows = 0;
    //episodes gets incremented in the declaration
    //shows is static because it needs to be accessed by the objects as well. 
    public TVShow(){
        name = "n/a";
        stream = "n/a";
        genre = "n/a";
        avgLength = 0;
        shows++; //increment because this is an instance of a show
    }public int getEpisodes(){
        return episodes;
    }public double getavgLength(){
        return avgLength;
    }public String getgenre(){
        return genre;
    }public String getstream(){
        return stream;
    }public String getname(){
        return name;
    }public void setEpisodes(int episodes){
        this.episodes = episodes;
    }public void setavglength(double avgLength){
        this.avgLength = avgLength;
    }public void setgenre(String genre){
        this.genre = genre;
    }public void setstream(String stream){
        this.stream = stream;
    }public void setname(String name){
        this.name = name;
    }
    public TVShow(String name, String stream, String genre, double avgLength){
        this.name = name;
        this.stream = stream;
        this.genre = genre;
        this.avgLength = avgLength;
        shows++;
    }public void airEpisodes(){
        episodes++;
    }public void airEpisodes(int episodes){
        episodes+=episodes;
    }public double totalAirtime(){
        return this.episodes*this.avgLength;
    }public void display(){
        System.out.println("Name: \t Streaming Service: \t Genre: \t");
        System.out.println(this.name+ " \t "+this.stream+" \t "+ this.genre);

    }
}
