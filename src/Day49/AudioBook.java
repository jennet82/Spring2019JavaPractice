package Day49;

public class AudioBook extends Book{
	public int audioLength;
	public void play() {
		System.out.println("we are palying Book of "+author + " it is "+ audioLength + " hour long");

}
}