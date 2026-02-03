public class RotateString {
    public boolean rotateString(String s, String goal) {
        

        /*// ^ s = "abcde", goal = "cdeab" */
        // * abcde", goal = "abced"
        
        // abcdeabcde
        // abcdeabcde
        //append string with it self
        // then check goal is exist or not 

        s = s + s;

        return s.contains(goal);
    }
}
