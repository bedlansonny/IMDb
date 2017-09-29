import java.io.*;
import java.util.*;
public class IMDb
{
    public static void main(String args[]) throws IOException
    {
        //store actors into LinkedList allActors
        Scanner actorsFile = new Scanner(new File("actors.txt"));

        LinkedList allActors = new LinkedList();

        while(actorsFile.hasNext())
            allActors.add(new Actor(actorsFile.nextLine().trim()));


        //store movies into LinkedList allMovies
        Scanner moviesFile = new Scanner(new File("movies.txt"));

        LinkedList allMovies = new LinkedList();

        while(moviesFile.hasNext())
        {

            //movie file was meant to be split into columns. no indexOf necessary

            int date = moviesFile.nextInt();

            String line = moviesFile.nextLine();

            String title = line.substring(1, line.indexOf("  "));

            String actorsString = line.substring(line.indexOf("  "), line.indexOf("Dir:")).trim();
            String[] actorsArr = actorsString.split(",");
            LinkedList actors = new LinkedList();
            for(int i = 0; i < actorsArr.length; i++)
                actors.add(new Actor(actorsArr[i].trim()));

            String directorsString = line.substring(line.indexOf("Dir:")+5).trim();
            String[] directorsArr = directorsString.split(",");
            LinkedList directors = new LinkedList();
            for(int i = 0; i < directorsArr.length; i++)
                directors.add(new Actor(directorsArr[i].trim()));

            allMovies.add(new Movie(date, title, actors, directors));
        }


        //Print each actor name, and the date and title of each of their movies, starting with most recent
        for(int a = 0; a < allActors.size(); a++)
        {
            System.out.println(((Actor)allActors.get(a)).getName() + ":");

            for(int m = 0; m < allMovies.size(); m++)
            {
                if(((Movie)allMovies.get(m)).getActors().contains((Actor)allActors.get(a)))
                {
                    System.out.println("\t" + ((Movie)allMovies.get(m)).getDate() + " - " + ((Movie)allMovies.get(m)).getTitle());
                }
            }
        }

    }
}
