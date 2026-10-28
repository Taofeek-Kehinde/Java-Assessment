package MyTask;

public class AssessmentOne {

    public String Word(String sentense) {

        String[] words = sentense.trim().split(" ");

        String shortest = words[0];

        for (String word : words) {
            if(word.length() < shortest.length() ) {
                shortest = word;
            }
        }

        return shortest;
    }

    public static void main(String[] args) {
        AssessmentOne assessment = new AssessmentOne();
        String sentence = "My name is Taofeek Kehinde I'm a student of Semicolon";
        System.out.println(assessment.Word(sentence));
    }
}
