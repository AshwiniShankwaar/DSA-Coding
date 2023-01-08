package extra;

public class DNACoding {
    public static void main(String[] args) {
        dna("000001001011101010010110011");
    }
    public static void dna(String dnaData){
        String[] string = dnaData.split("(?<=\\G.{"+3+"})");
        String out = "";
        if(string[0].equals("000")){
            for (int i = 1; i < string.length; i++) {
                if(string[i].equals("001")){
                    out = out+"C";
                }else if(string[i].equals("010")){
                    out = out+"G";
                }else if(string[i].equals("011")){
                    out = out+"A";
                }else if(string[i].equals("101")){
                    out = out+"T";
                }else if(string[i].equals("110")){
                    out = out+"U";
                }
            }
        }else{
            for (int i = 1; i < string.length; i++) {
                if(string[i].equals("001")){
                    out = out+"C";
                }else if(string[i].equals("010")){
                    out = out+"G";
                }else if(string[i].equals("011")){
                    out = out+"A";
                }else if(string[i].equals("101")){
                    out = out+"T";
                }else if(string[i].equals("110")){
                    out = out+"U";
                }
            }
        }
        String FinalData = "";
        if(out.startsWith("C")){
            for (char c:out.toCharArray()) {
                if(c == 'U'){
                    FinalData = out.replace('U','T');
                }
            }
        }else{
            for (char c:out.toCharArray()) {
                if(c == 'T'){
                    FinalData = out.replace('T','U');
                }
            }
        }
        System.out.println(FinalData);
    }
}
