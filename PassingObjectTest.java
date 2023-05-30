
class MusicStudio
{
	void createSong(Lyricist x,Lyricist y, Musician m, Singer s1) {
		System.out.println("Creating song.....by "+x.getName()+","+y.getName()+" song lyrics : "+x.getLyrics());
		System.out.println("Song music by ......."+m.getName()+" music for the song : "+m.getMusic());
		System.out.println("Song sung by : "+s1.getName());
	}
}
public class PassingObjectTest {
	public static void main(String[] args) {

		//usesA - 8 			   producesA - Song
		
		Lyricist lyricist1 = new Lyricist("Gulzar", "Jay Ho");

		MusicStudio studio = new MusicStudio();
		
		
		Lyricist lyricist2 = new Lyricist("Tanvi", "Jay Ho");
		
		Musician musician = new Musician("AR Rehman", "Jay Ho");
		
		Singer singer1 = new Singer("AR Rehman","Jay Ho");
		Singer singer2 = new Singer("Sukhwinder Singh","Jay Ho");
		Singer singer3 = new Singer("Tanvi","Jay Ho");
		Singer singer4 = new Singer("Mahalakshmi Iyer","Jay Ho");
		Singer singer5 = new Singer("Vijay Prakash","Jay Ho");
	
		studio.createSong(lyricist1,lyricist2,musician,singer2);
		
	}
}

class Lyricist
{
	private String name;
	private String lyrics;
	
	public Lyricist(String name, String lyrics) {
		super();
		this.name = name;
		this.lyrics = lyrics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
		return "Lyricist [name=" + name + ", lyrics=" + lyrics + "]";
	}
	
	
}
class Musician
{
	private String name;
	private String music;
	
	public Musician(String name, String music) {
		super();
		this.name = name;
		this.music = music;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	@Override
	public String toString() {
		return "Musician [name=" + name + ", music=" + music + "]";
	}
	
	
}

class Singer
{
	String name;
	String song;
	public Singer(String name, String song) {
		super();
		this.name = name;
		this.song = song;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	@Override
	public String toString() {
		return "Singer [name=" + name + ", song=" + song + "]";
	}
	
	
}