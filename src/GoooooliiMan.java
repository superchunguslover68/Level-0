import java.net.URI;

import javax.swing.JOptionPane;

public class GoooooliiMan { 

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is a kewl guy doing?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Singing?", "Eating?", "Mathing?" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if(userMood==1){playVideo("https://www.youtube.com/watch?v=R8Ub98V8Wjg"); }
		// 4. Play different songs for other moods.
if (userMood==0){playVideo("http://www.youtube.com/watch?v=mw2kKyJu9gY&t=2m6s");}
		// If you are seeing ads at the beginning of your videos, install Adblock.
if (userMood==2){playVideo("https://www.youtube.com/watch?v=PL2A_KSdoc4");}
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







