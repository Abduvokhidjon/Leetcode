public class Haystack {
    public static void main(String[] args) {
        String haystack = "aksfkjafkacodeaklsd";
        String needle = "code";

        if(haystack.contains(needle)) {
            for(int i = 0; i < haystack.length(); i++) {
                if((haystack.substring(i, needle.length()+i).equals(needle)) && (needle.length()+i <= haystack.length())) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
