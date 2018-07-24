package Assignment10;

/**this program implements finding the occurrence of hello word in a line input from the command line,
 *  the locations of these occurrence and replacing the char h with * in the line*/
public class HelloInString {

    public static void main(String[] args) {

        int occurrenceCount = 0;
        String line = "";
        String locations = "";

        for(String s : args){
            if(s.equalsIgnoreCase("hello")){
                occurrenceCount++;
                //used the length of the line before adding the word as it's the starting index of the next word!
                locations += line.length() + " ";
            }

            line += s + " ";
        }

        String lineAfterReplace = line.replace("h" , "*");

        System.out.println("original line: " + line);
        System.out.println("number of occurences of hello: " + occurrenceCount);
        System.out.print("locations of hello: ");
        System.out.println(locations);
        System.out.println();
        System.out.println("line after replace: " + lineAfterReplace);




    }
}
