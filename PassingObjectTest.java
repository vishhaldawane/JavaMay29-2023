
class MusicStudio
{
	Song createSong(Lyricist x,Lyricist y, Musician m, Singer s1, Singer s2, Singer s3, Singer s4, Singer s5) {
		System.out.println("Creating song.....by "+x.getName()+","+y.getName()+" song lyrics : "+x.getLyrics());
		System.out.println("Song music by ......."+m.getName()+" music for the song : "+m.getMusic());
		System.out.println("Song sung by : "+s1.getName()+","+s2.getName()+","+s3.getName()+","+s3.getName()+" and "+s5.getName());
		Song theSong = new Song(x.getLyrics(), s1.getName()+","+s2.getName()+","+s3.getName()+","+s4.getName()+" and "+s5.getName(), "Slumdog Millionaire", 2008);
		return theSong;
	}
	
	Song createSong(Lyricist x, Musician m, Singer s1, Singer s2, Singer s3) {
		System.out.println("Creating song.....by "+x.getName()+"," +"song lyrics : "+x.getLyrics());
		System.out.println("Song music by ......."+m.getName()+" music for the song : "+m.getMusic());
		System.out.println("Song sung by : "+s1.getName()+","+s2.getName()+","+s3.getName()+","+s3.getName());
		Song theSong = new Song(x.getLyrics(), s1.getName()+","+s2.getName()+","+s3.getName(), "Slumdog Millionaire", 2008);
		return theSong;
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
		
		Singer singer6 = new Singer("Sonu Nigam","Aaj Ki Raat");
		Singer singer7 = new Singer("Alisha Chinai","Aaj Ki Raat");
		
		Lyricist lyricist3 = new Lyricist("Javed Akhtar", "Aaj Ki Raat");
		Musician musician2 = new Musician("Shankar-Ehsaan-Loy", "Aaj Ki Raat");
		
		Song song = studio.createSong(lyricist1,lyricist2,musician,singer1,singer2,singer3,singer4,singer5);
		System.out.println("Song : "+song);
		
		System.out.println("--------------------");
		
		
		Song song2 = studio.createSong(lyricist3, musician2, singer4, singer6, singer7);
		System.out.println("Song : "+song2);
				
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


class Song
{
	String title;
	String artist;
	String album;
	int year;
	
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	
	
	
}




