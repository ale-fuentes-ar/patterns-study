import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        var namesSearch = Arrays.asList("Ale", "jandro", "fuuu");

        namesSearch.forEach(name ->{
            System.out.println(getClient(name).getName());
        });

    }

    //This class how to test
    private static Employe getClient(String name){
        var names = Arrays.asList("Ale", "jandro", "fu");

        if(names.contains(name)){
            return new Develop(name);
        }
        return new NoDevelop();

    }
}
