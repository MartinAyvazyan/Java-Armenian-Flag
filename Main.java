import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

class Main {
	
		public static void main(String... args) throws IOException{
	
			int m = 9;
			int n = 20;			
			
			FileWriter xxx = new FileWriter("xxx.ppm");
			xxx.append("P3\n");
			xxx.append("" + n + " " + m + "" +"\n");
			xxx.append("255\n");

			for(int i = 1; i<=m; i++){
				for(int j = 1; j<=n; j++){
					if(i<=3) xxx.append("255 51 51 ");
					if(i<=6 && i> 3) xxx.append("0 0 255 ");
					if(i<=9 && i> 6) xxx.append("255 128 0 "); 
				}
				xxx.append("\n");
			}

			xxx.flush();

		}

}
