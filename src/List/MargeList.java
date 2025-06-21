package List;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MargeList
{
    public static void main(String []args)
    {
        List <List<String>> skills = Arrays.asList
                (
                Arrays.asList("java","Spring" ,"Springboot", "Spring"),
                Arrays.asList("Python","Pandas"),
                Arrays.asList("SQL","DBMS")
        );
                       // print all parameter as single list
      List<String>  allskills = skills.stream().flatMap(SkillList ->SkillList.stream()).collect(Collectors.toList());
        System.out.println( "All Parameter as a Single List " + allskills);

                               //StartWithS
       List<String> StartWiths= allskills.stream().filter(skill ->skill.startsWith("S")).collect(Collectors.toList());
        System.out.println("StartWith Character S " + StartWiths);

                               //StartWithP
       List<String> StartWithP = allskills.stream().filter(skill->skill.startsWith("P")).collect(Collectors.toList());
        System.out.println("StartWith Character P " + StartWithP);

                              // EndWith a
        List<String> EndWitha = allskills.stream().filter(skill->skill.endsWith("a")).collect(Collectors.toList());
        System.out.println("End The Character Of a " + EndWitha);
    }
}
